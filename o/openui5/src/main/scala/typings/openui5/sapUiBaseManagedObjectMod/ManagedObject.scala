package typings.openui5.sapUiBaseManagedObjectMod

import typings.openui5.anon.CloneChildren
import typings.openui5.anon.DetailedReason
import typings.openui5.anon.Locale
import typings.openui5.int
import typings.openui5.sapUiModelChangeReasonMod.ChangeReason
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedObject
  extends typings.openui5.sapUiBaseEventProviderMod.default {
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Adds some entity `oObject` to the aggregation identified by `sAggregationName`.
    *
    * If the given object is not valid with regard to the aggregation (if it is not an instance of the type
    * specified for that aggregation) or when the method is called for an aggregation of cardinality 0..1,
    * then an Error is thrown (see {@link #validateAggregation}.
    *
    * If the aggregation already has content, the new object will be added after the current content. If the
    * new object was already contained in the aggregation, it will be moved to the end.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically add an object to an aggregation. Use
    * the concrete method addXYZ for aggregation 'XYZ' or the generic {@link #applySettings} instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def addAggregation(
    /**
    * the string identifying the aggregation that `oObject` should be added to.
    */
  sAggregationName: String,
    /**
    * the object to add; if empty, nothing is added
    */
  oObject: ManagedObject
  ): this.type = js.native
  def addAggregation(
    /**
    * the string identifying the aggregation that `oObject` should be added to.
    */
  sAggregationName: String,
    /**
    * the object to add; if empty, nothing is added
    */
  oObject: ManagedObject,
    /**
    * if true, this ManagedObject as well as the added child are not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Adds some object with the ID `sId` to the association identified by `sAssociationName` and marks this
    * ManagedObject as changed.
    *
    * This method does not avoid duplicates.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically add an object to an association. Use
    * the concrete method addXYZ for association 'XYZ' or the generic {@link #applySettings} instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def addAssociation(
    /**
    * the string identifying the association the object should be added to.
    */
  sAssociationName: String,
    /**
    * the ID of the ManagedObject object to add; if empty, nothing is added; if a `sap.ui.base.ManagedObject`
    * is given, its ID is added
    */
  sId: String
  ): this.type = js.native
  def addAssociation(
    /**
    * the string identifying the association the object should be added to.
    */
  sAssociationName: String,
    /**
    * the ID of the ManagedObject object to add; if empty, nothing is added; if a `sap.ui.base.ManagedObject`
    * is given, its ID is added
    */
  sId: String,
    /**
    * if true, this managed object as well as the newly associated object are not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  def addAssociation(
    /**
    * the string identifying the association the object should be added to.
    */
  sAssociationName: String,
    /**
    * the ID of the ManagedObject object to add; if empty, nothing is added; if a `sap.ui.base.ManagedObject`
    * is given, its ID is added
    */
  sId: ManagedObject
  ): this.type = js.native
  def addAssociation(
    /**
    * the string identifying the association the object should be added to.
    */
  sAssociationName: String,
    /**
    * the ID of the ManagedObject object to add; if empty, nothing is added; if a `sap.ui.base.ManagedObject`
    * is given, its ID is added
    */
  sId: ManagedObject,
    /**
    * if true, this managed object as well as the newly associated object are not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Sets all the properties, aggregations, associations and event handlers as given in the object literal
    * `mSettings`. If a property, aggregation, etc. is not listed in `mSettings`, then its value is not changed
    * by this method.
    *
    * For properties and 0..1 aggregations/associations, any given setting overwrites the current value. For
    * 0..n aggregations, the given values are appended; event listeners are registered in addition to existing
    * ones.
    *
    * For the possible keys and values in `mSettings` see the general documentation in {@link sap.ui.base.ManagedObject }
    * or the specific documentation of the constructor of the concrete managed object class.
    *
    * @returns Returns `this` to allow method chaining
    */
  def applySettings(/**
    * the settings to apply to this managed object
    */
  mSettings: ManagedObjectSettings): this.type = js.native
  def applySettings(
    /**
    * the settings to apply to this managed object
    */
  mSettings: ManagedObjectSettings,
    /**
    * Scope object to resolve types and formatters
    */
  oScope: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:formatError formatError} event of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated from the model, but formatting
    * the value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFormatError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit]
  ): this.type = js.native
  def attachFormatError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:formatError formatError} event of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated from the model, but formatting
    * the value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachFormatError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit]
  ): this.type = js.native
  def attachFormatError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:modelContextChange modelContextChange} event
    * of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when models or contexts are changed on this object (either by calling setModel/setBindingContext
    * or due to propagation)
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachModelContextChange(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def attachModelContextChange(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:modelContextChange modelContextChange} event
    * of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when models or contexts are changed on this object (either by calling setModel/setBindingContext
    * or due to propagation)
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachModelContextChange(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def attachModelContextChange(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated to the model, but parsing the
    * value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachParseError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit]
  ): this.type = js.native
  def attachParseError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated to the model, but parsing the
    * value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachParseError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit]
  ): this.type = js.native
  def attachParseError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:validationError validationError} event of this
    * `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated to the model, but validating
    * the value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachValidationError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit]
  ): this.type = js.native
  def attachValidationError(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:validationError validationError} event of this
    * `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired when a new value for a bound property should have been propagated to the model, but validating
    * the value failed with an exception.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachValidationError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit]
  ): this.type = js.native
  def attachValidationError(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Attaches event handler `fnFunction` to the {@link #event:validationSuccess validationSuccess} event of
    * this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired after a new value for a bound property has been propagated to the model. Only fired, when the binding
    * uses a data type.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachValidationSuccess(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit]
  ): this.type = js.native
  def attachValidationSuccess(
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  /**
    * Attaches event handler `fnFunction` to the {@link #event:validationSuccess validationSuccess} event of
    * this `sap.ui.base.ManagedObject`.
    *
    * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
    * otherwise it will be bound to this `sap.ui.base.ManagedObject` itself.
    *
    * Fired after a new value for a bound property has been propagated to the model. Only fired, when the binding
    * uses a data type.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def attachValidationSuccess(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit]
  ): this.type = js.native
  def attachValidationSuccess(
    /**
    * An application-specific payload object that will be passed to the event handler along with the event
    * object when firing the event
    */
  oData: js.Object,
    /**
    * The function to be called when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit],
    /**
    * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Bind an aggregation to the model.
    *
    * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel setModel }
    * or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindList bindList} method
    * will be called to create a new {@link sap.ui.model.ListBinding ListBinding} with the configured binding
    * options.
    *
    * The bound aggregation will use the given template, clone it for each item which exists in the bound list
    * and set the appropriate binding context.
    *
    * This is a generic method which can be used to bind any aggregation to the model. A class may flag aggregations
    * in its metadata with `bindable: "bindable"` to get typed `bindSomething` and `unbindSomething`
    * methods for those aggregations.
    *
    * Also see {@link https://ui5.sap.com/#/topic/91f057786f4d1014b6dd926db0e91070 List Binding (Aggregation Binding) }
    * in the documentation.
    *
    * For more information on the `oBindingInfo.key` property and its usage, see {@link https://ui5.sap.com/#/topic/7cdff73f308b4b10bdf7d83b7aba72e7 Extended Change Detection}.
    *
    * @returns Returns `this` to allow method chaining
    */
  def bindAggregation(
    /**
    * Name of a public aggregation to bind
    */
  sName: String,
    /**
    * Binding info
    */
  oBindingInfo: AggregationBindingInfo
  ): this.type = js.native
  
  /**
    * @deprecated (since 1.11.1) - please use {@link #bindObject} instead.
    *
    * Bind the object to the referenced entity in the model, which is used as the binding context to resolve
    * bound properties or aggregations of the object itself and all of its children relatively to the given
    * path.
    *
    * @returns reference to the instance itself
    */
  def bindContext(/**
    * the binding path
    */
  sPath: String): this.type = js.native
  
  /**
    * Bind the object to the referenced entity in the model.
    *
    * The entity is used as the binding context to resolve bound properties or aggregations of the object itself
    * and all of its children relatively to the given path. If a relative binding path is used, it will be
    * evaluated anew whenever the parent context changes.
    *
    * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel setModel }
    * or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindContext bindContext }
    * method will be called to create a new {@link sap.ui.model.ContextBinding ContextBinding} with the configured
    * binding options.
    *
    * There's no difference between `bindObject` and {@link sap.ui.core.Element#bindElement bindElement}. Method
    * `bindObject` was introduced together with `ManagedObject` to make context bindings also available on
    * `ManagedObject`s. The new name was chosen to reflect that the binding is not necessarily applied to an
    * `Element`, it also could be applied to a component or some other `ManagedObject`.
    *
    * Also see {@link https://ui5.sap.com/#/topic/91f05e8b6f4d1014b6dd926db0e91070 Context Binding} in the
    * documentation.
    *
    * @returns Returns `this` to allow method chaining
    */
  def bindObject(/**
    * Binding info
    */
  oBindingInfo: ObjectBindingInfo): this.type = js.native
  
  /**
    * Binds a property to the model.
    *
    * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel setModel }
    * or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindProperty bindProperty }
    * method will be called to create a new {@link sap.ui.model.PropertyBinding PropertyBinding} with the configured
    * binding options.
    *
    * The Setter for the given property will be called by the binding with the value retrieved from the data
    * model. When the binding mode is `OneTime`, the property will be set only once. When it is `OneWay`, the
    * property will be updated whenever the corresponding data in the model changes. In mode `TwoWay`, changes
    * to the property (not originating in the model) will be reported back to the model (typical use case:
    * user interaction changes the value of a control).
    *
    * This is a generic method which can be used to bind any property to the model. A managed object may flag
    * any property in its metadata with `bindable: "bindable"` to additionally provide named methods to bind
    * and unbind the corresponding property.
    *
    * **Composite Binding**
    *  A composite property binding which combines data from multiple model paths can be declared using the
    * `parts` parameter instead of `path`. The `formatter` function or a {@link sap.ui.model.CompositeType composite type }
    * then can be used to combine the parts, Properties with a composite binding are also known as "calculated
    * fields".
    *
    * Example:
    * ```javascript
    *
    *   oTxt.bindValue({
    *     parts: [
    *       {path: "/firstName", type: "sap.ui.model.type.String"},
    *       {path: "myModel2>/lastName"}
    *     ]
    *   });
    * ```
    *
    *
    * Note that a composite binding will be forced into mode `OneWay` when one of the binding parts is not
    * in mode `TwoWay`.
    *
    * **Static Binding**
    *  A StaticBinding allows to define static values within a `sap.ui.model.CompositeBinding`. It behaves
    * like a property binding but always returns the value that is stored in the binding itself. The binding
    * does not have a `sap.ui.model.Context`, a `sap.ui.model.Model` or a `oBindingInfo.path`. A StaticBinding
    * is created when a `oBindingInfo.value` is passed instead of a `oBindingInfo.path` or `oBindingInfo.parts[i].path`.
    *
    * Also see {@link sap.ui.model.StaticBinding StaticBinding} in the documentation.
    *
    * **Formatter Functions**
    *  When a formatter function is specified for the binding or for a binding part, it will be called with
    * the value of the bound model property. After setting the initial property value, the formatter function
    * will only be called again when the bound model property changes (simple property binding) or when at
    * least one of the bound model properties changes (formatter function of a composite binding). Note that
    * a binding only monitors the bound model data for changes. Dependencies of the formatter implementation
    * to other model data is not known to the binding and changes won't be detected.
    *
    * When the formatter for a property binding (simple or composite) is called, the managed object will be
    * given as `this` context. For formatters of binding parts in a composite binding, this is not the case.
    *
    * Also see {@link https://ui5.sap.com/#/topic/91f0652b6f4d1014b6dd926db0e91070 Property Binding} in the
    * documentation.
    *
    * @returns Returns `this` to allow method chaining
    */
  def bindProperty(
    /**
    * Name of a public property to bind; public aggregations of cardinality 0..1 that have an alternative,
    * simple type (e.g. "string" or "int") can also be bound with this method
    */
  sName: String,
    /**
    * Binding information
    */
  oBindingInfo: PropertyBindingInfo
  ): this.type = js.native
  
  def clone(/**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: String): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: String,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: js.Array[String]
  ): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: String,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: js.Array[String],
    /**
    * Configuration object; when omitted, both properties default to `true`; when specified, undefined properties
    * default to `false`
    */
  oOptions: CloneChildren
  ): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: String,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: Unit,
    /**
    * Configuration object; when omitted, both properties default to `true`; when specified, undefined properties
    * default to `false`
    */
  oOptions: CloneChildren
  ): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: Unit,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: js.Array[String]
  ): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: Unit,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: js.Array[String],
    /**
    * Configuration object; when omitted, both properties default to `true`; when specified, undefined properties
    * default to `false`
    */
  oOptions: CloneChildren
  ): this.type = js.native
  def clone(
    /**
    * a suffix to be appended to the cloned object ID
    */
  sIdSuffix: Unit,
    /**
    * an array of local IDs within the cloned hierarchy (internally used)
    */
  aLocalIds: Unit,
    /**
    * Configuration object; when omitted, both properties default to `true`; when specified, undefined properties
    * default to `false`
    */
  oOptions: CloneChildren
  ): this.type = js.native
  
  def destroy(
    /**
    * If `true`, this ManagedObject and all its ancestors won't be invalidated.
    * This flag should be used only during control development to optimize invalidation procedures. It should
    * not be used by any application code.
    */
  bSuppressInvalidate: Boolean
  ): Unit = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Destroys (all) the managed object(s) in the aggregation named `sAggregationName` and empties the aggregation.
    * If the aggregation did contain any object, this ManagedObject is marked as changed.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically destroy all objects in an aggregation.
    * Use the concrete method destroyXYZ for aggregation 'XYZ' instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def destroyAggregation(/**
    * the name of the aggregation
    */
  sAggregationName: String): this.type = js.native
  def destroyAggregation(
    /**
    * the name of the aggregation
    */
  sAggregationName: String,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:formatError formatError} event of this `sap.ui.base.ManagedObject`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachFormatError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit]
  ): this.type = js.native
  def detachFormatError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectFormatErrorEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:modelContextChange modelContextChange} event
    * of this `sap.ui.base.ManagedObject`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachModelContextChange(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ): this.type = js.native
  def detachModelContextChange(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:parseError parseError} event of this `sap.ui.base.ManagedObject`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachParseError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit]
  ): this.type = js.native
  def detachParseError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectParseErrorEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:validationError validationError} event of
    * this `sap.ui.base.ManagedObject`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachValidationError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit]
  ): this.type = js.native
  def detachValidationError(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationErrorEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Detaches event handler `fnFunction` from the {@link #event:validationSuccess validationSuccess} event
    * of this `sap.ui.base.ManagedObject`.
    *
    * The passed function and listener object must match the ones used for event registration.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def detachValidationSuccess(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit]
  ): this.type = js.native
  def detachValidationSuccess(
    /**
    * The function to be called, when the event occurs
    */
  fnFunction: js.Function1[/* p1 */ ManagedObjectValidationSuccessEvent, Unit],
    /**
    * Context object on which the given function had to be called
    */
  oListener: js.Object
  ): this.type = js.native
  
  /**
    * Searches and returns all aggregated objects that pass the given check function.
    *
    * When the search is done recursively (`bRecursive === true`), it will be executed depth-first and ancestors
    * will be added to the result array before their descendants.
    *
    * If no check function is given, all aggregated objects will pass the check and be added to the result
    * array.
    *
    * When setting `bIncludeBindingTemplates` to `true`, binding templates will be included in the search.
    *
    * **Take care:** this operation might be expensive.
    *
    * @returns Array of aggregated objects that passed the check
    */
  def findAggregatedObjects(): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(/**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Boolean): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Boolean,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: js.Function1[/* p1 */ this.type, Boolean]
  ): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Boolean,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: js.Function1[/* p1 */ this.type, Boolean],
    /**
    * Whether binding templates should be included
    */
  bIncludeBindingTemplates: Boolean
  ): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Boolean,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: Unit,
    /**
    * Whether binding templates should be included
    */
  bIncludeBindingTemplates: Boolean
  ): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Unit,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: js.Function1[/* p1 */ this.type, Boolean]
  ): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Unit,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: js.Function1[/* p1 */ this.type, Boolean],
    /**
    * Whether binding templates should be included
    */
  bIncludeBindingTemplates: Boolean
  ): js.Array[ManagedObject] = js.native
  def findAggregatedObjects(
    /**
    * Whether the whole aggregation tree should be searched
    */
  bRecursive: Unit,
    /**
    * Objects for which this function returns a falsy value will not be added to the result array
    */
  fnCondition: Unit,
    /**
    * Whether binding templates should be included
    */
  bIncludeBindingTemplates: Boolean
  ): js.Array[ManagedObject] = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:formatError formatError} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireFormatError(): this.type = js.native
  def fireFormatError(
    /**
    * Parameters to pass along with the event
    */
  mParameters: ManagedObject$FormatErrorEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:modelContextChange modelContextChange} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireModelContextChange(): this.type = js.native
  def fireModelContextChange(/**
    * Parameters to pass along with the event
    */
  mParameters: js.Object): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:parseError parseError} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireParseError(): this.type = js.native
  def fireParseError(
    /**
    * Parameters to pass along with the event
    */
  mParameters: ManagedObject$ParseErrorEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:validationError validationError} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireValidationError(): this.type = js.native
  def fireValidationError(
    /**
    * Parameters to pass along with the event
    */
  mParameters: ManagedObject$ValidationErrorEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Fires event {@link #event:validationSuccess validationSuccess} to attached listeners.
    *
    * @returns Reference to `this` in order to allow method chaining
    */
  def fireValidationSuccess(): this.type = js.native
  def fireValidationSuccess(
    /**
    * Parameters to pass along with the event
    */
  mParameters: ManagedObject$ValidationSuccessEventParameters
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns the aggregated object(s) for the named aggregation of this ManagedObject.
    *
    * If the aggregation does not contain any objects(s), the given `oDefaultForCreation` (or `null`) is set
    * as new value of the aggregation and returned to the caller.
    *
    * **Note:** the need to specify a default value and the fact that it is stored as new value of a so far
    * empty aggregation is recognized as a shortcoming of this API but can no longer be changed for compatibility
    * reasons.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically read the content of an aggregation.
    * Use the concrete method getXYZ for aggregation 'XYZ' instead.
    *
    * @returns Aggregation array in case of 0..n-aggregations or the managed object or `null` in case of 0..1-aggregations
    */
  def getAggregation(/**
    * Name of the aggregation
    */
  sAggregationName: String): ManagedObject | js.Array[ManagedObject] | Null = js.native
  def getAggregation(
    /**
    * Name of the aggregation
    */
  sAggregationName: String,
    /**
    * Object that is used in case the current aggregation is empty. If provided, it must be null for 0..1 aggregations
    * or an empty array for 0..n aggregations. If not provided, `null` is used.
    *
    * **Note:** When an empty array is given and used because the aggregation was not set before, then this
    * array will be used for the aggregation from thereon. Sharing the same empty array between different calls
    * to this method therefore is not possible and will result in inconsistencies.
    */
  oDefaultForCreation: js.Array[Any]
  ): ManagedObject | js.Array[ManagedObject] | Null = js.native
  def getAggregation(
    /**
    * Name of the aggregation
    */
  sAggregationName: String,
    /**
    * Object that is used in case the current aggregation is empty. If provided, it must be null for 0..1 aggregations
    * or an empty array for 0..n aggregations. If not provided, `null` is used.
    *
    * **Note:** When an empty array is given and used because the aggregation was not set before, then this
    * array will be used for the aggregation from thereon. Sharing the same empty array between different calls
    * to this method therefore is not possible and will result in inconsistencies.
    */
  oDefaultForCreation: ManagedObject
  ): ManagedObject | js.Array[ManagedObject] | Null = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns the content of the association with the given name.
    *
    * For associations of cardinality 0..1, a single string with the ID of an associated object is returned
    * (if any). For cardinality 0..n, an array with the IDs of the associated objects is returned.
    *
    * If the association does not contain any objects(s), the given `oDefaultForCreation` is set as new value
    * of the association and returned to the caller. The only supported values for `oDefaultForCreation` are
    * `null` and `undefined` in the case of cardinality 0..1 and `null`, `undefined` or an empty array (`[]`)
    * in case of cardinality 0..n. If the argument is omitted, `null` is used independently from the cardinality.
    *
    * **Note:** the need to specify a default value and the fact that it is stored as new value of a so far
    * empty association is recognized as a shortcoming of this API but can no longer be changed for compatibility
    * reasons.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically retrieve the content of an association.
    * Use the concrete method getXYZ for association 'XYZ' instead.
    *
    * @returns the ID of the associated managed object or an array of such IDs; may be null if the association
    * has not been populated
    */
  def getAssociation(/**
    * the name of the association
    */
  sAssociationName: String): String | js.Array[String] | Null = js.native
  def getAssociation(
    /**
    * the name of the association
    */
  sAssociationName: String,
    /**
    * the value that is used in case the current aggregation is empty (only null or empty array is allowed)
    */
  oDefaultForCreation: js.Array[Any]
  ): String | js.Array[String] | Null = js.native
  
  /**
    * Get the binding object for a specific aggregation/property.
    *
    * @returns the binding for the given name
    */
  def getBinding(/**
    * the name of the property or aggregation
    */
  sName: String): js.UndefOr[typings.openui5.sapUiModelBindingMod.default] = js.native
  
  /**
    * Get the binding context of this object for the given model name.
    *
    * If the object does not have a binding context set on itself and has no own model set, it will use the
    * first binding context defined in its parent hierarchy.
    *
    * **Note:** to be compatible with future versions of this API, you must not use the following model names:
    *
    * 	 - `null`
    * 	 - empty string `""`
    * 	 - string literals `"null"` or `"undefined"`  Omitting the model name (or using the value `undefined`)
    *     is explicitly allowed and refers to the default model.
    *
    * **Note:** A ManagedObject inherits binding contexts from the Core only when it is a descendant of a UIArea.
    *
    * @returns The binding context of this object
    */
  def getBindingContext(): js.UndefOr[typings.openui5.sapUiModelContextMod.default | Null] = js.native
  def getBindingContext(/**
    * the name of the model or `undefined`
    */
  sModelName: String): js.UndefOr[typings.openui5.sapUiModelContextMod.default | Null] = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns the binding info for the given property or aggregation.
    *
    * The binding info contains information about path, binding object, format options, sorter, filter etc.
    * for the property or aggregation. As the binding object is only created when the model becomes available,
    * the `binding` property may be undefined.
    *
    * @returns A binding info object, containing at least a `path` or `parts` property and, depending on the
    * binding type, additional properties
    */
  def getBindingInfo(/**
    * Name of the property or aggregation
    */
  sName: String): PropertyBindingInfo | AggregationBindingInfo = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Get the binding path for a specific aggregation/property.
    *
    * @returns the binding path for the given name
    */
  def getBindingPath(/**
    * the name of the property or aggregation
    */
  sName: String): js.UndefOr[String] = js.native
  
  /**
    * Returns the object's ID.
    *
    * There is no guarantee or check or requirement for the ID of a `ManagedObject` to be unique. Only some
    * subclasses of `ManagedObject` introduce this as a requirement, e.g. `Component` or `Element`. All elements
    * existing in the same window at the same time must have different IDs. A new element will fail during
    * construction when the given ID is already used by another element. But there might be a component with
    * the same ID as an element or another `ManagedObject`.
    *
    * For the same reason, there is no general lookup for `ManagedObject`s via their ID. Only for subclasses
    * that enforce unique IDs, there might be lookup mechanisms (e.g. {@link sap.ui.core.Core#byId sap.ui.getCore().byId() }
    * for elements).
    *
    * @returns The objects's ID.
    */
  def getId(): String = js.native
  
  /**
    * Get the model to be used for data bindings with the given model name. If the object does not have a model
    * set on itself, it will use the first model defined in its parent hierarchy.
    *
    * The name can be omitted to reference the default model or it must be a non-empty string.
    *
    * **Note:** to be compatible with future versions of this API, you must not use the following model names:
    *
    * 	 - `null`
    * 	 - empty string `""`
    * 	 - string literals `"null"` or `"undefined"`  Omitting the model name (or using the value `undefined`)
    *     is explicitly allowed and refers to the default model.
    *
    * @returns oModel or undefined when there is no such model
    */
  def getModel(): js.UndefOr[typings.openui5.sapUiModelModelMod.default] = js.native
  def getModel(/**
    * name of the model to be retrieved
    */
  sModelName: String): js.UndefOr[typings.openui5.sapUiModelModelMod.default] = js.native
  
  /**
    * Get the object binding object for a specific model.
    *
    * **Note:** to be compatible with future versions of this API, you must not use the following model names:
    *
    * 	 - `null`
    * 	 - empty string `""`
    * 	 - string literals `"null"` or `"undefined"`  Omitting the model name (or using the value `undefined`)
    *     is explicitly allowed and refers to the default model.
    *
    * @returns Context binding for the given model name or `undefined`
    */
  def getObjectBinding(): js.UndefOr[typings.openui5.sapUiModelContextBindingMod.default] = js.native
  def getObjectBinding(/**
    * Non-empty name of the model or `undefined`
    */
  sModelName: String): js.UndefOr[typings.openui5.sapUiModelContextBindingMod.default] = js.native
  
  /**
    * Returns the origin info for the value of the given property.
    *
    * The origin info might contain additional information for translatable texts. The bookkeeping of this
    * information is not active by default and must be activated by configuration. Even then, it might not
    * be present for all properties and their values depending on where the value came form.
    *
    * If no origin info is available, `null` will be returned.
    *
    * @returns |null} An object describing the origin of this property's value or `null`
    */
  def getOriginInfo(/**
    * Name of the property
    */
  sPropertyName: String): Locale = js.native
  
  /**
    * @since 1.88.0
    *
    * Returns a map of all models assigned to this ManagedObject.
    *
    * The default model is available on key `undefined`.
    *
    * **Note:** Models propagated from the parent are not included.
    *
    * @returns The models
    */
  def getOwnModels(): Record[String, typings.openui5.sapUiModelModelMod.default] = js.native
  
  /**
    * Returns the parent managed object or `null` if this object hasn't been added to a parent yet.
    *
    * The parent returned by this method is the technical parent used for data binding, invalidation, rendering
    * etc. It might differ from the object on which the application originally added this object (the so called
    * 'API parent'): some composite controls internally use hidden controls or containers to store their children.
    * This method will return the innermost container that technically contains this object as a child.
    *
    * **Example:**
    *
    * Assume that a `Dialog` internally uses a (hidden) `VerticalLayout` to store its content:
    *
    *
    * ```javascript
    *
    *   Dialog (API parent)
    *    \__ VerticalLayout (hidden composite part)
    *       \__ Text (API child)
    * ```
    *
    *
    * If you add some content by calling the `Dialog.prototype.addContent` API, this will lead to the following
    * observations:
    *
    *
    * ```javascript
    *
    *   oDialog.addContent(oText);
    *   console.log(oText.getParent() === oDialog);  // false
    *   console.log(oText.getParent() instanceof VerticalLayout); // true
    *   console.log(oText.getParent().getParent() === oDialog); // true now, but might fail with later versions
    * ```
    *
    *
    * Technically, from API perspective, `oText` is added as a child to `Dialog`. But internally, the `Dialog`
    * adds the child to the hidden `VerticalLayout` container. If you now call the `getParent` method of the
    * child, you will get the internal `VerticalLayout` object and not the `Dialog` API parent.
    *
    * **Note: ** The internal (hidden) structure of a composite control is not fixed and may be changed (see
    * also our "Compatibility Rules"). Therefore, you should **never** rely on a specific structure or object
    * being returned by `getParent`.
    *
    * **Note: ** There is no API to determine the original API parent.
    *
    * @returns The technical parent managed object or `null`
    */
  def getParent(): ManagedObject | Null = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns the value for the property with the given `sPropertyName`.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically retrieve the value of a property.
    * Use the concrete method getXYZ for property 'XYZ' instead.
    *
    * @returns the value of the property
    */
  def getProperty(/**
    * the name of the property
    */
  sPropertyName: String): Any = js.native
  
  /**
    * Check if any model is set to the ManagedObject or to one of its parents (including UIArea and Core).
    *
    * **Note:** A ManagedObject inherits models from the Core only when it is a descendant of a UIArea.
    *
    * @returns whether a model reference exists or not
    */
  def hasModel(): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Searches for the provided ManagedObject in the named aggregation and returns its 0-based index if found,
    * or -1 otherwise. Returns -2 if the given named aggregation is of cardinality 0..1 and doesn't reference
    * the given object.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically determine the position of an object
    * in an aggregation. Use the concrete method indexOfXYZ for aggregation 'XYZ' instead.
    *
    * @returns the index of the provided managed object in the aggregation.
    */
  def indexOfAggregation(
    /**
    * the name of the aggregation
    */
  sAggregationName: String,
    /**
    * the ManagedObject whose index is looked for.
    */
  oObject: ManagedObject
  ): int = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Inserts managed object `oObject` to the aggregation named `sAggregationName` at position `iIndex`.
    *
    * If the given object is not valid with regard to the aggregation (if it is not an instance of the type
    * specified for that aggregation) or when the method is called for an aggregation of cardinality 0..1,
    * then an Error is thrown (see {@link #validateAggregation}.
    *
    * If the given index is out of range with respect to the current content of the aggregation, it is clipped
    * to that range (0 for iIndex < 0, n for iIndex > n).
    *
    * Please note that this method does not work as expected when an object is added that is already part of
    * the aggregation. In order to change the index of an object inside an aggregation, first remove it, then
    * insert it again.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically insert an object into an aggregation.
    * Use the concrete method insertXYZ for aggregation 'XYZ' instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def insertAggregation(
    /**
    * the string identifying the aggregation the managed object `oObject` should be inserted into.
    */
  sAggregationName: String,
    /**
    * the ManagedObject to add; if empty, nothing is inserted.
    */
  oObject: ManagedObject,
    /**
    * the `0`-based index the managed object should be inserted at; for a negative value `iIndex`, `oObject`
    * is inserted at position 0; for a value greater than the current size of the aggregation, `oObject` is
    * inserted at the last position
    */
  iIndex: int
  ): this.type = js.native
  def insertAggregation(
    /**
    * the string identifying the aggregation the managed object `oObject` should be inserted into.
    */
  sAggregationName: String,
    /**
    * the ManagedObject to add; if empty, nothing is inserted.
    */
  oObject: ManagedObject,
    /**
    * the `0`-based index the managed object should be inserted at; for a negative value `iIndex`, `oObject`
    * is inserted at position 0; for a value greater than the current size of the aggregation, `oObject` is
    * inserted at the last position
    */
  iIndex: int,
    /**
    * if true, this ManagedObject as well as the added child are not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Marks this object and its aggregated children as 'invalid'.
    *
    * The term 'invalid' originally was introduced by controls where a change to the object's state made the
    * rendered DOM invalid. Later, the concept of invalidation was moved up in the inheritance hierarchy
    * to `ManagedObject`, but the term was kept for compatibility reasons.
    *
    * Managed settings (properties, aggregations, associations) invalidate the corresponding object automatically.
    * Changing the state via the standard mutators, therefore, does not require an explicit call to `invalidate`.
    * The same applies to changes made via data binding, as it internally uses the standard mutators.
    *
    * By default, a `ManagedObject` propagates any invalidation to its parent. Controls or UIAreas handle invalidation
    * on their own by triggering a re-rendering.
    */
  def invalidate(): Unit = js.native
  
  /**
    * Find out whether a property or aggregation is bound
    *
    * @returns whether a binding exists for the given name
    */
  def isBound(/**
    * the name of the property or aggregation
    */
  sName: String): Boolean = js.native
  
  /**
    * @since 1.93
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Checks if an object's destruction has been started. During the descruction of an object its ID is still
    * registered, and child objects could be still aggregated. Creating another object with the same ID would
    * lead to duplicate ID issues. To check if the destruction is finished, call `isDestroyed`.
    *
    * @returns Whether an object's destruction has been started
    */
  def isDestroyStarted(): Boolean = js.native
  
  /**
    * @since 1.93
    *
    * Returns whether this object is destroyed or not. A destroyed object cannot be used anymore.
    *
    * @returns Whether the object is destroyed
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns whether re-rendering is currently suppressed on this ManagedObject.
    *
    * @returns Whether re-rendering is suppressed
    */
  def isInvalidateSuppressed(): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Returns whether the given property value is initial and has not been explicitly set or bound. Even after
    * setting the default value or setting null/undefined (which also causes the default value to be set),
    * the property is no longer initial. A property can be reset to initial state by calling `resetProperty(sPropertyName)`.
    *
    * @returns true if the property is initial
    */
  def isPropertyInitial(/**
    * the name of the property
    */
  sPropertyName: String): Boolean = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * This method is used internally and should only be overridden by a tree managed object which utilizes
    * the tree binding. In this case and if the aggregation is a tree node the overridden method should then
    * return true. If true is returned the tree binding will be used instead of the list binding.
    *
    * @returns whether tree binding should be used or list binding. Default is false. Override method to change
    * this behavior.
    */
  def isTreeBinding(/**
    * the aggregation to bind (e.g. nodes for a tree managed object)
    */
  sName: String): Boolean = js.native
  
  /**
    * @since 1.28
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Generic method which is called, whenever messages for this object exist.
    */
  def propagateMessages(/**
    * The property name
    */
  sName: String, /**
    * The messages
    */
  aMessages: js.Array[Any]): Unit = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Generic method which can be called, when an aggregation needs to be refreshed. This method does not make
    * any change on the aggregation, but just calls the `getContexts` method of the binding to trigger fetching
    * of new data.
    *
    * Subclasses should call this method only in the implementation of a named refresh method and for no other
    * purposes. The framework might change the conditions under which the method is called and the method implementation
    * might rely on those conditions.
    */
  def refreshAggregation(/**
    * name of the aggregation to refresh
    */
  sName: String): Unit = js.native
  
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: String
  ): ManagedObject | Null = js.native
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: String,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): ManagedObject | Null = js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Removes an object from the aggregation named `sAggregationName` with cardinality 0..n.
    *
    * The removed object is not destroyed nor is it marked as changed.
    *
    * If the given object is found in the aggregation, it is removed, it's parent relationship is unset and
    * this ManagedObject is marked as changed. The removed object is returned as result of this method. If
    * the object could not be found, `null` is returned.
    *
    * This method must only be called for aggregations of cardinality 0..n. The only way to remove objects
    * from a 0..1 aggregation is to set a `null` value for them.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically remove an object from an aggregation.
    * Use the concrete method removeXYZ for aggregation 'XYZ' instead.
    *
    * @returns the removed object or `null`
    */
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: int
  ): ManagedObject | Null = js.native
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: int,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): ManagedObject | Null = js.native
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: ManagedObject
  ): ManagedObject | Null = js.native
  def removeAggregation(
    /**
    * the string identifying the aggregation that the given object should be removed from
    */
  sAggregationName: String,
    /**
    * the position or ID of the ManagedObject that should be removed or that ManagedObject itself; if `vObject`
    * is invalid, a negative value or a value greater or equal than the current size of the aggregation, nothing
    * is removed.
    */
  vObject: ManagedObject,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): ManagedObject | Null = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Removes all objects from the 0..n-aggregation named `sAggregationName`.
    *
    * The removed objects are not destroyed nor are they marked as changed.
    *
    * Additionally, it clears the parent relationship of all removed objects, marks this ManagedObject as changed
    * and returns an array with the removed objects.
    *
    * If the aggregation did not contain any objects, an empty array is returned and this ManagedObject is
    * not marked as changed.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically remove all objects from an aggregation.
    * Use the concrete method removeAllXYZ for aggregation 'XYZ' instead.
    *
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAggregation(/**
    * Name of the aggregation to remove all objects from
    */
  sAggregationName: String): js.Array[ManagedObject] = js.native
  def removeAllAggregation(
    /**
    * Name of the aggregation to remove all objects from
    */
  sAggregationName: String,
    /**
    * If true, this `ManagedObject` is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): js.Array[ManagedObject] = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Removes all the objects in the 0..n-association named `sAssociationName` and returns an array with their
    * IDs. This ManagedObject is marked as changed, if the association contained any objects.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically remove all object from an association.
    * Use the concrete method removeAllXYZ for association 'XYZ' instead.
    *
    * @returns an array with the IDs of the removed objects (might be empty)
    */
  def removeAllAssociation(/**
    * the name of the association
    */
  sAssociationName: String): js.Array[Any] = js.native
  def removeAllAssociation(
    /**
    * the name of the association
    */
  sAssociationName: String,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): js.Array[Any] = js.native
  
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: String
  ): String | Null = js.native
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: String,
    /**
    * if `true`, the managed object is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): String | Null = js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Removes a `ManagedObject` from the association named `sAssociationName`.
    *
    * If an object is removed, the ID of that object is returned and this `ManagedObject` is marked as changed.
    * Otherwise `null` is returned.
    *
    * If the same object was added multiple times to the same association, only a single occurrence of it will
    * be removed by this method. If the object is not found or if the parameter can't be interpreted neither
    * as a `ManagedObject` (or ID) nor as an index in the association, nothing will be removed. The same is
    * true if an index is given and if that index is out of range for the association.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically remove an object from an association.
    * Use the concrete method removeXYZ for association 'XYZ' instead.
    *
    * @returns ID of the removed `ManagedObject` or `null`
    */
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: int
  ): String | Null = js.native
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: int,
    /**
    * if `true`, the managed object is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): String | Null = js.native
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: ManagedObject
  ): String | Null = js.native
  def removeAssociation(
    /**
    * the string identifying the association the `ManagedObject` should be removed from.
    */
  sAssociationName: String,
    /**
    * the position or ID of the `ManagedObject` to remove or the `ManagedObject` itself; if `vObject` is invalid
    * input, a negative value or a value greater or equal than the current size of the association, nothing
    * is removed
    */
  vObject: ManagedObject,
    /**
    * if `true`, the managed object is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): String | Null = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Resets the given property to the default value and also restores the "initial" state (like it has never
    * been set).
    *
    * As subclasses might have implemented side effects in the named setter `setXYZ` for property 'xyz', that
    * setter is called with a value of `null`, which by convention restores the default value of the property.
    * This is only done to notify subclasses, the internal state is anyhow reset.
    *
    * When the property has not been modified so far, nothing will be done.
    *
    * @returns Returns `this` to allow method chaining
    */
  def resetProperty(/**
    * Name of the property
    */
  sPropertyName: String): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Sets a new object in the named 0..1 aggregation of this ManagedObject and marks this ManagedObject as
    * changed.
    *
    * If the given object is not valid with regard to the aggregation (if it is not an instance of the type
    * specified for that aggregation) or when the method is called for an aggregation of cardinality 0..n,
    * then an Error is thrown (see {@link #validateAggregation}.
    *
    * If the new object is the same as the currently aggregated object, then the internal state is not modified
    * and this ManagedObject is not marked as changed.
    *
    * If the given object is different, the parent of a previously aggregated object is cleared (it must have
    * been this ManagedObject before), the parent of the given object is set to this ManagedObject and {@link #invalidate }
    * is called for this object.
    *
    * Note that this method does neither return nor destroy the previously aggregated object. This behavior
    * is inherited by named set methods (see below) in subclasses. To avoid memory leaks, applications therefore
    * should first get the aggregated object, keep a reference to it or destroy it, depending on their needs,
    * and only then set a new object.
    *
    * Note that ManagedObject only implements a single level of change tracking: if a first call to setAggregation
    * recognizes a change, 'invalidate' is called. If another call to setAggregation reverts that change, invalidate()
    * will be called again, the new status is not recognized as being 'clean' again.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically set an object in an aggregation. Use
    * the concrete method setXYZ for aggregation 'XYZ' or the generic {@link #applySettings} instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def setAggregation(
    /**
    * name of an 0..1 aggregation
    */
  sAggregationName: String,
    /**
    * the managed object that is set as aggregated object
    */
  oObject: ManagedObject
  ): this.type = js.native
  def setAggregation(
    /**
    * name of an 0..1 aggregation
    */
  sAggregationName: String,
    /**
    * the managed object that is set as aggregated object
    */
  oObject: ManagedObject,
    /**
    * if true, this ManagedObject is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Sets the associated object for the given managed association of cardinality '0..1' and marks this ManagedObject
    * as changed.
    *
    * The associated object can either be given by itself or by its id. If `null` or `undefined` is given,
    * the association is cleared.
    *
    * **Note:** This method is a low-level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically set an object in an association. Use
    * the concrete method setXYZ for association 'XYZ' or the generic {@link #applySettings} instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def setAssociation(
    /**
    * name of the association
    */
  sAssociationName: String,
    /**
    * the ID of the managed object that is set as an association, or the managed object itself or null
    */
  sId: String
  ): this.type = js.native
  def setAssociation(
    /**
    * name of the association
    */
  sAssociationName: String,
    /**
    * the ID of the managed object that is set as an association, or the managed object itself or null
    */
  sId: String,
    /**
    * if true, the managed objects invalidate method is not called
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  def setAssociation(
    /**
    * name of the association
    */
  sAssociationName: String,
    /**
    * the ID of the managed object that is set as an association, or the managed object itself or null
    */
  sId: ManagedObject
  ): this.type = js.native
  def setAssociation(
    /**
    * name of the association
    */
  sAssociationName: String,
    /**
    * the ID of the managed object that is set as an association, or the managed object itself or null
    */
  sId: ManagedObject,
    /**
    * if true, the managed objects invalidate method is not called
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Set the binding context for this ManagedObject for the model with the given name.
    *
    * **Note:** to be compatible with future versions of this API, you must not use the following model names:
    *
    * 	 - `null`
    * 	 - empty string `""`
    * 	 - string literals `"null"` or `"undefined"`  Omitting the model name (or using the value `undefined`)
    *     is explicitly allowed and refers to the default model.
    *
    * A value of `null` for `oContext` hides the parent context. The parent context will no longer be propagated
    * to aggregated child controls. A value of `undefined` removes a currently active context or a `null` context
    * and the parent context gets visible and propagated again.
    *
    * **Note:** A ManagedObject inherits binding contexts from the Core only when it is a descendant of a UIArea.
    *
    * @returns reference to the instance itself
    */
  def setBindingContext(
    /**
    * the new binding context for this object
    */
  oContext: typings.openui5.sapUiModelContextMod.default
  ): this.type = js.native
  def setBindingContext(
    /**
    * the new binding context for this object
    */
  oContext: typings.openui5.sapUiModelContextMod.default,
    /**
    * the name of the model to set the context for or `undefined`
    */
  sModelName: String
  ): this.type = js.native
  
  /**
    * Sets or unsets a model for the given model name for this ManagedObject.
    *
    * The `sName` must either be `undefined` (or omitted) or a non-empty string. When the name is omitted,
    * the default model is set/unset. To be compatible with future versions of this API, you must not use the
    * following model names:
    * 	 - `null`
    * 	 - empty string `""`
    * 	 - string literals `"null"` or `"undefined"`
    *
    * When `oModel` is `null` or `undefined`, a previously set model with that name is removed from this ManagedObject.
    * If an ancestor (parent, UIArea or Core) has a model with that name, this ManagedObject will immediately
    * inherit that model from its ancestor.
    *
    * All local bindings that depend on the given model name are updated (created if the model references became
    * complete now; updated, if any model reference has changed; removed if the model references became incomplete
    * now).
    *
    * Any change (new model, removed model, inherited model) is also applied to all aggregated descendants
    * as long as a descendant doesn't have its own model set for the given name.
    *
    * **Note:** By design, it is not possible to hide an inherited model by setting a `null` or `undefined`
    * model. Applications can set an empty model to achieve the same.
    *
    * **Note:** A ManagedObject inherits models from the Core only when it is a descendant of a UIArea.
    *
    * @returns `this` to allow method chaining
    */
  def setModel(): this.type = js.native
  def setModel(
    /**
    * Model to be set or `null` or `undefined`
    */
  oModel: Null,
    /**
    * the name of the model or `undefined`
    */
  sName: String
  ): this.type = js.native
  def setModel(
    /**
    * Model to be set or `null` or `undefined`
    */
  oModel: Unit,
    /**
    * the name of the model or `undefined`
    */
  sName: String
  ): this.type = js.native
  def setModel(
    /**
    * Model to be set or `null` or `undefined`
    */
  oModel: typings.openui5.sapUiModelModelMod.default
  ): this.type = js.native
  def setModel(
    /**
    * Model to be set or `null` or `undefined`
    */
  oModel: typings.openui5.sapUiModelModelMod.default,
    /**
    * the name of the model or `undefined`
    */
  sName: String
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Sets the given value for the given property after validating and normalizing it, marks this object as
    * changed.
    *
    * If the value is not valid with regard to the declared data type of the property, an Error is thrown.
    * In case `null` or `undefined` is passed, the default value for this property is used (see {@link #validateProperty}).
    * To fully reset the property to initial state, use {@link #resetProperty} instead. If the validated and
    * normalized `oValue` equals the current value of the property, the internal state of this object is not
    * changed (apart from the result of {@link #isPropertyInitial}). If the value changes, it is stored internally
    * and the {@link #invalidate} method is called on this object. In the case of TwoWay databinding, the bound
    * model is informed about the property change.
    *
    * Note that ManagedObject only implements a single level of change tracking: if a first call to setProperty
    * recognizes a change, 'invalidate' is called. If another call to setProperty reverts that change, invalidate()
    * will be called again, the new status is not recognized as being 'clean' again.
    *
    * **Note:** This method is a low level API as described in the class documentation.
    * Applications or frameworks must not use this method to generically set a property. Use the concrete method
    * setXYZ for property 'XYZ' or the generic {@link #applySettings} instead.
    *
    * @returns Returns `this` to allow method chaining
    */
  def setProperty(
    /**
    * name of the property to set
    */
  sPropertyName: String,
    /**
    * value to set the property to
    */
  oValue: Any
  ): this.type = js.native
  def setProperty(
    /**
    * name of the property to set
    */
  sPropertyName: String,
    /**
    * value to set the property to
    */
  oValue: Any,
    /**
    * if true, the managed object is not marked as changed
    */
  bSuppressInvalidate: Boolean
  ): this.type = js.native
  
  /**
    * Unbind the aggregation from the model.
    *
    * After unbinding, the current content of the aggregation is destroyed by default. When the `bSuppressReset`
    * parameter is set, it is however retained.
    *
    * @returns Reference to this instance itself
    */
  def unbindAggregation(
    /**
    * Name of the aggregation
    */
  sName: String,
    /**
    * Indicates whether destroying the content of the aggregation is skipped
    */
  bSuppressReset: Boolean
  ): this.type = js.native
  
  /**
    * @deprecated (since 1.11.1) - please use {@link #unbindObject} instead.
    *
    * Removes the defined binding context of this object, all bindings will now resolve relative to the parent
    * context again.
    *
    * @returns reference to the instance itself
    */
  def unbindContext(): this.type = js.native
  def unbindContext(/**
    * name of the model to remove the context for.
    */
  sModelName: String): this.type = js.native
  
  /**
    * Removes the defined binding context of this object, all bindings will now resolve relative to the parent
    * context again.
    *
    * @returns Reference to the instance itself
    */
  def unbindObject(): this.type = js.native
  def unbindObject(/**
    * Name of the model to remove the context for.
    */
  sModelName: String): this.type = js.native
  
  /**
    * Unbind the property from the model
    *
    * @returns reference to the instance itself
    */
  def unbindProperty(
    /**
    * the name of the property
    */
  sName: String,
    /**
    * whether the reset to the default value when unbinding should be suppressed
    */
  bSuppressReset: Boolean
  ): this.type = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Generic method which is called whenever an aggregation binding has changed.
    *
    * Depending on the type of the list binding and on additional configuration, this method either destroys
    * all elements in the aggregation `sName` and recreates them anew or tries to reuse as many existing objects
    * as possible. It is up to the method which strategy it uses.
    *
    * In case a managed object needs special handling for an aggregation binding, it can create a named update
    * method (e.g. `updateRows` for an aggregation `rows`) which then will be called by the framework
    * instead of this generic method. THe method will be called with two arguments `sChangeReason` and `oEventInfo`.
    *
    * Subclasses should call this method only in the implementation of such a named update method and for no
    * other purposes. The framework might change the conditions under which the method is called and the method
    * implementation might rely on those conditions.
    */
  def updateAggregation(
    /**
    * Name of the aggregation to update
    */
  sName: String,
    /**
    * One of the predefined reasons for the change event
    */
  sChangeReason: ChangeReason,
    /**
    * Additional information about the change event
    */
  oEventInfo: DetailedReason
  ): Unit = js.native
  
  def validateAggregation(
    /**
    * the name of the aggregation
    */
  sAggregationName: String,
    /**
    * the aggregated object or a primitive value
    */
  oObject: Any,
    /**
    * whether the caller assumes the aggregation to have cardinality 0..n
    */
  bMultiple: Boolean
  ): ManagedObject | Any = js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Checks whether the given value is of the proper type for the given aggregation name.
    *
    * This method is already called by {@link #setAggregation}, {@link #addAggregation} and {@link #insertAggregation}.
    * In many cases, subclasses of ManagedObject don't need to call it again in their mutator methods.
    *
    * @returns the passed object
    */
  def validateAggregation(
    /**
    * the name of the aggregation
    */
  sAggregationName: String,
    /**
    * the aggregated object or a primitive value
    */
  oObject: ManagedObject,
    /**
    * whether the caller assumes the aggregation to have cardinality 0..n
    */
  bMultiple: Boolean
  ): ManagedObject | Any = js.native
  
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Checks whether the given value is of the proper type for the given property name.
    *
    * In case `null` or `undefined` is passed, the default value for this property is used as value. If no
    * default value is defined for the property, the default value of the type of the property is used.
    *
    * If the property has a data type that is an instance of sap.ui.base.DataType and if a `normalize` function
    * is defined for that type, that function will be called with the resulting value as only argument. The
    * result of the function call is then used instead of the raw value.
    *
    * This method is called by {@link #setProperty}. In many cases, subclasses of ManagedObject don't need
    * to call it themselves.
    *
    * @returns The normalized value for the passed value or for the default value if `null` or `undefined`
    * was passed
    */
  def validateProperty(/**
    * Name of the property
    */
  sPropertyName: String, /**
    * Value to be set
    */
  oValue: Any): Any = js.native
}

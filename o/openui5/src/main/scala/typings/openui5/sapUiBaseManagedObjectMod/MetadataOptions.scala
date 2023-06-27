package typings.openui5.sapUiBaseManagedObjectMod

import typings.openui5.anon.Draggable
import typings.openui5.anon.Type
import typings.openui5.openui5Strings.Accessibility
import typings.openui5.openui5Strings.Appearance
import typings.openui5.openui5Strings.Behavior
import typings.openui5.openui5Strings.Data
import typings.openui5.openui5Strings.Designtime
import typings.openui5.openui5Strings.Dimension
import typings.openui5.openui5Strings.Identification
import typings.openui5.openui5Strings.Misc
import typings.openui5.openui5Strings.bindable
import typings.openui5.openui5Strings.hidden
import typings.openui5.openui5Strings.public
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Aggregation
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Association
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Event
import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions.Property
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataOptions
  extends StObject
     with typings.openui5.sapUiBaseObjectMod.MetadataOptions {
  
  /**
    * An object literal whose properties each define a new aggregation in the ManagedObject subclass. The value
    * can either be a simple string which then will be assumed to be the type of the new aggregation or it
    * can be an object literal with the following properties (see {@link sap.ui.base.ManagedObject.MetadataOptions.Aggregation Aggregation }
    * for details): type, multiple, singularName, visibility, bindable, forwarding, selector. Aggregation names
    * should use camelCase notation, start with a lowercase letter and only use characters from the set [a-zA-Z0-9_$].
    * The name for a hidden aggregations might start with an underscore. If an aggregation in the literal is
    * preceded by a JSDoc comment (doclet) and if the UI5 plugin and template are used for JSDoc3 generation,
    * the doclet will be used as generic documentation of the aggregation.
    *
    * For each public aggregation 'item' of cardinality 0..1, the following methods will be created by the
    * "extend" method and will be added to the prototype of the subclass:
    * 	 - getItem() - returns the current value of aggregation 'item'. Internally calls {@link #getAggregation }
    *     with a default value of `undefined`
    * 	 - setItem(o) - sets 'o' as the new aggregated object in aggregation 'item'. Internally calls {@link #setAggregation }
    *
    * 	 - destroyItem(o) - destroy a currently aggregated object in aggregation 'item' and clears the aggregation.
    *     Internally calls {@link #destroyAggregation}
    * 	 - bindItem(c) - (only if aggregation was defined to be 'bindable'): convenience function that wraps
    *     {@link #bindAggregation}
    * 	 - unbindItem() - (only if aggregation was defined to be 'bindable'): convenience function that wraps
    *     {@link #unbindAggregation}  For a public aggregation 'items' of cardinality 0..n, the following
    *     methods will be created:
    * 	 - getItems() - returns an array with the objects contained in aggregation 'items'. Internally calls
    *     {@link #getAggregation} with a default value of `[]`
    * 	 - addItem(o) - adds an object as last element in the aggregation 'items'. Internally calls {@link #addAggregation }
    *
    * 	 - insertItem(o,p) - inserts an object into the aggregation 'items'. Internally calls {@link #insertAggregation }
    *
    * 	 - indexOfItem(o) - returns the position of the given object within the aggregation 'items'. Internally
    *     calls {@link #indexOfAggregation}
    * 	 - removeItem(v) - removes an object from the aggregation 'items'. Internally calls {@link #removeAggregation }
    *
    * 	 - removeItems() - removes all objects from the aggregation 'items'. Internally calls {@link #removeAllAggregation }
    *
    * 	 - destroyItems() - destroy all currently aggregated objects in aggregation 'items' and clears the aggregation.
    *     Internally calls {@link #destroyAggregation}
    * 	 - bindItems(c) - (only if aggregation was defined to be 'bindable'): convenience function that wraps
    *     {@link #bindAggregation}
    * 	 - unbindItems() - (only if aggregation was defined to be 'bindable'): convenience function that wraps
    *     {@link #unbindAggregation}  For hidden aggregations, no methods are generated.
    */
  var aggregations: js.UndefOr[Record[String, String | Aggregation]] = js.undefined
  
  /**
    * An object literal whose properties each define a new association of the ManagedObject subclass. The value
    * can either be a simple string which then will be assumed to be the type of the new association or it
    * can be an object literal with the following properties (see {@link sap.ui.base.ManagedObject.MetadataOptions.Association Association }
    * for details): type, multiple, singularName, visibility Association names should use camelCase notation,
    * start with a lowercase letter and only use characters from the set [a-zA-Z0-9_$]. If an association in
    * the literal is preceded by a JSDoc comment (doclet) and if the UI5 plugin and template are used for JSDoc3
    * generation, the doclet will be used as generic documentation of the association.
    *
    * For each association 'ref' of cardinality 0..1, the following methods will be created by the "extend"
    * method and will be added to the prototype of the subclass:
    * 	 - getRef() - returns the current value of association 'item'. Internally calls {@link #getAssociation }
    *     with a default value of `undefined`
    * 	 - setRef(o) - sets 'o' as the new associated object in association 'item'. Internally calls {@link #setAssociation }
    *      For a public association 'refs' of cardinality 0..n, the following methods will be created:
    *
    * 	 - getRefs() - returns an array with the objects contained in association 'items'. Internally calls
    *     {@link #getAssociation} with a default value of `[]`
    * 	 - addRef(o) - adds an object as last element in the association 'items'. Internally calls {@link #addAssociation }
    *
    * 	 - removeRef(v) - removes an object from the association 'items'. Internally calls {@link #removeAssociation }
    *
    * 	 - removeAllRefs() - removes all objects from the association 'items'. Internally calls {@link #removeAllAssociation }
    *      For hidden associations, no methods are generated.
    */
  var associations: js.UndefOr[Record[String, String | Association]] = js.undefined
  
  /**
    * When specified, the default aggregation must match the name of one of the aggregations defined for the
    * new subclass (either own or inherited). The named aggregation will be used in contexts where no aggregation
    * is specified. E,g. when an object in an XMLView embeds other objects without naming an aggregation, as
    * in the following example:
    * ```javascript
    *
    *      <!-- assuming the defaultAggregation for Dialog is 'content' -->
    *      <Dialog>
    *        <Text/>
    *        <Button/>
    *      </Dialog>
    *     ```
    */
  var defaultAggregation: js.UndefOr[String] = js.undefined
  
  /**
    * When specified, the default property must match the name of one of the properties defined for the new
    * subclass (either own or inherited). The named property can be used to identify the main property to be
    * used for bound data. E.g. the value property of a field control.
    */
  var defaultProperty: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a module that implements the designtime part. Alternatively `true` to indicate that the module's
    * file is named *.designtime.js with the same base name as the class itself.
    */
  var designtime: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * An object literal whose properties each define a new event of the ManagedObject subclass. In this literal,
    * the property names are used as event names and the values are object literals describing the respective
    * event which can have the following properties (see {@link sap.ui.base.ManagedObject.MetadataOptions.Event Event }
    * for details): allowPreventDefault, parameters Event names should use camelCase notation, start with a
    * lower-case letter and only use characters from the set [a-zA-Z0-9_$]. If an event in the literal is preceded
    * by a JSDoc comment (doclet) and if the UI5 plugin and template are used for JSDoc3 generation, the doclet
    * will be used as generic documentation of the event.
    *
    * For each event 'Some' the following methods will be created by the "extend" method and will be added
    * to the prototype of the subclass:
    * 	 - attachSome(fn,o) - registers a listener for the event. Internally calls {@link #attachEvent}
    * 	 - detachSome(fn,o) - deregisters a listener for the event. Internally calls {@link #detachEvent}
    * 	 - fireSome() - fire the event. Internally calls {@link #fireEvent}
    */
  var events: js.UndefOr[Record[String, String | Event]] = js.undefined
  
  /**
    * Name of the library that the new subclass should belong to. If the subclass is a control or element,
    * it will automatically register with that library so that authoring tools can discover it. By convention,
    * the name of the subclass should have the library name as a prefix, but subfolders are allowed, e.g. `sap.ui.layout.form.Form`
    * belongs to library `sap.ui.layout`.
    */
  var library: js.UndefOr[String] = js.undefined
  
  /**
    * An object literal whose properties each define a new managed property in the ManagedObject subclass.
    * The value can either be a simple string which then will be assumed to be the type of the new property
    * or it can be an object literal with the following properties (see {@link sap.ui.base.ManagedObject.MetadataOptions.Property Property }
    * for details): type, visibility, byValue, group, defaultValue, bindable, selector Property names should
    * use camelCase notation, start with a lowercase letter and only use characters from the set [a-zA-Z0-9_$].
    * If an aggregation in the literal is preceded by a JSDoc comment (doclet) and if the UI5 plugin and template
    * are used for JSDoc3 generation, the doclet will be used as generic documentation of the aggregation.
    *
    * For each public property 'foo', the following methods will be created by the "extend" method and will
    * be added to the prototype of the subclass:
    * 	 - getFoo() - returns the current value of property 'foo'. Internally calls {@link #getProperty}
    * 	 - setFoo(v) - sets 'v' as the new value of property 'foo'. Internally calls {@link #setProperty}
    * 	 - bindFoo(c) - (only if property was defined to be 'bindable'): convenience function that wraps {@link #bindProperty }
    *
    * 	 - unbindFoo() - (only if property was defined to be 'bindable'): convenience function that wraps {@link #unbindProperty }
    *      For hidden properties, no methods are generated.
    */
  var properties: js.UndefOr[Record[String, String | Property]] = js.undefined
  
  /**
    * Special settings are an experimental feature and MUST NOT BE DEFINED in controls or applications outside
    * of the `sap.ui.core` library. There's no generic or general way how to set or get the values for special
    * settings. For the same reason, they cannot be bound against a model. If there's a way for consumers to
    * define a value for a special setting, it must be documented in the class that introduces the setting.
    */
  var specialSettings: js.UndefOr[Record[String, Any]] = js.undefined
}
object MetadataOptions {
  
  inline def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  /**
    * An object literal describing an aggregation of a class derived from `sap.ui.base.ManagedObject`. See
    * {@link sap.ui.base.ManagedObject.MetadataOptions MetadataOptions} for details on its usage.
    */
  trait Aggregation extends StObject {
    
    /**
      * An optional list of alternative types that may be given instead of the main type. Alternative types may
      * only be simple types, no descendants of ManagedObject. An example of altTypes being used is the 'tooltip'
      * aggregation of `sap.ui.core.Element`, which accepts tooltip controls extending `sap.ui.core.TooltipBase`
      * with their own renderer and design, as well as plain strings, which will simply be displayed using the
      * browser's built-in tooltip functionality.
      */
    var altTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * (Either can be omitted or set to the boolean value `true` or the magic string 'bindable'.) If set to
      * `true` or 'bindable', additional named methods `bindName` and `unbindName` are generated
      * as convenience. Despite its name, setting this flag is not mandatory to make the managed aggregation
      * bindable. The generic methods {@link #bindAggregation} and {@link #unbindAggregation} can always be used.
      */
    var bindable: js.UndefOr[Boolean | typings.openui5.openui5Strings.bindable] = js.undefined
    
    /**
      * Flag that marks the aggregation as deprecated (defaults to false). May lead to an additional warning
      * log message at runtime when the aggregation is still used. For the documentation, also add a `@deprecated`
      * tag in the JSDoc, describing since when it is deprecated and what any alternatives are.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only available for aggregations of a class extending `sap.ui.core.Element`, which is a subclass of `sap.ui.base.ManagedObject`!
      * Defines draggable and droppable configuration of the aggregation. If the `dnd` property is of type Boolean,
      * then the `draggable` and `droppable` configuration are both set to this Boolean value and the layout
      * (in case of enabled dnd) is set to default ("Vertical").
      */
    var dnd: js.UndefOr[Boolean | Draggable] = js.undefined
    
    /**
      * If set, this defines a forwarding of objects added to this aggregation into an aggregation of another
      * ManagedObject - typically to an inner control within a composite control. This means that all adding,
      * removal, or other operations happening on the source aggregation are actually called on the target instance.
      * All elements added to the source aggregation will be located at the target aggregation (this means the
      * target instance is their parent). Both, source and target element will return the added elements when
      * asked for the content of the respective aggregation. If present, the named (non-generic) aggregation
      * methods will be called for the target aggregation. Aggregations can only be forwarded to non-hidden aggregations
      * of the same or higher multiplicity (i.e. an aggregation with multiplicity "0..n" cannot be forwarded
      * to an aggregation with multiplicity "0..1"). The target aggregation must also be "compatible" to the
      * source aggregation in the sense that any items given to the source aggregation must also be valid in
      * the target aggregation (otherwise the target element will throw a validation error). If the forwarded
      * elements use data binding, the target element must be properly aggregated by the source element to make
      * sure all models are available there as well. The aggregation target must remain the same instance across
      * the entire lifetime of the source control. Aggregation forwarding will behave unexpectedly when the content
      * in the target aggregation is modified by other actors (e.g. by the target element or by another forwarding
      * from a different source aggregation). Hence, this is not allowed.
      */
    var forwarding: js.UndefOr[typings.openui5.anon.Aggregation] = js.undefined
    
    /**
      * Whether the aggregation is a 0..1 (false) or a 0..n aggregation (true), defaults to true
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be set to a valid CSS selector (as accepted by the {@link https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelector Element.prototype.querySelector }
      * method). When set, it locates the DOM element that surrounds the aggregation's content. It should only
      * be set for aggregations that have a visual representation in the DOM. A DOM element surrounding the aggregation's
      * rendered content should be available in the DOM, even if the aggregation is empty or not rendered for
      * some reason. In cases where this is not possible or not intended, `getDomRefForSetting` can be overridden,
      * see below.
      *
      * The purpose of the selector is to allow other framework parts like drag and drop or design time tooling
      * to identify those DOM parts of a control or element that represent a specific aggregation without knowing
      * the control or element implementation in detail.
      *
      * As an extension to the standard CSS selector syntax, the selector string can contain the placeholder
      * `{id}` (multiple times). Before evaluating the selector in the context of an element or control, all
      * occurrences of the placeholder have to be replaced by the (potentially escaped) ID of that element or
      * control. In fact, any selector should start with `#{id}` to ensure that the query result is limited to
      * the desired element or control.
      *
      * **Note**: there is a convenience method {@link sap.ui.core.Element#getDomRefForSetting} that evaluates
      * the selector in the context of a concrete element or control instance. It also handles the placeholder
      * `{id}`. Only selected framework features may use that private method, it is not yet a public API and
      * might be changed or removed in future versions of UI5. However, instead of maintaining the `selector`
      * in the metadata, element and control classes can overwrite `getDomRefForSetting` to calculate or add
      * the appropriate DOM Element dynamically.
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Singular name for 0..n aggregations. For 0..n aggregations the name by convention should be the plural
      * name. Methods affecting multiple objects in an aggregation will use the plural name (e.g. getItems(),
      * whereas methods that deal with a single object will use the singular name (e.g. addItem). The framework
      * knows a set of common rules for building the plural form of English nouns and uses these rules to determine
      * a singular name on its own. If that name is wrong, a singluarName can be specified with this property.
      */
    var singularName: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the new aggregation. Must be the full global name of a ManagedObject subclass or a UI5 interface
      * (in dot notation, e.g. 'sap.m.Button').
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Either 'hidden' or 'public', defaults to 'public'. Aggregations that belong to the API of a class must
      * be 'public' whereas 'hidden' aggregations typically are used for the implementation of composite classes
      * (e.g. composite controls). Only public aggregations are accepted by the constructor or by `applySettings`
      * or in declarative representations like an `XMLView`. Equally, only public aggregations are cloned.
      */
    var visibility: js.UndefOr[hidden | public] = js.undefined
  }
  object Aggregation {
    
    inline def apply(): Aggregation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aggregation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aggregation] (val x: Self) extends AnyVal {
      
      inline def setAltTypes(value: js.Array[String]): Self = StObject.set(x, "altTypes", value.asInstanceOf[js.Any])
      
      inline def setAltTypesUndefined: Self = StObject.set(x, "altTypes", js.undefined)
      
      inline def setAltTypesVarargs(value: String*): Self = StObject.set(x, "altTypes", js.Array(value*))
      
      inline def setBindable(value: Boolean | bindable): Self = StObject.set(x, "bindable", value.asInstanceOf[js.Any])
      
      inline def setBindableUndefined: Self = StObject.set(x, "bindable", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDnd(value: Boolean | Draggable): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
      
      inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
      
      inline def setForwarding(value: typings.openui5.anon.Aggregation): Self = StObject.set(x, "forwarding", value.asInstanceOf[js.Any])
      
      inline def setForwardingUndefined: Self = StObject.set(x, "forwarding", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSingularName(value: String): Self = StObject.set(x, "singularName", value.asInstanceOf[js.Any])
      
      inline def setSingularNameUndefined: Self = StObject.set(x, "singularName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(value: hidden | public): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  /**
    * An object literal describing an association of a class derived from `sap.ui.base.ManagedObject`. See
    * {@link sap.ui.base.ManagedObject.MetadataOptions MetadataOptions} for details on its usage.
    */
  trait Association extends StObject {
    
    /**
      * Flag that marks the association as deprecated (defaults to false). May lead to an additional warning
      * log message at runtime when the association is still used. For the documentation, also add a `@deprecated`
      * tag in the JSDoc, describing since when it is deprecated and what any alternatives are.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the association is a 0..1 (false) or a 0..n association (true), defaults to false (0..1) for
      * associations
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom singular name. This is only relevant for 0..n associations where the association name should be
      * defined in plural form and the framework tries to generate the singular form of it for certain places
      * where it is needed. To do so, the framework knows a set of common rules for building the plural form
      * of English nouns and uses these rules to determine a singular name on its own. If that name is wrong,
      * a singularName can be specified with this property. E.g. for an association named `items`, methods affecting
      * multiple objects in an association will use the plural name (`getItems()`), whereas methods that deal
      * with a single object will automatically use the generated singular name (e.g. `addItem(...)`). However,
      * the generated singular form for an association `news` would be `new`, which is wrong, so the singular
      * name "news" would need to be set.
      */
    var singularName: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the new association
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Either 'hidden' or 'public', defaults to 'public'. Associations that belong to the API of a class must
      * be 'public' whereas 'hidden' associations can only be used internally. Only public associations are accepted
      * by the constructor or by `applySettings` or in declarative representations like an `XMLView`. Equally,
      * only public associations are cloned.
      */
    var visibility: js.UndefOr[hidden | public] = js.undefined
  }
  object Association {
    
    inline def apply(): Association = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Association]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Association] (val x: Self) extends AnyVal {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setSingularName(value: String): Self = StObject.set(x, "singularName", value.asInstanceOf[js.Any])
      
      inline def setSingularNameUndefined: Self = StObject.set(x, "singularName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisibility(value: hidden | public): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  /**
    * An object literal describing an event of a class derived from `sap.ui.base.ManagedObject`. See {@link sap.ui.base.ManagedObject.MetadataOptions MetadataOptions }
    * for details on its usage.
    */
  trait Event extends StObject {
    
    /**
      * Whether the event allows to prevented the default behavior of the event source
      */
    var allowPreventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag that marks the event as deprecated (defaults to false). May lead to an additional warning log message
      * at runtime when the event is still used. For the documentation, also add a `@deprecated` tag in the JSDoc,
      * describing since when it is deprecated and what any alternatives are.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether event bubbling is enabled on this event. When `true` the event is also forwarded to the parent(s)
      * of the object (see {@link sap.ui.base.EventProvider#getEventingParent}) until the bubbling of the event
      * is stopped or no parent is available anymore.
      */
    var enableEventBubbling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object literal that describes the parameters of this event; the keys are the parameter names and the
      * values are objects with a 'type' property that specifies the type of the respective parameter.
      */
    var parameters: js.UndefOr[Record[String, Type | String]] = js.undefined
  }
  object Event {
    
    inline def apply(): Event = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setAllowPreventDefault(value: Boolean): Self = StObject.set(x, "allowPreventDefault", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventDefaultUndefined: Self = StObject.set(x, "allowPreventDefault", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setEnableEventBubbling(value: Boolean): Self = StObject.set(x, "enableEventBubbling", value.asInstanceOf[js.Any])
      
      inline def setEnableEventBubblingUndefined: Self = StObject.set(x, "enableEventBubbling", js.undefined)
      
      inline def setParameters(value: Record[String, Type | String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, String | Aggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAssociations(value: Record[String, String | Association]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setDefaultAggregation(value: String): Self = StObject.set(x, "defaultAggregation", value.asInstanceOf[js.Any])
    
    inline def setDefaultAggregationUndefined: Self = StObject.set(x, "defaultAggregation", js.undefined)
    
    inline def setDefaultProperty(value: String): Self = StObject.set(x, "defaultProperty", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropertyUndefined: Self = StObject.set(x, "defaultProperty", js.undefined)
    
    inline def setDesigntime(value: String | Boolean): Self = StObject.set(x, "designtime", value.asInstanceOf[js.Any])
    
    inline def setDesigntimeUndefined: Self = StObject.set(x, "designtime", js.undefined)
    
    inline def setEvents(value: Record[String, String | Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setProperties(value: Record[String, String | Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSpecialSettings(value: Record[String, Any]): Self = StObject.set(x, "specialSettings", value.asInstanceOf[js.Any])
    
    inline def setSpecialSettingsUndefined: Self = StObject.set(x, "specialSettings", js.undefined)
  }
  
  /**
    * An object literal describing a property of a class derived from `sap.ui.base.ManagedObject`. See {@link sap.ui.base.ManagedObject.MetadataOptions MetadataOptions }
    * for details on its usage.
    */
  trait Property extends StObject {
    
    /**
      * (Either can be omitted or set to the boolean value `true` or the magic string 'bindable'.) If set to
      * `true` or 'bindable', additional named methods `bindName` and `unbindName` are generated
      * as convenience. Despite its name, setting this flag is not mandatory to make the managed property bindable.
      * The generic methods {@link #bindProperty} and {@link #unbindProperty} can always be used.
      */
    var bindable: js.UndefOr[Boolean | typings.openui5.openui5Strings.bindable] = js.undefined
    
    /**
      * If set to `true`, the property value will be {@link module:sap/base/util/deepClone deep cloned} on write
      * and read operations to ensure that the internal value can't be modified by the outside. The property
      * `byValue` is currently restricted to a `boolean` value. Other types are reserved for future use. Class
      * definitions must only use boolean values for the flag (or omit it), but readers of ManagedObject metadata
      * should handle any truthy value as `true` to be future safe. Note that using `byValue:true` has a performance
      * impact on property access and therefore should be used carefully. It also doesn't make sense to set this
      * option for properties with a primitive type (they have value semantic anyhow) or for properties with
      * arrays of primitive types (they are already cloned with a less expensive implementation). Defaults to
      * 'false'.
      */
    var byValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the property or null if there is no specific default value defined (the data type's
      * default becomes the default value in this case, e.g. `false` for boolean and the empty string for type
      * string). Omitting this property means the default value is `undefined`.
      */
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    /**
      * Flag that marks the property as deprecated (defaults to false). May lead to an additional warning log
      * message at runtime when the property is still used. For the documentation, also add a `@deprecated` tag
      * in the JSDoc, describing since when it is deprecated and what any alternatives are.
      */
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A semantic grouping of the properties, intended to be used in design time tools. Allowed values are (case
      * sensitive): Accessibility, Appearance, Behavior, Data, Designtime, Dimension, Identification, Misc
      */
    var group: js.UndefOr[
        Accessibility | Appearance | Behavior | Data | Designtime | Dimension | Identification | Misc
      ] = js.undefined
    
    /**
      * Can be set to a valid CSS selector (as accepted by the {@link https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelector Element.prototype.querySelector }
      * method). When set, it locates the DOM element that represents this property's value. It should only be
      * set for properties that have a visual text representation in the DOM.
      *
      * The purpose of the selector is to allow other framework parts or design time tooling to identify the
      * DOM parts of a control or element that represent a specific property without knowing the control or element
      * implementation in detail.
      *
      * As an extension to the standard CSS selector syntax, the selector string can contain the placeholder
      * `{id}` (multiple times). Before evaluating the selector in the context of an element or control, all
      * occurrences of the placeholder have to be replaced by the (potentially escaped) ID of that element or
      * control. In fact, any selector should start with `#{id}` to ensure that the query result is limited to
      * the desired element or control.
      *
      * **Note**: there is a convenience method {@link sap.ui.core.Element#getDomRefForSetting} that evaluates
      * the selector in the context of a concrete element or control instance. It also handles the placeholder
      * `{id}`. Only selected framework features may use that private method, it is not yet a public API and
      * might be changed or removed in future versions of UI5. However, instead of maintaining the `selector`
      * in the metadata, element and control classes can overwrite `getDomRefForSetting` and determine the DOM
      * element dynamically.
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the new property. Must either be one of the built-in types 'string', 'boolean', 'int', 'float',
      * 'object', 'function' or 'any', or a type created and registered with {@link sap.ui.base.DataType.createType }
      * or an array type based on one of the previous types (e.g. 'int[]' or 'string[]', but not just 'array').
      */
    var `type`: String
    
    /**
      * Either 'hidden' or 'public', defaults to 'public'. Properties that belong to the API of a class must
      * be 'public' whereas 'hidden' properties can only be used internally. Only public properties are accepted
      * by the constructor or by `applySettings` or in declarative representations like an `XMLView`. Equally,
      * only public properties are cloned.
      */
    var visibility: js.UndefOr[hidden | public] = js.undefined
  }
  object Property {
    
    inline def apply(`type`: String): Property = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      inline def setBindable(value: Boolean | bindable): Self = StObject.set(x, "bindable", value.asInstanceOf[js.Any])
      
      inline def setBindableUndefined: Self = StObject.set(x, "bindable", js.undefined)
      
      inline def setByValue(value: Boolean): Self = StObject.set(x, "byValue", value.asInstanceOf[js.Any])
      
      inline def setByValueUndefined: Self = StObject.set(x, "byValue", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setGroup(
        value: Accessibility | Appearance | Behavior | Data | Designtime | Dimension | Identification | Misc
      ): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: hidden | public): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
}

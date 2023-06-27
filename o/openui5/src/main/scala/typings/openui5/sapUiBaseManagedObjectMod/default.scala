package typings.openui5.sapUiBaseManagedObjectMod

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sap/ui/base/ManagedObject", JSImport.Default)
@js.native
/**
  * Constructs and initializes a managed object with the given `sId` and settings.
  *
  * If the optional `mSettings` are given, they must be a simple object that defines values for properties,
  * aggregations, associations or events keyed by their name.
  *
  * **Valid Names and Value Ranges:**
  *
  * The property (key) names supported in the object literal are exactly the (case sensitive) names documented
  * in the JSDoc for the properties, aggregations, associations and events of the current class and its base
  * classes. Note that for 0..n aggregations and associations this name usually is the plural name, whereas
  * it is the singular name in case of 0..1 relations.
  *
  * The possible values for a setting depend on its kind:
  * 	 - for simple properties, the value has to match the documented type of the property (no type conversion
  *     occurs)
  * 	 - for 0..1 aggregations, the value has to be an instance of the aggregated type
  * 	 - for 0..n aggregations, the value has to be an array of instances of the aggregated type or a single
  *     instance
  * 	 - for 0..1 associations, an instance of the associated type or an id (string) is accepted
  * 	 - for 0..n associations, an array of instances of the associated type or of IDs is accepted
  * 	 - for events, either a function (event handler) is accepted or an array of length 2 where the first
  *     element is a function and the 2nd element is an object to invoke the method on; or an array of length
  *     3, where the first element is an arbitrary payload object, the second one is a function and the 3rd one
  *     is an object to invoke the method on; or an array of arrays where each nested array has the 2 or 3 element
  *     structure described before (multiple listeners).
  *
  * Each subclass should document the name and type of its supported settings in its constructor documentation.
  *
  * Example usage:
  * ```javascript
  *
  * new Dialog({
  *    title: "Some title text",            // property of type "string"
  *    showHeader: true,                    // property of type "boolean"
  *    endButton: new Button(...),          // 0..1 aggregation
  *    content: [                           // 0..n aggregation
  *       new Input(...),
  *       new Input(...)
  *    ],
  *    afterClose: function(oEvent) { ... } // event handler function
  * });
  * ```
  *
  *
  * Instead of static values and object instances, data binding expressions can be used, either embedded
  * in a string or as a binding info object as described in {@link #bindProperty} or {@link #bindAggregation}.
  *
  * Example usage:
  * ```javascript
  *
  * new Dialog({
  *    title: "{/title}",       // embedded binding expression, points to a string property in the data model
  *    ...
  *    content: {               // binding info object
  *       path : "/inputItems", // points to a collection in the data model
  *       template : new Input(...)
  *    }
  * });
  * ```
  *
  *
  * Note that when setting string values, any curly braces in those values need to be escaped, so they are
  * not interpreted as binding expressions. Use {@link #escapeSettingsValue} to do so.
  *
  * Besides the settings documented below, ManagedObject itself supports the following special settings:
  *
  * 	 - `id : sap.ui.core.ID` an ID for the new instance. Some subclasses (Element, Component) require
  *     the id to be unique in a specific scope (e.g. an Element Id must be unique across all Elements, a Component
  *     id must be unique across all Components). `models : object` a map of {@link sap.ui.model.Model }
  *     instances keyed by their model name (alias). Each entry with key k in this object has the same
  *     effect as a call `this.setModel(models[k], k);`.
  * 	 - `bindingContexts : object` a map of {@link sap.ui.model.Context} instances keyed by their
  *     model name. Each entry with key k in this object has the same effect as a call `this.setBindingContext(bindingContexts[k],
  *     k);`
  * 	 - `objectBindings : object` a map of binding paths keyed by the corresponding model name. Each
  *     entry with key k in this object has the same effect as a call `this.bindObject(objectBindings[k],
  *     k);` `metadataContexts : object` an array of single binding contexts keyed by the corresponding
  *     model or context name. The purpose of the `metadataContexts` special setting is to deduce as much information
  *     as possible from the binding context of the control in order to be able to predefine certain standard
  *     properties like e.g. visible, enabled, tooltip,...
  *
  * The structure is an array of single contexts, where a single context is a map containing the following
  * keys:
  * 	 - `path: string (mandatory)` The path to the corresponding model property or object, e.g. '/Customers/Name'.
  *     A path can also be relative, e.g. 'Name'
  * 	 - `model: string (optional)` The name of the model, in case there is no name then the undefined
  *     model is taken
  * 	 - `name: string (optional)` A name for the context to used in templating phase
  * 	 - `kind: string (optional)` The kind of the adapter, either `field` for single properties or
  *     `object` for structured contexts. `adapter: string (optional)` The path to an interpretion
  *     class that dilivers control relevant data depending on the context, e.g. enabled, visible. If not supplied
  *     the OData meta data is interpreted.  The syntax for providing the `metadataContexts` is as follows:
  *     `{SINGLE_CONTEXT1},...,{SINGLE_CONTEXTn}` or for simplicity in case there is only one context `{SINGLE_CONTEXT}`.
  *
  * Examples for such metadataContexts are:
  * 	 - `{/Customers/Name}` a single part with an absolute path to the property Name of the Customers
  *     entity set in the default model
  * 	 - `{path: 'Customers/Name', model:'json'}` a single part with an absolute path to the property Name
  *     of the Customers entity set in a named model
  * 	 - `{parts: [{path: 'Customers/Name'},{path: 'editable', model: 'viewModel'}]}` a combination of single
  *     binding contexts, one context from the default model and one from the viewModel
  */
open class default () extends ManagedObject {
  def this(/**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings) = this()
  def this(/**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: String) = this()
  def this(
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: Unit,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
  def this(
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: String,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: Unit,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: String,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: Unit,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: String,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: Unit,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: Unit,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
  def this(
    /**
    * ID for the new managed object; generated automatically if no non-empty ID is given **Note:** this can
    * be omitted, no matter whether `mSettings` will be given or not!
    */
  sId: Unit,
    /**
    * Optional map/JSON-object with initial property values, aggregated objects etc. for the new object
    */
  mSettings: ManagedObjectSettings,
    /**
    * Scope object for resolving string based type and formatter references in bindings. When a scope object
    * is given, `mSettings` cannot be omitted, at least `null` or an empty object literal must be given.
    */
  oScope: js.Object
  ) = this()
}
/* static members */
object default {
  
  @JSImport("sap/ui/base/ManagedObject", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @since 1.52
    *
    * Escapes the given value so it can be used in the constructor's settings object. Should be used when property
    * values are initialized with static string values which could contain binding characters (curly braces).
    *
    * @returns The given value, escaped for usage as static property value in the constructor's settings object
    * (or unchanged, if not of type string)
    */
  inline def escapeSettingsValue(
    /**
    * Value to escape; only needs to be done for string values, but the call will work for all types
    */
  vValue: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeSettingsValue")(vValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Defines a new subclass of ManagedObject with name `sClassName` and enriches it with the information contained
    * in `oClassInfo`.
    *
    * `oClassInfo` can contain the same information that {@link sap.ui.base.Object.extend} already accepts,
    * plus the following new properties in the 'metadata' object literal (see {@link sap.ui.base.ManagedObject.MetadataOptions MetadataOptions }
    * for details on each of them):
    * 	 - `library : string`
    * 	 - `properties : object`
    * 	 - `defaultProperty : string`
    * 	 - `aggregations : object`
    * 	 - `defaultAggregation : string`
    * 	 - `associations : object`
    * 	 - `events : object`
    * 	 - `specialSettings : object` // this one is still experimental and not for public usage!
    *
    * Example:
    * ```javascript
    *
    * ManagedObject.extend('sap.mylib.MyClass', {
    *   metadata : {
    *     library: 'sap.mylib',
    *     properties : {
    *       value: 'string',
    *       width: 'sap.ui.core.CSSSize',
    *       height: { type: 'sap.ui.core.CSSSize', defaultValue: '100%'}
    *       description: { type: 'string', defaultValue: '', selector: '#{id}-desc'}
    *     },
    *     defaultProperty : 'value',
    *     aggregations : {
    *       header : { type: 'sap.mylib.FancyHeader', multiple : false }
    *       items : 'sap.ui.core.Control',
    *       buttons: { type: 'sap.mylib.Button', multiple : true, selector: '#{id} > .sapMLButtonsSection'}
    *     },
    *     defaultAggregation : 'items',
    *     associations : {
    *       initiallyFocused : { type: 'sap.ui.core.Control' }
    *     },
    *     events: {
    *       beforeOpen : {
    *         parameters : {
    *           opener : { type: 'sap.ui.core.Control' }
    *         }
    *       }
    *     },
    *   },
    *
    *   init: function() {
    *   }
    *
    * }); // end of 'extend' call
    * ```
    *
    *
    * @returns The created class / constructor function
    */
  inline def extend[T /* <: Record[String, Any] */](/**
    * Name of the class to be created
    */
  sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class to be created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: Unit,
    /**
    * Constructor function for the metadata object. If not given, it defaults to `sap.ui.base.ManagedObjectMetadata`.
    */
  FNMetaImpl: js.Function
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class to be created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: ClassInfo[T, ManagedObject]
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  inline def extend[T /* <: Record[String, Any] */](
    /**
    * Name of the class to be created
    */
  sClassName: String,
    /**
    * Object literal with information about the class
    */
  oClassInfo: ClassInfo[T, ManagedObject],
    /**
    * Constructor function for the metadata object. If not given, it defaults to `sap.ui.base.ManagedObjectMetadata`.
    */
  FNMetaImpl: js.Function
  ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Returns the metadata for the ManagedObject class.
    *
    * @returns Metadata for the ManagedObject class.
    */
  inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
}

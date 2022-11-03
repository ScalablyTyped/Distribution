package typings.openui5

import typings.openui5.anon.CloneBindings
import typings.openui5.anon.DetailedReason
import typings.openui5.anon.Element
import typings.openui5.anon.Property
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.openui5.sapUiModelChangeReasonMod.ChangeReason
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseManagedObjectMod {
  
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
    * 			occurs)
    * 	 - for 0..1 aggregations, the value has to be an instance of the aggregated type
    * 	 - for 0..n aggregations, the value has to be an array of instances of the aggregated type or a single
    * 			instance
    * 	 - for 0..1 associations, an instance of the associated type or an id (string) is accepted
    * 	 - for 0..n associations, an array of instances of the associated type or of IDs is accepted
    * 	 - for events, either a function (event handler) is accepted or an array of length 2 where the first
    * 			element is a function and the 2nd element is an object to invoke the method on; or an array of length
    * 			3, where the first element is an arbitrary payload object, the second one is a function and the 3rd one
    * 			is an object to invoke the method on; or an array of arrays where each nested array has the 2 or 3 element
    * 			structure described before (multiple listeners).
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
    * 			the id to be unique in a specific scope (e.g. an Element Id must be unique across all Elements, a Component
    * 			id must be unique across all Components). `models : object` a map of {@link sap.ui.model.Model}
    * 			instances keyed by their model name (alias). Each entry with key k in this object has the same
    * 			effect as a call `this.setModel(models[k], k);`.
    * 	 - `bindingContexts : object` a map of {@link sap.ui.model.Context} instances keyed by their
    * 			model name. Each entry with key k in this object has the same effect as a call `this.setBindingContext(bindingContexts[k],
    * 			k);`
    * 	 - `objectBindings : object` a map of binding paths keyed by the corresponding model name. Each
    * 			entry with key k in this object has the same effect as a call `this.bindObject(objectBindings[k],
    * 			k);` `metadataContexts : object` an array of single binding contexts keyed by the corresponding
    * 			model or context name. The purpose of the `metadataContexts` special setting is to deduce as much information
    * 			as possible from the binding context of the control in order to be able to predefine certain standard
    * 			properties like e.g. visible, enabled, tooltip,...
    *
    * The structure is an array of single contexts, where a single context is a map containing the following
    * keys:
    * 	 - `path: string (mandatory)` The path to the corresponding model property or object, e.g. '/Customers/Name'.
    * 			A path can also be relative, e.g. 'Name'
    * 	 - `model: string (optional)` The name of the model, in case there is no name then the undefined
    * 			model is taken
    * 	 - `name: string (optional)` A name for the context to used in templating phase
    * 	 - `kind: string (optional)` The kind of the adapter, either `field` for single properties or
    * 			`object` for structured contexts. `adapter: string (optional)` The path to an interpretion
    * 			class that dilivers control relevant data depending on the context, e.g. enabled, visible. If not supplied
    * 			the OData meta data is interpreted.  The syntax for providing the `metadataContexts` is as follows:
    * 			`{SINGLE_CONTEXT1},...,{SINGLE_CONTEXTn}` or for simplicity in case there is only one context `{SINGLE_CONTEXT}`.
    *
    * Examples for such metadataContexts are:
    * 	 - `{/Customers/Name}` a single part with an absolute path to the property Name of the Customers
    * 			entity set in the default model
    * 	 - `{path: 'Customers/Name', model:'json'}` a single part with an absolute path to the property Name
    * 			of the Customers entity set in a named model
    * 	 - `{parts: [{path: 'Customers/Name'},{path: 'editable', model: 'viewModel'}]}` a combination of single
    * 			binding contexts, one context from the default model and one from the viewModel
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
      * @SINCE 1.52
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
      * plus the following new properties in the 'metadata' object literal:
      *
      *
      * 	 - `library : string`
      * 	 - `properties : object`
      * 	 - `defaultProperty : string`
      * 	 - `aggregations : object`
      * 	 - `defaultAggregation : string`
      * 	 - `associations : object`
      * 	 - `events : object`
      * 	 - `specialSettings : object`// this one is still experimental and not for public usage!
      *
      * Each of these properties is explained in more detail lateron.
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
      * Detailed explanation of properties
      *
      *
      * **'library'** : string
      *  Name of the library that the new subclass should belong to. If the subclass is a control or element,
      * it will automatically register with that library so that authoring tools can discover it. By convention,
      * the name of the subclass should have the library name as a prefix, but subfolders are allowed, e.g. `sap.ui.layout.form.Form`
      * belongs to library `sap.ui.layout`.
      *
      * **'properties'** : object
      *  An object literal whose properties each define a new managed property in the ManagedObject subclass.
      * The value can either be a simple string which then will be assumed to be the type of the new property
      * or it can be an object literal with the following properties
      * 	 - `type: string` type of the new property. Must either be one of the built-in types 'string',
      * 			'boolean', 'int', 'float', 'object', 'function' or 'any', or a type created and registered with {@link
      * 			sap.ui.base.DataType.createType} or an array type based on one of the previous types (e.g. 'int[]' or
      * 			'string[]', but not just 'array').
      * 	 - `visibility: string` either 'hidden' or 'public', defaults to 'public'. Properties that belong
      * 			to the API of a class must be 'public' whereas 'hidden' properties can only be used internally. Only
      * 			public properties are accepted by the constructor or by `applySettings` or in declarative representations
      * 			like an `XMLView`. Equally, only public properties are cloned.
      * 	 - `byValue: boolean` (either can be omitted or set to the boolean value `true`) If set to `true`,
      * 			the property value will be {@link module:sap/base/util/deepClone deep cloned} on write and read operations
      * 			to ensure that the internal value can't be modified by the outside. The property `byValue` is currently
      * 			restricted to a `boolean` value. Other types are reserved for future use. Class definitions must only
      * 			use boolean values for the flag (or omit it), but readers of ManagedObject metadata should handle any
      * 			truthy value as `true` to be future safe. Note that using `byValue:true` has a performance impact on
      * 			property access and therefore should be used carefully. It also doesn't make sense to set this option
      * 			for properties with a primitive type (they have value semantic anyhow) or for properties with arrays
      * 			of primitive types (they are already cloned with a less expensive implementation). `group:string`
      * 			a semantic grouping of the properties, intended to be used in design time tools. Allowed values are (case
      * 			sensitive): Accessibility, Appearance, Behavior, Data, Designtime, Dimension, Identification, Misc
      * 	 - `defaultValue: any` the default value for the property or null if there is no defaultValue.
      *
      * 	 - `bindable: boolean|string` (either can be omitted or set to the boolean value `true` or the
      * 			magic string 'bindable') If set to `true` or 'bindable', additional named methods `bindName` and
      * 			`unbindName` are generated as convenience. Despite its name, setting this flag is not mandatory
      * 			to make the managed property bindable. The generic methods {@link #bindProperty} and {@link #unbindProperty}
      * 			can always be used.  `selector: string` Optional; can be set to a valid CSS selector (as accepted
      * 			by the {@link https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelector Element.prototype.querySelector}
      * 			method). When set, it locates the DOM element that represents this property's value. It should only be
      * 			set for properties that have a visual text representation in the DOM.
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
      * element dynamically.  Property names should use camelCase notation, start with a lowercase
      * letter and only use characters from the set [a-zA-Z0-9_$]. If an aggregation in the literal is preceded
      * by a JSDoc comment (doclet) and if the UI5 plugin and template are used for JSDoc3 generation, the doclet
      * will be used as generic documentation of the aggregation.
      *
      * For each public property 'foo', the following methods will be created by the "extend" method and will
      * be added to the prototype of the subclass:
      * 	 - getFoo() - returns the current value of property 'foo'. Internally calls {@link #getProperty}
      * 	 - setFoo(v) - sets 'v' as the new value of property 'foo'. Internally calls {@link #setProperty}
      * 	 - bindFoo(c) - (only if property was defined to be 'bindable'): convenience function that wraps {@link
      * 			#bindProperty}
      * 	 - unbindFoo() - (only if property was defined to be 'bindable'): convenience function that wraps {@link
      * 			#unbindProperty}  For hidden properties, no methods are generated.
      *
      * **'defaultProperty'** : string
      *  When specified, the default property must match the name of one of the properties defined for the new
      * subclass (either own or inherited). The named property can be used to identify the main property to be
      * used for bound data. E.g. the value property of a field control.
      *
      * **'aggregations'** : object
      *  An object literal whose properties each define a new aggregation in the ManagedObject subclass. The
      * value can either be a simple string which then will be assumed to be the type of the new aggregation
      * or it can be an object literal with the following properties
      * 	 - `type: string` type of the new aggregation. must be the full global name of a ManagedObject
      * 			subclass or UI5 interface (in dot notation, e.g. 'sap.m.Button')
      * 	 - `[multiple]: boolean` whether the aggregation is a 0..1 (false) or a 0..n aggregation (true),
      * 			defaults to true
      * 	 - `[singularName]: string`. Singular name for 0..n aggregations. For 0..n aggregations the name
      * 			by convention should be the plural name. Methods affecting multiple objects in an aggregation will use
      * 			the plural name (e.g. getItems(), whereas methods that deal with a single object will use the singular
      * 			name (e.g. addItem). The framework knows a set of common rules for building plural form of English nouns
      * 			and uses these rules to determine a singular name on its own. if that name is wrong, a singluarName can
      * 			be specified with this property.
      * 	 - `[visibility]: string` either 'hidden' or 'public', defaults to 'public'. Aggregations that
      * 			belong to the API of a class must be 'public' whereas 'hidden' aggregations typically are used for the
      * 			implementation of composite classes (e.g. composite controls). Only public aggregations are accepted
      * 			by the constructor or by `applySettings` or in declarative representations like an `XMLView`. Equally,
      * 			only public aggregations are cloned.
      * 	 - `bindable: boolean|string` (either can be omitted or set to the boolean value `true` or the
      * 			magic string 'bindable') If set to `true` or 'bindable', additional named methods `bindName` and
      * 			`unbindName` are generated as convenience. Despite its name, setting this flag is not mandatory
      * 			to make the managed aggregation bindable. The generic methods {@link #bindAggregation} and {@link #unbindAggregation}
      * 			can always be used.
      * 	 - `forwarding: object` If set, this defines a forwarding of objects added to this aggregation
      * 			into an aggregation of another ManagedObject - typically to an inner control within a composite control.
      * 			This means that all adding, removal, or other operations happening on the source aggregation are actually
      * 			called on the target instance. All elements added to the source aggregation will be located at the target
      * 			aggregation (this means the target instance is their parent). Both, source and target element will return
      * 			the added elements when asked for the content of the respective aggregation. If present, the named (non-generic)
      * 			aggregation methods will be called for the target aggregation. Aggregations can only be forwarded to
      * 			non-hidden aggregations of the same or higher multiplicity (i.e. an aggregation with multiplicity "0..n"
      * 			cannot be forwarded to an aggregation with multiplicity "0..1"). The target aggregation must also be
      * 			"compatible" to the source aggregation in the sense that any items given to the source aggregation must
      * 			also be valid in the target aggregation (otherwise the target element will throw a validation error).
      * 			If the forwarded elements use data binding, the target element must be properly aggregated by the source
      * 			element to make sure all models are available there as well. The aggregation target must remain the same
      * 			instance across the entire lifetime of the source control. Aggregation forwarding will behave unexpectedly
      * 			when the content in the target aggregation is modified by other actors (e.g. by the target element or
      * 			by another forwarding from a different source aggregation). Hence, this is not allowed. The forwarding
      * 			configuration object defines the target of the forwarding. The available settings are:
      * 	`idSuffix: string`A string which is appended to the ID of this ManagedObject to construct
      * the ID of the target ManagedObject. This is one of the two options to specify the target. This option
      * requires the target instance to be created in the init() method of this ManagedObject and to be always
      * available.
      * 	 - `getter: string`The name of the function on instances of this ManagedObject which returns
      * 			the target instance. This second option to specify the target can be used for lazy instantiation of the
      * 			target. Note that either idSuffix or getter must be given. Also note that the target instance returned
      * 			by the getter must remain the same over the entire lifetime of this ManagedObject and the implementation
      * 			assumes that all instances return the same type of object (at least the target aggregation must always
      * 			be defined in the same class).
      * 	 - `aggregation: string`The name of the aggregation on the target into which the objects shall
      * 			be forwarded. The multiplicity of the target aggregation must be the same as the one of the source aggregation
      * 			for which forwarding is defined.
      * 	 - `[forwardBinding]: boolean`Whether any binding should happen on the forwarding target or not.
      * 			Default if omitted is `false`, which means any bindings happen on the outer ManagedObject. When the binding
      * 			is forwarded, all binding methods like updateAggregation, getBindingInfo, refreshAggregation etc. are
      * 			called on the target element of the forwarding instead of being called on this element. The basic aggregation
      * 			mutator methods (add/remove etc.) are only called on the forwarding target element. Without forwardBinding,
      * 			they are called on this element, but forwarded to the forwarding target, where they actually modify the
      * 			aggregation.    `selector: string` Optional; can be set to a valid CSS selector
      * 			(as accepted by the {@link https://developer.mozilla.org/en-US/docs/Web/API/Element/querySelector Element.prototype.querySelector}
      * 			method). When set, it locates the DOM element that surrounds the aggregation's content. It should only
      * 			be set for aggregations that have a visual representation in the DOM. A DOM element surrounding the aggregation's
      * 			rendered content should be available in the DOM, even if the aggregation is empty or not rendered for
      * 			some reason. In cases where this is not possible or not intended, `getDomRefForSetting` can be overridden,
      * 			see below.
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
      * the appropriate DOM Element dynamically.   Aggregation names should use camelCase notation,
      * start with a lowercase letter and only use characters from the set [a-zA-Z0-9_$]. The name for a hidden
      * aggregations might start with an underscore. If an aggregation in the literal is preceded by a JSDoc
      * comment (doclet) and if the UI5 plugin and template are used for JSDoc3 generation, the doclet will be
      * used as generic documentation of the aggregation.
      *
      * For each public aggregation 'item' of cardinality 0..1, the following methods will be created by the
      * "extend" method and will be added to the prototype of the subclass:
      * 	 - getItem() - returns the current value of aggregation 'item'. Internally calls {@link #getAggregation}
      * 			with a default value of `undefined`
      * 	 - setItem(o) - sets 'o' as the new aggregated object in aggregation 'item'. Internally calls {@link
      * 			#setAggregation}
      * 	 - destroyItem(o) - destroy a currently aggregated object in aggregation 'item' and clears the aggregation.
      * 			Internally calls {@link #destroyAggregation}
      * 	 - bindItem(c) - (only if aggregation was defined to be 'bindable'): convenience function that wraps
      * 			{@link #bindAggregation}
      * 	 - unbindItem() - (only if aggregation was defined to be 'bindable'): convenience function that wraps
      * 			{@link #unbindAggregation}  For a public aggregation 'items' of cardinality 0..n, the following
      * 			methods will be created:
      * 	 - getItems() - returns an array with the objects contained in aggregation 'items'. Internally calls
      * 			{@link #getAggregation} with a default value of `[]`
      * 	 - addItem(o) - adds an object as last element in the aggregation 'items'. Internally calls {@link #addAggregation}
      *
      * 	 - insertItem(o,p) - inserts an object into the aggregation 'items'. Internally calls {@link #insertAggregation}
      *
      * 	 - indexOfItem(o) - returns the position of the given object within the aggregation 'items'. Internally
      * 			calls {@link #indexOfAggregation}
      * 	 - removeItem(v) - removes an object from the aggregation 'items'. Internally calls {@link #removeAggregation}
      *
      * 	 - removeItems() - removes all objects from the aggregation 'items'. Internally calls {@link #removeAllAggregation}
      *
      * 	 - destroyItems() - destroy all currently aggregated objects in aggregation 'items' and clears the aggregation.
      * 			Internally calls {@link #destroyAggregation}
      * 	 - bindItems(c) - (only if aggregation was defined to be 'bindable'): convenience function that wraps
      * 			{@link #bindAggregation}
      * 	 - unbindItems() - (only if aggregation was defined to be 'bindable'): convenience function that wraps
      * 			{@link #unbindAggregation}  For hidden aggregations, no methods are generated.
      *
      * **'defaultAggregation'** : string
      *  When specified, the default aggregation must match the name of one of the aggregations defined for the
      * new subclass (either own or inherited). The named aggregation will be used in contexts where no aggregation
      * is specified. E,g. when an object in an XMLView embeds other objects without naming an aggregation, as
      * in the following example:
      * ```javascript
      *
      *  <!-- assuming the defaultAggregation for Dialog is 'content' -->
      *  <Dialog>
      *    <Text/>
      *    <Button/>
      *  </Dialog>
      * ```
      *
      *
      * **'associations'** : object
      *  An object literal whose properties each define a new association of the ManagedObject subclass. The
      * value can either be a simple string which then will be assumed to be the type of the new association
      * or it can be an object literal with the following properties
      * 	 - `type: string` type of the new association
      * 	 - `multiple: boolean` whether the association is a 0..1 (false) or a 0..n association (true),
      * 			defaults to false(1) for associations
      * 	 - `[singularName]: string`. Singular name for 0..n associations. For 0..n associations the name
      * 			by convention should be the plural name. Methods affecting multiple objects in an association will use
      * 			the plural name (e.g. getItems(), whereas methods that deal with a single object will use the singular
      * 			name (e.g. addItem). The framework knows a set of common rules for building plural form of English nouns
      * 			and uses these rules to determine a singular name on its own. if that name is wrong, a singluarName can
      * 			be specified with this property.
      * 	 - `visibility: string` either 'hidden' or 'public', defaults to 'public'. Associations that
      * 			belong to the API of a class must be 'public' whereas 'hidden' associations can only be used internally.
      * 			Only public associations are accepted by the constructor or by `applySettings` or in declarative representations
      * 			like an `XMLView`. Equally, only public associations are cloned.  Association names should use camelCase
      * 			notation, start with a lowercase letter and only use characters from the set [a-zA-Z0-9_$]. If an association
      * 			in the literal is preceded by a JSDoc comment (doclet) and if the UI5 plugin and template are used for
      * 			JSDoc3 generation, the doclet will be used as generic documentation of the association.
      *
      * For each association 'ref' of cardinality 0..1, the following methods will be created by the "extend"
      * method and will be added to the prototype of the subclass:
      * 	 - getRef() - returns the current value of association 'item'. Internally calls {@link #getAssociation}
      * 			with a default value of `undefined`
      * 	 - setRef(o) - sets 'o' as the new associated object in association 'item'. Internally calls {@link
      * 			#setAssociation}  For a public association 'refs' of cardinality 0..n, the following methods will
      * 			be created:
      * 	 - getRefs() - returns an array with the objects contained in association 'items'. Internally calls
      * 			{@link #getAssociation} with a default value of `[]`
      * 	 - addRef(o) - adds an object as last element in the association 'items'. Internally calls {@link #addAssociation}
      *
      * 	 - removeRef(v) - removes an object from the association 'items'. Internally calls {@link #removeAssociation}
      *
      * 	 - removeAllRefs() - removes all objects from the association 'items'. Internally calls {@link #removeAllAssociation}
      * 			 For hidden associations, no methods are generated.
      *
      * **'events'** : object
      *  An object literal whose properties each define a new event of the ManagedObject subclass. The value
      * can either be a simple string which then will be assumed to be the type of the new association or it
      * can be an object literal with the following properties
      * 	 - `allowPreventDefault: boolean` whether the event allows to prevented the default behavior
      * 			of the event source
      * 	 - `parameters: object` an object literal that describes the parameters of this event.
      * 			Event names should use camelCase notation, start with a lower-case letter and only use characters from
      * 			the set [a-zA-Z0-9_$]. If an event in the literal is preceded by a JSDoc comment (doclet) and if the
      * 			UI5 plugin and template are used for JSDoc3 generation, the doclet will be used as generic documentation
      * 			of the event.
      *
      * For each event 'Some' the following methods will be created by the "extend" method and will be added
      * to the prototype of the subclass:
      * 	 - attachSome(fn,o) - registers a listener for the event. Internally calls {@link #attachEvent}
      * 	 - detachSome(fn,o) - deregisters a listener for the event. Internally calls {@link #detachEvent}
      * 	 - fireSome() - fire the event. Internally calls {@link #fireEvent}
      *
      * **'specialSettings'** : object
      *  Special settings are an experimental feature and MUST NOT BE DEFINED in controls or applications outside
      * of the `sap.ui.core` library. There's no generic or general way how to set or get the values for special
      * settings. For the same reason, they cannot be bound against a model. If there's a way for consumers to
      * define a value for a special setting, it must be documented in the class that introduces the setting.
      *
      * @returns the created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * name of the class to be created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * constructor function for the metadata object. If not given, it defaults to `sap.ui.base.ManagedObjectMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ManagedObject]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * name of the class to be created
      */
    sClassName: String,
      /**
      * object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ManagedObject],
      /**
      * constructor function for the metadata object. If not given, it defaults to `sap.ui.base.ManagedObjectMetadata`.
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
  
  trait AggregationBindingInfo extends StObject {
    
    /**
      * Map of event handler functions keyed by the name of the binding events that they should be attached to
      */
    var events: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * A factory function that will be called to create an object for each item in the aggregation; this is
      * an alternative to providing a template object and can be used when the objects should differ depending
      * on the binding context; the factory function will be called with two parameters: an ID that should be
      * used for the created object and the binding context for which the object has to be created; the function
      * must return an object appropriate for the bound aggregation
      */
    var factory: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The predefined filters for this aggregation (optional)
      */
    var filters: js.UndefOr[
        typings.openui5.sapUiModelFilterMod.default | js.Array[typings.openui5.sapUiModelFilterMod.default]
      ] = js.undefined
    
    /**
      * A factory function to generate custom group visualization (optional). It should return a control suitable
      * to visualize a group header (e.g. a `sap.m.GroupHeaderListItem` for a `sap.m.List`).
      */
    var groupHeaderFactory: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Name of the key property or a function getting the context as only parameter to calculate a key for entries.
      * This can be used to improve update behaviour in models, where a key is not already available.
      */
    var key: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * The amount of entries to be created (may exceed the size limit of the model)
      */
    var length: js.UndefOr[int] = js.undefined
    
    /**
      * Name of the model to bind against; when `undefined` or omitted, the default model is used
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * Map of additional parameters for this binding; the names and value ranges of the supported parameters
      * depend on the model implementation, they should be documented with the `bindList` method of the corresponding
      * model class or with the model specific subclass of `sap.ui.model.ListBinding`
      */
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
      * model; when the path contains a '>' sign, the string preceding it will override the `model` property
      * and the remainder after the '>' will be used as binding path
      */
    var path: String
    
    /**
      * The initial sort order (optional)
      */
    var sorter: js.UndefOr[
        typings.openui5.sapUiModelSorterMod.default | js.Array[typings.openui5.sapUiModelSorterMod.default]
      ] = js.undefined
    
    /**
      * the first entry of the list to be created
      */
    var startIndex: js.UndefOr[int] = js.undefined
    
    /**
      * Whether the binding should be suspended initially
      */
    var suspended: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The template to clone for each item in the aggregation; either a template or a factory must be given
      */
    var template: js.UndefOr[ManagedObject] = js.undefined
    
    /**
      * Whether the framework should assume that the application takes care of the lifecycle of the given template;
      * when set to `true`, the template can be used in multiple bindings, either in parallel or over time, and
      * the framework won't clone it when this `ManagedObject` is cloned; when set to `false`, the lifecycle
      * of the template is bound to the lifecycle of the binding, when the aggregation is unbound or when this
      * `ManagedObject` is destroyed, the template also will be destroyed, and when this `ManagedObject` is cloned,
      * the template will be cloned as well; the third option (`undefined`) only exists for compatibility reasons,
      * its behavior is not fully reliable and it may leak the template
      */
    var templateShareable: js.UndefOr[Boolean] = js.undefined
  }
  object AggregationBindingInfo {
    
    inline def apply(path: String): AggregationBindingInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregationBindingInfo]
    }
    
    extension [Self <: AggregationBindingInfo](x: Self) {
      
      inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFactory(value: js.Function): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setFilters(
        value: typings.openui5.sapUiModelFilterMod.default | js.Array[typings.openui5.sapUiModelFilterMod.default]
      ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.openui5.sapUiModelFilterMod.default*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setGroupHeaderFactory(value: js.Function): Self = StObject.set(x, "groupHeaderFactory", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderFactoryUndefined: Self = StObject.set(x, "groupHeaderFactory", js.undefined)
      
      inline def setKey(value: String | js.Function): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLength(value: int): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSorter(
        value: typings.openui5.sapUiModelSorterMod.default | js.Array[typings.openui5.sapUiModelSorterMod.default]
      ): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
      
      inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
      
      inline def setSorterVarargs(value: typings.openui5.sapUiModelSorterMod.default*): Self = StObject.set(x, "sorter", js.Array(value*))
      
      inline def setStartIndex(value: int): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
      
      inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
      
      inline def setTemplate(value: ManagedObject): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateShareable(value: Boolean): Self = StObject.set(x, "templateShareable", value.asInstanceOf[js.Any])
      
      inline def setTemplateShareableUndefined: Self = StObject.set(x, "templateShareable", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait ManagedObject
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
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
      * For the possible keys and values in `mSettings` see the general documentation in {@link sap.ui.base.ManagedObject}
      * or the specific documentation of the constructor of the concrete managed object class.
      *
      * @returns Returns `this` to allow method chaining
      */
    def applySettings(/**
      * the settings to apply to this managed object
      */
    mSettings: js.Object): this.type = js.native
    def applySettings(
      /**
      * the settings to apply to this managed object
      */
    mSettings: js.Object,
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFormatError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachModelContextChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachParseError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachValidationError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachValidationSuccess(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.base.ManagedObject` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Bind an aggregation to the model.
      *
      * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel
      * setModel} or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindList bindList}
      * method will be called to create a new {@link sap.ui.model.ListBinding ListBinding} with the configured
      * binding options.
      *
      * The bound aggregation will use the given template, clone it for each item which exists in the bound list
      * and set the appropriate binding context.
      *
      * This is a generic method which can be used to bind any aggregation to the model. A class may flag aggregations
      * in its metadata with `bindable: "bindable"` to get typed `bindSomething` and `unbindSomething`
      * methods for those aggregations.
      *
      * Also see {@link topic:91f057786f4d1014b6dd926db0e91070 List Binding (Aggregation Binding)} in the documentation.
      *
      * For more information on the `oBindingInfo.key` property and its usage, see {@link topic:7cdff73f308b4b10bdf7d83b7aba72e7
      * Extended Change Detection}.
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
      * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel
      * setModel} or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindContext
      * bindContext} method will be called to create a new {@link sap.ui.model.ContextBinding ContextBinding}
      * with the configured binding options.
      *
      * There's no difference between `bindObject` and {@link sap.ui.core.Element#bindElement bindElement}. Method
      * `bindObject` was introduced together with `ManagedObject` to make context bindings also available on
      * `ManagedObject`s. The new name was chosen to reflect that the binding is not necessarily applied to an
      * `Element`, it also could be applied to a component or some other `ManagedObject`.
      *
      * Also see {@link topic:91f05e8b6f4d1014b6dd926db0e91070 Context Binding} in the documentation.
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
      * Whenever the corresponding model becomes available or changes (either via a call to {@link #setModel
      * setModel} or propagated from a {@link #getParent parent}), its {@link sap.ui.model.Model#bindProperty
      * bindProperty} method will be called to create a new {@link sap.ui.model.PropertyBinding PropertyBinding}
      * with the configured binding options.
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
      * `parts` parameter instead of `path`. The `formatter` function or a {@link sap.ui.model.CompositeType
      * composite type} then can be used to combine the parts, Properties with a composite binding are also known
      * as "calculated fields".
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
      * Also see {@link topic:91f0652b6f4d1014b6dd926db0e91070 Property Binding} in the documentation.
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
    oOptions: CloneBindings
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
    oOptions: CloneBindings
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
    oOptions: CloneBindings
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
    oOptions: CloneBindings
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFormatError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachModelContextChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachParseError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachValidationError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachValidationSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
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
      * Fires event {@link #event:formatError formatError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFormatError(): this.type = js.native
    def fireFormatError(/**
      * Parameters to pass along with the event
      */
    mParameters: Element): this.type = js.native
    
    /**
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
      * Fires event {@link #event:parseError parseError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireParseError(): this.type = js.native
    def fireParseError(/**
      * Parameters to pass along with the event
      */
    mParameters: Property): this.type = js.native
    
    /**
      * Fires event {@link #event:validationError validationError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValidationError(): this.type = js.native
    def fireValidationError(/**
      * Parameters to pass along with the event
      */
    mParameters: Property): this.type = js.native
    
    /**
      * Fires event {@link #event:validationSuccess validationSuccess} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValidationSuccess(): this.type = js.native
    def fireValidationSuccess(/**
      * Parameters to pass along with the event
      */
    mParameters: Element): this.type = js.native
    
    /**
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
    def getAssociation(
      /**
      * the name of the association
      */
    sAssociationName: String,
      /**
      * the object that is used in case the current aggregation is empty (only null or empty array allowed)
      */
    oDefaultForCreation: js.Object
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
      * 			is explicitly allowed and refers to the default model.
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
    sName: String): js.Object = js.native
    
    /**
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
      * that enforce unique IDs, there might be lookup mechanisms (e.g. {@link sap.ui.core.Core#byId sap.ui.getCore().byId()}
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
      * 			is explicitly allowed and refers to the default model.
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
      * 			is explicitly allowed and refers to the default model.
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
      * @returns An object describing the origin of this property's value or `null`
      */
    def getOriginInfo(/**
      * Name of the property
      */
    sPropertyName: String): js.Object | Null = js.native
    
    /**
      * @SINCE 1.88.0
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
      * @SINCE 1.93
      *
      * Checks if an object's destruction has been started. During the descruction of an object its ID is still
      * registered, and child objects could be still aggregated. Creating another object with the same ID would
      * lead to duplicate ID issues. To check if the destruction is finished, call `isDestroyed`.
      *
      * @returns Whether an object's destruction has been started
      */
    def isDestroyStarted(): Boolean = js.native
    
    /**
      * @SINCE 1.93
      *
      * Returns whether this object is destroyed or not. A destroyed object cannot be used anymore.
      *
      * @returns Whether the object is destroyed
      */
    def isDestroyed(): Boolean = js.native
    
    /**
      * Returns whether re-rendering is currently suppressed on this ManagedObject.
      *
      * @returns Whether re-rendering is suppressed
      */
    def isInvalidateSuppressed(): Boolean = js.native
    
    /**
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
      * @SINCE 1.28
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
      * been this ManagedObject before), the parent of the given object is set to this ManagedObject and {@link
      * #invalidate} is called for this object.
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
    oObject: js.Object
    ): this.type = js.native
    def setAggregation(
      /**
      * name of an 0..1 aggregation
      */
    sAggregationName: String,
      /**
      * the managed object that is set as aggregated object
      */
    oObject: js.Object,
      /**
      * if true, this ManagedObject is not marked as changed
      */
    bSuppressInvalidate: Boolean
    ): this.type = js.native
    
    /**
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
      * 			is explicitly allowed and refers to the default model.
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
  
  trait ManagedObjectSettings extends StObject {
    
    /**
      * Fired when a new value for a bound property should have been propagated from the model, but formatting
      * the value failed with an exception.
      */
    var formatError: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when models or contexts are changed on this object (either by calling setModel/setBindingContext
      * or due to propagation)
      */
    var modelContextChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when a new value for a bound property should have been propagated to the model, but parsing the
      * value failed with an exception.
      */
    var parseError: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when a new value for a bound property should have been propagated to the model, but validating
      * the value failed with an exception.
      */
    var validationError: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired after a new value for a bound property has been propagated to the model. Only fired, when the binding
      * uses a data type.
      */
    var validationSuccess: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object ManagedObjectSettings {
    
    inline def apply(): ManagedObjectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagedObjectSettings]
    }
    
    extension [Self <: ManagedObjectSettings](x: Self) {
      
      inline def setFormatError(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      inline def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
      
      inline def setModelContextChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "modelContextChange", js.Any.fromFunction1(value))
      
      inline def setModelContextChangeUndefined: Self = StObject.set(x, "modelContextChange", js.undefined)
      
      inline def setParseError(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "parseError", js.Any.fromFunction1(value))
      
      inline def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
      
      inline def setValidationError(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "validationError", js.Any.fromFunction1(value))
      
      inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
      
      inline def setValidationSuccess(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "validationSuccess", js.Any.fromFunction1(value))
      
      inline def setValidationSuccessUndefined: Self = StObject.set(x, "validationSuccess", js.undefined)
    }
  }
  
  trait ObjectBindingInfo extends StObject {
    
    /**
      * Map of event handler functions keyed by the name of the binding events that they are attached to
      */
    var events: js.UndefOr[Record[String, js.Function]] = js.undefined
    
    /**
      * Name of the model to bind against; when `undefined` or omitted, the default model is used
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * Map of additional parameters for this binding; the names and value ranges of the supported parameters
      * depend on the model implementation and should be documented with the `bindContext` method of the corresponding
      * model class or with the model-specific subclass of `sap.ui.model.ContextBinding`
      */
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
      * model. If the path contains a '>' sign, the string preceding it will override the `model` property,
      * and the remainder after the '>' sign will be used as binding path
      */
    var path: String
    
    /**
      * Whether the binding is initially suspended
      */
    var suspended: js.UndefOr[Boolean] = js.undefined
  }
  object ObjectBindingInfo {
    
    inline def apply(path: String): ObjectBindingInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectBindingInfo]
    }
    
    extension [Self <: ObjectBindingInfo](x: Self) {
      
      inline def setEvents(value: Record[String, js.Function]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
      
      inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    }
  }
  
  trait PropertyBindingInfo extends StObject {
    
    /**
      * Additional constraints to be used when constructing a type object from a type name, ignored when a type
      * object is given
      */
    var constraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Map of event handler functions keyed by the name of the binding events that they should be attached to
      */
    var events: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Format options to be used for the type; only taken into account when the type is specified by its name
      * - a given type object won't be modified
      */
    var formatOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Function to convert model data into a property value
      */
    var formatter: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Binding mode to be used for this property binding (e.g. one way)
      */
    var mode: js.UndefOr[
        BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
      ] = js.undefined
    
    /**
      * Name of the model to bind against; when `undefined` or omitted, the default model is used
      */
    var model: js.UndefOr[String] = js.undefined
    
    /**
      * Map of additional parameters for this binding; the names and value ranges of the supported parameters
      * depend on the model implementation, they should be documented with the `bindProperty` method of the corresponding
      * model class or with the model specific subclass of `sap.ui.model.PropertyBinding`
      */
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Array of binding info objects for the parts of a composite binding; the structure of each binding info
      * is the same as described for the `oBindingInfo` as a whole.
      *
      * If a part is not specified as a binding info object but as a simple string, a binding info object will
      * be created with that string as `path`. The string may start with a model name prefix (see property `path`).
      *
      * **Note**: recursive composite bindings are currently not supported. Therefore, a part must not contain
      * a `parts` property.
      */
    var parts: js.UndefOr[js.Array[String | PropertyBindingInfo]] = js.undefined
    
    /**
      * Path in the model to bind to, either an absolute path or relative to the binding context for the corresponding
      * model; when the path contains a '>' sign, the string preceding it will override the `model` property
      * and the remainder after the '>' will be used as binding path
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the binding should be suspended initially
      */
    var suspended: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Target type to be used by the type when formatting model data, for example "boolean" or "string" or "any";
      * defaults to the property's type
      */
    var targetType: js.UndefOr[String] = js.undefined
    
    /**
      * A type object or the name of a type class to create such a type object; the type will be used for converting
      * model data to a property value (aka "formatting") and vice versa (in binding mode `TwoWay`, aka "parsing")
      */
    var `type`: js.UndefOr[typings.openui5.sapUiModelTypeMod.default | String] = js.undefined
    
    /**
      * Whether the parameters to the formatter function should be passed as the related JavaScript primitive
      * values. In this case the values of the model are parsed by the {@link sap.ui.model.SimpleType#getModelFormat
      * model format} of the specified types from the binding parts.
      *
      * **Note**: use this flag only when using multiple bindings.
      */
    var useInternalValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the parameters to the formatter function should be passed as raw values. In this case the specified
      * types for the binding parts are not used and the values are not formatted.
      *
      * **Note**: use this flag only when using multiple bindings. If you use only one binding and want raw values
      * then simply don't specify a type for that binding.
      */
    var useRawValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Since 1.61, defines a static binding with the given value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object PropertyBindingInfo {
    
    inline def apply(): PropertyBindingInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyBindingInfo]
    }
    
    extension [Self <: PropertyBindingInfo](x: Self) {
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setFormatter(value: js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setMode(
        value: BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String)
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParts(value: js.Array[String | PropertyBindingInfo]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPartsVarargs(value: (String | PropertyBindingInfo)*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
      
      inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
      
      inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
      
      inline def setType(value: typings.openui5.sapUiModelTypeMod.default | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseInternalValues(value: Boolean): Self = StObject.set(x, "useInternalValues", value.asInstanceOf[js.Any])
      
      inline def setUseInternalValuesUndefined: Self = StObject.set(x, "useInternalValues", js.undefined)
      
      inline def setUseRawValues(value: Boolean): Self = StObject.set(x, "useRawValues", value.asInstanceOf[js.Any])
      
      inline def setUseRawValuesUndefined: Self = StObject.set(x, "useRawValues", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

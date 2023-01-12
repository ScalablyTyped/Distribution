package typings.openui5

import typings.openui5.anon.PreventScroll
import typings.openui5.anon.`27`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.ObjectBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreElementMod {
  
  @JSImport("sap/ui/core/Element", JSImport.Default)
  @js.native
  /**
    * Constructs and initializes a UI Element with the given `sId` and settings.
    *
    * Uniqueness of IDs:
    *
    * Each `Element` must have an ID. If no `sId` or `mSettings.id` is given at construction time, a new ID
    * will be created automatically. The IDs of all elements that exist at the same time in the same window
    * must be different. Providing an ID which is already used by another element throws an error.
    *
    * When an element is created from a declarative source (e.g. XMLView), then an ID defined in that declarative
    * source needs to be unique only within the declarative source. Declarative views will prefix that ID with
    * their own ID (and some separator) before constructing the element. Programmatically created views (JSViews)
    * can do the same with the {@link sap.ui.core.mvc.View#createId} API. Similarly, UIComponents can prefix
    * the IDs of elements created in their context with their own ID. Also see {@link sap.ui.core.UIComponent#getAutoPrefixId
    * UIComponent#getAutoPrefixId}.
    *
    * Settings: If the optional `mSettings` are given, they must be a JSON-like object (object literal) that
    * defines values for properties, aggregations, associations or events keyed by their name.
    *
    * **Valid Names:**
    *
    * The property (key) names supported in the object literal are exactly the (case sensitive) names documented
    * in the JSDoc for the properties, aggregations, associations and events of the control and its base classes.
    * Note that for 0..n aggregations and associations this usually is the plural name, whereas it is the singular
    * name in case of 0..1 relations.
    *
    * Each subclass should document the set of supported names in its constructor documentation.
    *
    * **Valid Values:**
    *
    *
    * 	 - for normal properties, the value has to be of the correct simple type (no type conversion occurs)
    *
    * 	 - for 0..1 aggregations, the value has to be an instance of the aggregated control or element type
    *
    * 	 - for 0..n aggregations, the value has to be an array of instances of the aggregated type
    * 	 - for 0..1 associations, an instance of the associated type or an id (string) is accepted
    * 	 - 0..n associations are not supported yet
    * 	 - for events either a function (event handler) is accepted or an array of length 2 where the first
    * 			element is a function and the 2nd element is an object to invoke the method on.
    *
    * Special aggregation `dependents` is connected to the lifecycle management and databinding, but not rendered
    * automatically and can be used for popups or other dependent controls or elements. This allows the definition
    * of popup controls in declarative views and enables propagation of model and context information to them.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends UI5Element {
    def this(/**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new element
      */
    mSettings: ElementSettings) = this()
    def this(/**
      * id for the new control; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new element
      */
    mSettings: ElementSettings
    ) = this()
    def this(
      /**
      * id for the new control; generated automatically if no non-empty id is given Note: this can be omitted,
      * no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial property values, aggregated objects etc. for the new element
      */
    mSettings: ElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def closestTo(
      /**
      * A DOM Element or a CSS selector from which to start the search for the nearest UI5 Element by traversing
      * up the DOM tree
      */
    vParam: String
    ): UI5Element = ^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(vParam.asInstanceOf[js.Any]).asInstanceOf[UI5Element]
    inline def closestTo(
      /**
      * A DOM Element or a CSS selector from which to start the search for the nearest UI5 Element by traversing
      * up the DOM tree
      */
    vParam: String,
      /**
      * Whether the `data-sap-ui-related` attribute is also accepted as a selector for a UI5 Element, in addition
      * to `data-sap-ui`
      */
    bIncludeRelated: Boolean
    ): UI5Element = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(vParam.asInstanceOf[js.Any], bIncludeRelated.asInstanceOf[js.Any])).asInstanceOf[UI5Element]
    /**
      * @SINCE 1.106
      *
      * Returns the nearest [UI5 Element]{@link sap.ui.core.Element} that wraps the given DOM element.
      *
      * A DOM element or a CSS selector is accepted as a given parameter. When a CSS selector is given as parameter,
      * only the first DOM element that matches the CSS selector is taken to find the nearest UI5 Element that
      * wraps it. When no UI5 Element can be found, `undefined` is returned.
      *
      * @returns The UI5 Element that wraps the given DOM element. `undefined` is returned when no UI5 Element
      * can be found.
      */
    inline def closestTo(
      /**
      * A DOM Element or a CSS selector from which to start the search for the nearest UI5 Element by traversing
      * up the DOM tree
      */
    vParam: HTMLElement
    ): UI5Element = ^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(vParam.asInstanceOf[js.Any]).asInstanceOf[UI5Element]
    inline def closestTo(
      /**
      * A DOM Element or a CSS selector from which to start the search for the nearest UI5 Element by traversing
      * up the DOM tree
      */
    vParam: HTMLElement,
      /**
      * Whether the `data-sap-ui-related` attribute is also accepted as a selector for a UI5 Element, in addition
      * to `data-sap-ui`
      */
    bIncludeRelated: Boolean
    ): UI5Element = (^.asInstanceOf[js.Dynamic].applyDynamic("closestTo")(vParam.asInstanceOf[js.Any], bIncludeRelated.asInstanceOf[js.Any])).asInstanceOf[UI5Element]
    
    /**
      * @deprecated (since 1.3.1) - Use the static `extend` method of the desired base class (e.g. {@link sap.ui.core.Element.extend})
      *
      * Creates metadata for a UI Element by extending the Object Metadata.
      *
      * @returns the created metadata
      */
    inline def defineClass(
      /**
      * name of the class to build the metadata for
      */
    sClassName: String,
      /**
      * static information used to build the metadata
      */
    oStaticInfo: js.Object
    ): typings.openui5.sapUiCoreElementMetadataMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("defineClass")(sClassName.asInstanceOf[js.Any], oStaticInfo.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    inline def defineClass(
      /**
      * name of the class to build the metadata for
      */
    sClassName: String,
      /**
      * static information used to build the metadata
      */
    oStaticInfo: js.Object,
      /**
      * constructor to be used for the metadata
      */
    fnMetaImpl: js.Function
    ): typings.openui5.sapUiCoreElementMetadataMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("defineClass")(sClassName.asInstanceOf[js.Any], oStaticInfo.asInstanceOf[js.Any], fnMetaImpl.asInstanceOf[js.Any])).asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Defines a new subclass of Element with the name `sClassName` and enriches it with the information contained
      * in `oClassInfo`.
      *
      * `oClassInfo` can contain the same information that {@link sap.ui.base.ManagedObject.extend} already accepts,
      * plus the following `dnd` property to configure drag-and-drop behavior in the metadata object literal:
      *
      * Example:
      * ```javascript
      *
      * Element.extend('sap.mylib.MyElement', {
      *   metadata : {
      *     library : 'sap.mylib',
      *     properties : {
      *       value : 'string',
      *       width : 'sap.ui.core.CSSSize'
      *     },
      *     dnd : { draggable: true, droppable: false },
      *     aggregations : {
      *       items : { type: 'sap.ui.core.Control', multiple : true, dnd : {draggable: false, dropppable: true, layout: "Horizontal" } },
      *       header : {type : "sap.ui.core.Control", multiple : false, dnd : true },
      *     }
      *   }
      * });
      * ```
      *
      *
      * `dnd` key as a metadata property:
      *
      * **dnd**: object|boolean
      *  Defines draggable and droppable configuration of the element. The following keys can be provided via
      * `dnd` object literal to configure drag-and-drop behavior of the element:
      * 	 - `[draggable=false]: boolean` Defines whether the element is draggable or not. The default
      * 			value is `false`.
      * 	 - `[droppable=false]: boolean` Defines whether the element is droppable (it allows being dropped
      * 			on by a draggable element) or not. The default value is `false`.  If `dnd` property is of type Boolean,
      * 			then the `draggable` and `droppable` configuration are set to this Boolean value.
      *
      * `dnd` key as an aggregation metadata property:
      *
      * **dnd**: object|boolean
      *  In addition to draggable and droppable configuration, the layout of the aggregation can be defined as
      * a hint at the drop position indicator.
      * 	 - `[layout="Vertical"]: ` The arrangement of the items in this aggregation. This setting is recommended
      * 			for the aggregation with multiplicity 0..n (`multiple: true`). Possible values are `Vertical` (e.g. rows
      * 			in a table) and `Horizontal` (e.g. columns in a table). It is recommended to use `Horizontal` layout
      * 			if the arrangement is multidimensional.
      *
      * @returns Created class / constructor function
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
      * Constructor function for the metadata object. If not given, it defaults to `sap.ui.core.ElementMetadata`.
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
    oClassInfo: ClassInfo[T, UI5Element]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class to be created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UI5Element],
      /**
      * Constructor function for the metadata object. If not given, it defaults to `sap.ui.core.ElementMetadata`.
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Element.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait registry extends StObject {
    
    /**
      * Return an object with all instances of `sap.ui.core.Element`, keyed by their ID.
      *
      * Each call creates a new snapshot object. Depending on the size of the UI, this operation therefore might
      * be expensive. Consider to use the `forEach` or `filter` method instead of executing similar operations
      * on the returned object.
      *
      * **Note**: The returned object is created by a call to `Object.create(null)`, and therefore lacks all
      * methods of `Object.prototype`, e.g. `toString` etc.
      *
      * @returns Object with all elements, keyed by their ID
      */
    def all(): Record[ID, UI5Element] = js.native
    
    /**
      * Returns an array with elements for which the given `callback` returns a value that coerces to `true`.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oElement, sID)
      * ```
      *  where `oElement` is the currently visited element instance and `sID` is the ID of that instance.
      *
      * If elements are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When an element is destroyed during the filtering and was
      * not visited yet, it might or might not be visited. As the behavior for such concurrent modifications
      * is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      *
      * This function returns an array with all elements matching the given predicate. The order of the elements
      * in the array is not specified and might change between calls (over time and across different versions
      * of UI5).
      *
      * @returns Array of elements matching the predicate; order is undefined and might change in newer versions
      * of UI5
      */
    def filter(
      /**
      * predicate against which each element is tested
      */
    callback: js.Function2[/* p1 */ UI5Element, /* p2 */ ID, Boolean]
    ): js.Array[UI5Element] = js.native
    def filter(
      /**
      * predicate against which each element is tested
      */
    callback: js.Function2[/* p1 */ UI5Element, /* p2 */ ID, Boolean],
      /**
      * context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): js.Array[UI5Element] = js.native
    
    /**
      * Calls the given `callback` for each element.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oElement, sID)
      * ```
      *  where `oElement` is the currently visited element instance and `sID` is the ID of that instance.
      *
      * The order in which the callback is called for elements is not specified and might change between calls
      * (over time and across different versions of UI5).
      *
      * If elements are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When an element is destroyed during the filtering and was
      * not visited yet, it might or might not be visited. As the behavior for such concurrent modifications
      * is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      */
    def forEach(
      /**
      * Function to call for each element
      */
    callback: js.Function2[/* p1 */ UI5Element, /* p2 */ ID, Unit]
    ): Unit = js.native
    def forEach(
      /**
      * Function to call for each element
      */
    callback: js.Function2[/* p1 */ UI5Element, /* p2 */ ID, Unit],
      /**
      * Context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): Unit = js.native
    
    /**
      * Retrieves an Element by its ID.
      *
      * When the ID is `null` or `undefined` or when there's no element with the given ID, then `undefined` is
      * returned.
      *
      * @returns Element with the given ID or `undefined`
      */
    def get(/**
      * ID of the element to retrieve
      */
    id: ID): js.UndefOr[UI5Element] = js.native
    
    /**
      * Number of existing elements.
      */
    var size: int = js.native
  }
  @JSImport("sap/ui/core/Element", "registry")
  @js.native
  val registry: typings.openui5.sapUiCoreElementMod.registry = js.native
  
  trait ElementSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Custom Data, a data structure like a map containing arbitrary key value pairs.
      */
    var customData: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreCustomDataMod.default] | typings.openui5.sapUiCoreCustomDataMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.19
      *
      * Dependents are not rendered, but their databinding context and lifecycle are bound to the aggregating
      * Element.
      */
    var dependents: js.UndefOr[
        js.Array[UI5Element] | UI5Element | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Defines the drag-and-drop configuration. **Note:** This configuration might be ignored due to control
      * {@link sap.ui.core.Element.extend metadata} restrictions.
      */
    var dragDropConfig: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreDndDragDropBaseMod.default] | typings.openui5.sapUiCoreDndDragDropBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the layout constraints for this control when it is used inside a Layout. LayoutData classes are
      * typed classes and must match the embedding Layout. See VariantLayoutData for aggregating multiple alternative
      * LayoutData instances to a single Element.
      */
    var layoutData: js.UndefOr[typings.openui5.sapUiCoreLayoutDataMod.default] = js.undefined
    
    /**
      * The tooltip that should be shown for this Element.
      *
      * In the most simple case, a tooltip is a string that will be rendered by the control and displayed by
      * the browser when the mouse pointer hovers over the control's DOM. In this variant, `tooltip` behaves
      * like a simple control property.
      *
      * Controls need to explicitly support this kind of tooltip as they have to render it, but most controls
      * do. Exceptions will be documented for the corresponding controls (e.g. `sap.ui.core.HTML` does not support
      * tooltips).
      *
      * Alternatively, `tooltip` can act like a 0..1 aggregation and can be set to a tooltip control (an instance
      * of a subclass of `sap.ui.core.TooltipBase`). In that case, the framework will take care of rendering
      * the tooltip control in a popup-like manner. Such a tooltip control can display arbitrary content, not
      * only a string.
      *
      * UI5 currently does not provide a recommended implementation of `TooltipBase` as the use of content-rich
      * tooltips is discouraged by the Fiori Design Guidelines. Existing subclasses of `TooltipBase` therefore
      * have been deprecated. However, apps can still subclass from `TooltipBase` and create their own implementation
      * when needed (potentially taking the deprecated implementations as a starting point).
      *
      * See the section {@link https://experience.sap.com/fiori-design-web/using-tooltips/ Using Tooltips} in
      * the Fiori Design Guideline.
      */
    var tooltip: js.UndefOr[String | typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo] = js.undefined
  }
  object ElementSettings {
    
    inline def apply(): ElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomData(
        value: js.Array[typings.openui5.sapUiCoreCustomDataMod.default] | typings.openui5.sapUiCoreCustomDataMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      inline def setCustomDataVarargs(value: typings.openui5.sapUiCoreCustomDataMod.default*): Self = StObject.set(x, "customData", js.Array(value*))
      
      inline def setDependents(
        value: js.Array[UI5Element] | UI5Element | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
      
      inline def setDependentsUndefined: Self = StObject.set(x, "dependents", js.undefined)
      
      inline def setDependentsVarargs(value: UI5Element*): Self = StObject.set(x, "dependents", js.Array(value*))
      
      inline def setDragDropConfig(
        value: js.Array[typings.openui5.sapUiCoreDndDragDropBaseMod.default] | typings.openui5.sapUiCoreDndDragDropBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "dragDropConfig", value.asInstanceOf[js.Any])
      
      inline def setDragDropConfigUndefined: Self = StObject.set(x, "dragDropConfig", js.undefined)
      
      inline def setDragDropConfigVarargs(value: typings.openui5.sapUiCoreDndDragDropBaseMod.default*): Self = StObject.set(x, "dragDropConfig", js.Array(value*))
      
      inline def setLayoutData(value: typings.openui5.sapUiCoreLayoutDataMod.default): Self = StObject.set(x, "layoutData", value.asInstanceOf[js.Any])
      
      inline def setLayoutDataUndefined: Self = StObject.set(x, "layoutData", js.undefined)
      
      inline def setTooltip(value: String | typings.openui5.sapUiCoreTooltipBaseMod.default | PropertyBindingInfo): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait UI5Element
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Returns the best suitable DOM node that represents this Element wrapped as jQuery object. I.e. the element
      * returned by {@link sap.ui.core.Element#getDomRef} is wrapped and returned.
      *
      * If an ID suffix is given, the ID of this Element is concatenated with the suffix (separated by a single
      * dash) and the DOM node with that compound ID will be wrapped by jQuery. This matches the UI5 naming convention
      * for named inner DOM nodes of a control.
      *
      * @returns The jQuery wrapped element's DOM reference
      */
    @JSName("$")
    def $(): jQuery[HTMLElement] = js.native
    @JSName("$")
    def $(/**
      * ID suffix to get a jQuery object for
      */
    sSuffix: String): jQuery[HTMLElement] = js.native
    
    /**
      * Adds some customData to the aggregation {@link #getCustomData customData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addCustomData(
      /**
      * The customData to add; if empty, nothing is inserted
      */
    oCustomData: typings.openui5.sapUiCoreCustomDataMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.19
      *
      * Adds some dependent to the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDependent(/**
      * The dependent to add; if empty, nothing is inserted
      */
    oDependent: UI5Element): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Adds some dragDropConfig to the aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDragDropConfig(
      /**
      * The dragDropConfig to add; if empty, nothing is inserted
      */
    oDragDropConfig: typings.openui5.sapUiCoreDndDragDropBaseMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Adds a delegate that can listen to the browser-, pseudo- and framework events that are handled by this
      * `Element` (as opposed to events which are fired by this `Element`).
      *
      * Delegates are simple objects that can have an arbitrary number of event handler methods. See the section
      * "Handling of Events" in the {@link #constructor} documentation to learn how events will be dispatched
      * and how event handler methods have to be named to be found.
      *
      * If multiple delegates are registered for the same element, they will be called in the order of their
      * registration. Double registrations are prevented. Before a delegate is added, all registrations of the
      * same delegate (no matter what value for `oThis` was used for their registration) are removed and only
      * then the delegate is added. Note that this might change the position of the delegate in the list of delegates.
      *
      * When an element is cloned, all its event delegates will be added to the clone. This behavior is well-suited
      * for applications which want to add delegates that also work with templates in aggregation bindings. For
      * control development, the internal `addDelegate` method may be more suitable. Delegates added via that
      * method are not cloned automatically, as typically each control instance takes care of adding its own
      * delegates.
      *
      * **Important:** If event delegates were added, the delegate will still be called even if the event was
      * processed and/or cancelled via `preventDefault` by the Element or another event delegate. `preventDefault`
      * only prevents the event from bubbling. It should be checked e.g. in the event delegate's listener whether
      * an Element is still enabled via `getEnabled`. Additionally there might be other things that delegates
      * need to check depending on the event (e.g. not adding a key twice to an output string etc.).
      *
      * See {@link topic:bdf3e9818cd84d37a18ee5680e97e1c1 Event Handler Methods} for a general explanation of
      * event handling in controls.
      *
      * @returns Returns `this` to allow method chaining
      */
    def addEventDelegate(
      /**
      * The delegate object which consists of the event handler names and the corresponding event handler functions
      */
    oDelegate: js.Object
    ): this.type = js.native
    def addEventDelegate(
      /**
      * The delegate object which consists of the event handler names and the corresponding event handler functions
      */
    oDelegate: js.Object,
      /**
      * If given, this object will be the "this" context in the listener methods; default is the delegate object
      * itself
      */
    oThis: js.Object
    ): this.type = js.native
    
    /**
      * Applies the focus info.
      *
      * To be overwritten by the specific control method.
      *
      * @returns Returns `this` to allow method chaining
      */
    def applyFocusInfo(/**
      * Focus info object as returned by {@link #getFocusInfo}
      */
    oFocusInfo: `27`): this.type = js.native
    
    /**
      * Bind the object to the referenced entity in the model, which is used as the binding context to resolve
      * bound properties or aggregations of the object itself and all of its children relatively to the given
      * path.
      *
      * If a relative binding path is used, this will be applied whenever the parent context changes.
      *
      * There's no difference between `bindElement` and {@link sap.ui.base.ManagedObject#bindObject}.
      * See:
      * 	{@link sap.ui.base.ManagedObject#bindObject}
      *
      * @returns reference to the instance itself
      */
    def bindElement(/**
      * the binding path or an object with more detailed binding options
      */
    vPath: String): this.type = js.native
    def bindElement(
      /**
      * the binding path or an object with more detailed binding options
      */
    vPath: String,
      /**
      * map of additional parameters for this binding. Only taken into account when `vPath` is a string. In that
      * case it corresponds to `mParameters` of {@link sap.ui.base.ManagedObject.ObjectBindingInfo}. The supported
      * parameters are listed in the corresponding model-specific implementation of `sap.ui.model.ContextBinding`.
      */
    mParameters: js.Object
    ): this.type = js.native
    def bindElement(
      /**
      * the binding path or an object with more detailed binding options
      */
    vPath: ObjectBindingInfo
    ): this.type = js.native
    def bindElement(
      /**
      * the binding path or an object with more detailed binding options
      */
    vPath: ObjectBindingInfo,
      /**
      * map of additional parameters for this binding. Only taken into account when `vPath` is a string. In that
      * case it corresponds to `mParameters` of {@link sap.ui.base.ManagedObject.ObjectBindingInfo}. The supported
      * parameters are listed in the corresponding model-specific implementation of `sap.ui.model.ContextBinding`.
      */
    mParameters: js.Object
    ): this.type = js.native
    
    /**
      * Retrieves, modifies or removes custom data attached to an `Element`.
      *
      * Usages: Setting the value for a single key:
      * ```javascript
      *
      *    data("myKey", myData)
      * ```
      *  Attaches `myData` (which can be any JS data type, e.g. a number, a string, an object, or a function)
      * to this element, under the given key "myKey". If the key already exists,the value will be updated.
      *
      * Setting a value for a single key (rendered to the DOM):
      * ```javascript
      *
      *    data("myKey", myData, writeToDom)
      * ```
      *  Attaches `myData` to this element, under the given key "myKey" and (if `writeToDom` is true) writes
      * key and value to the HTML. If the key already exists,the value will be updated. While `oValue` can be
      * any JS data type to be attached, it must be a string to be also written to DOM. The key must also be
      * a valid HTML attribute name (it must conform to `sap.ui.core.ID` and may contain no colon) and may not
      * start with "sap-ui". When written to HTML, the key is prefixed with "data-".
      *
      * Getting the value for a single key:
      * ```javascript
      *
      *    data("myKey")
      * ```
      *  Retrieves whatever data has been attached to this element (using the key "myKey") before.
      *
      * Removing the value for a single key:
      * ```javascript
      *
      *    data("myKey", null)
      * ```
      *  Removes whatever data has been attached to this element (using the key "myKey") before.
      *
      * Removing all custom data for all keys:
      * ```javascript
      *
      *    data(null)
      * ```
      *
      *
      * Getting all custom data values as a plain object:
      * ```javascript
      *
      *    data()
      * ```
      *  Returns all data, as a map-like object, property names are keys, property values are values.
      *
      * Setting multiple key/value pairs in a single call:
      * ```javascript
      *
      *    data({"myKey1": myData, "myKey2": null})
      * ```
      *  Attaches `myData` (using the key "myKey1" and removes any data that had been attached for key "myKey2".
      * See:
      * 	See chapter {@link topic:91f0c3ee6f4d1014b6dd926db0e91070 Custom Data - Attaching Data Objects to Controls}
      *    in the documentation.
      *
      * @returns A map with all custom data, a custom data value for a single specified key or `null` when no
      * custom data exists for such a key or this element when custom data was to be removed.
      */
    def data(): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: String,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Unit,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Null,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Null,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Null,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Null,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Null,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Unit,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Unit,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Unit,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Unit,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Unit,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Unit,
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Unit,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any]
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any],
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any],
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: String,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any],
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any],
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Any,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    def data(
      /**
      * Single key to set or remove, or an object with key/value pairs or `null` to remove all custom data
      */
    vKeyOrData: Record[String, Any],
      /**
      * Value to set or `null` to remove the corresponding custom data
      */
    vValue: Unit,
      /**
      * Whether this custom data entry should be written to the DOM during rendering
      */
    bWriteToDom: Boolean
    ): (Record[String, Any]) | Any | Null | UI5Element = js.native
    
    /**
      * Destroys all the customData in the aggregation {@link #getCustomData customData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomData(): this.type = js.native
    
    /**
      * @SINCE 1.19
      *
      * Destroys all the dependents in the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDependents(): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Destroys all the dragDropConfig in the aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDragDropConfig(): this.type = js.native
    
    /**
      * Destroys the layoutData in the aggregation {@link #getLayoutData layoutData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLayoutData(): this.type = js.native
    
    /**
      * Destroys the tooltip in the aggregation named `tooltip`.
      *
      * @returns `this` to allow method chaining
      */
    def destroyTooltip(): this.type = js.native
    
    /**
      * Allows the parent of a control to enhance the ARIA information during rendering.
      *
      * This function is called by the RenderManager's {@link sap.ui.core.RenderManager#accessibilityState accessibilityState}
      * and {@link sap.ui.core.RenderManager#writeAccessibilityState writeAccessibilityState} methods for the
      * parent of the currently rendered control - if the parent implements it.
      */
    def enhanceAccessibilityState(
      /**
      * The Control/Element for which ARIA properties are collected
      */
    oElement: UI5Element,
      /**
      * Map of ARIA properties keyed by their name (without prefix "aria-"); the method implementation can enhance
      * this map in any way (add or remove properties, modify values)
      */
    mAriaProps: js.Object
    ): Unit = js.native
    
    /**
      * Hook method for cleaning up the element instance before destruction.
      *
      * Applications must not call this hook method directly, it is called by the framework when the element
      * is {@link #destroy destroyed}.
      *
      * Subclasses of Element should override this hook to implement any necessary cleanup.
      *
      *
      * ```javascript
      *
      * exit: function() {
      *     // ... do any further cleanups of your subclass e.g. detach events...
      *     this.$().off("click", this.handleClick);
      *
      *     if (Element.prototype.exit) {
      *         Element.prototype.exit.apply(this, arguments);
      *     }
      * }
      * ```
      *
      *
      * For a more detailed description how to to use the exit hook, see Section {@link topic:d4ac0edbc467483585d0c53a282505a5
      * exit() Method} in the documentation.
      */
    def exit(): Unit = js.native
    
    /**
      * Searches and returns an array of child elements and controls which are referenced within an aggregation
      * or aggregations of child elements/controls. This can be either done recursive or not.
      *
      * **Take care: this operation might be expensive.**
      *
      * @returns array of child elements and controls
      */
    def findElements(/**
      * true, if all nested children should be returned.
      */
    bRecursive: Boolean): js.Array[UI5Element] = js.native
    
    /**
      * Sets the focus to the stored focus DOM reference.
      */
    def focus(): Unit = js.native
    def focus(/**
      * Options for setting the focus
      */
    oFocusInfo: PreventScroll): Unit = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomData customData}.
      *
      * Custom Data, a data structure like a map containing arbitrary key value pairs.
      */
    def getCustomData(): js.Array[typings.openui5.sapUiCoreCustomDataMod.default] = js.native
    
    /**
      * @SINCE 1.19
      *
      * Gets content of aggregation {@link #getDependents dependents}.
      *
      * Dependents are not rendered, but their databinding context and lifecycle are bound to the aggregating
      * Element.
      */
    def getDependents(): js.Array[UI5Element] = js.native
    
    /**
      * Returns the best suitable DOM Element that represents this UI5 Element. By default the DOM Element with
      * the same ID as this Element is returned. Subclasses should override this method if the lookup via id
      * is not sufficient.
      *
      * Note that such a DOM Element does not necessarily exist in all cases. Some elements or controls might
      * not have a DOM representation at all (e.g. a naive FlowLayout) while others might not have one due to
      * their current state (e.g. an initial, not yet rendered control).
      *
      * If an ID suffix is given, the ID of this Element is concatenated with the suffix (separated by a single
      * dash) and the DOM node with that compound ID will be returned. This matches the UI5 naming convention
      * for named inner DOM nodes of a control.
      *
      * @returns The Element's DOM Element, sub DOM Element or `null`
      */
    def getDomRef(): Element | Null = js.native
    def getDomRef(/**
      * ID suffix to get the DOMRef for
      */
    sSuffix: String): Element | Null = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets content of aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * Defines the drag-and-drop configuration. **Note:** This configuration might be ignored due to control
      * {@link sap.ui.core.Element.extend metadata} restrictions.
      */
    def getDragDropConfig(): js.Array[typings.openui5.sapUiCoreDndDragDropBaseMod.default] = js.native
    
    /**
      * Get the context binding object for a specific model name.
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
    def getElementBinding(): js.UndefOr[typings.openui5.sapUiModelContextBindingMod.default] = js.native
    def getElementBinding(/**
      * Name of the model or `undefined`
      */
    sModelName: String): js.UndefOr[typings.openui5.sapUiModelContextBindingMod.default] = js.native
    
    /**
      * Returns the DOM Element that should get the focus or `null` if there's no such element currently.
      *
      * To be overwritten by the specific control method.
      *
      * @returns Returns the DOM Element that should get the focus or `null`
      */
    def getFocusDomRef(): Element | Null = js.native
    
    /**
      * Returns an object representing the serialized focus information.
      *
      * To be overwritten by the specific control method.
      *
      * @returns an object representing the serialized focus information
      */
    def getFocusInfo(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getLayoutData layoutData}.
      *
      * Defines the layout constraints for this control when it is used inside a Layout. LayoutData classes are
      * typed classes and must match the embedding Layout. See VariantLayoutData for aggregating multiple alternative
      * LayoutData instances to a single Element.
      */
    def getLayoutData(): typings.openui5.sapUiCoreLayoutDataMod.default = js.native
    
    /**
      * Returns the tooltip for this element if any or an undefined value. The tooltip can either be a simple
      * string or a subclass of {@link sap.ui.core.TooltipBase}.
      *
      * Callers that are only interested in tooltips of type string (e.g. to render them as a `title` attribute),
      * should call the convenience method {@link #getTooltip_AsString} instead. If they want to get a tooltip
      * text no matter where it comes from (be it a string tooltip or the text from a TooltipBase instance) then
      * they could call {@link #getTooltip_Text} instead.
      *
      * @returns The tooltip for this Element or `null`.
      */
    def getTooltip(): String | typings.openui5.sapUiCoreTooltipBaseMod.default | Null = js.native
    
    /**
      * Returns the tooltip for this element but only if it is a simple string. Otherwise, `undefined` is returned.
      *
      * @returns string tooltip or `undefined`
      */
    def getTooltip_AsString(): js.UndefOr[String] = js.native
    
    /**
      * Returns the main text for the current tooltip or `undefined` if there is no such text.
      *
      * If the tooltip is an object derived from `sap.ui.core.TooltipBase`, then the text property of that object
      * is returned. Otherwise the object itself is returned (either a string or `undefined` or `null`).
      *
      * @returns Text of the current tooltip or `undefined` or `null`
      */
    def getTooltip_Text(): js.UndefOr[String | Null] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.CustomData` in the aggregation {@link #getCustomData customData}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfCustomData(
      /**
      * The customData whose index is looked for
      */
    oCustomData: typings.openui5.sapUiCoreCustomDataMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.19
      *
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getDependents dependents}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDependent(/**
      * The dependent whose index is looked for
      */
    oDependent: UI5Element): int = js.native
    
    /**
      * @SINCE 1.56
      *
      * Checks for the provided `sap.ui.core.dnd.DragDropBase` in the aggregation {@link #getDragDropConfig dragDropConfig}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDragDropConfig(
      /**
      * The dragDropConfig whose index is looked for
      */
    oDragDropConfig: typings.openui5.sapUiCoreDndDragDropBaseMod.default
    ): int = js.native
    
    /**
      * Initializes the element instance after creation.
      *
      * Applications must not call this hook method directly, it is called by the framework while the constructor
      * of an element is executed.
      *
      * Subclasses of Element should override this hook to implement any necessary initialization.
      */
    def init(): Unit = js.native
    
    /**
      * Inserts a customData into the aggregation {@link #getCustomData customData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertCustomData(
      /**
      * The customData to insert; if empty, nothing is inserted
      */
    oCustomData: typings.openui5.sapUiCoreCustomDataMod.default,
      /**
      * The `0`-based index the customData should be inserted at; for a negative value of `iIndex`, the customData
      * is inserted at position 0; for a value greater than the current size of the aggregation, the customData
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.19
      *
      * Inserts a dependent into the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDependent(
      /**
      * The dependent to insert; if empty, nothing is inserted
      */
    oDependent: UI5Element,
      /**
      * The `0`-based index the dependent should be inserted at; for a negative value of `iIndex`, the dependent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the dependent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Inserts a dragDropConfig into the aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDragDropConfig(
      /**
      * The dragDropConfig to insert; if empty, nothing is inserted
      */
    oDragDropConfig: typings.openui5.sapUiCoreDndDragDropBaseMod.default,
      /**
      * The `0`-based index the dragDropConfig should be inserted at; for a negative value of `iIndex`, the dragDropConfig
      * is inserted at position 0; for a value greater than the current size of the aggregation, the dragDropConfig
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.28.0) - The contract of this method is not fully defined and its write capabilities
      * overlap with applySettings
      *
      * This function either calls set[sPropertyName] or get[sPropertyName] with the specified property name
      * depending if an `oValue` is provided or not.
      *
      * @returns Returns `this` to allow method chaining in case of setter and the property value in case of
      * getter
      */
    def prop(/**
      * name of the property to set
      */
    sPropertyName: String): Any | this.type = js.native
    def prop(
      /**
      * name of the property to set
      */
    sPropertyName: String,
      /**
      * value to set the property to
      */
    oValue: Any
    ): Any | this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getCustomData customData}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllCustomData(): js.Array[typings.openui5.sapUiCoreCustomDataMod.default] = js.native
    
    /**
      * @SINCE 1.19
      *
      * Removes all the controls from the aggregation {@link #getDependents dependents}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDependents(): js.Array[UI5Element] = js.native
    
    /**
      * @SINCE 1.56
      *
      * Removes all the controls from the aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDragDropConfig(): js.Array[typings.openui5.sapUiCoreDndDragDropBaseMod.default] = js.native
    
    def removeCustomData(/**
      * The customData to remove or its index or id
      */
    vCustomData: String): typings.openui5.sapUiCoreCustomDataMod.default | Null = js.native
    /**
      * Removes a customData from the aggregation {@link #getCustomData customData}.
      *
      * @returns The removed customData or `null`
      */
    def removeCustomData(/**
      * The customData to remove or its index or id
      */
    vCustomData: int): typings.openui5.sapUiCoreCustomDataMod.default | Null = js.native
    def removeCustomData(
      /**
      * The customData to remove or its index or id
      */
    vCustomData: typings.openui5.sapUiCoreCustomDataMod.default
    ): typings.openui5.sapUiCoreCustomDataMod.default | Null = js.native
    
    def removeDependent(/**
      * The dependent to remove or its index or id
      */
    vDependent: String): UI5Element | Null = js.native
    /**
      * @SINCE 1.19
      *
      * Removes a dependent from the aggregation {@link #getDependents dependents}.
      *
      * @returns The removed dependent or `null`
      */
    def removeDependent(/**
      * The dependent to remove or its index or id
      */
    vDependent: int): UI5Element | Null = js.native
    def removeDependent(/**
      * The dependent to remove or its index or id
      */
    vDependent: UI5Element): UI5Element | Null = js.native
    
    def removeDragDropConfig(/**
      * The dragDropConfig to remove or its index or id
      */
    vDragDropConfig: String): typings.openui5.sapUiCoreDndDragDropBaseMod.default | Null = js.native
    /**
      * @SINCE 1.56
      *
      * Removes a dragDropConfig from the aggregation {@link #getDragDropConfig dragDropConfig}.
      *
      * @returns The removed dragDropConfig or `null`
      */
    def removeDragDropConfig(/**
      * The dragDropConfig to remove or its index or id
      */
    vDragDropConfig: int): typings.openui5.sapUiCoreDndDragDropBaseMod.default | Null = js.native
    def removeDragDropConfig(
      /**
      * The dragDropConfig to remove or its index or id
      */
    vDragDropConfig: typings.openui5.sapUiCoreDndDragDropBaseMod.default
    ): typings.openui5.sapUiCoreDndDragDropBaseMod.default | Null = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Removes the given delegate from this element.
      *
      * This method will remove all registrations of the given delegate, not only one.
      *
      * @returns Returns `this` to allow method chaining
      */
    def removeEventDelegate(
      /**
      * The delegate object which consists of the event handler names and the corresponding event handler functions
      */
    oDelegate: js.Object
    ): this.type = js.native
    
    /**
      * This triggers immediate rerendering of its parent and thus of itself and its children.
      *
      * As `sap.ui.core.Element` "bubbles up" the rerender, changes to child-`Elements` will also result in immediate
      * rerendering of the whole sub tree.
      */
    def rerender(): Unit = js.native
    
    /**
      * Sets the {@link sap.ui.core.LayoutData} defining the layout constraints for this control when it is used
      * inside a layout.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setLayoutData(/**
      * which should be set
      */
    oLayoutData: typings.openui5.sapUiCoreLayoutDataMod.default): this.type = js.native
    
    /**
      * Sets a new tooltip for this object.
      *
      * The tooltip can either be a simple string (which in most cases will be rendered as the `title` attribute
      * of this Element) or an instance of {@link sap.ui.core.TooltipBase}.
      *
      * If a new tooltip is set, any previously set tooltip is deactivated.
      *
      * @returns Returns `this` to allow method chaining
      */
    def setTooltip(/**
      * New tooltip
      */
    vTooltip: String): this.type = js.native
    def setTooltip(/**
      * New tooltip
      */
    vTooltip: typings.openui5.sapUiCoreTooltipBaseMod.default): this.type = js.native
    
    /**
      * Removes the defined binding context of this object, all bindings will now resolve relative to the parent
      * context again.
      *
      * @returns reference to the instance itself
      */
    def unbindElement(sModelName: String): typings.openui5.sapUiBaseManagedObjectMod.default = js.native
  }
}

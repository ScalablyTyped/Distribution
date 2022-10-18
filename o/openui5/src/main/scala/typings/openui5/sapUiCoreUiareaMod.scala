package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUiareaMod {
  
  @JSImport("sap/ui/core/UIArea", JSImport.Default)
  @js.native
  open class default () extends UIArea
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/UIArea", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @SINCE 1.62
      *
      * Enabled or disables logging of certain event types.
      *
      * The event handling code of class UIArea logs all processed browser events with log level DEBUG. Only
      * some events that occur too frequently are suppressed by default: `mousemove`, `mouseover`, `mouseout`,
      * `scroll`, `dragover`, `dragenter` and `dragleave`.
      *
      * With this method, logging can be disabled for further event types or it can be enabled for some or all
      * of the event types listed above. The parameter `mEventTypes` is a map of boolean values keyed by event
      * type names. When the value for an event type coerces to true, events of that type won't be logged.
      *
      * @returns A copy of the resulting event logging configuration (not normalized)
      */
    inline def configureEventLogging(): Record[String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureEventLogging")().asInstanceOf[Record[String, Boolean]]
    inline def configureEventLogging(/**
      * Map of logging flags keyed by event types
      */
    mEventTypes: Record[String, Boolean]): Record[String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("configureEventLogging")(mEventTypes.asInstanceOf[js.Any]).asInstanceOf[Record[String, Boolean]]
    
    /**
      * Creates a new subclass of class sap.ui.core.UIArea with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UIArea]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, UIArea],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.UIArea.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait registry extends StObject {
    
    /**
      * Return an object with all instances of `sap.ui.core.UIArea`, keyed by their ID.
      *
      * Each call creates a new snapshot object. Depending on the size of the UI, this operation therefore might
      * be expensive. Consider to use the `forEach` or `filter` method instead of executing similar operations
      * on the returned object.
      *
      * **Note**: The returned object is created by a call to `Object.create(null)`, and therefore lacks all
      * methods of `Object.prototype`, e.g. `toString` etc.
      *
      * @returns Object with all UIAreas, keyed by their ID
      */
    def all(): Record[ID, UIArea] = js.native
    
    /**
      * Returns an array with UIAreas for which the given `callback` returns a value that coerces to `true`.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oUIArea, sID)
      * ```
      *  where `oUIArea` is the currently visited UIArea instance and `sID` is the ID of that instance.
      *
      * If UIAreas are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When an UIArea is destroyed or the root node is changed
      * during the filtering and was not visited yet, it might or might not be visited. As the behavior for such
      * concurrent modifications is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      *
      * This function returns an array with all UIAreas matching the given predicate. The order of the UIAreas
      * in the array is not specified and might change between calls (over time and across different versions
      * of UI5).
      *
      * @returns Array of UIAreas matching the predicate; order is undefined and might change in newer versions
      * of UI5
      */
    def filter(
      /**
      * predicate against which each UIArea is tested
      */
    callback: js.Function2[/* p1 */ UIArea, /* p2 */ ID, Boolean]
    ): js.Array[UIArea] = js.native
    def filter(
      /**
      * predicate against which each UIArea is tested
      */
    callback: js.Function2[/* p1 */ UIArea, /* p2 */ ID, Boolean],
      /**
      * context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): js.Array[UIArea] = js.native
    
    /**
      * Calls the given `callback` for each UIArea.
      *
      * The expected signature of the callback is
      * ```javascript
      *
      *    function callback(oUIArea, sID)
      * ```
      *  where `oUIArea` is the currently visited UIArea instance and `sID` is the ID of that instance.
      *
      * The order in which the callback is called for UIAreas is not specified and might change between calls
      * (over time and across different versions of UI5).
      *
      * If UIAreas are created or destroyed within the `callback`, then the behavior is not specified. Newly
      * added objects might or might not be visited. When an UIArea is destroyed or the root node is changed
      * during the filtering and was not visited yet, it might or might not be visited. As the behavior for such
      * concurrent modifications is not specified, it may change in newer releases.
      *
      * If a `thisArg` is given, it will be provided as `this` context when calling `callback`. The `this` value
      * that the implementation of `callback` sees, depends on the usual resolution mechanism. E.g. when `callback`
      * was bound to some context object, that object wins over the given `thisArg`.
      */
    def forEach(
      /**
      * Function to call for each UIArea
      */
    callback: js.Function2[/* p1 */ UIArea, /* p2 */ ID, Unit]
    ): Unit = js.native
    def forEach(
      /**
      * Function to call for each UIArea
      */
    callback: js.Function2[/* p1 */ UIArea, /* p2 */ ID, Unit],
      /**
      * Context object to provide as `this` in each call of `callback`
      */
    thisArg: js.Object
    ): Unit = js.native
    
    /**
      * Retrieves an UIArea by its ID.
      *
      * When the ID is `null` or `undefined` or when there's no UIArea with the given ID, then `undefined` is
      * returned.
      *
      * @returns UIArea with the given ID or `undefined`
      */
    def get(/**
      * ID of the UIArea to retrieve
      */
    id: ID): js.UndefOr[UIArea] = js.native
    
    /**
      * Number of existing UIAreas.
      */
    var size: int = js.native
  }
  @JSImport("sap/ui/core/UIArea", "registry")
  @js.native
  val registry: typings.openui5.sapUiCoreUiareaMod.registry = js.native
  
  @js.native
  trait UIArea
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some dependent to the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDependent(
      /**
      * The dependent to add; if empty, nothing is inserted
      */
    oDependent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the dependents in the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDependents(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content that is displayed in the UIArea.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getDependents dependents}.
      *
      * Dependent objects whose lifecycle is bound to the UIArea but which are not automatically rendered by
      * the UIArea.
      */
    def getDependents(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @deprecated (since 1.1) - use function {@link #getContent} instead
      *
      * Returns the content control of this `UIArea` at the specified index. If no index is given the first content
      * control is returned.
      *
      * @returns the content control of this `UIArea` at the specified index.
      */
    def getRootControl(/**
      * index of the control in the content of this `UIArea`
      */
    idx: int): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns the Root Node hosting this instance of `UIArea`.
      *
      * @returns the Root Node hosting this instance of `UIArea`.
      */
    def getRootNode(): Element = js.native
    
    /**
      * Returns this UI area. Needed to stop recursive calls from an element to its parent.
      *
      * @returns this
      */
    def getUIArea(): UIArea = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getDependents dependents}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDependent(
      /**
      * The dependent whose index is looked for
      */
    oDependent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a dependent into the aggregation {@link #getDependents dependents}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDependent(
      /**
      * The dependent to insert; if empty, nothing is inserted
      */
    oDependent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the dependent should be inserted at; for a negative value of `iIndex`, the dependent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the dependent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Checks whether the control is still valid (is in the DOM)
      *
      * @returns True if the control is still in the active DOM
      */
    def isActive(): Boolean = js.native
    
    /**
      * Returns the locked state of the `sap.ui.core.UIArea`
      *
      * @returns locked state
      */
    def isLocked(): Boolean = js.native
    
    /**
      * Locks this instance of UIArea.
      *
      * Rerendering and eventing will not be active as long as no {@link #unlock} is called.
      */
    def lock(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDependents dependents}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDependents(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeDependent(/**
      * The dependent to remove or its index or id
      */
    vDependent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a dependent from the aggregation {@link #getDependents dependents}.
      *
      * @returns The removed dependent or `null`
      */
    def removeDependent(/**
      * The dependent to remove or its index or id
      */
    vDependent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeDependent(
      /**
      * The dependent to remove or its index or id
      */
    vDependent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.1) - use {@link #removeAllContent} and {@link #addContent} instead
      *
      * Sets the root control to be displayed in this UIArea.
      *
      * First, all old content controls (if any) will be detached from this UIArea (e.g. their parent relationship
      * to this UIArea will be cut off). Then the parent relationship for the new content control (if not empty)
      * will be set to this UIArea and finally, the UIArea will be marked for re-rendering.
      *
      * The real re-rendering happens whenever the re-rendering is called. Either implicitly at the end of any
      * control event or by calling sap.ui.getCore().applyChanges().
      */
    def setRootControl(
      /**
      * the Control that should be the Root for this `UIArea`.
      */
    oRootControl: typings.openui5.sapUiBaseInterfaceMod.default
    ): Unit = js.native
    def setRootControl(
      /**
      * the Control that should be the Root for this `UIArea`.
      */
    oRootControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.107.0)
      *
      * Allows setting the root node hosting this instance of `UIArea`.
      *
      * The node must have an ID that will be used as ID for this instance of `UIArea`.
      */
    def setRootNode(/**
      * the hosting DOM node for this instance of `UIArea`.
      */
    oRootNode: Element): Unit = js.native
    
    /**
      * Un-Locks this instance of UIArea.
      *
      * Rerendering and eventing will now be enabled again.
      */
    def unlock(): Unit = js.native
  }
  
  trait UIAreaSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Content that is displayed in the UIArea.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Dependent objects whose lifecycle is bound to the UIArea but which are not automatically rendered by
      * the UIArea.
      */
    var dependents: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object UIAreaSettings {
    
    inline def apply(): UIAreaSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIAreaSettings]
    }
    
    extension [Self <: UIAreaSettings](x: Self) {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDependents(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "dependents", value.asInstanceOf[js.Any])
      
      inline def setDependentsUndefined: Self = StObject.set(x, "dependents", js.undefined)
      
      inline def setDependentsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "dependents", js.Array(value*))
    }
  }
}

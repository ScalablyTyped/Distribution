package typings.openui5

import typings.openui5.anon.AltKey
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.BreadcrumbsDesign
import typings.openui5.sapUiWebcMainLibraryMod.BreadcrumbsSeparatorStyle
import typings.openui5.sapUiWebcMainLibraryMod.IBreadcrumbsItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainBreadcrumbsMod {
  
  @JSImport("sap/ui/webc/main/Breadcrumbs", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Breadcrumbs`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Breadcrumbs {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BreadcrumbsSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: BreadcrumbsSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BreadcrumbsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Breadcrumbs with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, Breadcrumbs]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Breadcrumbs],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Breadcrumbs.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Breadcrumbs
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IBreadcrumbsItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Breadcrumbs`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Breadcrumbs` itself.
      *
      * Fires when a `BreadcrumbsItem` is clicked. **Note:** You can prevent browser location change by calling
      * `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Breadcrumbs` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Breadcrumbs`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Breadcrumbs` itself.
      *
      * Fires when a `BreadcrumbsItem` is clicked. **Note:** You can prevent browser location change by calling
      * `event.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
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
    def attachItemClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Breadcrumbs` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Breadcrumbs`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemClick(
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
      * Fires event {@link #event:itemClick itemClick} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireItemClick(): Boolean = js.native
    def fireItemClick(/**
      * Parameters to pass along with the event
      */
    mParameters: AltKey): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the visual indication and behavior of the breadcrumbs. Available options are `Standard` (by default)
      * and `NoCurrentPage`.
      *
      *  **Note:** The `Standard` breadcrumbs show the current page as the last item in the trail. The last item
      * contains only plain text and is not a link.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): BreadcrumbsDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the component items.
      *
      *
      *
      *  **Note:** Use the `sap.ui.webc.main.BreadcrumbsItem` component to define the desired items.
      */
    def getItems(): js.Array[IBreadcrumbsItem] = js.native
    
    /**
      * Gets current value of property {@link #getSeparatorStyle separatorStyle}.
      *
      * Determines the visual style of the separator between the breadcrumb items.
      *
      *
      *
      *  Available options are:
      * 	 - `Slash`
      * 	 - `BackSlash`
      * 	 - `DoubleBackSlash`
      * 	 - `DoubleGreaterThan`
      * 	 - `DoubleSlash`
      * 	 - `GreaterThan`
      *
      * Default value is `Slash`.
      *
      * @returns Value of property `separatorStyle`
      */
    def getSeparatorStyle(): BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IBreadcrumbsItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IBreadcrumbsItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IBreadcrumbsItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IBreadcrumbsItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IBreadcrumbsItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IBreadcrumbsItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IBreadcrumbsItem): IBreadcrumbsItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the visual indication and behavior of the breadcrumbs. Available options are `Standard` (by default)
      * and `NoCurrentPage`.
      *
      *  **Note:** The `Standard` breadcrumbs show the current page as the last item in the trail. The last item
      * contains only plain text and is not a link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: BreadcrumbsDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSeparatorStyle separatorStyle}.
      *
      * Determines the visual style of the separator between the breadcrumb items.
      *
      *
      *
      *  Available options are:
      * 	 - `Slash`
      * 	 - `BackSlash`
      * 	 - `DoubleBackSlash`
      * 	 - `DoubleGreaterThan`
      * 	 - `DoubleSlash`
      * 	 - `GreaterThan`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Slash`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSeparatorStyle(): this.type = js.native
    def setSeparatorStyle(
      /**
      * New value for property `separatorStyle`
      */
    sSeparatorStyle: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String
    ): this.type = js.native
    def setSeparatorStyle(/**
      * New value for property `separatorStyle`
      */
    sSeparatorStyle: BreadcrumbsSeparatorStyle): this.type = js.native
  }
  
  trait BreadcrumbsSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the visual indication and behavior of the breadcrumbs. Available options are `Standard` (by default)
      * and `NoCurrentPage`.
      *
      *  **Note:** The `Standard` breadcrumbs show the current page as the last item in the trail. The last item
      * contains only plain text and is not a link.
      */
    var design: js.UndefOr[
        BreadcrumbsDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fires when a `BreadcrumbsItem` is clicked. **Note:** You can prevent browser location change by calling
      * `event.preventDefault()`.
      */
    var itemClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the component items.
      *
      *
      *
      *  **Note:** Use the `sap.ui.webc.main.BreadcrumbsItem` component to define the desired items.
      */
    var items: js.UndefOr[
        js.Array[IBreadcrumbsItem] | IBreadcrumbsItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the visual style of the separator between the breadcrumb items.
      *
      *
      *
      *  Available options are:
      * 	 - `Slash`
      * 	 - `BackSlash`
      * 	 - `DoubleBackSlash`
      * 	 - `DoubleGreaterThan`
      * 	 - `DoubleSlash`
      * 	 - `GreaterThan`
      */
    var separatorStyle: js.UndefOr[
        BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object BreadcrumbsSettings {
    
    inline def apply(): BreadcrumbsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsSettings] (val x: Self) extends AnyVal {
      
      inline def setDesign(
        value: BreadcrumbsDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setItemClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
      
      inline def setItems(
        value: js.Array[IBreadcrumbsItem] | IBreadcrumbsItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IBreadcrumbsItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSeparatorStyle(
        value: BreadcrumbsSeparatorStyle | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BreadcrumbsSeparatorStyle * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
      
      inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
    }
  }
}

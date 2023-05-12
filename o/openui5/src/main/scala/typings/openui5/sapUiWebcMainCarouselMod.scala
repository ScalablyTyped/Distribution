package typings.openui5

import typings.openui5.anon.SelectedIndex
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.CarouselArrowsPlacement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainCarouselMod {
  
  @JSImport("sap/ui/webc/main/Carousel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Carousel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Carousel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CarouselSettings) = this()
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
    mSettings: CarouselSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CarouselSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Carousel with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Carousel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Carousel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Carousel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Carousel
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.ui.webc.main.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Carousel` itself.
      *
      * Fired whenever the page changes due to user interaction, when the user clicks on the navigation arrows
      * or while resizing, based on the `items-per-page-l`, `items-per-page-m` and `items-per-page-s` properties.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.ui.webc.main.Carousel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Carousel` itself.
      *
      * Fired whenever the page changes due to user interaction, when the user clicks on the navigation arrows
      * or while resizing, based on the `items-per-page-l`, `items-per-page-m` and `items-per-page-s` properties.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
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
    def attachNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Carousel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.ui.webc.main.Carousel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigate(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigate(): this.type = js.native
    def fireNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: SelectedIndex): this.type = js.native
    
    /**
      * Gets current value of property {@link #getArrowsPlacement arrowsPlacement}.
      *
      * Defines the position of arrows.
      *
      *  Available options are:
      * 	 - `Content`
      * 	 - `Navigation`
      *  When set to "Content", the arrows are placed on the sides of the current page.
      *  When set to "Navigation", the arrows are placed on the sides of the page indicator.
      *
      * Default value is `Content`.
      *
      * @returns Value of property `arrowsPlacement`
      */
    def getArrowsPlacement(): CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the component.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getCyclic cyclic}.
      *
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      *
      * Default value is `false`.
      *
      * @returns Value of property `cyclic`
      */
    def getCyclic(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideNavigationArrows hideNavigationArrows}.
      *
      * Defines the visibility of the navigation arrows. If set to true the navigation arrows will be hidden.
      *
      *
      *  **Note:** The navigation arrows are never displayed on touch devices. In this case, the user can swipe
      * to navigate through the items.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideNavigationArrows`
      */
    def getHideNavigationArrows(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHidePageIndicator hidePageIndicator}.
      *
      * Defines the visibility of the paging indicator. If set to true the page indicator will be hidden.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hidePageIndicator`
      */
    def getHidePageIndicator(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getItemsPerPageL itemsPerPageL}.
      *
      * Defines the number of items per page on large size (more than 1024px). One item per page shown by default.
      *
      * Default value is `1`.
      *
      * @returns Value of property `itemsPerPageL`
      */
    def getItemsPerPageL(): int = js.native
    
    /**
      * Gets current value of property {@link #getItemsPerPageM itemsPerPageM}.
      *
      * Defines the number of items per page on medium size (from 640px to 1024px). One item per page shown by
      * default.
      *
      * Default value is `1`.
      *
      * @returns Value of property `itemsPerPageM`
      */
    def getItemsPerPageM(): int = js.native
    
    /**
      * Gets current value of property {@link #getItemsPerPageS itemsPerPageS}.
      *
      * Defines the number of items per page on small size (up to 640px). One item per page shown by default.
      *
      * Default value is `1`.
      *
      * @returns Value of property `itemsPerPageS`
      */
    def getItemsPerPageS(): int = js.native
    
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
      * Changes the currently displayed page.
      */
    def navigateTo(/**
      * The index of the target page
      */
    itemIndex: int): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getArrowsPlacement arrowsPlacement}.
      *
      * Defines the position of arrows.
      *
      *  Available options are:
      * 	 - `Content`
      * 	 - `Navigation`
      *  When set to "Content", the arrows are placed on the sides of the current page.
      *  When set to "Navigation", the arrows are placed on the sides of the page indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Content`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setArrowsPlacement(): this.type = js.native
    def setArrowsPlacement(
      /**
      * New value for property `arrowsPlacement`
      */
    sArrowsPlacement: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String
    ): this.type = js.native
    def setArrowsPlacement(/**
      * New value for property `arrowsPlacement`
      */
    sArrowsPlacement: CarouselArrowsPlacement): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCyclic cyclic}.
      *
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCyclic(): this.type = js.native
    def setCyclic(/**
      * New value for property `cyclic`
      */
    bCyclic: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideNavigationArrows hideNavigationArrows}.
      *
      * Defines the visibility of the navigation arrows. If set to true the navigation arrows will be hidden.
      *
      *
      *  **Note:** The navigation arrows are never displayed on touch devices. In this case, the user can swipe
      * to navigate through the items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideNavigationArrows(): this.type = js.native
    def setHideNavigationArrows(/**
      * New value for property `hideNavigationArrows`
      */
    bHideNavigationArrows: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHidePageIndicator hidePageIndicator}.
      *
      * Defines the visibility of the paging indicator. If set to true the page indicator will be hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHidePageIndicator(): this.type = js.native
    def setHidePageIndicator(/**
      * New value for property `hidePageIndicator`
      */
    bHidePageIndicator: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getItemsPerPageL itemsPerPageL}.
      *
      * Defines the number of items per page on large size (more than 1024px). One item per page shown by default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemsPerPageL(): this.type = js.native
    def setItemsPerPageL(/**
      * New value for property `itemsPerPageL`
      */
    iItemsPerPageL: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getItemsPerPageM itemsPerPageM}.
      *
      * Defines the number of items per page on medium size (from 640px to 1024px). One item per page shown by
      * default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemsPerPageM(): this.type = js.native
    def setItemsPerPageM(/**
      * New value for property `itemsPerPageM`
      */
    iItemsPerPageM: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getItemsPerPageS itemsPerPageS}.
      *
      * Defines the number of items per page on small size (up to 640px). One item per page shown by default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemsPerPageS(): this.type = js.native
    def setItemsPerPageS(/**
      * New value for property `itemsPerPageS`
      */
    iItemsPerPageS: int): this.type = js.native
  }
  
  trait CarouselSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the position of arrows.
      *
      *  Available options are:
      * 	 - `Content`
      * 	 - `Navigation`
      *  When set to "Content", the arrows are placed on the sides of the current page.
      *  When set to "Navigation", the arrows are placed on the sides of the page indicator.
      */
    var arrowsPlacement: js.UndefOr[
        CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the content of the component.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and
      * vice versa.
      */
    var cyclic: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visibility of the navigation arrows. If set to true the navigation arrows will be hidden.
      *
      *
      *  **Note:** The navigation arrows are never displayed on touch devices. In this case, the user can swipe
      * to navigate through the items.
      */
    var hideNavigationArrows: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the visibility of the paging indicator. If set to true the page indicator will be hidden.
      */
    var hidePageIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the number of items per page on large size (more than 1024px). One item per page shown by default.
      */
    var itemsPerPageL: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the number of items per page on medium size (from 640px to 1024px). One item per page shown by
      * default.
      */
    var itemsPerPageM: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the number of items per page on small size (up to 640px). One item per page shown by default.
      */
    var itemsPerPageS: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired whenever the page changes due to user interaction, when the user clicks on the navigation arrows
      * or while resizing, based on the `items-per-page-l`, `items-per-page-m` and `items-per-page-s` properties.
      */
    var navigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object CarouselSettings {
    
    inline def apply(): CarouselSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselSettings] (val x: Self) extends AnyVal {
      
      inline def setArrowsPlacement(
        value: CarouselArrowsPlacement | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CarouselArrowsPlacement * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "arrowsPlacement", value.asInstanceOf[js.Any])
      
      inline def setArrowsPlacementUndefined: Self = StObject.set(x, "arrowsPlacement", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCyclic(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "cyclic", value.asInstanceOf[js.Any])
      
      inline def setCyclicUndefined: Self = StObject.set(x, "cyclic", js.undefined)
      
      inline def setHideNavigationArrows(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideNavigationArrows", value.asInstanceOf[js.Any])
      
      inline def setHideNavigationArrowsUndefined: Self = StObject.set(x, "hideNavigationArrows", js.undefined)
      
      inline def setHidePageIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hidePageIndicator", value.asInstanceOf[js.Any])
      
      inline def setHidePageIndicatorUndefined: Self = StObject.set(x, "hidePageIndicator", js.undefined)
      
      inline def setItemsPerPageL(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemsPerPageL", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageLUndefined: Self = StObject.set(x, "itemsPerPageL", js.undefined)
      
      inline def setItemsPerPageM(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemsPerPageM", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageMUndefined: Self = StObject.set(x, "itemsPerPageM", js.undefined)
      
      inline def setItemsPerPageS(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemsPerPageS", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageSUndefined: Self = StObject.set(x, "itemsPerPageS", js.undefined)
      
      inline def setNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    }
  }
}

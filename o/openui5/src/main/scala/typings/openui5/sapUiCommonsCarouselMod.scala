package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.enums.Orientation
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsCarouselMod {
  
  @JSImport("sap/ui/commons/Carousel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Carousel.
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
    
    @JSImport("sap/ui/commons/Carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Carousel with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
      * Returns a metadata object for class sap.ui.commons.Carousel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Carousel
    extends typings.openui5.sapUiCoreControlMod.default {
    
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
      * Binds aggregation {@link #getContent content} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindContent(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Calculates and sets the size of the carousel, its items and its buttons
      */
    def calculateAndSetSize(): Unit = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAnimationDuration animationDuration}.
      *
      * Duration for animation when navigating through the contents of the Carousel
      *
      * Default value is `500`.
      *
      * @returns Value of property `animationDuration`
      */
    def getAnimationDuration(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Controls which are displayed inside the Carousel
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDefaultItemHeight defaultItemHeight}.
      *
      * Default height of the item in a carousel if no height can be determined
      *
      * Default value is `150`.
      *
      * @returns Value of property `defaultItemHeight`
      */
    def getDefaultItemHeight(): int = js.native
    
    /**
      * Gets current value of property {@link #getDefaultItemWidth defaultItemWidth}.
      *
      * Default width of the item in a carousel if no height can be determined
      *
      * Default value is `150`.
      *
      * @returns Value of property `defaultItemWidth`
      */
    def getDefaultItemWidth(): int = js.native
    
    /**
      * @SINCE 1.11.0
      *
      * Gets current value of property {@link #getFirstVisibleIndex firstVisibleIndex}.
      *
      * The index of the element in the content aggreation which is displayed first on rendering
      *
      * Default value is `0`.
      *
      * @returns Value of property `firstVisibleIndex`
      */
    def getFirstVisibleIndex(): int = js.native
    
    /**
      * Gets current value of property {@link #getHandleSize handleSize}.
      *
      * Determines the size of the handle in pixels. (Height for vertical carousel, width for horizontal carousel)
      *
      * Default value is `22`.
      *
      * @returns Value of property `handleSize`
      */
    def getHandleSize(): int = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Determines the height of the Carousel
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getOrientation orientation}.
      *
      * Determines the orientation of the Carousel. Can be either "horizontal" or "vertical"
      *
      * Default value is `horizontal`.
      *
      * @returns Value of property `orientation`
      */
    def getOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.Orientation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisibleItems visibleItems}.
      *
      * If defined, the carousel displays the number of items defined. Items will be resized to fit the area.
      *
      * @returns Value of property `visibleItems`
      */
    def getVisibleItems(): int = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the Carousel
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * If the device supports touch gestures and left swipe is triggered shows the next carousel item
      */
    def onswipeleft(oEvent: Event): Unit = js.native
    
    /**
      * If the device supports touch gestures and right swipe is triggered shows the previous carousel item
      */
    def onswiperight(oEvent: Event): Unit = js.native
    
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
      * Sets a new value for property {@link #getAnimationDuration animationDuration}.
      *
      * Duration for animation when navigating through the contents of the Carousel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `500`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnimationDuration(): this.type = js.native
    def setAnimationDuration(/**
      * New value for property `animationDuration`
      */
    iAnimationDuration: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultItemHeight defaultItemHeight}.
      *
      * Default height of the item in a carousel if no height can be determined
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `150`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultItemHeight(): this.type = js.native
    def setDefaultItemHeight(/**
      * New value for property `defaultItemHeight`
      */
    iDefaultItemHeight: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDefaultItemWidth defaultItemWidth}.
      *
      * Default width of the item in a carousel if no height can be determined
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `150`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultItemWidth(): this.type = js.native
    def setDefaultItemWidth(/**
      * New value for property `defaultItemWidth`
      */
    iDefaultItemWidth: int): this.type = js.native
    
    /**
      * @SINCE 1.11.0
      *
      * Setter for property `firstVisibleIndex`.
      *
      * Default value is `0`
      *
      * @returns `this` to allow method chaining
      */
    def setFirstVisibleIndex(/**
      * new value for property `firstVisibleIndex`
      */
    iFirstVisibleIndex: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHandleSize handleSize}.
      *
      * Determines the size of the handle in pixels. (Height for vertical carousel, width for horizontal carousel)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `22`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHandleSize(): this.type = js.native
    def setHandleSize(/**
      * New value for property `handleSize`
      */
    iHandleSize: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Determines the height of the Carousel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getOrientation orientation}.
      *
      * Determines the orientation of the Carousel. Can be either "horizontal" or "vertical"
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `horizontal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOrientation(): this.type = js.native
    def setOrientation(
      /**
      * New value for property `orientation`
      */
    sOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.Orientation * / any */ String
    ): this.type = js.native
    def setOrientation(/**
      * New value for property `orientation`
      */
    sOrientation: Orientation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleItems visibleItems}.
      *
      * If defined, the carousel displays the number of items defined. Items will be resized to fit the area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleItems(): this.type = js.native
    def setVisibleItems(/**
      * New value for property `visibleItems`
      */
    iVisibleItems: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the width of the Carousel
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Shows the element with the specified Id. This can be only used after the component is rendered.
      */
    def showElementWithId(/**
      * Id of the element to slide to.
      */
    sElementId: String): Unit = js.native
    
    /**
      * Shows the next item in carousel. This can be only used after the component is rendered.
      */
    def showNext(): Unit = js.native
    
    /**
      * Shows the previous item in carousel. This can be only used after the component is rendered.
      */
    def showPrevious(): Unit = js.native
    
    /**
      * Unbinds aggregation {@link #getContent content} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindContent(): this.type = js.native
  }
  
  trait CarouselSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Duration for animation when navigating through the contents of the Carousel
      */
    var animationDuration: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Controls which are displayed inside the Carousel
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Default height of the item in a carousel if no height can be determined
      */
    var defaultItemHeight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Default width of the item in a carousel if no height can be determined
      */
    var defaultItemWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.11.0
      *
      * The index of the element in the content aggreation which is displayed first on rendering
      */
    var firstVisibleIndex: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the size of the handle in pixels. (Height for vertical carousel, width for horizontal carousel)
      */
    var handleSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the height of the Carousel
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the orientation of the Carousel. Can be either "horizontal" or "vertical"
      */
    var orientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If defined, the carousel displays the number of items defined. Items will be resized to fit the area.
      */
    var visibleItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the width of the Carousel
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CarouselSettings {
    
    inline def apply(): CarouselSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselSettings]
    }
    
    extension [Self <: CarouselSettings](x: Self) {
      
      inline def setAnimationDuration(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDefaultItemHeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultItemHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultItemHeightUndefined: Self = StObject.set(x, "defaultItemHeight", js.undefined)
      
      inline def setDefaultItemWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "defaultItemWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultItemWidthUndefined: Self = StObject.set(x, "defaultItemWidth", js.undefined)
      
      inline def setFirstVisibleIndex(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "firstVisibleIndex", value.asInstanceOf[js.Any])
      
      inline def setFirstVisibleIndexUndefined: Self = StObject.set(x, "firstVisibleIndex", js.undefined)
      
      inline def setHandleSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "handleSize", value.asInstanceOf[js.Any])
      
      inline def setHandleSizeUndefined: Self = StObject.set(x, "handleSize", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setVisibleItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleItems", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemsUndefined: Self = StObject.set(x, "visibleItems", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

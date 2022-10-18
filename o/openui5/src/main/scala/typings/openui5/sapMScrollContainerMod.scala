package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMScrollContainerMod {
  
  @JSImport("sap/m/ScrollContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ScrollContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ScrollContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ScrollContainerSettings) = this()
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
    mSettings: ScrollContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ScrollContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ScrollContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ScrollContainer with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ScrollContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ScrollContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ScrollContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ScrollContainer
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
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content of the ScrollContainer.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFocusable focusable}.
      *
      * Whether the scroll container can be focused.
      *
      * Note that it should be set to "true" when there are no focusable elements inside or when keyboard interaction
      * requires an additional tab stop on the container.
      *
      * Default value is `false`.
      *
      * @returns Value of property `focusable`
      */
    def getFocusable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the ScrollContainer. By default the height equals the content height. If only horizontal
      * scrolling is used, do not set the height or make sure the height is always larger than the height of
      * the content.
      *
      * Note that when a percentage is given, for the height to work as expected, the height of the surrounding
      * container must be defined.
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHorizontal horizontal}.
      *
      * Whether horizontal scrolling should be possible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `horizontal`
      */
    def getHorizontal(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVertical vertical}.
      *
      * Whether vertical scrolling should be possible.
      *
      * Note that this is off by default because typically a Page is used as fullscreen element which can handle
      * vertical scrolling. If this is not the case and vertical scrolling is required, this flag needs to be
      * set to "true". Important: it is not supported to have nested controls that both enable scrolling into
      * the same dimension.
      *
      * Default value is `false`.
      *
      * @returns Value of property `vertical`
      */
    def getVertical(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the ScrollContainer. If not set, it consumes the complete available width, behaving like
      * normal HTML block elements. If only vertical scrolling is enabled, make sure the content always fits
      * or wraps.
      *
      * Default value is `'auto'`.
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
      * Scrolls to the given position. When called while the control is not rendered (yet), the scrolling position
      * is still applied, but there is no animation.
      *
      * @returns `this` to facilitate method chaining
      */
    def scrollTo(
      /**
      * The horizontal pixel position to scroll to. Scrolling to the right happens with positive values. In right-to-left
      * mode scrolling starts at the right side and higher values scroll to the left. If only vertical scrolling
      * is enabled, give 0 as value.
      */
    x: int,
      /**
      * The vertical pixel position to scroll to. Scrolling down happens with positive values. If only horizontal
      * scrolling is enabled, give 0 as value.
      */
    y: int
    ): this.type = js.native
    def scrollTo(
      /**
      * The horizontal pixel position to scroll to. Scrolling to the right happens with positive values. In right-to-left
      * mode scrolling starts at the right side and higher values scroll to the left. If only vertical scrolling
      * is enabled, give 0 as value.
      */
    x: int,
      /**
      * The vertical pixel position to scroll to. Scrolling down happens with positive values. If only horizontal
      * scrolling is enabled, give 0 as value.
      */
    y: int,
      /**
      * The duration of animated scrolling in milliseconds. The value `0` results in immediate scrolling without
      * animation.
      */
    time: int
    ): this.type = js.native
    
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    element: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    element: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The duration of animated scrolling. To scroll immediately without animation, give 0 as value or leave
      * it default.
      */
    time: int
    ): this.type = js.native
    /**
      * @SINCE 1.30
      *
      * Scrolls to an element(DOM or sap.ui.core.Element) within the page if the element is rendered.
      *
      * @returns `this` to facilitate method chaining.
      */
    def scrollToElement(/**
      * The element to which should be scrolled.
      */
    element: HTMLElement): this.type = js.native
    def scrollToElement(
      /**
      * The element to which should be scrolled.
      */
    element: HTMLElement,
      /**
      * The duration of animated scrolling. To scroll immediately without animation, give 0 as value or leave
      * it default.
      */
    time: int
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFocusable focusable}.
      *
      * Whether the scroll container can be focused.
      *
      * Note that it should be set to "true" when there are no focusable elements inside or when keyboard interaction
      * requires an additional tab stop on the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFocusable(): this.type = js.native
    def setFocusable(/**
      * New value for property `focusable`
      */
    bFocusable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the ScrollContainer. By default the height equals the content height. If only horizontal
      * scrolling is used, do not set the height or make sure the height is always larger than the height of
      * the content.
      *
      * Note that when a percentage is given, for the height to work as expected, the height of the surrounding
      * container must be defined.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHorizontal horizontal}.
      *
      * Whether horizontal scrolling should be possible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHorizontal(): this.type = js.native
    def setHorizontal(/**
      * New value for property `horizontal`
      */
    bHorizontal: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVertical vertical}.
      *
      * Whether vertical scrolling should be possible.
      *
      * Note that this is off by default because typically a Page is used as fullscreen element which can handle
      * vertical scrolling. If this is not the case and vertical scrolling is required, this flag needs to be
      * set to "true". Important: it is not supported to have nested controls that both enable scrolling into
      * the same dimension.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVertical(): this.type = js.native
    def setVertical(/**
      * New value for property `vertical`
      */
    bVertical: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the ScrollContainer. If not set, it consumes the complete available width, behaving like
      * normal HTML block elements. If only vertical scrolling is enabled, make sure the content always fits
      * or wraps.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ScrollContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The content of the ScrollContainer.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the scroll container can be focused.
      *
      * Note that it should be set to "true" when there are no focusable elements inside or when keyboard interaction
      * requires an additional tab stop on the container.
      */
    var focusable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the ScrollContainer. By default the height equals the content height. If only horizontal
      * scrolling is used, do not set the height or make sure the height is always larger than the height of
      * the content.
      *
      * Note that when a percentage is given, for the height to work as expected, the height of the surrounding
      * container must be defined.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether horizontal scrolling should be possible.
      */
    var horizontal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether vertical scrolling should be possible.
      *
      * Note that this is off by default because typically a Page is used as fullscreen element which can handle
      * vertical scrolling. If this is not the case and vertical scrolling is required, this flag needs to be
      * set to "true". Important: it is not supported to have nested controls that both enable scrolling into
      * the same dimension.
      */
    var vertical: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width of the ScrollContainer. If not set, it consumes the complete available width, behaving like
      * normal HTML block elements. If only vertical scrolling is enabled, make sure the content always fits
      * or wraps.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ScrollContainerSettings {
    
    inline def apply(): ScrollContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollContainerSettings]
    }
    
    extension [Self <: ScrollContainerSettings](x: Self) {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFocusable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

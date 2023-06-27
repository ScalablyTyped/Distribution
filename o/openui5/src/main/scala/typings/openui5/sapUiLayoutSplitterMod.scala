package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.Orientation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutSplitterMod {
  
  @JSImport("sap/ui/layout/Splitter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Splitter.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Splitter {
    def this(/**
      * initial settings for the new control
      */
    mSettings: SplitterSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: SplitterSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: SplitterSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/Splitter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.Splitter with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Splitter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Splitter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.Splitter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Splitter
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some contentArea to the aggregation {@link #getContentAreas contentAreas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContentArea(
      /**
      * The contentArea to add; if empty, nothing is inserted
      */
    oContentArea: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.layout.Splitter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.Splitter` itself.
      *
      * Event is fired when contents are resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit]
    ): this.type = js.native
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.Splitter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.layout.Splitter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.layout.Splitter` itself.
      *
      * Event is fired when contents are resized.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit]
    ): this.type = js.native
    def attachResize(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.layout.Splitter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the contentAreas in the aggregation {@link #getContentAreas contentAreas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContentAreas(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:resize resize} event of this `sap.ui.layout.Splitter`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit]
    ): this.type = js.native
    def detachResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SplitterResizeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.21) - This method is declared as protected in order to assess the need for this
      * feature. It is declared as deprecated because the API might change in case the need for this is high
      * enough to make it part of the official Splitter interface
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Disables the resize handler for this control, this leads to an automatic resize of the contents whenever
      * the control changes its size. The resize handler is enabled in every control instance by default. For
      * performance reasons this behavior can be disabled by calling disableAutoResize()
      */
    def disableAutoResize(): Unit = js.native
    def disableAutoResize(
      /**
      * Only disable autoResize temporarily (used for live resize), so that the previous status can be restored
      * afterwards
      */
    bTemporarily: Boolean
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Disables the resizing of the Splitter contents via keyboard. This changes the Splitter bars to non-focusable
      * elements.
      */
    def disableKeyboardSupport(): Unit = js.native
    
    /**
      * @deprecated (since 1.21) - This method is declared as protected in order to assess the need for this
      * feature. It is declared as deprecated because the API might change in case the need for this is high
      * enough to make it part of the official Splitter interface
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Disables recalculation and resize of the splitter contents while dragging the splitter bar. This means
      * that the contents are resized only once after moving the splitter bar.
      */
    def disableLiveResize(): Unit = js.native
    
    /**
      * @deprecated (since 1.21) - This method is declared as protected in order to assess the need for this
      * feature. It is declared as deprecated because the API might change in case the need for this is high
      * enough to make it part of the official Splitter interface
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Enables the resize handler for this control, this leads to an automatic resize of the contents whenever
      * the control changes its size. The resize handler is enabled in every control instance by default. For
      * performance reasons this behavior can be disabled by calling disableAutoResize()
      */
    def enableAutoResize(): Unit = js.native
    def enableAutoResize(
      /**
      * Only enables autoResize if it was previously disabled temporarily (used for live resize)
      */
    bTemporarily: Boolean
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Enables the resizing of the Splitter contents via keyboard. This makes the Splitter bars focusable elements.
      */
    def enableKeyboardSupport(): Unit = js.native
    
    /**
      * @deprecated (since 1.21) - This method is declared as protected in order to assess the need for this
      * feature. It is declared as deprecated because the API might change in case the need for this is high
      * enough to make it part of the official Splitter interface
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Enables recalculation and resize of the splitter contents while dragging the splitter bar. This means
      * that the contents are resized several times per second when moving the splitter bar.
      */
    def enableLiveResize(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:resize resize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireResize(): this.type = js.native
    def fireResize(/**
      * Parameters to pass along with the event
      */
    mParameters: Splitter$ResizeEventParameters): this.type = js.native
    
    /**
      * @deprecated (since 1.21) - This method is declared as protected in order to assess the need for this
      * feature. It is declared as deprecated because the API might change in case the need for this is high
      * enough to make it part of the official Splitter interface
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the current actual content sizes as pixel value - these values can change with every resize.
      *
      * @returns Array of px values that correspond to the content area sizes
      */
    def getCalculatedSizes(): js.Array[Double] = js.native
    
    /**
      * Gets content of aggregation {@link #getContentAreas contentAreas}.
      *
      * The content areas to be split. The control will show n-1 splitter bars between n controls in this aggregation.
      */
    def getContentAreas(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the control
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getOrientation orientation}.
      *
      * Whether to split the contents horizontally (default) or vertically.
      *
      * Default value is `Horizontal`.
      *
      * @returns Value of property `orientation`
      */
    def getOrientation(): Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the control
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContentAreas contentAreas}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContentArea(
      /**
      * The contentArea whose index is looked for
      */
    oContentArea: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a contentArea into the aggregation {@link #getContentAreas contentAreas}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContentArea(
      /**
      * The contentArea to insert; if empty, nothing is inserted
      */
    oContentArea: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the contentArea should be inserted at; for a negative value of `iIndex`, the contentArea
      * is inserted at position 0; for a value greater than the current size of the aggregation, the contentArea
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContentAreas contentAreas}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContentAreas(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeContentArea(/**
      * The contentArea to remove or its index or id
      */
    vContentArea: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a contentArea from the aggregation {@link #getContentAreas contentAreas}.
      *
      * @returns The removed contentArea or `null`
      */
    def removeContentArea(/**
      * The contentArea to remove or its index or id
      */
    vContentArea: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContentArea(
      /**
      * The contentArea to remove or its index or id
      */
    vContentArea: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Resets the size (width or height) of each of the content areas.
      */
    def resetContentAreasSizes(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
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
      * Whether to split the contents horizontally (default) or vertically.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Horizontal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOrientation(): this.type = js.native
    def setOrientation(
      /**
      * New value for property `orientation`
      */
    sOrientation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String
    ): this.type = js.native
    def setOrientation(/**
      * New value for property `orientation`
      */
    sOrientation: Orientation): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * This method triggers a resize on the Splitter - meaning it forces the Splitter to recalculate all sizes.
      * This method should only be used in rare cases, for example when the CSS that defines the sizes of the
      * splitter bars changes without triggering a rerendering of the splitter.
      */
    def triggerResize(): Unit = js.native
    def triggerResize(/**
      * Do not delay the resize, trigger it right now.
      */
    forceDirectly: Boolean): Unit = js.native
  }
  
  trait Splitter$ResizeEventParameters extends StObject {
    
    /**
      * The ID of the splitter control. The splitter control can also be accessed by calling getSource() on the
      * event.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * An array of values representing the new (pixel-)sizes of the splitter contents
      */
    var newSizes: js.UndefOr[js.Array[int]] = js.undefined
    
    /**
      * An array of values representing the old (pixel-)sizes of the splitter contents
      */
    var oldSizes: js.UndefOr[js.Array[int]] = js.undefined
  }
  object Splitter$ResizeEventParameters {
    
    inline def apply(): Splitter$ResizeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Splitter$ResizeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Splitter$ResizeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNewSizes(value: js.Array[int]): Self = StObject.set(x, "newSizes", value.asInstanceOf[js.Any])
      
      inline def setNewSizesUndefined: Self = StObject.set(x, "newSizes", js.undefined)
      
      inline def setNewSizesVarargs(value: int*): Self = StObject.set(x, "newSizes", js.Array(value*))
      
      inline def setOldSizes(value: js.Array[int]): Self = StObject.set(x, "oldSizes", value.asInstanceOf[js.Any])
      
      inline def setOldSizesUndefined: Self = StObject.set(x, "oldSizes", js.undefined)
      
      inline def setOldSizesVarargs(value: int*): Self = StObject.set(x, "oldSizes", js.Array(value*))
    }
  }
  
  type SplitterResizeEvent = typings.openui5.sapUiBaseEventMod.default[Splitter$ResizeEventParameters]
  
  type SplitterResizeEventParameters = Splitter$ResizeEventParameters
  
  trait SplitterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The content areas to be split. The control will show n-1 splitter bars between n controls in this aggregation.
      */
    var contentAreas: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether to split the contents horizontally (default) or vertically.
      */
    var orientation: js.UndefOr[
        Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Event is fired when contents are resized.
      */
    var resize: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Splitter$ResizeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SplitterSettings {
    
    inline def apply(): SplitterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitterSettings] (val x: Self) extends AnyVal {
      
      inline def setContentAreas(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "contentAreas", value.asInstanceOf[js.Any])
      
      inline def setContentAreasUndefined: Self = StObject.set(x, "contentAreas", js.undefined)
      
      inline def setContentAreasVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "contentAreas", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOrientation(
        value: Orientation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Orientation * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setResize(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Splitter$ResizeEventParameters] => Unit
      ): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ScrollBarAction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreScrollBarMod {
  
  @JSImport("sap/ui/core/ScrollBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ScrollBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ScrollBar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ScrollBarSettings) = this()
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
    mSettings: ScrollBarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ScrollBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ScrollBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.ScrollBar with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ScrollBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ScrollBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.ScrollBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ScrollBar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scroll scroll} event of this `sap.ui.core.ScrollBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ScrollBar` itself.
      *
      * Scroll event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScroll(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit]
    ): this.type = js.native
    def attachScroll(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ScrollBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:scroll scroll} event of this `sap.ui.core.ScrollBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.ScrollBar` itself.
      *
      * Scroll event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachScroll(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit]
    ): this.type = js.native
    def attachScroll(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.ScrollBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds the mouse wheel scroll event of the control that has the scrollbar to the scrollbar itself.
      */
    def bind(/**
      * Dom ref of the control that uses the scrollbar
      */
    oOwnerDomRef: String): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:scroll scroll} event of this `sap.ui.core.ScrollBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachScroll(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit]
    ): this.type = js.native
    def detachScroll(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ScrollBarScrollEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:scroll scroll} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireScroll(): this.type = js.native
    def fireScroll(/**
      * Parameters to pass along with the event
      */
    mParameters: ScrollBar$ScrollEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContentSize contentSize}.
      *
      * Size of the scrollable content (in pixels).
      *
      * @returns Value of property `contentSize`
      */
    def getContentSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getScrollPosition scrollPosition}.
      *
      * Scroll position in steps or pixels.
      *
      * @returns Value of property `scrollPosition`
      */
    def getScrollPosition(): int = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Size of the Scrollbar (in pixels).
      *
      * @returns Value of property `size`
      */
    def getSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSteps steps}.
      *
      * Number of steps to scroll. Used if the size of the content is not known as the data is loaded dynamically.
      *
      * @returns Value of property `steps`
      */
    def getSteps(): int = js.native
    
    /**
      * Gets current value of property {@link #getVertical vertical}.
      *
      * Orientation. Defines if the Scrollbar is vertical or horizontal.
      *
      * Default value is `true`.
      *
      * @returns Value of property `vertical`
      */
    def getVertical(): Boolean = js.native
    
    /**
      * Page Down is used to scroll one page forward.
      */
    def pageDown(): Unit = js.native
    
    /**
      * Page Up is used to scroll one page back.
      */
    def pageUp(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getContentSize contentSize}.
      *
      * Size of the scrollable content (in pixels).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentSize(): this.type = js.native
    def setContentSize(/**
      * New value for property `contentSize`
      */
    sContentSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollPosition scrollPosition}.
      *
      * Scroll position in steps or pixels.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollPosition(): this.type = js.native
    def setScrollPosition(/**
      * New value for property `scrollPosition`
      */
    iScrollPosition: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Size of the Scrollbar (in pixels).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSteps steps}.
      *
      * Number of steps to scroll. Used if the size of the content is not known as the data is loaded dynamically.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSteps(): this.type = js.native
    def setSteps(/**
      * New value for property `steps`
      */
    iSteps: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVertical vertical}.
      *
      * Orientation. Defines if the Scrollbar is vertical or horizontal.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVertical(): this.type = js.native
    def setVertical(/**
      * New value for property `vertical`
      */
    bVertical: Boolean): this.type = js.native
    
    /**
      * Unbinds the mouse wheel scroll event of the control that has the scrollbar
      */
    def unbind(/**
      * Dom ref of the Control that uses the scrollbar
      */
    oOwnerDomRef: String): Unit = js.native
  }
  
  trait ScrollBar$ScrollEventParameters extends StObject {
    
    /**
      * Actions are: Click on track, button, drag of thumb, or mouse wheel click.
      */
    var action: js.UndefOr[
        ScrollBarAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScrollBarAction * / any */ String)
      ] = js.undefined
    
    /**
      * Direction of scrolling: back (up) or forward (down).
      */
    var forward: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current Scroll position either in pixels or in steps.
      */
    var newScrollPos: js.UndefOr[int] = js.undefined
    
    /**
      * Old Scroll position - can be in pixels or in steps.
      */
    var oldScrollPos: js.UndefOr[int] = js.undefined
  }
  object ScrollBar$ScrollEventParameters {
    
    inline def apply(): ScrollBar$ScrollEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollBar$ScrollEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollBar$ScrollEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAction(
        value: ScrollBarAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScrollBarAction * / any */ String)
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      inline def setNewScrollPos(value: int): Self = StObject.set(x, "newScrollPos", value.asInstanceOf[js.Any])
      
      inline def setNewScrollPosUndefined: Self = StObject.set(x, "newScrollPos", js.undefined)
      
      inline def setOldScrollPos(value: int): Self = StObject.set(x, "oldScrollPos", value.asInstanceOf[js.Any])
      
      inline def setOldScrollPosUndefined: Self = StObject.set(x, "oldScrollPos", js.undefined)
    }
  }
  
  type ScrollBarScrollEvent = typings.openui5.sapUiBaseEventMod.default[ScrollBar$ScrollEventParameters]
  
  type ScrollBarScrollEventParameters = ScrollBar$ScrollEventParameters
  
  trait ScrollBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Size of the scrollable content (in pixels).
      */
    var contentSize: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Scroll event.
      */
    var scroll: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ScrollBar$ScrollEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Scroll position in steps or pixels.
      */
    var scrollPosition: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Size of the Scrollbar (in pixels).
      */
    var size: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of steps to scroll. Used if the size of the content is not known as the data is loaded dynamically.
      */
    var steps: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Orientation. Defines if the Scrollbar is vertical or horizontal.
      */
    var vertical: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ScrollBarSettings {
    
    inline def apply(): ScrollBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollBarSettings] (val x: Self) extends AnyVal {
      
      inline def setContentSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
      
      inline def setContentSizeUndefined: Self = StObject.set(x, "contentSize", js.undefined)
      
      inline def setScroll(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ScrollBar$ScrollEventParameters] => Unit
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      inline def setScrollPosition(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      inline def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSteps(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setVertical(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}

package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.jquery.JQuery.Promise
import typings.oojs.OO.EventEmitter
import typings.oojsUi.OO.ui.Window.Props
import typings.oojsUi.OO.ui.Window.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A window is a container for elements that are in a child frame. They are used with
  * a window manager (OO.ui.WindowManager), which is used to open and close the window and control
  * its presentation. The size of a window is specified using a symbolic name (e.g., ‘small’,
  * ‘medium’, ‘large’), which is interpreted by the window manager. If the requested size is not
  * recognized, the window manager will choose a sensible fallback.
  *
  * The lifecycle of a window has three primary stages (opening, opened, and closing) in which
  * different processes are executed:
  *
  * **opening**: The opening stage begins when the window manager's
  * {@link OO.ui.WindowManager.openWindow openWindow} or the window's {@link open} methods are
  * used, and the window manager begins to open the window.
  *
  * - {@link getSetupProcess} method is called and its result executed
  * - {@link getReadyProcess} method is called and its result executed
  *
  * **opened**: The window is now open
  *
  * **closing**: The closing stage begins when the window manager's
  * {@link OO.ui.WindowManager.closeWindow closeWindow}
  * or the window's {@link close} methods are used, and the window manager begins to close the
  * window.
  *
  * - {@link getHoldProcess} method is called and its result executed
  * - {@link getTeardownProcess} method is called and its result executed. The window is now closed
  *
  * Each of the window's processes (setup, ready, hold, and teardown) can be extended in subclasses
  * by overriding the window's getSetupProcess, getReadyProcess, getHoldProcess and
  * getTeardownProcess methods. Note that each {@link OO.ui.Process process} is executed in series,
  * so asynchronous processing can complete. Always assume window processes are executed
  * asynchronously.
  *
  * For more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows).
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Window
  */
@js.native
trait Window
  extends StObject
     with Props
     with Prototype
object Window {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions {
    
    /**
      * Symbolic name of the dialog size: `small`, `medium`, `large`, `larger` or `full`.
      * If omitted, the value of the {@link Static.size static size} property will be used.
      */
    var size: js.UndefOr[Size] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[Window]
       with Instantiable1[/* config */ ConfigOptions, Window] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Element.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Element.Constructor = js.native
  }
  
  /**
    * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Window-method-setDimensions
    */
  trait Dimension extends StObject {
    
    /** Height, omit to set based on height of contents */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** Maximum height */
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    /** Maximum width */
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    /** Minimum height */
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    /** Minimum width */
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    /** Width */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Dimension {
    
    inline def apply(): Dimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props {
    
    @JSName("$content")
    var $content: JQuery[HTMLElement]
    
    @JSName("$focusTrapAfter")
    var $focusTrapAfter: JQuery[HTMLElement]
    
    /**
      * Set focus traps
      *
      * It is considered best practice to trap focus in a loop within a modal dialog, even
      * though with 'inert' support we could allow focus to break out to the browser chrome.
      *
      * - https://www.w3.org/TR/wai-aria-practices-1.1/examples/dialog-modal/dialog.html#kbd_label
      * - https://allyjs.io/tutorials/accessible-dialog.html#reacting-to-kbdtabkbd-and-kbdshift-tabkbd
      * - https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA/Roles/dialog_role#focus_management
      */
    @JSName("$focusTrapBefore")
    var $focusTrapBefore: JQuery[HTMLElement]
    
    @JSName("$focusTraps")
    var $focusTraps: JQuery[HTMLElement]
    
    @JSName("$frame")
    var $frame: JQuery[HTMLElement]
    
    /**
      * Overlay element to use for the `$overlay` configuration option of widgets that support it.
      * Things put inside it are overlaid on top of the window and are not bound to its dimensions.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      *
      *     MyDialog.prototype.initialize = function () {
      *       ...
      *       var popupButton = new OO.ui.PopupButtonWidget( {
      *         $overlay: this.$overlay,
      *         label: 'Popup button',
      *         popup: {
      *           $content: $( '<p>Popup content.</p><p>More content.</p><p>Yet more content.</p>' ),
      *           padded: true
      *         }
      *       } );
      *       ...
      *     };
      */
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $content: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $focusTrapAfter: JQuery[HTMLElement],
      $focusTrapBefore: JQuery[HTMLElement],
      $focusTraps: JQuery[HTMLElement],
      $frame: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($content = $content.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $focusTrapAfter = $focusTrapAfter.asInstanceOf[js.Any], $focusTrapBefore = $focusTrapBefore.asInstanceOf[js.Any], $focusTraps = $focusTraps.asInstanceOf[js.Any], $frame = $frame.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$content(value: JQuery[HTMLElement]): Self = StObject.set(x, "$content", value.asInstanceOf[js.Any])
      
      inline def set$focusTrapAfter(value: JQuery[HTMLElement]): Self = StObject.set(x, "$focusTrapAfter", value.asInstanceOf[js.Any])
      
      inline def set$focusTrapBefore(value: JQuery[HTMLElement]): Self = StObject.set(x, "$focusTrapBefore", value.asInstanceOf[js.Any])
      
      inline def set$focusTraps(value: JQuery[HTMLElement]): Self = StObject.set(x, "$focusTraps", value.asInstanceOf[js.Any])
      
      inline def set$frame(value: JQuery[HTMLElement]): Self = StObject.set(x, "$frame", value.asInstanceOf[js.Any])
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Element.Prototype
       with EventEmitter {
    
    /**
      * Close the window.
      *
      * This method is a wrapper around a call to the window
      * manager’s {@link OO.ui.WindowManager.closeWindow closeWindow} method.
      *
      * The window's {@link getHoldProcess} and {@link getTeardownProcess} methods are called during the closing
      * phase of the window’s lifecycle and can be used to specify closing behavior each time
      * the window closes.
      *
      * @param data Window closing data
      * @return See OO.ui.WindowManager.closeWindow
      * @throws {Error} An error is thrown if the window is not attached to a window manager
      */
    def close(): WindowInstance = js.native
    def close(data: Any): WindowInstance = js.native
    
    /**
      * Focus the window
      *
      * @param focusLast Focus the last focusable element in the window, instead of the first
      * @return The window, for chaining
      */
    def focus(focusLast: Boolean): this.type = js.native
    
    /**
      * Get the height of the window body.
      *
      * To get the height of the full window contents (the window body, head, and foot together),
      * use {@link getContentHeight}.
      *
      * When this function is called, the window will temporarily have been resized
      * to height=1px, so .scrollHeight measurements can be taken accurately.
      *
      * @return Height of the window body in pixels
      */
    def getBodyHeight(): Double = js.native
    
    /**
      * Get the height of the full window contents (i.e., the window head, body and foot together).
      *
      * What constitutes the head, body, and foot varies depending on the window type.
      * A {@link OO.ui.MessageDialog message dialog} displays a title and message in its body,
      * and any actions in the foot. A {@link OO.ui.ProcessDialog process dialog} displays a title
      * and special actions in the head, and dialog content in the body.
      *
      * To get just the height of the dialog body, use the {@link getBodyHeight} method.
      *
      * @return The height of the window contents (the dialog head, body and foot) in pixels
      */
    def getContentHeight(): Double = js.native
    
    /**
      * Get the directionality of the frame (right-to-left or left-to-right).
      *
      * @return Directionality: `'ltr'` or `'rtl'`
      */
    def getDir(): Direction = js.native
    
    /**
      * Get the 'hold' process.
      *
      * The hold process is used to keep a window from being used in a particular context, based on the
      * `data` argument. This method is called during the closing phase of the window’s lifecycle (before
      * the closing animation). You can close dropdowns of elements in the window in this process, if
      * they do not get closed automatically.
      *
      * Override this method to add additional steps to the 'hold' process the parent method provides
      * using the {@link OO.ui.Process.first first} and {@link OO.ui.Process.next next} methods
      * of OO.ui.Process.
      *
      * @param data Window closing data
      * @return Hold process
      */
    def getHoldProcess(): Process = js.native
    def getHoldProcess(data: Any): Process = js.native
    
    /**
      * Get the window manager.
      *
      * All windows must be attached to a window manager, which is used to open
      * and close the window and control its presentation.
      *
      * @return Manager of window
      */
    def getManager(): WindowManager = js.native
    
    /**
      * Get the ‘ready’ process.
      *
      * The ready process is used to ready a window for use in a particular context, based on the `data`
      * argument. This method is called during the opening phase of the window’s lifecycle, after the
      * window has been {@link getSetupProcess setup} (after the opening animation). You can focus
      * elements in the window in this process, or open their dropdowns.
      *
      * Override this method to add additional steps to the ‘ready’ process the parent method
      * provides using the {@link OO.ui.Process.first first} and {@link OO.ui.Process.next next}
      * methods of OO.ui.Process.
      *
      * @param data Window opening data
      * @return Ready process
      */
    def getReadyProcess(): Process = js.native
    def getReadyProcess(data: Any): Process = js.native
    
    /**
      * Get the 'setup' process.
      *
      * The setup process is used to set up a window for use in a particular context, based on the `data`
      * argument. This method is called during the opening phase of the window’s lifecycle (before the
      * opening animation). You can add elements to the window in this process or set their default
      * values.
      *
      * Override this method to add additional steps to the ‘setup’ process the parent method provides
      * using the {@link OO.ui.Process.first first} and {@link OO.ui.Process.next next} methods
      * of OO.ui.Process.
      *
      * To add window content that persists between openings, you may wish to use the {@link initialize}
      * method instead.
      *
      * @param data Window opening data
      * @return Setup process
      */
    def getSetupProcess(): Process = js.native
    def getSetupProcess(data: Any): Process = js.native
    
    /**
      * Get the symbolic name of the window size (e.g., `small` or `medium`).
      *
      * @return Symbolic name of the size: `small`, `medium`, `large`, `larger`, `full`
      */
    def getSize(): Size = js.native
    
    /**
      * Get the size properties associated with the current window size
      *
      * @return Size properties
      */
    def getSizeProperties(): Dimension = js.native
    
    /**
      * Get the ‘teardown’ process.
      *
      * The teardown process is used to teardown a window after use. During teardown, user interactions
      * within the window are conveyed and the window is closed, based on the `data` argument. This
      * method is called during the closing phase of the window’s lifecycle (after the closing
      * animation). You can remove elements in the window in this process or clear their values.
      *
      * Override this method to add additional steps to the ‘teardown’ process the parent method provides
      * using the {@link OO.ui.Process.first first} and {@link OO.ui.Process.next next} methods
      * of OO.ui.Process.
      *
      * @param data Window closing data
      * @return Teardown process
      */
    def getTeardownProcess(): Process = js.native
    def getTeardownProcess(data: Any): Process = js.native
    
    /**
      * Hold window.
      *
      * This is called by OO.ui.WindowManager during window closing (before the animation), and should
      * not be called directly by other systems.
      *
      * @param data Window closing data
      * @return Promise resolved when window is held
      */
    def hold(): Promise[Unit, Any, Any] = js.native
    def hold(data: Any): Promise[Unit, Any, Any] = js.native
    
    /**
      * Initialize window contents.
      *
      * Before the window is opened for the first time, initialize is called so that content that
      * persists between openings can be added to the window.
      *
      * To set up a window with new content each time the window opens, use {@link getSetupProcess}.
      *
      * @throws {Error} An error is thrown if the window is not attached to a window manager
      * @return The window, for chaining
      */
    def initialize(): this.type = js.native
    
    /**
      * Check if the window is closing.
      *
      * This method is a wrapper around the window manager's
      * {@link OO.ui.WindowManager.isClosing isClosing} method.
      *
      * @return Window is closing
      */
    def isClosing(): Boolean = js.native
    
    /**
      * Check if the window has been initialized.
      *
      * Initialization occurs when a window is added to a manager.
      *
      * @return Window has been initialized
      */
    def isInitialized(): Boolean = js.native
    
    /**
      * Check if the window is opened.
      *
      * This method is a wrapper around the window manager's
      * {@link OO.ui.WindowManager.isOpened isOpened} method.
      *
      * @return Window is opened
      */
    def isOpened(): Boolean = js.native
    
    /**
      * Check if the window is opening.
      *
      * This method is a wrapper around the window manager's
      * {@link OO.ui.WindowManager.isOpening isOpening} method.
      *
      * @return Window is opening
      */
    def isOpening(): Boolean = js.native
    
    /**
      * Called when someone tries to focus the hidden element at the end of the dialog.
      * Sends focus back to the start of the dialog.
      *
      * @param event Focus event
      */
    def onFocusTrapFocused(event: Event): Unit = js.native
    
    /**
      * Open the window.
      *
      * This method is a wrapper around a call to the window
      * manager’s {@link OO.ui.WindowManager.openWindow openWindow} method.
      *
      * To customize the window each time it opens, use {@link getSetupProcess} or {@link getReadyProcess}.
      *
      * @param data Window opening data
      * @return See OO.ui.WindowManager.openWindow
      * @throws {Error} An error is thrown if the window is not attached to a window manager
      */
    def open(): WindowInstance = js.native
    def open(data: Any): WindowInstance = js.native
    
    /**
      * Ready window.
      *
      * This is called by OO.ui.WindowManager during window opening (after the animation), and should not
      * be called directly by other systems.
      *
      * @param data Window opening data
      * @return Promise resolved when window is ready
      */
    def ready(): Promise[Unit, Any, Any] = js.native
    def ready(data: Any): Promise[Unit, Any, Any] = js.native
    
    /**
      * Set window dimensions. This method is called by the {@link OO.ui.WindowManager window manager}
      * when the window is opening. In general, setDimensions should not be called directly.
      *
      * To set the size of the window, use the {@link setSize} method.
      *
      * @param dim CSS dimension properties
      * @return The window, for chaining
      */
    def setDimensions(dim: Dimension): this.type = js.native
    
    /**
      * Set the window manager.
      *
      * This will cause the window to initialize. Calling it more than once will cause an error.
      *
      * @param manager Manager for this window
      * @throws {Error} An error is thrown if the method is called more than once
      * @return The window, for chaining
      */
    def setManager(manager: WindowManager): this.type = js.native
    
    /**
      * Set the window size by symbolic name (e.g., 'small' or 'medium')
      *
      * @param size Symbolic name of size: `small`, `medium`, `large`, `larger` or `full`
      * @return The window, for chaining
      */
    def setSize(size: Size): this.type = js.native
    
    /**
      * Setup window.
      *
      * This is called by OO.ui.WindowManager during window opening (before the animation), and should
      * not be called directly by other systems.
      *
      * @param data Window opening data
      * @return Promise resolved when window is setup
      */
    def setup(): Promise[Unit, Any, Any] = js.native
    def setup(data: Any): Promise[Unit, Any, Any] = js.native
    
    /**
      * Teardown window.
      *
      * This is called by OO.ui.WindowManager during window closing (after the animation), and should not
      * be called directly by other systems.
      *
      * @param data Window closing data
      * @return Promise resolved when window is torn down
      */
    def teardown(): Promise[Unit, Any, Any] = js.native
    def teardown(data: Any): Promise[Unit, Any, Any] = js.native
    
    /**
      * Update the window size.
      *
      * @throws {Error} An error is thrown if the window is not attached to a window manager
      * @return The window, for chaining
      */
    def updateSize(): this.type = js.native
  }
  
  type Size = /* template literal string: small */ String
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static {
    
    /**
      * Symbolic name of the window size: `small`, `medium`, `large`, `larger` or `full`.
      *
      * The static size is used if no {@link ConfigOptions.size size} is configured during
      * construction.
      */
    var size: Size = js.native
  }
}

package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.jquery.JQuery.Promise2
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojs.OO.Factory
import typings.oojsUi.OO.ui.Window.Dimension
import typings.oojsUi.OO.ui.WindowManager.Props
import typings.oojsUi.OO.ui.WindowManager.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaOpening
import typings.oojsUi.oojsUiStrings.closing
import typings.oojsUi.oojsUiStrings.hold
import typings.oojsUi.oojsUiStrings.opening
import typings.oojsUi.oojsUiStrings.ready
import typings.oojsUi.oojsUiStrings.resize
import typings.oojsUi.oojsUiStrings.setup
import typings.oojsUi.oojsUiStrings.teardown
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Window managers are used to open and close {@link OO.ui.Window windows} and control their
  * presentation. Managed windows are mutually exclusive. If a new window is opened while a current
  * window is opening or is opened, the current window will be closed and any on-going
  * {@link OO.ui.Process process} will be cancelled. Windows
  * themselves are persistent and—rather than being torn down when closed—can be repopulated with the
  * pertinent data and reused.
  *
  * Over the lifecycle of a window, the window manager makes available three promises: `opening`,
  * `opened`, and `closing`, which represent the primary stages of the cycle:
  *
  * **Opening**: the opening stage begins when the window manager’s {@link openWindow} or a window’s
  * {@link OO.ui.Window.open open} method is used, and the window manager begins to open the window.
  *
  * - an `opening` event is emitted with an `opening` promise
  * - the {@link getSetupDelay} method is called and the returned value is used to time a pause in execution
  *   before the window’s {@link OO.ui.Window.setup setup} method is called which executes
  *   {@link OO.ui.Window.getSetupProcess}.
  * - a `setup` progress notification is emitted from the `opening` promise
  * - the {@link getReadyDelay} method is called the returned value is used to time a pause in execution
  *   before the window’s {@link OO.ui.Window.ready ready} method is called which executes
  *   {@link OO.ui.Window.getReadyProcess}.
  * - a `ready` progress notification is emitted from the `opening` promise
  * - the `opening` promise is resolved with an `opened` promise
  *
  * **Opened**: the window is now open.
  *
  * **Closing**: the closing stage begins when the window manager's {@link closeWindow} or the
  * window's {@link OO.ui.Window.close close} methods is used, and the window manager begins
  * to close the window.
  *
  * - the `opened` promise is resolved with `closing` promise and a `closing` event is emitted
  * - the {@link getHoldDelay} method is called and the returned value is used to time a pause in execution
  *   before the window's {@link OO.ui.Window.getHoldProcess getHoldProcess} method is called on the
  *   window and its result executed
  * - a `hold` progress notification is emitted from the `closing` promise
  * - the {@link getTeardownDelay}() method is called and the returned value is used to time a pause in
  *   execution before the window's {@link OO.ui.Window.getTeardownProcess getTeardownProcess} method
  *   is called on the window and its result executed
  * - a `teardown` progress notification is emitted from the `closing` promise
  * - the `closing` promise is resolved. The window is now closed
  *
  * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Window_managers) for more information.
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.WindowManager
  */
@js.native
trait WindowManager
  extends StObject
     with Props
     with Prototype
object WindowManager {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions {
    
    /**
      * Window factory to use for automatic instantiation
      * Note that window classes that are instantiated with a factory must have a
      * {@link Dialog.Static.name static name} property that specifies a symbolic name.
      */
    var factory: js.UndefOr[Factory] = js.undefined
    
    /**
      * Force the trapping of focus within windows. This is done automatically for modal
      * window managers and full screen windows.
      */
    var forceTrapFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevent interaction outside the current window
      */
    var modal: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      inline def setForceTrapFocus(value: Boolean): Self = StObject.set(x, "forceTrapFocus", value.asInstanceOf[js.Any])
      
      inline def setForceTrapFocusUndefined: Self = StObject.set(x, "forceTrapFocus", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[WindowManager]
       with Instantiable1[/* config */ ConfigOptions, WindowManager] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Element.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Element.Constructor = js.native
  }
  
  trait EventMap extends StObject {
    
    var closing: js.Tuple3[
        /* win */ Window, 
        /* closed */ Promise[Any, Error, WindowClosingState], 
        /* data */ Any
      ]
    
    var opening: js.Tuple3[
        /* win */ Window, 
        /* opened */ Promise2[
          Promise[Unit, Any, Any], 
          js.UndefOr[Error], 
          WindowOpeningState, 
          Any, 
          scala.Nothing, 
          scala.Nothing
        ], 
        /* data */ Any
      ]
    
    var resize: js.Array[/* win */ Window]
  }
  object EventMap {
    
    inline def apply(
      closing: js.Tuple3[
          /* win */ Window, 
          /* closed */ Promise[Any, Error, WindowClosingState], 
          /* data */ Any
        ],
      opening: js.Tuple3[
          /* win */ Window, 
          /* opened */ Promise2[
            Promise[Unit, Any, Any], 
            js.UndefOr[Error], 
            WindowOpeningState, 
            Any, 
            scala.Nothing, 
            scala.Nothing
          ], 
          /* data */ Any
        ],
      resize: js.Array[/* win */ Window]
    ): EventMap = {
      val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setClosing(
        value: js.Tuple3[
              /* win */ Window, 
              /* closed */ Promise[Any, Error, WindowClosingState], 
              /* data */ Any
            ]
      ): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      inline def setOpening(
        value: js.Tuple3[
              /* win */ Window, 
              /* opened */ Promise2[
                Promise[Unit, Any, Any], 
                js.UndefOr[Error], 
                WindowOpeningState, 
                Any, 
                scala.Nothing, 
                scala.Nothing
              ], 
              /* data */ Any
            ]
      ): Self = StObject.set(x, "opening", value.asInstanceOf[js.Any])
      
      inline def setResize(value: js.Array[/* win */ Window]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeVarargs(value: (/* win */ Window)*): Self = StObject.set(x, "resize", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props {
    
    @JSName("$ariaHidden")
    var $ariaHidden: JQuery[HTMLElement] | Null
    
    @JSName("$inert")
    var $inert: JQuery[HTMLElement] | Null
    
    @JSName("$returnFocusTo")
    var $returnFocusTo: JQuery[HTMLElement] | Null
  }
  object Props {
    
    inline def apply($element: JQuery[HTMLElement]): Props = {
      val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $ariaHidden = null, $inert = null, $returnFocusTo = null)
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$ariaHidden(value: JQuery[HTMLElement]): Self = StObject.set(x, "$ariaHidden", value.asInstanceOf[js.Any])
      
      inline def set$ariaHiddenNull: Self = StObject.set(x, "$ariaHidden", null)
      
      inline def set$inert(value: JQuery[HTMLElement]): Self = StObject.set(x, "$inert", value.asInstanceOf[js.Any])
      
      inline def set$inertNull: Self = StObject.set(x, "$inert", null)
      
      inline def set$returnFocusTo(value: JQuery[HTMLElement]): Self = StObject.set(x, "$returnFocusTo", value.asInstanceOf[js.Any])
      
      inline def set$returnFocusToNull: Self = StObject.set(x, "$returnFocusTo", null)
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Element.Prototype
       with EventEmitter {
    
    /**
      * Add windows to the window manager.
      *
      * Windows can be added by reference, symbolic name, or explicitly defined symbolic names.
      * See the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Window_managers)
      * for examples.
      *
      * This function can be called in two manners:
      *
      * 1. `.addWindows( [ winA, winB, ... ] )` (where `winA`, `winB` are OO.ui.Window objects)
      *
      *    This syntax registers windows under the symbolic names defined in their `.static.name`
      *    properties. For example, if `windowA.constructor.static.name` is `'nameA'`, calling
      *    `.openWindow( 'nameA' )` afterwards will open the window `windowA`. This syntax requires the
      *    static name to be set, otherwise an exception will be thrown.
      *
      *    This is the recommended way, as it allows for an easier switch to using a window factory.
      *
      * 2. `.addWindows( { nameA: winA, nameB: winB, ... } )`
      *
      *    This syntax registers windows under the explicitly given symbolic names. In this example,
      *    calling `.openWindow( 'nameA' )` afterwards will open the window `windowA`, regardless of what
      *    its `.static.name` is set to. The static name is not required to be set.
      *
      *    This should only be used if you need to override the default symbolic names.
      *
      * Example:
      *
      *     var windowManager = new OO.ui.WindowManager();
      *     $( document.body ).append( windowManager.$element );
      *
      *     // Add a window under the default name: see OO.ui.MessageDialog.static.name
      *     windowManager.addWindows( [ new OO.ui.MessageDialog() ] );
      *     // Add a window under an explicit name
      *     windowManager.addWindows( { myMessageDialog: new OO.ui.MessageDialog() } );
      *
      *     // Open window by default name
      *     windowManager.openWindow( 'message' );
      *     // Open window by explicitly given name
      *     windowManager.openWindow( 'myMessageDialog' );
      *
      *
      * @param windows An array of window objects specified
      *  by reference, symbolic name, or explicitly defined symbolic names.
      * @throws {Error} An error is thrown if a window is added by symbolic name, but has neither an
      *  explicit nor a statically configured symbolic name.
      */
    def addWindows(windows: js.Array[Window]): Unit = js.native
    def addWindows(windows: Record[String, Window]): Unit = js.native
    
    /**
      * Remove all windows from the window manager.
      *
      * Windows will be closed before they are removed. Note that the window manager, though not in use,
      * will still listen to events. If the window manager will not be used again, you may wish to use
      * the {@link destroy} method instead. To remove just a subset of windows, use the {@link removeWindows} method.
      *
      * @return Promise resolved when all windows are closed and removed
      */
    def clearWindows(): Promise[Unit, Any, Any] = js.native
    
    def closeWindow(win: String): WindowInstance & (DeprecatedPromise[Any, Error, WindowClosingState, scala.Nothing, scala.Nothing, scala.Nothing]) = js.native
    def closeWindow(win: String, data: Any): WindowInstance & (DeprecatedPromise[Any, Error, WindowClosingState, scala.Nothing, scala.Nothing, scala.Nothing]) = js.native
    /**
      * Close a window.
      *
      * @param win Window object or symbolic name of window to close
      * @param data Window closing data
      * @return A lifecycle object representing this particular
      *  opening of the window. For backwards-compatibility, the object is also a Thenable
      *  that is resolved when the window is done closing, see T163510.
      */
    def closeWindow(win: Window): WindowInstance & (DeprecatedPromise[Any, Error, WindowClosingState, scala.Nothing, scala.Nothing, scala.Nothing]) = js.native
    def closeWindow(win: Window, data: Any): WindowInstance & (DeprecatedPromise[Any, Error, WindowClosingState, scala.Nothing, scala.Nothing, scala.Nothing]) = js.native
    
    def connect[T /* <: PartialRecordkeyofEventMaOpening */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    /**
      * Destroy the window manager.
      */
    def destroy(): Unit = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaOpening */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    def emitThrow[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_closing(
      event: closing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[
          /* win */ Window, 
          /* closed */ Promise[Any, Error, WindowClosingState], 
          /* data */ Any
        ]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_opening(
      event: opening,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[
          /* win */ Window, 
          /* opened */ Promise2[
            Promise[Unit, Any, Any], 
            js.UndefOr[Error], 
            WindowOpeningState, 
            Any, 
            scala.Nothing, 
            scala.Nothing
          ], 
          /* data */ Any
        ]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* win */ Window]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_closing(
      event: closing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[
          /* win */ Window, 
          /* closed */ Promise[Any, Error, WindowClosingState], 
          /* data */ Any
        ]
    ): Boolean = js.native
    @JSName("emit")
    def emit_opening(
      event: opening,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[
          /* win */ Window, 
          /* opened */ Promise2[
            Promise[Unit, Any, Any], 
            js.UndefOr[Error], 
            WindowOpeningState, 
            Any, 
            scala.Nothing, 
            scala.Nothing
          ], 
          /* data */ Any
        ]
    ): Boolean = js.native
    @JSName("emit")
    def emit_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* win */ Window]
    ): Boolean = js.native
    
    /**
      * Get current window.
      *
      * @return Currently opening/opened/closing window
      */
    def getCurrentWindow(): Window | Null = js.native
    
    /**
      * Get the number of milliseconds to wait after closing has begun before executing the
      * 'hold' process.
      *
      * @param win Window being closed
      * @param data Window closing data
      * @return Milliseconds to wait
      */
    def getHoldDelay(win: Window): Double = js.native
    def getHoldDelay(win: Window, data: Any): Double = js.native
    
    /**
      * Get the number of milliseconds to wait after setup has finished before executing the
      * ‘ready’ process.
      *
      * @param win Window being opened
      * @param data Window opening data
      * @return Milliseconds to wait
      */
    def getReadyDelay(win: Window): Double = js.native
    def getReadyDelay(win: Window, data: Any): Double = js.native
    
    /**
      * Get the number of milliseconds to wait after opening begins before executing the
      * ‘setup’ process.
      *
      * @param win Window being opened
      * @param data Window opening data
      * @return Milliseconds to wait
      */
    def getSetupDelay(win: Window): Double = js.native
    def getSetupDelay(win: Window, data: Any): Double = js.native
    
    /**
      * Get the number of milliseconds to wait after the ‘hold’ process has finished before
      * executing the ‘teardown’ process.
      *
      * @param win Window being closed
      * @param data Window closing data
      * @return Milliseconds to wait
      */
    def getTeardownDelay(win: Window): Double = js.native
    def getTeardownDelay(win: Window, data: Any): Double = js.native
    
    /**
      * Get a window by its symbolic name.
      *
      * If the window is not yet instantiated and its symbolic name is recognized by a
      * factory, it will be instantiated and added to the window manager automatically.
      * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Window_managers)
      * for more information about using factories.
      *
      * @param name Symbolic name of the window
      * @return Promise resolved with matching window, or rejected with an OO.ui.Error
      * @throws {Error} An error is thrown if the symbolic name is not recognized by the
      *  factory.
      * @throws {Error} An error is thrown if the named window is not recognized as a managed
      *  window.
      */
    def getWindow(name: String): Promise[Window, Error, Any] = js.native
    
    /**
      * Check if a window is being managed.
      *
      * @param win Window to check
      * @return Window is being managed
      */
    def hasWindow(win: Window): Boolean = js.native
    
    /**
      * Check if window is closing.
      *
      * @param win Window to check
      * @return Window is closing
      */
    def isClosing(win: Window): Boolean = js.native
    
    /**
      * Check if the window manager is modal, preventing interaction outside the current
      * window
      *
      * @return The window manager is modal
      */
    def isModal(): Boolean = js.native
    
    /**
      * Check if window is opened.
      *
      * @param win Window to check
      * @return Window is opened
      */
    def isOpened(win: Window): Boolean = js.native
    
    /**
      * Check if window is opening.
      *
      * @param win Window to check
      * @return Window is opening
      */
    def isOpening(win: Window): Boolean = js.native
    
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_closing[C](event: closing): this.type = js.native
    @JSName("off")
    def off_closing[C](event: closing, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_closing[C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[
              /* win */ Window, 
              /* closed */ Promise[Any, Error, WindowClosingState], 
              /* data */ Any
            ], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_closing[C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[
              /* win */ Window, 
              /* closed */ Promise[Any, Error, WindowClosingState], 
              /* data */ Any
            ], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_opening[C](event: opening): this.type = js.native
    @JSName("off")
    def off_opening[C](event: opening, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_opening[C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[
              /* win */ Window, 
              /* opened */ Promise2[
                Promise[Unit, Any, Any], 
                js.UndefOr[Error], 
                WindowOpeningState, 
                Any, 
                scala.Nothing, 
                scala.Nothing
              ], 
              /* data */ Any
            ], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_opening[C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[
              /* win */ Window, 
              /* opened */ Promise2[
                Promise[Unit, Any, Any], 
                js.UndefOr[Error], 
                WindowOpeningState, 
                Any, 
                scala.Nothing, 
                scala.Nothing
              ], 
              /* data */ Any
            ], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_resize[C](event: resize): this.type = js.native
    @JSName("off")
    def off_resize[C](event: resize, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* win */ Window], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* win */ Window], Unit]],
      context: C
    ): this.type = js.native
    
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_closing[A /* <: ArgTuple */, C](
      event: closing,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_opening[A /* <: ArgTuple */, C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_opening[A /* <: ArgTuple */, C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_opening[A /* <: ArgTuple */, C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_opening[A /* <: ArgTuple */, C](
      event: opening,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    def once[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'opening' | 'closing' | 'resize' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_closing(
      event: closing,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple3[
            /* win */ Window, 
            /* closed */ Promise[Any, Error, WindowClosingState], 
            /* data */ Any
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_opening(
      event: opening,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple3[
            /* win */ Window, 
            /* opened */ Promise2[
              Promise[Unit, Any, Any], 
              js.UndefOr[Error], 
              WindowOpeningState, 
              Any, 
              scala.Nothing, 
              scala.Nothing
            ], 
            /* data */ Any
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_resize(
      event: resize,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* win */ Window], Unit]
    ): this.type = js.native
    
    def openWindow(win: String): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    def openWindow(win: String, data: WindowOpeningData): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    /**
      * Open a window.
      *
      * @param win Window object or symbolic name of window to open
      * @param data Window opening data
      * @return A lifecycle object representing this particular
      *  opening of the window. For backwards-compatibility, then object is also a Thenable
      *  that is resolved when the window is done opening, with nested promise for when
      *  closing starts. This behaviour is deprecated and is not compatible with jQuery 3,
      *  see T163510.
      */
    def openWindow(win: Window): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    def openWindow(win: Window, data: WindowOpeningData): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    def openWindow[T](
      win: String,
      data: /* import warning: importer.ImportType#apply Failed type conversion: T extends object ? never : T */ js.Any
    ): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    def openWindow[T](
      win: Window,
      data: /* import warning: importer.ImportType#apply Failed type conversion: T extends object ? never : T */ js.Any
    ): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    @JSName("openWindow")
    def openWindow_T[T](win: String): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    @JSName("openWindow")
    def openWindow_T[T](win: Window): WindowInstance & (DeprecatedPromise[
        Promise[Unit, Any, Any], 
        js.UndefOr[Error], 
        WindowOpeningState, 
        Any, 
        scala.Nothing, 
        scala.Nothing
      ]) = js.native
    
    /**
      * Remove the specified windows from the windows manager.
      *
      * Windows will be closed before they are removed. If you wish to remove all windows, you may wish
      * to use the {@link clearWindows} method instead. If you no longer need the window manager and want to
      * ensure that it no longer listens to events, use the {@link destroy} method.
      *
      * @param names Symbolic names of windows to remove
      * @return Promise resolved when window is closed and removed
      * @throws {Error} An error is thrown if the named windows are not managed by the window manager.
      */
    def removeWindows(names: js.Array[String]): Promise[Unit, Any, Any] = js.native
    
    /**
      * Set dialog size. In general, this method should not be called directly.
      *
      * Fullscreen mode will be used if the dialog is too wide to fit in the screen.
      *
      * @param win Window to update, should be the current window
      * @return The manager, for chaining
      */
    def updateWindowSize(win: Window): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static {
    
    /**
      * Symbolic name of the default window size.
      *
      * The default size is used if the window's requested size is not recognized.
      */
    var defaultSize: String = js.native
    
    /**
      * Map of the symbolic name of each window size and its CSS properties.
      */
    var sizes: Record[String, Dimension] = js.native
  }
  
  trait WindowClosingState extends StObject {
    
    var state: hold | teardown
  }
  object WindowClosingState {
    
    inline def apply(state: hold | teardown): WindowClosingState = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowClosingState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowClosingState] (val x: Self) extends AnyVal {
      
      inline def setState(value: hold | teardown): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait WindowOpeningData
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    /**
      * Element to which the window will return focus when closed. Defaults the current
      * activeElement. If set to null, focus isn't changed on close.
      */
    @JSName("$returnFocusTo")
    var $returnFocusTo: js.UndefOr[JQuery[HTMLElement] | Null] = js.undefined
  }
  object WindowOpeningData {
    
    inline def apply(): WindowOpeningData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOpeningData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowOpeningData] (val x: Self) extends AnyVal {
      
      inline def set$returnFocusTo(value: JQuery[HTMLElement]): Self = StObject.set(x, "$returnFocusTo", value.asInstanceOf[js.Any])
      
      inline def set$returnFocusToNull: Self = StObject.set(x, "$returnFocusTo", null)
      
      inline def set$returnFocusToUndefined: Self = StObject.set(x, "$returnFocusTo", js.undefined)
    }
  }
  
  trait WindowOpeningState extends StObject {
    
    var state: setup | ready
  }
  object WindowOpeningState {
    
    inline def apply(state: setup | ready): WindowOpeningState = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowOpeningState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WindowOpeningState] (val x: Self) extends AnyVal {
      
      inline def setState(value: setup | ready): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}

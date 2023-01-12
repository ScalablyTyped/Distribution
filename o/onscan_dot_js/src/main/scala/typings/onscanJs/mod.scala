package typings.onscanJs

import org.scalablytyped.runtime.Shortcut
import typings.onscanJs.anon.Key
import typings.std.CustomEvent
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("onscan.js", JSImport.Default)
  @js.native
  val default: OnScan = js.native
  
  type KeyCode = Double | Key
  
  @js.native
  trait OnScan extends StObject {
    
    /**
      * Initializes listening for scan events for given DOM element. Only events
      * fired for this DOM element will be processed. Use ``document`` to
      * process all possible events. This is the best pick in most cases.
      *
      * NOTE: onScan.js can be attached to a DOM element only once. If you, for
      * some reason, need to call ``attachTo()`` for a single element multiple
      * times, you must call ``detachFrom()`` first.
      */
    def attachTo(node: Node): Unit = js.native
    def attachTo(node: Node, options: ScanOptions): Unit = js.native
    
    /**
      * Extracts the scanned string character from a keyboard event (i.e.
      * ``keydown``).
      */
    def decodeKeyEvent(event: Event): Any = js.native
    
    /**
      * Removes all scanner detection logic from the given DOM element.
      */
    def detachFrom(node: Node): Unit = js.native
    
    /**
      * Retrieves entire options object.
      */
    def getOptions(node: Node): ScanOptions = js.native
    
    /**
      * Returns ``true`` if onScan is attached to the given DOM element and
      * ``false`` otherwise.
      */
    def isAttachedTo(node: Node): Boolean = js.native
    
    /**
      * Returns ``true`` the scanner is currently in the middle of a scan
      * sequence and ``false`` otherwise. Technically, this means, that the scan
      * sequence started (e.g. via prefix character) and has not ended yet (e.g.
      * via suffix or timeout). This method is useful inside event handlers.
      */
    def isScanInProgressFor(node: Node): Boolean = js.native
    
    /**
      * Replaces only the newly sent options.
      */
    def setOptions(node: Node, options: ScanOptions): Unit = js.native
    
    /**
      * Fires the scan event for the given scan code - usefull to trigger
      * listeners manually (e.g. for testing). Accepts either an already decoded
      * string or an array with key codes or event property objects
      */
    def simulate(node: Node, stringOrArray: String): Unit = js.native
    def simulate(node: Node, stringOrArray: js.Array[KeyCode]): Unit = js.native
  }
  
  trait Scan extends StObject {
    
    /**
      * Quantity
      */
    var qty: Double
    
    /**
      * Scanned code
      */
    var scanCode: String
  }
  object Scan {
    
    inline def apply(qty: Double, scanCode: String): Scan = {
      val __obj = js.Dynamic.literal(qty = qty.asInstanceOf[js.Any], scanCode = scanCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scan] (val x: Self) extends AnyVal {
      
      inline def setQty(value: Double): Self = StObject.set(x, "qty", value.asInstanceOf[js.Any])
      
      inline def setScanCode(value: String): Self = StObject.set(x, "scanCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScanError extends StObject {
    
    var avgTimeByChar: Double
    
    var message: String
    
    var minLength: Double
    
    var scanCode: String
    
    var scanDuration: Double
  }
  object ScanError {
    
    inline def apply(avgTimeByChar: Double, message: String, minLength: Double, scanCode: String, scanDuration: Double): ScanError = {
      val __obj = js.Dynamic.literal(avgTimeByChar = avgTimeByChar.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], scanCode = scanCode.asInstanceOf[js.Any], scanDuration = scanDuration.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanError] (val x: Self) extends AnyVal {
      
      inline def setAvgTimeByChar(value: Double): Self = StObject.set(x, "avgTimeByChar", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setScanCode(value: String): Self = StObject.set(x, "scanCode", value.asInstanceOf[js.Any])
      
      inline def setScanDuration(value: Double): Self = StObject.set(x, "scanDuration", value.asInstanceOf[js.Any])
    }
  }
  
  type ScanErrorEvent = CustomEvent[ScanError]
  
  type ScanEvent = CustomEvent[Scan]
  
  trait ScanOptions extends StObject {
    
    /**
      * Average time (ms) between 2 chars. If a scan is detected, but it took
      * more time that [code length] * ``avgTimeByChar``, a ``scanError`` will
      * be triggered.
      */
    var avgTimeByChar: js.UndefOr[Double] = js.undefined
    
    /**
      * Set to ``true`` to force all relevant events to be dispatched to onScan
      * before being dispatched to any ``EventTarget`` beneath it in the DOM
      * tree. Use this if you need to cancel certain events in onScan callbacks.
      * Technically this option is used as the third parameter in
      * ``.addEventListener(type, listener [, useCapture])`` calls. The exact
      * behavior is documented [here](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener).
      */
    var captureEvents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignore scans if the currently focused element matches this selector. For
      * example, if you set this option to ``'input'``, scan events will not be
      * fired if an input field is focused. You can either pass an DOMElement, a
      * CSS selector or an array containing multiple besaid objects
      */
    var ignoreIfFocusOn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to extract the character from a ``keydown`` event. The event
      * will be ignored if the function returns ``null``. See chapter "Decoding
      * key codes" below for more information.
      */
    var keyCodeMapper: js.UndefOr[js.Function1[/* event */ Any, Any]] = js.undefined
    
    /**
      * Minimum length for a scanned code. If the scan ends before reaching this
      * length, it will trigger a scanError event.
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback after every detected key event. Further event processing can be
      * canceled by returning ``false`` from this callback - e.g. to exclude certain
      * key events completely.
      * @param keyCode Detected key code
      * @param event Complete event instance
      */
    var onKeyDetect: js.UndefOr[js.Function2[/* keyCode */ Double, /* event */ KeyboardEvent, Unit | Boolean]] = js.undefined
    
    /**
      * Callback after a key event was decoded and found to be part of a
      * potential scan code. Keep in mind, that a this point it is not yet
      * known, whether it's a scan or not - it's just a valid character being
      * processed and decoded.
      * @param char Decoded character
      * @param event Complete event instance
      */
    var onKeyProcess: js.UndefOr[js.Function2[/* char */ String, /* event */ KeyboardEvent, Unit]] = js.undefined
    
    /**
      * Callback after detecting a paste. Only fired if ``reactToPaste`` is set
      * to ``true``.
      * @param pasted Pasted string
      * @param event Complete event instance
      */
    var onPaste: js.UndefOr[js.Function2[/* pasted */ String, /* event */ Event, Unit]] = js.undefined
    
    /**
      * Callback after sccessful scan.
      * @param scanned Scanned code
      * @param qty Quantity
      */
    var onScan: js.UndefOr[js.Function2[/* scanned */ String, /* qty */ Double, Unit]] = js.undefined
    
    /**
      * Callback after the scan button was pressed and held down for a time
      * defined in ``scanButtonLongPressThreshold``. This can only be used if
      * the scan button behaves as a key itself and the ``scanButtonKeyCode``
      * option is set.
      */
    var onScanButtonLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback after a scanned string being dropped due to restrictors.
      * @param debug Plain object with various debug data
      */
    var onScanError: js.UndefOr[js.Function1[/* debug */ Any, Unit]] = js.undefined
    
    /**
      * An array with possible prefix codes sent by the scanner before the
      * actual data. Detecting one of them means the start of scanning, but they
      * can never be part of the scanned code. Many scanners support prefix
      * characters in their configuration.
      *
      * NOTE: KeyboardEvents with these key codes will be silenced via
      * ``event.stopImmediatePropagation()`` and ``event.preventDefault()``.
      */
    var prefixKeyCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Prevent default action of events, that are processed successfully.
      *
      * __WARNING:__ If ``reactToKeyDown`` is true, the default of every
      * keyboard event, that could potentially be part of a scancode will be
      * prevented - in particular you won't be able to use the keyboard for
      * typing!!!
      */
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Look for scan input among ``keydown`` events (i.e. if the scanner works
      * in keyboard-mode).
      */
    var reactToKeyDown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Look for scan input among ``paste`` events (i.e. if the scanner works in
      * clipboard-mode).
      */
    var reactToPaste: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Key code of the scanner hardware button (i.e. if the scanner button a
      * acts as a key itself). Knowing this key code is important, because it is
      * not part of the scanned code and must be ignored.
      */
    var scanButtonKeyCode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time (ms) to hold the scan button before ``onScanButtonLongPress`` is
      * triggered. Only works if ``scanButtonKeyCode`` is set.
      */
    var scanButtonLongPressTime: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the quantity of items which gets returned on a single successful
      * scan.
      */
    var singleScanQty: js.UndefOr[Double] = js.undefined
    
    /**
      * Stop immediate propagation of events, that are processed successfully.
      *
      * __WARNING:__ If ``reactToKeyDown`` is true, every keyboard event, that
      * could potentially be part of a scancode will be stopped!
      */
    var stopPropagation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array with possible suffix codes sent by the scanner after the actual
      * data. Detecting one of them means end of scanning, but they can never be
      * part of the scanned code. Many scanners will send key code ``13``
      * (enter) as suffix by default. This can be changed in the configuration
      * in most cases.
      *
      * NOTE: KeyboardEvents with these key codes will be silenced via
      * ``event.stopImmediatePropagation()`` and ``event.preventDefault()``.
      */
    var suffixKeyCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Wait duration (ms) after keypress event to check if scanning finished.
      */
    var timeBeforeScanTest: js.UndefOr[Double] = js.undefined
  }
  object ScanOptions {
    
    inline def apply(): ScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanOptions] (val x: Self) extends AnyVal {
      
      inline def setAvgTimeByChar(value: Double): Self = StObject.set(x, "avgTimeByChar", value.asInstanceOf[js.Any])
      
      inline def setAvgTimeByCharUndefined: Self = StObject.set(x, "avgTimeByChar", js.undefined)
      
      inline def setCaptureEvents(value: Boolean): Self = StObject.set(x, "captureEvents", value.asInstanceOf[js.Any])
      
      inline def setCaptureEventsUndefined: Self = StObject.set(x, "captureEvents", js.undefined)
      
      inline def setIgnoreIfFocusOn(value: Boolean): Self = StObject.set(x, "ignoreIfFocusOn", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIfFocusOnUndefined: Self = StObject.set(x, "ignoreIfFocusOn", js.undefined)
      
      inline def setKeyCodeMapper(value: /* event */ Any => Any): Self = StObject.set(x, "keyCodeMapper", js.Any.fromFunction1(value))
      
      inline def setKeyCodeMapperUndefined: Self = StObject.set(x, "keyCodeMapper", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnKeyDetect(value: (/* keyCode */ Double, /* event */ KeyboardEvent) => Unit | Boolean): Self = StObject.set(x, "onKeyDetect", js.Any.fromFunction2(value))
      
      inline def setOnKeyDetectUndefined: Self = StObject.set(x, "onKeyDetect", js.undefined)
      
      inline def setOnKeyProcess(value: (/* char */ String, /* event */ KeyboardEvent) => Unit): Self = StObject.set(x, "onKeyProcess", js.Any.fromFunction2(value))
      
      inline def setOnKeyProcessUndefined: Self = StObject.set(x, "onKeyProcess", js.undefined)
      
      inline def setOnPaste(value: (/* pasted */ String, /* event */ Event) => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction2(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnScan(value: (/* scanned */ String, /* qty */ Double) => Unit): Self = StObject.set(x, "onScan", js.Any.fromFunction2(value))
      
      inline def setOnScanButtonLongPress(value: () => Unit): Self = StObject.set(x, "onScanButtonLongPress", js.Any.fromFunction0(value))
      
      inline def setOnScanButtonLongPressUndefined: Self = StObject.set(x, "onScanButtonLongPress", js.undefined)
      
      inline def setOnScanError(value: /* debug */ Any => Unit): Self = StObject.set(x, "onScanError", js.Any.fromFunction1(value))
      
      inline def setOnScanErrorUndefined: Self = StObject.set(x, "onScanError", js.undefined)
      
      inline def setOnScanUndefined: Self = StObject.set(x, "onScan", js.undefined)
      
      inline def setPrefixKeyCodes(value: js.Array[Double]): Self = StObject.set(x, "prefixKeyCodes", value.asInstanceOf[js.Any])
      
      inline def setPrefixKeyCodesUndefined: Self = StObject.set(x, "prefixKeyCodes", js.undefined)
      
      inline def setPrefixKeyCodesVarargs(value: Double*): Self = StObject.set(x, "prefixKeyCodes", js.Array(value*))
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReactToKeyDown(value: Boolean): Self = StObject.set(x, "reactToKeyDown", value.asInstanceOf[js.Any])
      
      inline def setReactToKeyDownUndefined: Self = StObject.set(x, "reactToKeyDown", js.undefined)
      
      inline def setReactToPaste(value: Boolean): Self = StObject.set(x, "reactToPaste", value.asInstanceOf[js.Any])
      
      inline def setReactToPasteUndefined: Self = StObject.set(x, "reactToPaste", js.undefined)
      
      inline def setScanButtonKeyCode(value: Boolean): Self = StObject.set(x, "scanButtonKeyCode", value.asInstanceOf[js.Any])
      
      inline def setScanButtonKeyCodeUndefined: Self = StObject.set(x, "scanButtonKeyCode", js.undefined)
      
      inline def setScanButtonLongPressTime(value: Double): Self = StObject.set(x, "scanButtonLongPressTime", value.asInstanceOf[js.Any])
      
      inline def setScanButtonLongPressTimeUndefined: Self = StObject.set(x, "scanButtonLongPressTime", js.undefined)
      
      inline def setSingleScanQty(value: Double): Self = StObject.set(x, "singleScanQty", value.asInstanceOf[js.Any])
      
      inline def setSingleScanQtyUndefined: Self = StObject.set(x, "singleScanQty", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setSuffixKeyCodes(value: js.Array[Double]): Self = StObject.set(x, "suffixKeyCodes", value.asInstanceOf[js.Any])
      
      inline def setSuffixKeyCodesUndefined: Self = StObject.set(x, "suffixKeyCodes", js.undefined)
      
      inline def setSuffixKeyCodesVarargs(value: Double*): Self = StObject.set(x, "suffixKeyCodes", js.Array(value*))
      
      inline def setTimeBeforeScanTest(value: Double): Self = StObject.set(x, "timeBeforeScanTest", value.asInstanceOf[js.Any])
      
      inline def setTimeBeforeScanTestUndefined: Self = StObject.set(x, "timeBeforeScanTest", js.undefined)
    }
  }
  
  type _To = OnScan
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: OnScan = default
  
  object global {
    
    trait DocumentEventMap extends StObject {
      
      var scan: ScanEvent
      
      var scanError: ScanErrorEvent
    }
    object DocumentEventMap {
      
      inline def apply(scan: ScanEvent, scanError: ScanErrorEvent): DocumentEventMap = {
        val __obj = js.Dynamic.literal(scan = scan.asInstanceOf[js.Any], scanError = scanError.asInstanceOf[js.Any])
        __obj.asInstanceOf[DocumentEventMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DocumentEventMap] (val x: Self) extends AnyVal {
        
        inline def setScan(value: ScanEvent): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
        
        inline def setScanError(value: ScanErrorEvent): Self = StObject.set(x, "scanError", value.asInstanceOf[js.Any])
      }
    }
  }
}

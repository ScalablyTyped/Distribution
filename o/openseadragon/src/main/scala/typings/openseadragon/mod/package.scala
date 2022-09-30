package typings.openseadragon.mod

import typings.openseadragon.anon.Bmp
import typings.openseadragon.anon.Capture
import typings.openseadragon.anon.Error
import typings.openseadragon.anon.`0`
import typings.openseadragon.mod.^
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(options: Options): Viewer = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Viewer]

inline def DEFAULT_SETTINGS: Options = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SETTINGS").asInstanceOf[Options]

inline def addClass(element: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addEvent(element: String, eventName: String, handler: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEvent(
  element: String,
  eventName: String,
  handler: js.Function1[/* event */ Event, Unit],
  useCapture: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEvent(
  element: String,
  eventName: String,
  handler: js.Function1[/* event */ Event, Unit],
  useCapture: Capture
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEvent(element: Element, eventName: String, handler: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEvent(
  element: Element,
  eventName: String,
  handler: js.Function1[/* event */ Event, Unit],
  useCapture: Boolean
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def addEvent(
  element: Element,
  eventName: String,
  handler: js.Function1[/* event */ Event, Unit],
  useCapture: Capture
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def cancelEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")().asInstanceOf[Unit]
inline def cancelEvent(event: OSDEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def capitalizeFirstLetter(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirstLetter")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def createCallback(`object`: js.Object, method: js.Function1[/* repeated */ Any, Unit], args: Any*): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")((scala.List(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]

inline def delegate(`object`: js.Object, method: js.Function1[/* repeated */ Any, Unit]): js.Function2[/* object */ Any, /* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* object */ Any, /* repeated */ Any, Unit]]

// REVIEW: unsure of return type
inline def eventIsCanceled(event: OSDEvent[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eventIsCanceled")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def extend(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Any]

inline def getCssPropertyWithVendorPrefix(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCssPropertyWithVendorPrefix")(property.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getElement(element: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def getElement(element: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def getElementOffset(element: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Point]
inline def getElementOffset(element: Element): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def getElementPosition(element: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[Point]
inline def getElementPosition(element: Element): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def getElementSize(element: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[Point]
inline def getElementSize(element: Element): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def getElementStyle(element: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def getElementStyle(element: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def getMousePosition(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")().asInstanceOf[Point]
inline def getMousePosition(event: OSDEvent[Any]): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(event.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def getPageScroll(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageScroll")().asInstanceOf[Point]

inline def getString(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(property.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getUrlParameter(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlParameter")(key.asInstanceOf[js.Any]).asInstanceOf[String]

// CSSStyle?
inline def getViewer(element: Element): Viewer = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewer")(element.asInstanceOf[js.Any]).asInstanceOf[Viewer]

inline def getWindowSize(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSize")().asInstanceOf[Point]

inline def imageFormatSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")().asInstanceOf[Boolean]
inline def imageFormatSupported(`extension`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def indexOf(array: js.Array[Any], searchElement: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def indexOf(array: js.Array[Any], searchElement: js.Object, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]

// (missing jquery functions)
inline def makeAjaxRequest(options: Error): XMLHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAjaxRequest")(options.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest]

inline def makeCenteredNode(element: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def makeCenteredNode(element: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def makeNeutralElement(tagName: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNeutralElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def makeTransparentImage(src: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTransparentImage")(src.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def normalizeEventListenerOptions(options: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEventListenerOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
inline def normalizeEventListenerOptions(options: Capture): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEventListenerOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]

inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]

inline def parseJSON(string: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(string.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def parseXml(string: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(string.asInstanceOf[js.Any]).asInstanceOf[Document]

inline def pixelDensityRatio: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("pixelDensityRatio").asInstanceOf[Double]
inline def pixelDensityRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelDensityRatio")(x.asInstanceOf[js.Any])

inline def pointInElement(element: String, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def pointInElement(element: Element, point: Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def positiveModulo(number: Double, modulo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("positiveModulo")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def removeClass(element: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeClass(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any], useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any], useCapture: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEvent(element: Element, eventName: String, handler: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEvent(element: Element, eventName: String, handler: EventHandler[Any], useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def removeEvent(element: Element, eventName: String, handler: EventHandler[Any], useCapture: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setElementOpacity(element: String, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setElementOpacity(element: String, opacity: Double, usesAlpha: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setElementOpacity(element: Element, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setElementOpacity(element: Element, opacity: Double, usesAlpha: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setElementPointerEvents(element: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEvents")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setElementPointerEvents(element: Element, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEvents")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setElementPointerEventsNone(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEventsNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setElementPointerEventsNone(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEventsNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setElementTouchActionNone(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setElementTouchActionNone(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setImageFormatsSupported(formats: Bmp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageFormatsSupported")(formats.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setPageScroll(point: Point): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPageScroll")(point.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setString(property: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setString")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
inline def stopEvent(event: OSDEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def supportsCanvas: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("supportsCanvas").asInstanceOf[Boolean]
inline def supportsCanvas_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsCanvas")(x.asInstanceOf[js.Any])

type EventHandler[T /* <: OSDEvent[Any] */] = js.Function1[/* event */ T, Unit]

type OnDrawCallback = js.Function3[/* position */ Point, /* size */ Point, /* element */ HTMLElement, Unit]

type PreprocessEventHandler = js.Function1[/* event */ EventProcessInfo, Unit]

// -- TILE SOURCE EVENTS --
type TileSourceEvent = OSDEvent[TileSource]

// -- TILED IMAGE EVENTS --
type TiledImageEvent = OSDEvent[TiledImage]

// -- VIEWER EVENTS --
type ViewerEvent = OSDEvent[Viewer]

// -- WORLD EVENTS --
type WorldEvent = OSDEvent[World]

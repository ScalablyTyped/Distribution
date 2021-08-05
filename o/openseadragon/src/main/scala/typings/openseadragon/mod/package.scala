package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(options: typings.openseadragon.mod.Options): typings.openseadragon.mod.Viewer = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Viewer]

inline def DEFAULT_SETTINGS: typings.openseadragon.mod.Options = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SETTINGS").asInstanceOf[typings.openseadragon.mod.Options]

inline def addClass(element: java.lang.String, className: java.lang.String): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def addClass(element: typings.std.Element, className: java.lang.String): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def addEvent(
  element: java.lang.String,
  eventName: java.lang.String,
  handler: js.Function1[/* event */ typings.std.Event, scala.Unit]
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def addEvent(
  element: java.lang.String,
  eventName: java.lang.String,
  handler: js.Function1[/* event */ typings.std.Event, scala.Unit],
  useCapture: scala.Boolean
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def addEvent(
  element: typings.std.Element,
  eventName: java.lang.String,
  handler: js.Function1[/* event */ typings.std.Event, scala.Unit]
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def addEvent(
  element: typings.std.Element,
  eventName: java.lang.String,
  handler: js.Function1[/* event */ typings.std.Event, scala.Unit],
  useCapture: scala.Boolean
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def cancelEvent(): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")().asInstanceOf[scala.Unit]
inline def cancelEvent(event: typings.openseadragon.mod.OSDEvent[js.Any]): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def capitalizeFirstLetter(value: java.lang.String): java.lang.String = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirstLetter")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def createCallback(`object`: js.Object, method: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): js.Function1[/* repeated */ js.Any, scala.Unit] = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ js.Any, scala.Unit]]

inline def delegate(`object`: js.Object, method: js.Function1[/* repeated */ js.Any, scala.Unit]): js.Function2[/* object */ js.Any, /* repeated */ js.Any, scala.Unit] = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* object */ js.Any, /* repeated */ js.Any, scala.Unit]]

// REVIEW: unsure of return type
inline def extend(): js.Any = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[js.Any]

inline def getCssPropertyWithVendorPrefix(property: java.lang.String): java.lang.String = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCssPropertyWithVendorPrefix")(property.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getElement(element: java.lang.String): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
inline def getElement(element: typings.std.Element): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]

inline def getElementOffset(element: java.lang.String): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
inline def getElementOffset(element: typings.std.Element): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]

inline def getElementPosition(element: java.lang.String): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
inline def getElementPosition(element: typings.std.Element): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]

inline def getElementSize(element: java.lang.String): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
inline def getElementSize(element: typings.std.Element): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]

inline def getElementStyle(element: java.lang.String): js.Any = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]
inline def getElementStyle(element: typings.std.Element): js.Any = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[js.Any]

// CSSStyle?
inline def getMousePosition(): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")().asInstanceOf[typings.openseadragon.mod.Point]
inline def getMousePosition(event: typings.openseadragon.mod.OSDEvent[js.Any]): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(event.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]

inline def getPageScroll(): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getPageScroll")().asInstanceOf[typings.openseadragon.mod.Point]

inline def getString(property: java.lang.String): java.lang.String = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getString")(property.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getUrlParameter(key: java.lang.String): java.lang.String = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getUrlParameter")(key.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getWindowSize(): typings.openseadragon.mod.Point = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSize")().asInstanceOf[typings.openseadragon.mod.Point]

inline def imageFormatSupported(): scala.Boolean = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")().asInstanceOf[scala.Boolean]
inline def imageFormatSupported(`extension`: java.lang.String): scala.Boolean = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")(`extension`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def indexOf(array: js.Array[js.Any], searchElement: js.Object): scala.Double = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def indexOf(array: js.Array[js.Any], searchElement: js.Object, fromIndex: scala.Double): scala.Double = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

// (missing jquery functions)
inline def makeAjaxRequest(options: typings.openseadragon.anon.Error): typings.std.XMLHttpRequest = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeAjaxRequest")(options.asInstanceOf[js.Any]).asInstanceOf[typings.std.XMLHttpRequest]

inline def makeCenteredNode(element: java.lang.String): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
inline def makeCenteredNode(element: typings.std.Element): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]

inline def makeNeutralElement(tagName: java.lang.String): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeNeutralElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]

inline def makeTransparentImage(src: java.lang.String): typings.std.Element = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeTransparentImage")(src.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]

inline def now(): scala.Double = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[scala.Double]

inline def parseJSON(string: java.lang.String): js.Object = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(string.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def parseXml(string: java.lang.String): typings.std.Document = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(string.asInstanceOf[js.Any]).asInstanceOf[typings.std.Document]

inline def pixelDensityRatio: scala.Double = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pixelDensityRatio").asInstanceOf[scala.Double]
inline def pixelDensityRatio_=(x: scala.Double): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].updateDynamic("pixelDensityRatio")(x.asInstanceOf[js.Any])

inline def pointInElement(element: java.lang.String, point: typings.openseadragon.mod.Point): scala.Boolean = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
inline def pointInElement(element: typings.std.Element, point: typings.openseadragon.mod.Point): scala.Boolean = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def positiveModulo(number: scala.Double, modulo: scala.Double): scala.Double = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("positiveModulo")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def removeClass(element: java.lang.String, className: java.lang.String): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def removeClass(element: typings.std.Element, className: java.lang.String): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def removeEvent(
  element: java.lang.String,
  eventName: java.lang.String,
  handler: typings.openseadragon.mod.EventHandler[js.Any]
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def removeEvent(
  element: java.lang.String,
  eventName: java.lang.String,
  handler: typings.openseadragon.mod.EventHandler[js.Any],
  useCapture: scala.Boolean
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def removeEvent(
  element: typings.std.Element,
  eventName: java.lang.String,
  handler: typings.openseadragon.mod.EventHandler[js.Any]
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def removeEvent(
  element: typings.std.Element,
  eventName: java.lang.String,
  handler: typings.openseadragon.mod.EventHandler[js.Any],
  useCapture: scala.Boolean
): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def setElementOpacity(element: java.lang.String, opacity: scala.Double): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def setElementOpacity(element: java.lang.String, opacity: scala.Double, usesAlpha: scala.Boolean): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def setElementOpacity(element: typings.std.Element, opacity: scala.Double): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def setElementOpacity(element: typings.std.Element, opacity: scala.Double, usesAlpha: scala.Boolean): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def setElementTouchActionNone(element: java.lang.String): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def setElementTouchActionNone(element: typings.std.Element): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setPageScroll(point: typings.openseadragon.mod.Point): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setPageScroll")(point.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def setString(property: java.lang.String, value: js.Any): scala.Unit = (typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setString")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def stopEvent(): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[scala.Unit]
inline def stopEvent(event: typings.openseadragon.mod.OSDEvent[js.Any]): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def supportsCanvas: scala.Boolean = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("supportsCanvas").asInstanceOf[scala.Boolean]
inline def supportsCanvas_=(x: scala.Boolean): scala.Unit = typings.openseadragon.mod.^.asInstanceOf[js.Dynamic].updateDynamic("supportsCanvas")(x.asInstanceOf[js.Any])

// TODO: use proper eventName type aliases, and OSDEvent where appropiate
type EventHandler[T /* <: typings.openseadragon.mod.OSDEvent[js.Any] */] = js.Function1[/* event */ T, scala.Unit]

type OnDrawCallback = js.Function3[
/* position */ typings.openseadragon.mod.Point, 
/* size */ typings.openseadragon.mod.Point, 
/* element */ typings.std.HTMLElement, 
scala.Unit]

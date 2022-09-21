package typings.openseadragon

import typings.openseadragon.anon.AjaxHeaders
import typings.openseadragon.anon.AjaxWithCredentials
import typings.openseadragon.anon.AnimationTime
import typings.openseadragon.anon.Bmp
import typings.openseadragon.anon.Buttons
import typings.openseadragon.anon.Capture
import typings.openseadragon.anon.DebugGridColor
import typings.openseadragon.anon.DefaultZoomLevel
import typings.openseadragon.anon.Element
import typings.openseadragon.anon.Error
import typings.openseadragon.anon.Height
import typings.openseadragon.anon.JobLimit
import typings.openseadragon.anon.MaxImageCacheCount
import typings.openseadragon.anon.TileSourceOptionstileForm
import typings.openseadragon.anon.`0`
import typings.openseadragon.mod.EventHandler
import typings.openseadragon.mod.MouseTrackerOptions
import typings.openseadragon.mod.OSDEvent
import typings.openseadragon.mod.Options
import typings.openseadragon.mod.OverlayOptions
import typings.openseadragon.mod.TControlOptions
import typings.openseadragon.mod.TileSourceOptions
import typings.std.CanvasRenderingContext2D
import typings.std.Document
import typings.std.Event
import typings.std.HTMLElement
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OpenSeadragon {
    
    inline def apply(options: Options): typings.openseadragon.mod.Viewer = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Viewer]
    
    @JSGlobal("OpenSeadragon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("OpenSeadragon.BROWSERS")
    @js.native
    object BROWSERS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.BROWSERS & Double] = js.native
      
      /* 4 */ val CHROME: typings.openseadragon.mod.BROWSERS.CHROME & Double = js.native
      
      /* 7 */ val CHROMEEDGE: typings.openseadragon.mod.BROWSERS.CHROMEEDGE & Double = js.native
      
      /* 6 */ val EDGE: typings.openseadragon.mod.BROWSERS.EDGE & Double = js.native
      
      /* 2 */ val FIREFOX: typings.openseadragon.mod.BROWSERS.FIREFOX & Double = js.native
      
      /* 1 */ val IE: typings.openseadragon.mod.BROWSERS.IE & Double = js.native
      
      /* 5 */ val OPERA: typings.openseadragon.mod.BROWSERS.OPERA & Double = js.native
      
      /* 3 */ val SAFARI: typings.openseadragon.mod.BROWSERS.SAFARI & Double = js.native
      
      /* 0 */ val UNKNOWN: typings.openseadragon.mod.BROWSERS.UNKNOWN & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.Browser")
    @js.native
    open class Browser ()
      extends typings.openseadragon.mod.Browser
    
    @JSGlobal("OpenSeadragon.Button")
    @js.native
    open class Button protected ()
      extends typings.openseadragon.mod.Button {
      def this(options: Element) = this()
    }
    
    @JSGlobal("OpenSeadragon.ButtonGroup")
    @js.native
    open class ButtonGroup protected ()
      extends typings.openseadragon.mod.ButtonGroup {
      def this(options: Buttons) = this()
    }
    
    @JSGlobal("OpenSeadragon.ButtonState")
    @js.native
    object ButtonState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.ButtonState & Double] = js.native
      
      /* 3 */ val DOWN: typings.openseadragon.mod.ButtonState.DOWN & Double = js.native
      
      /* 1 */ val GROUP: typings.openseadragon.mod.ButtonState.GROUP & Double = js.native
      
      /* 2 */ val HOVER: typings.openseadragon.mod.ButtonState.HOVER & Double = js.native
      
      /* 0 */ val REST: typings.openseadragon.mod.ButtonState.REST & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.Control")
    @js.native
    open class Control protected ()
      extends typings.openseadragon.mod.Control {
      def this(element: typings.std.Element, options: TControlOptions, container: typings.std.Element) = this()
    }
    
    @JSGlobal("OpenSeadragon.ControlAnchor")
    @js.native
    object ControlAnchor extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.ControlAnchor & Double] = js.native
      
      /* 5 */ val ABSOLUTE: typings.openseadragon.mod.ControlAnchor.ABSOLUTE & Double = js.native
      
      /* 3 */ val BOTTOM_LEFT: typings.openseadragon.mod.ControlAnchor.BOTTOM_LEFT & Double = js.native
      
      /* 4 */ val BOTTOM_RIGHT: typings.openseadragon.mod.ControlAnchor.BOTTOM_RIGHT & Double = js.native
      
      /* 0 */ val NONE: typings.openseadragon.mod.ControlAnchor.NONE & Double = js.native
      
      /* 1 */ val TOP_LEFT: typings.openseadragon.mod.ControlAnchor.TOP_LEFT & Double = js.native
      
      /* 2 */ val TOP_RIGHT: typings.openseadragon.mod.ControlAnchor.TOP_RIGHT & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.ControlDock")
    @js.native
    open class ControlDock protected ()
      extends typings.openseadragon.mod.ControlDock {
      def this(options: js.Object) = this()
    }
    
    @JSGlobal("OpenSeadragon.DEFAULT_SETTINGS")
    @js.native
    val DEFAULT_SETTINGS: Options = js.native
    
    @JSGlobal("OpenSeadragon.DisplayRect")
    @js.native
    open class DisplayRect protected ()
      extends typings.openseadragon.mod.DisplayRect {
      def this(x: Double, y: Double, width: Double, height: Double, minLevel: Double, maxLevel: Double) = this()
    }
    
    @JSGlobal("OpenSeadragon.Drawer")
    @js.native
    open class Drawer protected ()
      extends typings.openseadragon.mod.Drawer {
      // element : Element; // Deprecated
      def this(options: DebugGridColor) = this()
    }
    
    @JSGlobal("OpenSeadragon.DziTileSource")
    @js.native
    open class DziTileSource protected ()
      extends typings.openseadragon.mod.DziTileSource {
      def this(
        width: Double,
        height: Double,
        tileSize: Double,
        tileOverlap: Double,
        tilesUrl: Double,
        fileFormat: Double,
        displayRects: Double,
        minLevel: Double,
        maxLevel: Double
      ) = this()
    }
    
    @JSGlobal("OpenSeadragon.GesturePointList")
    @js.native
    open class GesturePointList protected ()
      extends typings.openseadragon.mod.GesturePointList {
      def this(`type`: String) = this()
    }
    
    @JSGlobal("OpenSeadragon.IIIFTileSource")
    @js.native
    open class IIIFTileSource protected ()
      extends typings.openseadragon.mod.IIIFTileSource {
      def this(options: TileSourceOptionstileForm) = this()
    }
    
    @JSGlobal("OpenSeadragon.ImageLoader")
    @js.native
    open class ImageLoader protected ()
      extends typings.openseadragon.mod.ImageLoader {
      def this(options: JobLimit) = this()
    }
    
    @JSGlobal("OpenSeadragon.ImageTileSource")
    @js.native
    open class ImageTileSource protected ()
      extends typings.openseadragon.mod.ImageTileSource {
      def this(options: AjaxWithCredentials) = this()
    }
    
    @JSGlobal("OpenSeadragon.LegacyTileSource")
    @js.native
    open class LegacyTileSource ()
      extends typings.openseadragon.mod.LegacyTileSource {
      def this(levels: js.Array[Height]) = this()
    }
    
    @JSGlobal("OpenSeadragon.MouseTracker")
    @js.native
    open class MouseTracker protected ()
      extends typings.openseadragon.mod.MouseTracker {
      def this(options: MouseTrackerOptions) = this()
    }
    
    @JSGlobal("OpenSeadragon.Navigator")
    @js.native
    open class Navigator protected ()
      extends typings.openseadragon.mod.Navigator {
      def this(options: Options) = this()
    }
    
    @JSGlobal("OpenSeadragon.OsmTileSource")
    @js.native
    open class OsmTileSource protected ()
      extends typings.openseadragon.mod.OsmTileSource {
      def this(width: Double, height: Double, tileSize: Double, tileOverlap: Double, tilesUrl: String) = this()
    }
    
    @JSGlobal("OpenSeadragon.Overlay")
    @js.native
    open class Overlay protected ()
      extends typings.openseadragon.mod.Overlay {
      def this(options: OverlayOptions) = this()
    }
    
    @JSGlobal("OpenSeadragon.OverlayPlacement")
    @js.native
    object OverlayPlacement extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.OverlayPlacement & Double] = js.native
      
      /* 6 */ val BOTTOM: typings.openseadragon.mod.OverlayPlacement.BOTTOM & Double = js.native
      
      /* 7 */ val BOTTOM_LEFT: typings.openseadragon.mod.OverlayPlacement.BOTTOM_LEFT & Double = js.native
      
      /* 5 */ val BOTTOM_RIGHT: typings.openseadragon.mod.OverlayPlacement.BOTTOM_RIGHT & Double = js.native
      
      /* 0 */ val CENTER: typings.openseadragon.mod.OverlayPlacement.CENTER & Double = js.native
      
      /* 8 */ val LEFT: typings.openseadragon.mod.OverlayPlacement.LEFT & Double = js.native
      
      /* 4 */ val RIGHT: typings.openseadragon.mod.OverlayPlacement.RIGHT & Double = js.native
      
      /* 2 */ val TOP: typings.openseadragon.mod.OverlayPlacement.TOP & Double = js.native
      
      /* 1 */ val TOP_LEFT: typings.openseadragon.mod.OverlayPlacement.TOP_LEFT & Double = js.native
      
      /* 3 */ val TOP_RIGHT: typings.openseadragon.mod.OverlayPlacement.TOP_RIGHT & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.OverlayRotationMode")
    @js.native
    object OverlayRotationMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.OverlayRotationMode & Double] = js.native
      
      /* 2 */ val BOUNDING_BOX: typings.openseadragon.mod.OverlayRotationMode.BOUNDING_BOX & Double = js.native
      
      /* 1 */ val EXACT: typings.openseadragon.mod.OverlayRotationMode.EXACT & Double = js.native
      
      /* 0 */ val NO_ROTATION: typings.openseadragon.mod.OverlayRotationMode.NO_ROTATION & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.Placement")
    @js.native
    object Placement extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openseadragon.mod.Placement & Double] = js.native
      
      /* 6 */ val BOTTOM: typings.openseadragon.mod.Placement.BOTTOM & Double = js.native
      
      /* 7 */ val BOTTOM_LEFT: typings.openseadragon.mod.Placement.BOTTOM_LEFT & Double = js.native
      
      /* 5 */ val BOTTOM_RIGHT: typings.openseadragon.mod.Placement.BOTTOM_RIGHT & Double = js.native
      
      /* 0 */ val CENTER: typings.openseadragon.mod.Placement.CENTER & Double = js.native
      
      /* 8 */ val LEFT: typings.openseadragon.mod.Placement.LEFT & Double = js.native
      
      /* 4 */ val RIGHT: typings.openseadragon.mod.Placement.RIGHT & Double = js.native
      
      /* 2 */ val TOP: typings.openseadragon.mod.Placement.TOP & Double = js.native
      
      /* 1 */ val TOP_LEFT: typings.openseadragon.mod.Placement.TOP_LEFT & Double = js.native
      
      /* 3 */ val TOP_RIGHT: typings.openseadragon.mod.Placement.TOP_RIGHT & Double = js.native
    }
    
    @JSGlobal("OpenSeadragon.Point")
    @js.native
    open class Point ()
      extends typings.openseadragon.mod.Point {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
    }
    
    @JSGlobal("OpenSeadragon.Rect")
    @js.native
    open class Rect ()
      extends typings.openseadragon.mod.Rect {
      def this(x: Double) = this()
      def this(x: Double, y: Double) = this()
      def this(x: Unit, y: Double) = this()
      def this(x: Double, y: Double, width: Double) = this()
      def this(x: Double, y: Unit, width: Double) = this()
      def this(x: Unit, y: Double, width: Double) = this()
      def this(x: Unit, y: Unit, width: Double) = this()
      def this(x: Double, y: Double, width: Double, height: Double) = this()
      def this(x: Double, y: Double, width: Unit, height: Double) = this()
      def this(x: Double, y: Unit, width: Double, height: Double) = this()
      def this(x: Double, y: Unit, width: Unit, height: Double) = this()
      def this(x: Unit, y: Double, width: Double, height: Double) = this()
      def this(x: Unit, y: Double, width: Unit, height: Double) = this()
      def this(x: Unit, y: Unit, width: Double, height: Double) = this()
      def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
      def this(x: Double, y: Double, width: Double, height: Double, degrees: Double) = this()
      def this(x: Double, y: Double, width: Double, height: Unit, degrees: Double) = this()
      def this(x: Double, y: Double, width: Unit, height: Double, degrees: Double) = this()
      def this(x: Double, y: Double, width: Unit, height: Unit, degrees: Double) = this()
      def this(x: Double, y: Unit, width: Double, height: Double, degrees: Double) = this()
      def this(x: Double, y: Unit, width: Double, height: Unit, degrees: Double) = this()
      def this(x: Double, y: Unit, width: Unit, height: Double, degrees: Double) = this()
      def this(x: Double, y: Unit, width: Unit, height: Unit, degrees: Double) = this()
      def this(x: Unit, y: Double, width: Double, height: Double, degrees: Double) = this()
      def this(x: Unit, y: Double, width: Double, height: Unit, degrees: Double) = this()
      def this(x: Unit, y: Double, width: Unit, height: Double, degrees: Double) = this()
      def this(x: Unit, y: Double, width: Unit, height: Unit, degrees: Double) = this()
      def this(x: Unit, y: Unit, width: Double, height: Double, degrees: Double) = this()
      def this(x: Unit, y: Unit, width: Double, height: Unit, degrees: Double) = this()
      def this(x: Unit, y: Unit, width: Unit, height: Double, degrees: Double) = this()
      def this(x: Unit, y: Unit, width: Unit, height: Unit, degrees: Double) = this()
    }
    
    @JSGlobal("OpenSeadragon.ReferenceStrip")
    @js.native
    open class ReferenceStrip protected ()
      extends typings.openseadragon.mod.ReferenceStrip {
      def this(options: js.Object) = this()
    }
    
    @JSGlobal("OpenSeadragon.Spring")
    @js.native
    open class Spring protected ()
      extends typings.openseadragon.mod.Spring {
      def this(options: AnimationTime) = this()
    }
    
    @JSGlobal("OpenSeadragon.Tile")
    @js.native
    open class Tile protected ()
      extends typings.openseadragon.mod.Tile {
      def this(
        level: Double,
        x: Double,
        y: Double,
        bounds: typings.openseadragon.mod.Rect,
        exists: Boolean,
        url: String,
        context2D: CanvasRenderingContext2D,
        loadWithAjax: Boolean,
        ajaxHeaders: js.Object,
        sourceBounds: typings.openseadragon.mod.Rect
      ) = this()
    }
    
    @JSGlobal("OpenSeadragon.TileCache")
    @js.native
    open class TileCache protected ()
      extends typings.openseadragon.mod.TileCache {
      def this(options: MaxImageCacheCount) = this()
    }
    
    @JSGlobal("OpenSeadragon.TileSource")
    @js.native
    open class TileSource protected ()
      extends typings.openseadragon.mod.TileSource {
      def this(options: TileSourceOptions) = this()
    }
    
    @JSGlobal("OpenSeadragon.TiledImage")
    @js.native
    open class TiledImage protected ()
      extends typings.openseadragon.mod.TiledImage {
      def this(options: AjaxHeaders) = this()
    }
    
    @JSGlobal("OpenSeadragon.TmsTileSource")
    @js.native
    open class TmsTileSource protected ()
      extends typings.openseadragon.mod.TmsTileSource {
      def this(width: Double, height: Double, tileSize: Double, tileOverlap: Double, tilesUrl: String) = this()
    }
    
    @JSGlobal("OpenSeadragon.Viewer")
    @js.native
    open class Viewer protected ()
      extends typings.openseadragon.mod.Viewer {
      def this(options: Options) = this()
    }
    
    @JSGlobal("OpenSeadragon.Viewport")
    @js.native
    open class Viewport protected ()
      extends typings.openseadragon.mod.Viewport {
      def this(options: DefaultZoomLevel) = this()
    }
    
    @JSGlobal("OpenSeadragon.World")
    @js.native
    open class World protected ()
      extends typings.openseadragon.mod.World {
      def this(options: js.Object) = this()
    }
    
    @JSGlobal("OpenSeadragon.ZoomifyTileSource")
    @js.native
    open class ZoomifyTileSource protected ()
      extends typings.openseadragon.mod.ZoomifyTileSource {
      def this(width: Double, height: Double, tileSize: Double, tilesUrl: String) = this()
    }
    
    inline def addClass(element: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addClass(element: typings.std.Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    inline def addEvent(element: typings.std.Element, eventName: String, handler: js.Function1[/* event */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEvent(
      element: typings.std.Element,
      eventName: String,
      handler: js.Function1[/* event */ Event, Unit],
      useCapture: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEvent(
      element: typings.std.Element,
      eventName: String,
      handler: js.Function1[/* event */ Event, Unit],
      useCapture: Capture
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def cancelEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")().asInstanceOf[Unit]
    inline def cancelEvent(event: OSDEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def capitalizeFirstLetter(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirstLetter")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def createCallback(`object`: js.Object, method: js.Function1[/* repeated */ Any, Unit], args: Any*): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallback")((List(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
    
    inline def delegate(`object`: js.Object, method: js.Function1[/* repeated */ Any, Unit]): js.Function2[/* object */ Any, /* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delegate")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* object */ Any, /* repeated */ Any, Unit]]
    
    // REVIEW: unsure of return type
    inline def eventIsCanceled(event: OSDEvent[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eventIsCanceled")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def extend(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Any]
    
    object fullScreenApi {
      
      @JSGlobal("OpenSeadragon.fullScreenApi")
      @js.native
      val ^ : js.Any = js.native
      
      inline def cancelFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFullScreen")().asInstanceOf[Unit]
      
      inline def exitFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFullScreen")().asInstanceOf[Unit]
      
      @JSGlobal("OpenSeadragon.fullScreenApi.fullScreenErrorEventName")
      @js.native
      def fullScreenErrorEventName: String = js.native
      inline def fullScreenErrorEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenErrorEventName")(x.asInstanceOf[js.Any])
      
      @JSGlobal("OpenSeadragon.fullScreenApi.fullScreenEventName")
      @js.native
      def fullScreenEventName: String = js.native
      inline def fullScreenEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenEventName")(x.asInstanceOf[js.Any])
      
      inline def getFullScreenElement(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullScreenElement")().asInstanceOf[HTMLElement]
      
      inline def isFullScreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullScreen")().asInstanceOf[Boolean]
      
      inline def requestFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFullScreen")().asInstanceOf[Unit]
      
      @JSGlobal("OpenSeadragon.fullScreenApi.supportsFullScreen")
      @js.native
      def supportsFullScreen: Boolean = js.native
      inline def supportsFullScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsFullScreen")(x.asInstanceOf[js.Any])
    }
    
    inline def getCssPropertyWithVendorPrefix(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCssPropertyWithVendorPrefix")(property.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getElement(element: String): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    inline def getElement(element: typings.std.Element): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    
    inline def getElementOffset(element: String): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    inline def getElementOffset(element: typings.std.Element): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementOffset")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def getElementPosition(element: String): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    inline def getElementPosition(element: typings.std.Element): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementPosition")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def getElementSize(element: String): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    inline def getElementSize(element: typings.std.Element): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSize")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def getElementStyle(element: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getElementStyle(element: typings.std.Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementStyle")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getMousePosition(): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")().asInstanceOf[typings.openseadragon.mod.Point]
    inline def getMousePosition(event: OSDEvent[Any]): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getMousePosition")(event.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def getPageScroll(): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageScroll")().asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def getString(property: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(property.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getUrlParameter(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlParameter")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    // CSSStyle?
    inline def getViewer(element: typings.std.Element): typings.openseadragon.mod.Viewer = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewer")(element.asInstanceOf[js.Any]).asInstanceOf[typings.openseadragon.mod.Viewer]
    
    inline def getWindowSize(): typings.openseadragon.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowSize")().asInstanceOf[typings.openseadragon.mod.Point]
    
    inline def imageFormatSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")().asInstanceOf[Boolean]
    inline def imageFormatSupported(`extension`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("imageFormatSupported")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def indexOf(array: js.Array[Any], searchElement: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def indexOf(array: js.Array[Any], searchElement: js.Object, fromIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], searchElement.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    // (missing jquery functions)
    inline def makeAjaxRequest(options: Error): XMLHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAjaxRequest")(options.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest]
    
    inline def makeCenteredNode(element: String): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    inline def makeCenteredNode(element: typings.std.Element): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCenteredNode")(element.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    
    inline def makeNeutralElement(tagName: String): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNeutralElement")(tagName.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    
    inline def makeTransparentImage(src: String): typings.std.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTransparentImage")(src.asInstanceOf[js.Any]).asInstanceOf[typings.std.Element]
    
    inline def normalizeEventListenerOptions(options: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEventListenerOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def normalizeEventListenerOptions(options: Capture): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEventListenerOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    
    inline def parseJSON(string: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(string.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def parseXml(string: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(string.asInstanceOf[js.Any]).asInstanceOf[Document]
    
    @JSGlobal("OpenSeadragon.pixelDensityRatio")
    @js.native
    def pixelDensityRatio: Double = js.native
    inline def pixelDensityRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelDensityRatio")(x.asInstanceOf[js.Any])
    
    inline def pointInElement(element: String, point: typings.openseadragon.mod.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def pointInElement(element: typings.std.Element, point: typings.openseadragon.mod.Point): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInElement")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def positiveModulo(number: Double, modulo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("positiveModulo")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def removeClass(element: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeClass(element: typings.std.Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any], useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent(element: String, eventName: String, handler: EventHandler[Any], useCapture: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent(element: typings.std.Element, eventName: String, handler: EventHandler[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent(element: typings.std.Element, eventName: String, handler: EventHandler[Any], useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeEvent(element: typings.std.Element, eventName: String, handler: EventHandler[Any], useCapture: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setElementOpacity(element: String, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setElementOpacity(element: String, opacity: Double, usesAlpha: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setElementOpacity(element: typings.std.Element, opacity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setElementOpacity(element: typings.std.Element, opacity: Double, usesAlpha: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementOpacity")(element.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], usesAlpha.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setElementPointerEvents(element: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEvents")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setElementPointerEvents(element: typings.std.Element, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEvents")(element.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setElementPointerEventsNone(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEventsNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setElementPointerEventsNone(element: typings.std.Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementPointerEventsNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setElementTouchActionNone(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setElementTouchActionNone(element: typings.std.Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setElementTouchActionNone")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setImageFormatsSupported(formats: Bmp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setImageFormatsSupported")(formats.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setPageScroll(point: typings.openseadragon.mod.Point): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPageScroll")(point.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setString(property: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setString")(property.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stopEvent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")().asInstanceOf[Unit]
    inline def stopEvent(event: OSDEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("OpenSeadragon.supportsCanvas")
    @js.native
    def supportsCanvas: Boolean = js.native
    inline def supportsCanvas_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsCanvas")(x.asInstanceOf[js.Any])
    
    object version {
      
      @JSGlobal("OpenSeadragon.version")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("OpenSeadragon.version.major")
      @js.native
      def major: Double = js.native
      inline def major_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("major")(x.asInstanceOf[js.Any])
      
      @JSGlobal("OpenSeadragon.version.minor")
      @js.native
      def minor: Double = js.native
      inline def minor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minor")(x.asInstanceOf[js.Any])
      
      @JSGlobal("OpenSeadragon.version.revision")
      @js.native
      def revision: Double = js.native
      inline def revision_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revision")(x.asInstanceOf[js.Any])
      
      @JSGlobal("OpenSeadragon.version.versionStr")
      @js.native
      def versionStr: String = js.native
      inline def versionStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionStr")(x.asInstanceOf[js.Any])
    }
  }
}

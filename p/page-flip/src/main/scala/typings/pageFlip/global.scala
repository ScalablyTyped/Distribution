package typings.pageFlip

import typings.pageFlip.anon.PartialFlipSetting
import typings.pageFlip.distBasicTypesMod.Point
import typings.pageFlip.distBasicTypesMod.Rect
import typings.pageFlip.distBasicTypesMod.Segment
import typings.pageFlip.distFlipFlipMod.FlipCorner
import typings.pageFlip.distFlipFlipMod.FlipDirection
import typings.pageFlip.distPagePageMod.PageDensity
import typings.pageFlip.distSettingsMod.FlipSetting
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object St {
    
    @JSGlobal("St.CanvasRender")
    @js.native
    open class CanvasRender protected ()
      extends typings.pageFlip.mod.CanvasRender {
      def this(app: typings.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting, inCanvas: HTMLCanvasElement) = this()
    }
    
    @JSGlobal("St.CanvasUI")
    @js.native
    open class CanvasUI protected ()
      extends typings.pageFlip.mod.CanvasUI {
      def this(inBlock: HTMLElement, app: typings.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
    }
    
    /* note: abstract class */ @JSGlobal("St.EventObject")
    @js.native
    open class EventObject ()
      extends typings.pageFlip.mod.EventObject
    
    @JSGlobal("St.Flip")
    @js.native
    open class Flip protected ()
      extends typings.pageFlip.mod.Flip {
      def this(
        render: typings.pageFlip.distRenderRenderMod.Render,
        app: typings.pageFlip.distPageFlipMod.PageFlip
      ) = this()
    }
    
    @JSGlobal("St.FlipCalculation")
    @js.native
    open class FlipCalculation protected ()
      extends typings.pageFlip.mod.FlipCalculation {
      def this(direction: FlipDirection, corner: FlipCorner, pageWidth: String, pageHeight: String) = this()
    }
    
    @JSGlobal("St.FlipCorner")
    @js.native
    object FlipCorner extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.pageFlip.distFlipFlipMod.FlipCorner & String] = js.native
      
      /* "bottom" */ val BOTTOM: typings.pageFlip.distFlipFlipMod.FlipCorner.BOTTOM & String = js.native
      
      /* "top" */ val TOP: typings.pageFlip.distFlipFlipMod.FlipCorner.TOP & String = js.native
    }
    
    @JSGlobal("St.FlipDirection")
    @js.native
    object FlipDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pageFlip.distFlipFlipMod.FlipDirection & Double] = js.native
      
      /* 1 */ val BACK: typings.pageFlip.distFlipFlipMod.FlipDirection.BACK & Double = js.native
      
      /* 0 */ val FORWARD: typings.pageFlip.distFlipFlipMod.FlipDirection.FORWARD & Double = js.native
    }
    
    @JSGlobal("St.FlippingState")
    @js.native
    object FlippingState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.pageFlip.distFlipFlipMod.FlippingState & String] = js.native
      
      /* "flipping" */ val FLIPPING: typings.pageFlip.distFlipFlipMod.FlippingState.FLIPPING & String = js.native
      
      /* "fold_corner" */ val FOLD_CORNER: typings.pageFlip.distFlipFlipMod.FlippingState.FOLD_CORNER & String = js.native
      
      /* "read" */ val READ: typings.pageFlip.distFlipFlipMod.FlippingState.READ & String = js.native
      
      /* "user_fold" */ val USER_FOLD: typings.pageFlip.distFlipFlipMod.FlippingState.USER_FOLD & String = js.native
    }
    
    @JSGlobal("St.HTMLPage")
    @js.native
    open class HTMLPage protected ()
      extends typings.pageFlip.mod.HTMLPage {
      def this(render: typings.pageFlip.distRenderRenderMod.Render, element: HTMLElement, density: PageDensity) = this()
    }
    
    @JSGlobal("St.HTMLPageCollection")
    @js.native
    open class HTMLPageCollection protected ()
      extends typings.pageFlip.mod.HTMLPageCollection {
      def this(
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        render: typings.pageFlip.distRenderRenderMod.Render,
        element: HTMLElement,
        items: js.Array[HTMLElement]
      ) = this()
      def this(
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        render: typings.pageFlip.distRenderRenderMod.Render,
        element: HTMLElement,
        items: NodeListOf[HTMLElement]
      ) = this()
    }
    
    @JSGlobal("St.HTMLRender")
    @js.native
    open class HTMLRender protected ()
      extends typings.pageFlip.mod.HTMLRender {
      def this(app: typings.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting, element: HTMLElement) = this()
    }
    
    @JSGlobal("St.HTMLUI")
    @js.native
    open class HTMLUI protected ()
      extends typings.pageFlip.mod.HTMLUI {
      def this(
        inBlock: HTMLElement,
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        setting: FlipSetting,
        items: js.Array[HTMLElement]
      ) = this()
      def this(
        inBlock: HTMLElement,
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        setting: FlipSetting,
        items: NodeListOf[HTMLElement]
      ) = this()
    }
    
    object Helper {
      
      @JSGlobal("St.Helper")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get the angle between two lines
        */
      inline def GetAngleBetweenTwoLine(line1: Segment, line2: Segment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenTwoLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Get a list of coordinates (step: 1px) between two points
        */
      inline def GetCordsFromTwoPoint(pointOne: Point, pointTwo: Point): js.Array[Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCordsFromTwoPoint")(pointOne.asInstanceOf[js.Any], pointTwo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point]]
      
      /**
        * Get the distance between two points
        */
      inline def GetDistanceBetweenTwoPoint(point1: Point, point2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetDistanceBetweenTwoPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Find the intersection point of two lines
        *
        * @throws Error if the segments are on the same line
        */
      inline def GetIntersectBeetwenTwoLine(one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBeetwenTwoLine")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      /**
        * Find the intersection of two lines bounded by a rectangle "rectBorder"
        */
      inline def GetIntersectBetweenTwoSegment(rectBorder: Rect, one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBetweenTwoSegment")(rectBorder.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      /**
        * Transform point coordinates to a given angle
        */
      inline def GetRotatedPoint(transformedPoint: Point, startPoint: Point, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRotatedPoint")(transformedPoint.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      /**
        * Get the length of the line segment
        */
      inline def GetSegmentLength(segment: Segment): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSegmentLength")(segment.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Limit a point "linePoint" to a given circle centered at point "startPoint" and a given radius
        */
      inline def LimitPointToCircle(startPoint: Point, radius: Double, limitedPoint: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("LimitPointToCircle")(startPoint.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], limitedPoint.asInstanceOf[js.Any])).asInstanceOf[Point]
      
      /**
        * Check for a point in a rectangle
        */
      inline def PointInRect(rect: Rect, pos: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInRect")(rect.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Point]
    }
    
    @JSGlobal("St.ImagePage")
    @js.native
    open class ImagePage protected ()
      extends typings.pageFlip.mod.ImagePage {
      def this(render: typings.pageFlip.distRenderRenderMod.Render, href: String, density: PageDensity) = this()
    }
    
    @JSGlobal("St.ImagePageCollection")
    @js.native
    open class ImagePageCollection protected ()
      extends typings.pageFlip.mod.ImagePageCollection {
      def this(
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        render: typings.pageFlip.distRenderRenderMod.Render,
        imagesHref: js.Array[String]
      ) = this()
    }
    
    @JSGlobal("St.Orientation")
    @js.native
    object Orientation extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.pageFlip.distRenderRenderMod.Orientation & String] = js.native
      
      /* "landscape" */ val LANDSCAPE: typings.pageFlip.distRenderRenderMod.Orientation.LANDSCAPE & String = js.native
      
      /* "portrait" */ val PORTRAIT: typings.pageFlip.distRenderRenderMod.Orientation.PORTRAIT & String = js.native
    }
    
    /* note: abstract class */ @JSGlobal("St.Page")
    @js.native
    open class Page protected ()
      extends typings.pageFlip.mod.Page {
      /* protected */ def this(render: typings.pageFlip.distRenderRenderMod.Render, density: PageDensity) = this()
    }
    
    /* note: abstract class */ @JSGlobal("St.PageCollection")
    @js.native
    open class PageCollection protected ()
      extends typings.pageFlip.mod.PageCollection {
      /* protected */ def this(
        app: typings.pageFlip.distPageFlipMod.PageFlip,
        render: typings.pageFlip.distRenderRenderMod.Render
      ) = this()
    }
    
    @JSGlobal("St.PageDensity")
    @js.native
    object PageDensity extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.pageFlip.distPagePageMod.PageDensity & String] = js.native
      
      /* "hard" */ val HARD: typings.pageFlip.distPagePageMod.PageDensity.HARD & String = js.native
      
      /* "soft" */ val SOFT: typings.pageFlip.distPagePageMod.PageDensity.SOFT & String = js.native
    }
    
    @JSGlobal("St.PageFlip")
    @js.native
    open class PageFlip protected ()
      extends typings.pageFlip.mod.PageFlip {
      /**
        * Create a new PageFlip instance
        */
      def this(inBlock: HTMLElement, setting: PartialFlipSetting) = this()
    }
    
    @JSGlobal("St.PageOrientation")
    @js.native
    object PageOrientation extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.pageFlip.distPagePageMod.PageOrientation & Double] = js.native
      
      /* 0 */ val LEFT: typings.pageFlip.distPagePageMod.PageOrientation.LEFT & Double = js.native
      
      /* 1 */ val RIGHT: typings.pageFlip.distPagePageMod.PageOrientation.RIGHT & Double = js.native
    }
    
    /* note: abstract class */ @JSGlobal("St.Render")
    @js.native
    open class Render protected ()
      extends typings.pageFlip.mod.Render {
      /* protected */ def this(app: typings.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
    }
    
    @JSGlobal("St.Settings")
    @js.native
    open class Settings ()
      extends typings.pageFlip.mod.Settings
    
    @JSGlobal("St.SizeType")
    @js.native
    object SizeType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.pageFlip.distSettingsMod.SizeType & String] = js.native
      
      /* "fixed" */ val FIXED: typings.pageFlip.distSettingsMod.SizeType.FIXED & String = js.native
      
      /* "stretch" */ val STRETCH: typings.pageFlip.distSettingsMod.SizeType.STRETCH & String = js.native
    }
    
    /* note: abstract class */ @JSGlobal("St.UI")
    @js.native
    open class UI protected ()
      extends typings.pageFlip.mod.UI {
      /* protected */ def this(inBlock: HTMLElement, app: typings.pageFlip.distPageFlipMod.PageFlip, setting: FlipSetting) = this()
    }
  }
}

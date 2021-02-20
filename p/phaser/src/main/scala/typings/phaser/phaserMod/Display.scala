package typings.phaser.phaserMod

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Types.Display.ColorObject
import typings.phaser.Phaser.Types.Display.HSVColorObject
import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  object Align {
    
    /**
      * A constant representing a bottom-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_CENTER")
    @js.native
    val BOTTOM_CENTER: integer = js.native
    
    /**
      * A constant representing a bottom-left alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_LEFT")
    @js.native
    val BOTTOM_LEFT: integer = js.native
    
    /**
      * A constant representing a bottom-right alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_RIGHT")
    @js.native
    val BOTTOM_RIGHT: integer = js.native
    
    /**
      * A constant representing a center alignment or position.
      */
    @JSImport("phaser", "Display.Align.CENTER")
    @js.native
    val CENTER: integer = js.native
    
    object In {
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.Center")
      @js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.Center")
      @js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.Center")
      @js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.Center")
      @js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the left center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned relative to the other.
        * The alignment used is based on the `position` argument, which is an `ALIGN_CONST` value, such as `LEFT_CENTER` or `TOP_RIGHT`.
        * @param child The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param position The position to align the Game Object with. This is an align constant, such as `ALIGN_CONST.LEFT_CENTER`.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer): G = js.native
      @JSImport("phaser", "Display.Align.In.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](
        child: G,
        alignIn: GameObject,
        position: integer,
        offsetX: js.UndefOr[scala.Nothing],
        offsetY: Double
      ): G = js.native
      @JSImport("phaser", "Display.Align.In.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the right center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.In.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.In.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.In.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    }
    
    /**
      * A constant representing a left-bottom alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_BOTTOM")
    @js.native
    val LEFT_BOTTOM: integer = js.native
    
    /**
      * A constant representing a left-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_CENTER")
    @js.native
    val LEFT_CENTER: integer = js.native
    
    /**
      * A constant representing a left-top alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_TOP")
    @js.native
    val LEFT_TOP: integer = js.native
    
    /**
      * A constant representing a right-bottom alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_BOTTOM")
    @js.native
    val RIGHT_BOTTOM: integer = js.native
    
    /**
      * A constant representing a right-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_CENTER")
    @js.native
    val RIGHT_CENTER: integer = js.native
    
    /**
      * A constant representing a right-top alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_TOP")
    @js.native
    val RIGHT_TOP: integer = js.native
    
    /**
      * A constant representing a top-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_CENTER")
    @js.native
    val TOP_CENTER: integer = js.native
    
    /**
      * A constant representing a top-left alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_LEFT")
    @js.native
    val TOP_LEFT: integer = js.native
    
    /**
      * A constant representing a top-right alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_RIGHT")
    @js.native
    val TOP_RIGHT: integer = js.native
    
    object To {
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomCenter")
      @js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomLeft")
      @js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.BottomRight")
      @js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.LeftBottom")
      @js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftBottom")
      @js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftBottom")
      @js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftBottom")
      @js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftCenter")
      @js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.LeftTop")
      @js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftTop")
      @js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftTop")
      @js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.LeftTop")
      @js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes a Game Object and aligns it next to another, at the given position.
        * The alignment used is based on the `position` argument, which is a `Phaser.Display.Align` property such as `LEFT_CENTER` or `TOP_RIGHT`.
        * @param child The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param position The position to align the Game Object with. This is an align constant, such as `Phaser.Display.Align.LEFT_CENTER`.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: integer): G = js.native
      @JSImport("phaser", "Display.Align.To.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](
        child: G,
        alignTo: GameObject,
        position: integer,
        offsetX: js.UndefOr[scala.Nothing],
        offsetY: Double
      ): G = js.native
      @JSImport("phaser", "Display.Align.To.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: integer, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.QuickSet")
      @js.native
      def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: integer, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.RightBottom")
      @js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.RightBottom")
      @js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightBottom")
      @js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightBottom")
      @js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightCenter")
      @js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.RightTop")
      @js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.RightTop")
      @js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightTop")
      @js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.RightTop")
      @js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopCenter")
      @js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopLeft")
      @js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      @JSImport("phaser", "Display.Align.To.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      @JSImport("phaser", "Display.Align.To.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      @JSImport("phaser", "Display.Align.To.TopRight")
      @js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    }
  }
  
  /**
    * A BaseShader is a small resource class that contains the data required for a WebGL Shader to be created.
    * 
    * It contains the raw source code to the fragment and vertex shader, as well as an object that defines
    * the uniforms the shader requires, if any.
    * 
    * BaseShaders are stored in the Shader Cache, available in a Scene via `this.cache.shaders` and are referenced
    * by a unique key-based string. Retrieve them via `this.cache.shaders.get(key)`.
    * 
    * BaseShaders are created automatically by the GLSL File Loader when loading an external shader resource.
    * They can also be created at runtime, allowing you to use dynamically generated shader source code.
    * 
    * Default fragment and vertex source is used if not provided in the constructor, setting-up a basic shader,
    * suitable for debug rendering.
    */
  @JSImport("phaser", "Display.BaseShader")
  @js.native
  class BaseShader protected ()
    extends typings.phaser.Phaser.Display.BaseShader {
    /**
      * 
      * @param key The key of this shader. Must be unique within the shader cache.
      * @param fragmentSrc The fragment source for the shader.
      * @param vertexSrc The vertex source for the shader.
      * @param uniforms Optional object defining the uniforms the shader uses.
      */
    def this(key: String) = this()
    def this(key: String, fragmentSrc: String) = this()
    def this(key: String, fragmentSrc: js.UndefOr[scala.Nothing], vertexSrc: String) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String) = this()
    def this(
      key: String,
      fragmentSrc: js.UndefOr[scala.Nothing],
      vertexSrc: js.UndefOr[scala.Nothing],
      uniforms: js.Any
    ) = this()
    def this(key: String, fragmentSrc: js.UndefOr[scala.Nothing], vertexSrc: String, uniforms: js.Any) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: js.UndefOr[scala.Nothing], uniforms: js.Any) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String, uniforms: js.Any) = this()
  }
  
  object Bounds {
    
    /**
      * Positions the Game Object so that it is centered on the given coordinates.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The horizontal coordinate to position the Game Object on.
      * @param y The vertical coordinate to position the Game Object on.
      */
    @JSImport("phaser", "Display.Bounds.CenterOn")
    @js.native
    def CenterOn[G /* <: GameObject */](gameObject: G, x: Double, y: Double): G = js.native
    
    /**
      * Returns the bottom coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetBottom")
    @js.native
    def GetBottom(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the unrotated bounds of the Game Object as a rectangle.
      * @param gameObject The Game Object to get the bounds value from.
      * @param output An object to store the values in.
      */
    @JSImport("phaser", "Display.Bounds.GetBounds")
    @js.native
    def GetBounds(gameObject: GameObject): Rectangle | js.Object = js.native
    @JSImport("phaser", "Display.Bounds.GetBounds")
    @js.native
    def GetBounds(gameObject: GameObject, output: js.Object): Rectangle | js.Object = js.native
    @JSImport("phaser", "Display.Bounds.GetBounds")
    @js.native
    def GetBounds(gameObject: GameObject, output: Rectangle): Rectangle | js.Object = js.native
    
    /**
      * Returns the center x coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetCenterX")
    @js.native
    def GetCenterX(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the center y coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetCenterY")
    @js.native
    def GetCenterY(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the left coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetLeft")
    @js.native
    def GetLeft(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the amount the Game Object is visually offset from its x coordinate.
      * This is the same as `width * origin.x`.
      * This value will only be > 0 if `origin.x` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetOffsetX")
    @js.native
    def GetOffsetX(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the amount the Game Object is visually offset from its y coordinate.
      * This is the same as `width * origin.y`.
      * This value will only be > 0 if `origin.y` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetOffsetY")
    @js.native
    def GetOffsetY(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the right coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetRight")
    @js.native
    def GetRight(gameObject: GameObject): Double = js.native
    
    /**
      * Returns the top coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    @JSImport("phaser", "Display.Bounds.GetTop")
    @js.native
    def GetTop(gameObject: GameObject): Double = js.native
    
    /**
      * Positions the Game Object so that the bottom of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetBottom")
    @js.native
    def SetBottom[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetCenterX")
    @js.native
    def SetCenterX[G /* <: GameObject */](gameObject: G, x: Double): G = js.native
    
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param y The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetCenterY")
    @js.native
    def SetCenterY[G /* <: GameObject */](gameObject: G, y: Double): G = js.native
    
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetLeft")
    @js.native
    def SetLeft[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetRight")
    @js.native
    def SetRight[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    
    /**
      * Positions the Game Object so that the top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    @JSImport("phaser", "Display.Bounds.SetTop")
    @js.native
    def SetTop[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
  }
  
  object Canvas {
    
    object CanvasInterpolation {
      
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'bicubic' (aka 'auto').
        * @param canvas The canvas object to have the style set on.
        */
      @JSImport("phaser", "Display.Canvas.CanvasInterpolation.setBicubic")
      @js.native
      def setBicubic(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
      
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'crisp' (aka 'optimize contrast' on webkit).
        * @param canvas The canvas object to have the style set on.
        */
      @JSImport("phaser", "Display.Canvas.CanvasInterpolation.setCrisp")
      @js.native
      def setCrisp(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    }
    
    /**
      * The CanvasPool is a global static object, that allows Phaser to recycle and pool 2D Context Canvas DOM elements.
      * It does not pool WebGL Contexts, because once the context options are set they cannot be modified again, 
      * which is useless for some of the Phaser pipelines / renderer.
      * 
      * This singleton is instantiated as soon as Phaser loads, before a Phaser.Game instance has even been created.
      * Which means all instances of Phaser Games on the same page can share the one single pool.
      */
    object CanvasPool {
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        * @param selfParent Use the generated Canvas element as the parent? Default false.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        canvasType: js.UndefOr[scala.Nothing],
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        canvasType: integer
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: js.UndefOr[scala.Nothing],
        height: js.UndefOr[scala.Nothing],
        canvasType: integer,
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: js.UndefOr[scala.Nothing], height: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: js.UndefOr[scala.Nothing],
        height: integer,
        canvasType: js.UndefOr[scala.Nothing],
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: js.UndefOr[scala.Nothing], height: integer, canvasType: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: js.UndefOr[scala.Nothing],
        height: integer,
        canvasType: integer,
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: integer,
        height: js.UndefOr[scala.Nothing],
        canvasType: js.UndefOr[scala.Nothing],
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: integer, height: js.UndefOr[scala.Nothing], canvasType: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: integer,
        height: js.UndefOr[scala.Nothing],
        canvasType: integer,
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(
        parent: js.Any,
        width: integer,
        height: integer,
        canvasType: js.UndefOr[scala.Nothing],
        selfParent: Boolean
      ): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: integer, height: integer, canvasType: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create")
      @js.native
      def create(parent: js.Any, width: integer, height: integer, canvasType: integer, selfParent: Boolean): HTMLCanvasElement = js.native
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.create2D")
      @js.native
      def create2D(parent: js.Any): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create2D")
      @js.native
      def create2D(parent: js.Any, width: js.UndefOr[scala.Nothing], height: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create2D")
      @js.native
      def create2D(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.create2D")
      @js.native
      def create2D(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.createWebGL")
      @js.native
      def createWebGL(parent: js.Any): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.createWebGL")
      @js.native
      def createWebGL(parent: js.Any, width: js.UndefOr[scala.Nothing], height: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.createWebGL")
      @js.native
      def createWebGL(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.createWebGL")
      @js.native
      def createWebGL(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      
      /**
        * Disable context smoothing on any new Canvas element created.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.disableSmoothing")
      @js.native
      def disableSmoothing(): Unit = js.native
      
      /**
        * Enable context smoothing on any new Canvas element created.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.enableSmoothing")
      @js.native
      def enableSmoothing(): Unit = js.native
      
      /**
        * Gets the first free canvas index from the pool.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.first")
      @js.native
      def first(): HTMLCanvasElement = js.native
      @JSImport("phaser", "Display.Canvas.CanvasPool.first")
      @js.native
      def first(canvasType: integer): HTMLCanvasElement = js.native
      
      /**
        * Gets the total number of free canvas elements in the pool.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.free")
      @js.native
      def free(): integer = js.native
      
      /**
        * Looks up a canvas based on its parent, and if found puts it back in the pool, freeing it up for re-use.
        * The canvas has its width and height set to 1, and its parent attribute nulled.
        * @param parent The canvas or the parent of the canvas to free.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.remove")
      @js.native
      def remove(parent: js.Any): Unit = js.native
      
      /**
        * Gets the total number of used canvas elements in the pool.
        */
      @JSImport("phaser", "Display.Canvas.CanvasPool.total")
      @js.native
      def total(): integer = js.native
    }
    
    object Smoothing {
      
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to disable smoothing.
        */
      @JSImport("phaser", "Display.Canvas.Smoothing.disable")
      @js.native
      def disable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      @JSImport("phaser", "Display.Canvas.Smoothing.disable")
      @js.native
      def disable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to enable smoothing.
        */
      @JSImport("phaser", "Display.Canvas.Smoothing.enable")
      @js.native
      def enable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      @JSImport("phaser", "Display.Canvas.Smoothing.enable")
      @js.native
      def enable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      
      /**
        * Gets the Smoothing Enabled vendor prefix being used on the given context, or null if not set.
        * @param context The canvas context to check.
        */
      @JSImport("phaser", "Display.Canvas.Smoothing.getPrefix")
      @js.native
      def getPrefix(context: CanvasRenderingContext2D): String = js.native
      @JSImport("phaser", "Display.Canvas.Smoothing.getPrefix")
      @js.native
      def getPrefix(context: WebGLRenderingContext): String = js.native
      
      /**
        * Returns `true` if the given context has image smoothing enabled, otherwise returns `false`.
        * Returns null if no smoothing prefix is available.
        * @param context The context to check.
        */
      @JSImport("phaser", "Display.Canvas.Smoothing.isEnabled")
      @js.native
      def isEnabled(context: CanvasRenderingContext2D): Boolean = js.native
      @JSImport("phaser", "Display.Canvas.Smoothing.isEnabled")
      @js.native
      def isEnabled(context: WebGLRenderingContext): Boolean = js.native
    }
    
    /**
      * Sets the touch-action property on the canvas style. Can be used to disable default browser touch actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch action value to set on the canvas. Set to `none` to disable touch actions. Default 'none'.
      */
    @JSImport("phaser", "Display.Canvas.TouchAction")
    @js.native
    def TouchAction(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    @JSImport("phaser", "Display.Canvas.TouchAction")
    @js.native
    def TouchAction(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = js.native
    
    /**
      * Sets the user-select property on the canvas style. Can be used to disable default browser selection actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch callout value to set on the canvas. Set to `none` to disable touch callouts. Default 'none'.
      */
    @JSImport("phaser", "Display.Canvas.UserSelect")
    @js.native
    def UserSelect(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    @JSImport("phaser", "Display.Canvas.UserSelect")
    @js.native
    def UserSelect(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = js.native
  }
  
  /**
    * The Color class holds a single color value and allows for easy modification and reading of it.
    */
  @JSImport("phaser", "Display.Color")
  @js.native
  /**
    * 
    * @param red The red color value. A number between 0 and 255. Default 0.
    * @param green The green color value. A number between 0 and 255. Default 0.
    * @param blue The blue color value. A number between 0 and 255. Default 0.
    * @param alpha The alpha value. A number between 0 and 255. Default 255.
    */
  class Color ()
    extends typings.phaser.Phaser.Display.Color {
    def this(red: integer) = this()
    def this(red: js.UndefOr[scala.Nothing], green: integer) = this()
    def this(red: integer, green: integer) = this()
    def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: integer) = this()
    def this(red: js.UndefOr[scala.Nothing], green: integer, blue: integer) = this()
    def this(red: integer, green: js.UndefOr[scala.Nothing], blue: integer) = this()
    def this(red: integer, green: integer, blue: integer) = this()
    def this(
      red: js.UndefOr[scala.Nothing],
      green: js.UndefOr[scala.Nothing],
      blue: js.UndefOr[scala.Nothing],
      alpha: integer
    ) = this()
    def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: integer, alpha: integer) = this()
    def this(red: js.UndefOr[scala.Nothing], green: integer, blue: js.UndefOr[scala.Nothing], alpha: integer) = this()
    def this(red: js.UndefOr[scala.Nothing], green: integer, blue: integer, alpha: integer) = this()
    def this(red: integer, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: integer) = this()
    def this(red: integer, green: js.UndefOr[scala.Nothing], blue: integer, alpha: integer) = this()
    def this(red: integer, green: integer, blue: js.UndefOr[scala.Nothing], alpha: integer) = this()
    def this(red: integer, green: integer, blue: integer, alpha: integer) = this()
  }
  object Color {
    
    /**
      * Converts the given color value into an Object containing r,g,b and a properties.
      * @param color A color value, optionally including the alpha value.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.ColorToRGBA")
    @js.native
    def ColorToRGBA(color: Double): ColorObject = js.native
    
    /**
      * Returns a string containing a hex representation of the given color component.
      * @param color The color channel to get the hex value for, must be a value between 0 and 255.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.ComponentToHex")
    @js.native
    def ComponentToHex(color: integer): String = js.native
    
    /**
      * Given 3 separate color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.GetColor")
    @js.native
    def GetColor(red: integer, green: integer, blue: integer): Double = js.native
    
    /**
      * Given an alpha and 3 color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      * @param alpha The alpha color value. A number between 0 and 255.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.GetColor32")
    @js.native
    def GetColor32(red: integer, green: integer, blue: integer, alpha: integer): Double = js.native
    
    /**
      * Converts HSL (hue, saturation and lightness) values to a Phaser Color object.
      * @param h The hue value in the range 0 to 1.
      * @param s The saturation value in the range 0 to 1.
      * @param l The lightness value in the range 0 to 1.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.HSLToColor")
    @js.native
    def HSLToColor(h: Double, s: Double, l: Double): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Get HSV color wheel values in an array which will be 360 elements in size.
      * @param s The saturation, in the range 0 - 1. Default 1.
      * @param v The value, in the range 0 - 1. Default 1.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.HSVColorWheel")
    @js.native
    def HSVColorWheel(): js.Array[ColorObject] = js.native
    @JSImport("phaser", "Display.Color.HSVColorWheel")
    @js.native
    def HSVColorWheel(s: js.UndefOr[scala.Nothing], v: Double): js.Array[ColorObject] = js.native
    @JSImport("phaser", "Display.Color.HSVColorWheel")
    @js.native
    def HSVColorWheel(s: Double): js.Array[ColorObject] = js.native
    @JSImport("phaser", "Display.Color.HSVColorWheel")
    @js.native
    def HSVColorWheel(s: Double, v: Double): js.Array[ColorObject] = js.native
    
    /**
      * Converts an HSV (hue, saturation and value) color value to RGB.
      * Conversion formula from http://en.wikipedia.org/wiki/HSL_color_space.
      * Assumes HSV values are contained in the set [0, 1].
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      * @param h The hue, in the range 0 - 1. This is the base color.
      * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
      * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      * @param out A Color object to store the results in. If not given a new ColorObject will be created.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.HSVToRGB")
    @js.native
    def HSVToRGB(h: Double, s: Double, v: Double): ColorObject | typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.HSVToRGB")
    @js.native
    def HSVToRGB(h: Double, s: Double, v: Double, out: typings.phaser.Phaser.Display.Color): ColorObject | typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.HSVToRGB")
    @js.native
    def HSVToRGB(h: Double, s: Double, v: Double, out: ColorObject): ColorObject | typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts a hex string into a Phaser Color object.
      * 
      * The hex string can supplied as `'#0033ff'` or the short-hand format of `'#03f'`; it can begin with an optional "#" or "0x", or be unprefixed.
      * 
      * An alpha channel is _not_ supported.
      * @param hex The hex color value to convert, such as `#0033ff` or the short-hand format: `#03f`.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.HexStringToColor")
    @js.native
    def HexStringToColor(hex: String): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts a hue to an RGB color.
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      */
    /* static member */
    @JSImport("phaser", "Display.Color.HueToComponent")
    @js.native
    def HueToComponent(p: Double, q: Double, t: Double): Double = js.native
    
    /**
      * Converts the given color value into an instance of a Color object.
      * @param input The color value to convert into a Color object.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.IntegerToColor")
    @js.native
    def IntegerToColor(input: integer): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Return the component parts of a color as an Object with the properties alpha, red, green, blue.
      * 
      * Alpha will only be set if it exists in the given color (0xAARRGGBB)
      * @param input The color value to convert into a Color object.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.IntegerToRGB")
    @js.native
    def IntegerToRGB(input: integer): ColorObject = js.native
    
    object Interpolate {
      
      /**
        * Interpolates between the two given color objects over the length supplied.
        * @param color1 The first Color object.
        * @param color2 The second Color object.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithColor")
      @js.native
      def ColorWithColor(color1: typings.phaser.Phaser.Display.Color, color2: typings.phaser.Phaser.Display.Color): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithColor")
      @js.native
      def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: js.UndefOr[scala.Nothing],
        index: Double
      ): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithColor")
      @js.native
      def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: Double
      ): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithColor")
      @js.native
      def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: Double,
        index: Double
      ): ColorObject = js.native
      
      /**
        * Interpolates between the Color object and color values over the length supplied.
        * @param color1 The first Color object.
        * @param r Red value.
        * @param g Blue value.
        * @param b Green value.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithRGB")
      @js.native
      def ColorWithRGB(color1: typings.phaser.Phaser.Display.Color, r: Double, g: Double, b: Double): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithRGB")
      @js.native
      def ColorWithRGB(
        color1: typings.phaser.Phaser.Display.Color,
        r: Double,
        g: Double,
        b: Double,
        length: js.UndefOr[scala.Nothing],
        index: Double
      ): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithRGB")
      @js.native
      def ColorWithRGB(color1: typings.phaser.Phaser.Display.Color, r: Double, g: Double, b: Double, length: Double): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.ColorWithRGB")
      @js.native
      def ColorWithRGB(
        color1: typings.phaser.Phaser.Display.Color,
        r: Double,
        g: Double,
        b: Double,
        length: Double,
        index: Double
      ): ColorObject = js.native
      
      /**
        * Interpolates between the two given color ranges over the length supplied.
        * @param r1 Red value.
        * @param g1 Blue value.
        * @param b1 Green value.
        * @param r2 Red value.
        * @param g2 Blue value.
        * @param b2 Green value.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      @JSImport("phaser", "Display.Color.Interpolate.RGBWithRGB")
      @js.native
      def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.RGBWithRGB")
      @js.native
      def RGBWithRGB(
        r1: Double,
        g1: Double,
        b1: Double,
        r2: Double,
        g2: Double,
        b2: Double,
        length: js.UndefOr[scala.Nothing],
        index: Double
      ): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.RGBWithRGB")
      @js.native
      def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double, length: Double): ColorObject = js.native
      @JSImport("phaser", "Display.Color.Interpolate.RGBWithRGB")
      @js.native
      def RGBWithRGB(
        r1: Double,
        g1: Double,
        b1: Double,
        r2: Double,
        g2: Double,
        b2: Double,
        length: Double,
        index: Double
      ): ColorObject = js.native
    }
    
    /**
      * Converts an object containing `r`, `g`, `b` and `a` properties into a Color class instance.
      * @param input An object containing `r`, `g`, `b` and `a` properties in the range 0 to 255.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.ObjectToColor")
    @js.native
    def ObjectToColor(input: InputColorObject): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts a CSS 'web' string into a Phaser Color object.
      * 
      * The web string can be in the format `'rgb(r,g,b)'` or `'rgba(r,g,b,a)'` where r/g/b are in the range [0..255] and a is in the range [0..1].
      * @param rgb The CSS format color string, using the `rgb` or `rgba` format.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.RGBStringToColor")
    @js.native
    def RGBStringToColor(rgb: String): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts an RGB color value to HSV (hue, saturation and value).
      * Conversion formula from http://en.wikipedia.org/wiki/HSL_color_space.
      * Assumes RGB values are contained in the set [0, 255] and returns h, s and v in the set [0, 1].
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      * @param r The red color value. A number between 0 and 255.
      * @param g The green color value. A number between 0 and 255.
      * @param b The blue color value. A number between 0 and 255.
      * @param out An object to store the color values in. If not given an HSV Color Object will be created.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.RGBToHSV")
    @js.native
    def RGBToHSV(r: integer, g: integer, b: integer): HSVColorObject | typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.RGBToHSV")
    @js.native
    def RGBToHSV(r: integer, g: integer, b: integer, out: typings.phaser.Phaser.Display.Color): HSVColorObject | typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.RGBToHSV")
    @js.native
    def RGBToHSV(r: integer, g: integer, b: integer, out: HSVColorObject): HSVColorObject | typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts the color values into an HTML compatible color string, prefixed with either `#` or `0x`.
      * @param r The red color value. A number between 0 and 255.
      * @param g The green color value. A number between 0 and 255.
      * @param b The blue color value. A number between 0 and 255.
      * @param a The alpha value. A number between 0 and 255. Default 255.
      * @param prefix The prefix of the string. Either `#` or `0x`. Default #.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.RGBToString")
    @js.native
    def RGBToString(r: integer, g: integer, b: integer): String = js.native
    @JSImport("phaser", "Display.Color.RGBToString")
    @js.native
    def RGBToString(r: integer, g: integer, b: integer, a: js.UndefOr[scala.Nothing], prefix: String): String = js.native
    @JSImport("phaser", "Display.Color.RGBToString")
    @js.native
    def RGBToString(r: integer, g: integer, b: integer, a: integer): String = js.native
    @JSImport("phaser", "Display.Color.RGBToString")
    @js.native
    def RGBToString(r: integer, g: integer, b: integer, a: integer, prefix: String): String = js.native
    
    /**
      * Creates a new Color object where the r, g, and b values have been set to random values
      * based on the given min max values.
      * @param min The minimum value to set the random range from (between 0 and 255) Default 0.
      * @param max The maximum value to set the random range from (between 0 and 255) Default 255.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.RandomRGB")
    @js.native
    def RandomRGB(): typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.RandomRGB")
    @js.native
    def RandomRGB(min: js.UndefOr[scala.Nothing], max: integer): typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.RandomRGB")
    @js.native
    def RandomRGB(min: integer): typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.RandomRGB")
    @js.native
    def RandomRGB(min: integer, max: integer): typings.phaser.Phaser.Display.Color = js.native
    
    /**
      * Converts the given source color value into an instance of a Color class.
      * The value can be either a string, prefixed with `rgb` or a hex string, a number or an Object.
      * @param input The source color value to convert.
      */
    /* static member */
    @JSImport("phaser", "Display.Color.ValueToColor")
    @js.native
    def ValueToColor(input: String): typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.ValueToColor")
    @js.native
    def ValueToColor(input: Double): typings.phaser.Phaser.Display.Color = js.native
    @JSImport("phaser", "Display.Color.ValueToColor")
    @js.native
    def ValueToColor(input: InputColorObject): typings.phaser.Phaser.Display.Color = js.native
  }
  
  object Masks {
    
    /**
      * A Bitmap Mask combines the alpha (opacity) of a masked pixel with the alpha of another pixel.
      * Unlike the Geometry Mask, which is a clipping path, a Bitmap Mask behaves like an alpha mask,
      * not a clipping path. It is only available when using the WebGL Renderer.
      * 
      * A Bitmap Mask can use any Game Object to determine the alpha of each pixel of the masked Game Object(s).
      * For any given point of a masked Game Object's texture, the pixel's alpha will be multiplied by the alpha
      * of the pixel at the same position in the Bitmap Mask's Game Object. The color of the pixel from the
      * Bitmap Mask doesn't matter.
      * 
      * For example, if a pure blue pixel with an alpha of 0.95 is masked with a pure red pixel with an
      * alpha of 0.5, the resulting pixel will be pure blue with an alpha of 0.475. Naturally, this means
      * that a pixel in the mask with an alpha of 0 will hide the corresponding pixel in all masked Game Objects
      *  A pixel with an alpha of 1 in the masked Game Object will receive the same alpha as the
      * corresponding pixel in the mask.
      * 
      * The Bitmap Mask's location matches the location of its Game Object, not the location of the
      * masked objects. Moving or transforming the underlying Game Object will change the mask
      * (and affect the visibility of any masked objects), whereas moving or transforming a masked object
      * will not affect the mask.
      * 
      * The Bitmap Mask will not render its Game Object by itself. If the Game Object is not in a
      * Scene's display list, it will only be used for the mask and its full texture will not be directly
      * visible. Adding the underlying Game Object to a Scene will not cause any problems - it will
      * render as a normal Game Object and will also serve as a mask.
      */
    @JSImport("phaser", "Display.Masks.BitmapMask")
    @js.native
    class BitmapMask protected ()
      extends typings.phaser.Phaser.Display.Masks.BitmapMask {
      /**
        * 
        * @param scene The Scene which this Bitmap Mask will be used in.
        * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
        */
      def this(scene: typings.phaser.Phaser.Scene, renderable: GameObject) = this()
    }
    
    /**
      * A Geometry Mask can be applied to a Game Object to hide any pixels of it which don't intersect
      * a visible pixel from the geometry mask. The mask is essentially a clipping path which can only
      * make a masked pixel fully visible or fully invisible without changing its alpha (opacity).
      * 
      * A Geometry Mask uses a Graphics Game Object to determine which pixels of the masked Game Object(s)
      * should be clipped. For any given point of a masked Game Object's texture, the pixel will only be displayed
      * if the Graphics Game Object of the Geometry Mask has a visible pixel at the same position. The color and
      * alpha of the pixel from the Geometry Mask do not matter.
      * 
      * The Geometry Mask's location matches the location of its Graphics object, not the location of the masked objects.
      * Moving or transforming the underlying Graphics object will change the mask (and affect the visibility
      * of any masked objects), whereas moving or transforming a masked object will not affect the mask.
      * You can think of the Geometry Mask (or rather, of its Graphics object) as an invisible curtain placed
      * in front of all masked objects which has its own visual properties and, naturally, respects the camera's
      * visual properties, but isn't affected by and doesn't follow the masked objects by itself.
      */
    @JSImport("phaser", "Display.Masks.GeometryMask")
    @js.native
    class GeometryMask protected ()
      extends typings.phaser.Phaser.Display.Masks.GeometryMask {
      /**
        * 
        * @param scene This parameter is not used.
        * @param graphicsGeometry The Graphics Game Object to use for the Geometry Mask. Doesn't have to be in the Display List.
        */
      def this(scene: typings.phaser.Phaser.Scene, graphicsGeometry: Graphics) = this()
    }
  }
}

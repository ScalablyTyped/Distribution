package typings.phaser.phaserMod

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Types.Display.ColorObject
import typings.phaser.Phaser.Types.Display.HSVColorObject
import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  object Align {
    
    /**
      * A constant representing a bottom-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_CENTER")
    @js.native
    val BOTTOM_CENTER: Double = js.native
    
    /**
      * A constant representing a bottom-left alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_LEFT")
    @js.native
    val BOTTOM_LEFT: Double = js.native
    
    /**
      * A constant representing a bottom-right alignment or position.
      */
    @JSImport("phaser", "Display.Align.BOTTOM_RIGHT")
    @js.native
    val BOTTOM_RIGHT: Double = js.native
    
    /**
      * A constant representing a center alignment or position.
      */
    @JSImport("phaser", "Display.Align.CENTER")
    @js.native
    val CENTER: Double = js.native
    
    object In {
      
      @JSImport("phaser", "Display.Align.In")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the left center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned relative to the other.
        * The alignment used is based on the `position` argument, which is an `ALIGN_CONST` value, such as `LEFT_CENTER` or `TOP_RIGHT`.
        * @param child The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param position The position to align the Game Object with. This is an align constant, such as `ALIGN_CONST.LEFT_CENTER`.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: Double, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: Double, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: Double, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the right center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignIn.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
    }
    
    /**
      * A constant representing a left-bottom alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_BOTTOM")
    @js.native
    val LEFT_BOTTOM: Double = js.native
    
    /**
      * A constant representing a left-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_CENTER")
    @js.native
    val LEFT_CENTER: Double = js.native
    
    /**
      * A constant representing a left-top alignment or position.
      */
    @JSImport("phaser", "Display.Align.LEFT_TOP")
    @js.native
    val LEFT_TOP: Double = js.native
    
    /**
      * A constant representing a right-bottom alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_BOTTOM")
    @js.native
    val RIGHT_BOTTOM: Double = js.native
    
    /**
      * A constant representing a right-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_CENTER")
    @js.native
    val RIGHT_CENTER: Double = js.native
    
    /**
      * A constant representing a right-top alignment or position.
      */
    @JSImport("phaser", "Display.Align.RIGHT_TOP")
    @js.native
    val RIGHT_TOP: Double = js.native
    
    /**
      * A constant representing a top-center alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_CENTER")
    @js.native
    val TOP_CENTER: Double = js.native
    
    /**
      * A constant representing a top-left alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_LEFT")
    @js.native
    val TOP_LEFT: Double = js.native
    
    /**
      * A constant representing a top-right alignment or position.
      */
    @JSImport("phaser", "Display.Align.TOP_RIGHT")
    @js.native
    val TOP_RIGHT: Double = js.native
    
    object To {
      
      @JSImport("phaser", "Display.Align.To")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("BottomRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("LeftTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes a Game Object and aligns it next to another, at the given position.
        * The alignment used is based on the `position` argument, which is a `Phaser.Display.Align` property such as `LEFT_CENTER` or `TOP_RIGHT`.
        * @param child The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param position The position to align the Game Object with. This is an align constant, such as `Phaser.Display.Align.LEFT_CENTER`.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: Double, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: Double, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def QuickSet[G /* <: GameObject */](child: G, alignTo: GameObject, position: Double, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("QuickSet")(child.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], position.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightBottom")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("RightTop")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopCenter")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopLeft")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
      inline def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Unit, offsetY: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("TopRight")(gameObject.asInstanceOf[js.Any], alignTo.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[G]
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
  open class BaseShader protected ()
    extends StObject
       with typings.phaser.Phaser.Display.BaseShader {
    /**
      * 
      * @param key The key of this shader. Must be unique within the shader cache.
      * @param fragmentSrc The fragment source for the shader.
      * @param vertexSrc The vertex source for the shader.
      * @param uniforms Optional object defining the uniforms the shader uses.
      */
    def this(key: String) = this()
    def this(key: String, fragmentSrc: String) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String) = this()
    def this(key: String, fragmentSrc: Unit, vertexSrc: String) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String, uniforms: Any) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: Unit, uniforms: Any) = this()
    def this(key: String, fragmentSrc: Unit, vertexSrc: String, uniforms: Any) = this()
    def this(key: String, fragmentSrc: Unit, vertexSrc: Unit, uniforms: Any) = this()
    
    /**
      * The source code, as a string, of the fragment shader being used.
      */
    /* CompleteClass */
    var fragmentSrc: String = js.native
    
    /**
      * The key of this shader, unique within the shader cache of this Phaser game instance.
      */
    /* CompleteClass */
    var key: String = js.native
    
    /**
      * The default uniforms for this shader.
      */
    /* CompleteClass */
    var uniforms: Any = js.native
    
    /**
      * The source code, as a string, of the vertex shader being used.
      */
    /* CompleteClass */
    var vertexSrc: String = js.native
  }
  
  object Bounds {
    
    @JSImport("phaser", "Display.Bounds")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Positions the Game Object so that it is centered on the given coordinates.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The horizontal coordinate to position the Game Object on.
      * @param y The vertical coordinate to position the Game Object on.
      */
    inline def CenterOn[G /* <: GameObject */](gameObject: G, x: Double, y: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("CenterOn")(gameObject.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Returns the bottom coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetBottom(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBottom")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the unrotated bounds of the Game Object as a rectangle.
      * @param gameObject The Game Object to get the bounds value from.
      * @param output An object to store the values in.
      */
    inline def GetBounds(gameObject: GameObject): Rectangle | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Rectangle | js.Object]
    inline def GetBounds(gameObject: GameObject, output: js.Object): Rectangle | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(gameObject.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Rectangle | js.Object]
    inline def GetBounds(gameObject: GameObject, output: Rectangle): Rectangle | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("GetBounds")(gameObject.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Rectangle | js.Object]
    
    /**
      * Returns the center x coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetCenterX(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCenterX")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the center y coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetCenterY(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCenterY")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the left coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetLeft(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLeft")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the amount the Game Object is visually offset from its x coordinate.
      * This is the same as `width * origin.x`.
      * This value will only be > 0 if `origin.x` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetOffsetX(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOffsetX")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the amount the Game Object is visually offset from its y coordinate.
      * This is the same as `width * origin.y`.
      * This value will only be > 0 if `origin.y` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetOffsetY(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOffsetY")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the right coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetRight(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRight")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Returns the top coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    inline def GetTop(gameObject: GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTop")(gameObject.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Positions the Game Object so that the bottom of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    inline def SetBottom[G /* <: GameObject */](gameObject: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetBottom")(gameObject.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The coordinate to position the Game Object bounds on.
      */
    inline def SetCenterX[G /* <: GameObject */](gameObject: G, x: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCenterX")(gameObject.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param y The coordinate to position the Game Object bounds on.
      */
    inline def SetCenterY[G /* <: GameObject */](gameObject: G, y: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetCenterY")(gameObject.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    inline def SetLeft[G /* <: GameObject */](gameObject: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetLeft")(gameObject.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    inline def SetRight[G /* <: GameObject */](gameObject: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetRight")(gameObject.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
    
    /**
      * Positions the Game Object so that the top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    inline def SetTop[G /* <: GameObject */](gameObject: G, value: Double): G = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTop")(gameObject.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[G]
  }
  
  object Canvas {
    
    @JSImport("phaser", "Display.Canvas")
    @js.native
    val ^ : js.Any = js.native
    
    object CanvasInterpolation {
      
      @JSImport("phaser", "Display.Canvas.CanvasInterpolation")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'bicubic' (aka 'auto').
        * @param canvas The canvas object to have the style set on.
        */
      inline def setBicubic(canvas: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("setBicubic")(canvas.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
      
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'crisp' (aka 'optimize contrast' on webkit).
        * @param canvas The canvas object to have the style set on.
        */
      inline def setCrisp(canvas: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("setCrisp")(canvas.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
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
      
      @JSImport("phaser", "Display.Canvas.CanvasPool")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        * @param selfParent Use the generated Canvas element as the parent? Default false.
        */
      inline def create(parent: Any): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Double, canvasType: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Double, canvasType: Double, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Double, canvasType: Unit, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Unit, canvasType: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Unit, canvasType: Double, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Double, height: Unit, canvasType: Unit, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Double, canvasType: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Double, canvasType: Double, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Double, canvasType: Unit, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Unit, canvasType: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Unit, canvasType: Double, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create(parent: Any, width: Unit, height: Unit, canvasType: Unit, selfParent: Boolean): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], canvasType.asInstanceOf[js.Any], selfParent.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      inline def create2D(parent: Any): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create2D")(parent.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
      inline def create2D(parent: Any, width: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create2D")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create2D(parent: Any, width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create2D")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def create2D(parent: Any, width: Unit, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create2D")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      inline def createWebGL(parent: Any): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebGL")(parent.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
      inline def createWebGL(parent: Any, width: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebGL")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def createWebGL(parent: Any, width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebGL")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      inline def createWebGL(parent: Any, width: Unit, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebGL")(parent.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
      
      /**
        * Disable context smoothing on any new Canvas element created.
        */
      inline def disableSmoothing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableSmoothing")().asInstanceOf[Unit]
      
      /**
        * Enable context smoothing on any new Canvas element created.
        */
      inline def enableSmoothing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableSmoothing")().asInstanceOf[Unit]
      
      /**
        * Gets the first free canvas index from the pool.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        */
      inline def first(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("first")().asInstanceOf[HTMLCanvasElement]
      inline def first(canvasType: Double): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("first")(canvasType.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
      
      /**
        * Gets the total number of free canvas elements in the pool.
        */
      inline def free(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("free")().asInstanceOf[Double]
      
      /**
        * Looks up a canvas based on its parent, and if found puts it back in the pool, freeing it up for re-use.
        * The canvas has its width and height set to 1, and its parent attribute nulled.
        * @param parent The canvas or the parent of the canvas to free.
        */
      inline def remove(parent: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Gets the total number of used canvas elements in the pool.
        */
      inline def total(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("total")().asInstanceOf[Double]
    }
    
    object Smoothing {
      
      @JSImport("phaser", "Display.Canvas.Smoothing")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to disable smoothing.
        */
      inline def disable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(context.asInstanceOf[js.Any]).asInstanceOf[CanvasRenderingContext2D | WebGLRenderingContext]
      inline def disable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(context.asInstanceOf[js.Any]).asInstanceOf[CanvasRenderingContext2D | WebGLRenderingContext]
      
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to enable smoothing.
        */
      inline def enable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(context.asInstanceOf[js.Any]).asInstanceOf[CanvasRenderingContext2D | WebGLRenderingContext]
      inline def enable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(context.asInstanceOf[js.Any]).asInstanceOf[CanvasRenderingContext2D | WebGLRenderingContext]
      
      /**
        * Gets the Smoothing Enabled vendor prefix being used on the given context, or null if not set.
        * @param context The canvas context to check.
        */
      inline def getPrefix(context: CanvasRenderingContext2D): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(context.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def getPrefix(context: WebGLRenderingContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(context.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Returns `true` if the given context has image smoothing enabled, otherwise returns `false`.
        * Returns null if no smoothing prefix is available.
        * @param context The context to check.
        */
      inline def isEnabled(context: CanvasRenderingContext2D): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isEnabled(context: WebGLRenderingContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    /**
      * Sets the touch-action property on the canvas style. Can be used to disable default browser touch actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch action value to set on the canvas. Set to `none` to disable touch actions. Default 'none'.
      */
    inline def TouchAction(canvas: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TouchAction")(canvas.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
    inline def TouchAction(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("TouchAction")(canvas.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
    
    /**
      * Sets the user-select property on the canvas style. Can be used to disable default browser selection actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch callout value to set on the canvas. Set to `none` to disable touch callouts. Default 'none'.
      */
    inline def UserSelect(canvas: HTMLCanvasElement): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("UserSelect")(canvas.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
    inline def UserSelect(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("UserSelect")(canvas.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
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
  open class Color ()
    extends StObject
       with typings.phaser.Phaser.Display.Color {
    def this(red: Double) = this()
    def this(red: Double, green: Double) = this()
    def this(red: Unit, green: Double) = this()
    def this(red: Double, green: Double, blue: Double) = this()
    def this(red: Double, green: Unit, blue: Double) = this()
    def this(red: Unit, green: Double, blue: Double) = this()
    def this(red: Unit, green: Unit, blue: Double) = this()
    def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
    def this(red: Double, green: Double, blue: Unit, alpha: Double) = this()
    def this(red: Double, green: Unit, blue: Double, alpha: Double) = this()
    def this(red: Double, green: Unit, blue: Unit, alpha: Double) = this()
    def this(red: Unit, green: Double, blue: Double, alpha: Double) = this()
    def this(red: Unit, green: Double, blue: Unit, alpha: Double) = this()
    def this(red: Unit, green: Unit, blue: Double, alpha: Double) = this()
    def this(red: Unit, green: Unit, blue: Unit, alpha: Double) = this()
  }
  object Color {
    
    @JSImport("phaser", "Display.Color")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Return an array of Colors in a Color Spectrum.
      * 
      * The spectrum colors flow in the order: red, yellow, green, blue.
      * 
      * By default this function will return an array with 1024 elements in.
      * 
      * However, you can reduce this to a smaller quantity if needed, by specitying the `limit` parameter.
      * @param limit How many colors should be returned? The maximum is 1024 but you can set a smaller quantity if required. Default 1024.
      */
    /* static member */
    inline def ColorSpectrum(): js.Array[ColorObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorSpectrum")().asInstanceOf[js.Array[ColorObject]]
    inline def ColorSpectrum(limit: Double): js.Array[ColorObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorSpectrum")(limit.asInstanceOf[js.Any]).asInstanceOf[js.Array[ColorObject]]
    
    /**
      * Converts the given color value into an Object containing r,g,b and a properties.
      * @param color A color value, optionally including the alpha value.
      */
    /* static member */
    inline def ColorToRGBA(color: Double): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("ColorToRGBA")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
    
    /**
      * Returns a string containing a hex representation of the given color component.
      * @param color The color channel to get the hex value for, must be a value between 0 and 255.
      */
    /* static member */
    inline def ComponentToHex(color: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ComponentToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Given 3 separate color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      */
    /* static member */
    inline def GetColor(red: Double, green: Double, blue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetColor")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Given an alpha and 3 color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      * @param alpha The alpha color value. A number between 0 and 255.
      */
    /* static member */
    inline def GetColor32(red: Double, green: Double, blue: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetColor32")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts HSL (hue, saturation and lightness) values to a Phaser Color object.
      * @param h The hue value in the range 0 to 1.
      * @param s The saturation value in the range 0 to 1.
      * @param l The lightness value in the range 0 to 1.
      */
    /* static member */
    inline def HSLToColor(h: Double, s: Double, l: Double): typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("HSLToColor")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
    /**
      * Get HSV color wheel values in an array which will be 360 elements in size.
      * @param s The saturation, in the range 0 - 1. Default 1.
      * @param v The value, in the range 0 - 1. Default 1.
      */
    /* static member */
    inline def HSVColorWheel(): js.Array[ColorObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("HSVColorWheel")().asInstanceOf[js.Array[ColorObject]]
    inline def HSVColorWheel(s: Double): js.Array[ColorObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("HSVColorWheel")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[ColorObject]]
    inline def HSVColorWheel(s: Double, v: Double): js.Array[ColorObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVColorWheel")(s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[ColorObject]]
    inline def HSVColorWheel(s: Unit, v: Double): js.Array[ColorObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVColorWheel")(s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[ColorObject]]
    
    /**
      * Converts a HSV (hue, saturation and value) color set to RGB.
      * 
      * Conversion formula from https://en.wikipedia.org/wiki/HSL_and_HSV
      * 
      * Assumes HSV values are contained in the set [0, 1].
      * @param h The hue, in the range 0 - 1. This is the base color.
      * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
      * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      * @param out A Color object to store the results in. If not given a new ColorObject will be created.
      */
    /* static member */
    inline def HSVToRGB(h: Double, s: Double, v: Double): ColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVToRGB")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ColorObject | typings.phaser.Phaser.Display.Color]
    inline def HSVToRGB(h: Double, s: Double, v: Double, out: typings.phaser.Phaser.Display.Color): ColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVToRGB")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[ColorObject | typings.phaser.Phaser.Display.Color]
    inline def HSVToRGB(h: Double, s: Double, v: Double, out: ColorObject): ColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("HSVToRGB")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[ColorObject | typings.phaser.Phaser.Display.Color]
    
    /**
      * Converts a hex string into a Phaser Color object.
      * 
      * The hex string can supplied as `'#0033ff'` or the short-hand format of `'#03f'`; it can begin with an optional "#" or "0x", or be unprefixed.
      * 
      * An alpha channel is _not_ supported.
      * @param hex The hex color value to convert, such as `#0033ff` or the short-hand format: `#03f`.
      */
    /* static member */
    inline def HexStringToColor(hex: String): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("HexStringToColor")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
    /**
      * Converts a hue to an RGB color.
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      */
    /* static member */
    inline def HueToComponent(p: Double, q: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HueToComponent")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Converts the given color value into an instance of a Color object.
      * @param input The color value to convert into a Color object.
      */
    /* static member */
    inline def IntegerToColor(input: Double): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("IntegerToColor")(input.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
    /**
      * Return the component parts of a color as an Object with the properties alpha, red, green, blue.
      * 
      * Alpha will only be set if it exists in the given color (0xAARRGGBB)
      * @param input The color value to convert into a Color object.
      */
    /* static member */
    inline def IntegerToRGB(input: Double): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("IntegerToRGB")(input.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
    
    object Interpolate {
      
      @JSImport("phaser", "Display.Color.Interpolate")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Interpolates between the two given color objects over the length supplied.
        * @param color1 The first Color object.
        * @param color2 The second Color object.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      inline def ColorWithColor(color1: typings.phaser.Phaser.Display.Color, color2: typings.phaser.Phaser.Display.Color): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithColor")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithColor")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: Double,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithColor")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithColor(
        color1: typings.phaser.Phaser.Display.Color,
        color2: typings.phaser.Phaser.Display.Color,
        length: Unit,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithColor")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      
      /**
        * Interpolates between the Color object and color values over the length supplied.
        * @param color1 The first Color object.
        * @param r Red value.
        * @param g Blue value.
        * @param b Green value.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      inline def ColorWithRGB(color1: typings.phaser.Phaser.Display.Color, r: Double, g: Double, b: Double): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithRGB")(color1.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithRGB(color1: typings.phaser.Phaser.Display.Color, r: Double, g: Double, b: Double, length: Double): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithRGB")(color1.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithRGB(
        color1: typings.phaser.Phaser.Display.Color,
        r: Double,
        g: Double,
        b: Double,
        length: Double,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithRGB")(color1.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def ColorWithRGB(
        color1: typings.phaser.Phaser.Display.Color,
        r: Double,
        g: Double,
        b: Double,
        length: Unit,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ColorWithRGB")(color1.asInstanceOf[js.Any], r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      
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
      inline def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBWithRGB")(r1.asInstanceOf[js.Any], g1.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], g2.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double, length: Double): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBWithRGB")(r1.asInstanceOf[js.Any], g1.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], g2.asInstanceOf[js.Any], b2.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def RGBWithRGB(
        r1: Double,
        g1: Double,
        b1: Double,
        r2: Double,
        g2: Double,
        b2: Double,
        length: Double,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBWithRGB")(r1.asInstanceOf[js.Any], g1.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], g2.asInstanceOf[js.Any], b2.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
      inline def RGBWithRGB(
        r1: Double,
        g1: Double,
        b1: Double,
        r2: Double,
        g2: Double,
        b2: Double,
        length: Unit,
        index: Double
      ): ColorObject = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBWithRGB")(r1.asInstanceOf[js.Any], g1.asInstanceOf[js.Any], b1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], g2.asInstanceOf[js.Any], b2.asInstanceOf[js.Any], length.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ColorObject]
    }
    
    /**
      * Converts an object containing `r`, `g`, `b` and `a` properties into a Color class instance.
      * @param input An object containing `r`, `g`, `b` and `a` properties in the range 0 to 255.
      */
    /* static member */
    inline def ObjectToColor(input: InputColorObject): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectToColor")(input.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
    /**
      * Converts a CSS 'web' string into a Phaser Color object.
      * 
      * The web string can be in the format `'rgb(r,g,b)'` or `'rgba(r,g,b,a)'` where r/g/b are in the range [0..255] and a is in the range [0..1].
      * @param rgb The CSS format color string, using the `rgb` or `rgba` format.
      */
    /* static member */
    inline def RGBStringToColor(rgb: String): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBStringToColor")(rgb.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
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
    inline def RGBToHSV(r: Double, g: Double, b: Double): HSVColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToHSV")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSVColorObject | typings.phaser.Phaser.Display.Color]
    inline def RGBToHSV(r: Double, g: Double, b: Double, out: typings.phaser.Phaser.Display.Color): HSVColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToHSV")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[HSVColorObject | typings.phaser.Phaser.Display.Color]
    inline def RGBToHSV(r: Double, g: Double, b: Double, out: HSVColorObject): HSVColorObject | typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToHSV")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[HSVColorObject | typings.phaser.Phaser.Display.Color]
    
    /**
      * Converts the color values into an HTML compatible color string, prefixed with either `#` or `0x`.
      * @param r The red color value. A number between 0 and 255.
      * @param g The green color value. A number between 0 and 255.
      * @param b The blue color value. A number between 0 and 255.
      * @param a The alpha value. A number between 0 and 255. Default 255.
      * @param prefix The prefix of the string. Either `#` or `0x`. Default #.
      */
    /* static member */
    inline def RGBToString(r: Double, g: Double, b: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToString")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def RGBToString(r: Double, g: Double, b: Double, a: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToString")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def RGBToString(r: Double, g: Double, b: Double, a: Double, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToString")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def RGBToString(r: Double, g: Double, b: Double, a: Unit, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBToString")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any], a.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Creates a new Color object where the r, g, and b values have been set to random values
      * based on the given min max values.
      * @param min The minimum value to set the random range from (between 0 and 255) Default 0.
      * @param max The maximum value to set the random range from (between 0 and 255) Default 255.
      */
    /* static member */
    inline def RandomRGB(): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomRGB")().asInstanceOf[typings.phaser.Phaser.Display.Color]
    inline def RandomRGB(min: Double): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomRGB")(min.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    inline def RandomRGB(min: Double, max: Double): typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomRGB")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Display.Color]
    inline def RandomRGB(min: Unit, max: Double): typings.phaser.Phaser.Display.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("RandomRGB")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.Display.Color]
    
    /**
      * Converts the given source color value into an instance of a Color class.
      * The value can be either a string, prefixed with `rgb` or a hex string, a number or an Object.
      * @param input The source color value to convert.
      */
    /* static member */
    inline def ValueToColor(input: String): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueToColor")(input.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    inline def ValueToColor(input: Double): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueToColor")(input.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
    inline def ValueToColor(input: InputColorObject): typings.phaser.Phaser.Display.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueToColor")(input.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Display.Color]
  }
  
  /**
    * The ColorMatrix class creates a 5x4 matrix that can be used in shaders and graphics
    * operations. It provides methods required to modify the color values, such as adjusting
    * the brightness, setting a sepia tone, hue rotation and more.
    * 
    * Use the method `getData` to return a Float32Array containing the current color values.
    */
  @JSImport("phaser", "Display.ColorMatrix")
  @js.native
  open class ColorMatrix ()
    extends StObject
       with typings.phaser.Phaser.Display.ColorMatrix
  
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
      * Note: You cannot combine Bitmap Masks and Blend Modes on the same Game Object. You can, however,
      * combine Geometry Masks and Blend Modes together.
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
    open class BitmapMask protected ()
      extends StObject
         with typings.phaser.Phaser.Display.Masks.BitmapMask {
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
    open class GeometryMask protected ()
      extends StObject
         with typings.phaser.Phaser.Display.Masks.GeometryMask {
      /**
        * 
        * @param scene This parameter is not used.
        * @param graphicsGeometry The Graphics Game Object to use for the Geometry Mask. Doesn't have to be in the Display List.
        */
      def this(scene: typings.phaser.Phaser.Scene, graphicsGeometry: Graphics) = this()
    }
  }
  
  /**
    * The RGB class holds a single color value and allows for easy modification and reading of it,
    * with optional on-change callback notification and a dirty flag.
    */
  @JSImport("phaser", "Display.RGB")
  @js.native
  /**
    * 
    * @param red The red color value. A number between 0 and 1. Default 0.
    * @param green The green color value. A number between 0 and 1. Default 0.
    * @param blue The blue color value. A number between 0 and 1. Default 0.
    */
  open class RGB ()
    extends StObject
       with typings.phaser.Phaser.Display.RGB {
    def this(red: Double) = this()
    def this(red: Double, green: Double) = this()
    def this(red: Unit, green: Double) = this()
    def this(red: Double, green: Double, blue: Double) = this()
    def this(red: Double, green: Unit, blue: Double) = this()
    def this(red: Unit, green: Double, blue: Double) = this()
    def this(red: Unit, green: Unit, blue: Double) = this()
  }
}

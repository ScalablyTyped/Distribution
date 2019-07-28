package typings.phaser.PhaserNs.DisplayNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Display.Align")
@js.native
object AlignNs extends js.Object {
  /**
    * A constant representing a bottom-center alignment or position.
    */
  val BOTTOM_CENTER: integer = js.native
  /**
    * A constant representing a bottom-left alignment or position.
    */
  val BOTTOM_LEFT: integer = js.native
  /**
    * A constant representing a bottom-right alignment or position.
    */
  val BOTTOM_RIGHT: integer = js.native
  /**
    * A constant representing a center alignment or position.
    */
  val CENTER: integer = js.native
  /**
    * A constant representing a left-bottom alignment or position.
    */
  val LEFT_BOTTOM: integer = js.native
  /**
    * A constant representing a left-center alignment or position.
    */
  val LEFT_CENTER: integer = js.native
  /**
    * A constant representing a left-top alignment or position.
    */
  val LEFT_TOP: integer = js.native
  /**
    * A constant representing a right-bottom alignment or position.
    */
  val RIGHT_BOTTOM: integer = js.native
  /**
    * A constant representing a right-center alignment or position.
    */
  val RIGHT_CENTER: integer = js.native
  /**
    * A constant representing a right-top alignment or position.
    */
  val RIGHT_TOP: integer = js.native
  /**
    * A constant representing a top-center alignment or position.
    */
  val TOP_CENTER: integer = js.native
  /**
    * A constant representing a top-left alignment or position.
    */
  val TOP_LEFT: integer = js.native
  /**
    * A constant representing a top-right alignment or position.
    */
  val TOP_RIGHT: integer = js.native
  @JSName("In")
  @js.native
  object InNs extends js.Object {
    /**
      * Takes given Game Object and aligns it so that it is positioned in the bottom center of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the bottom left of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the bottom right of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the center of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the left center of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
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
    def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer): G = js.native
    def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double): G = js.native
    def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the right center of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the top center of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the top left of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned in the top right of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignIn The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
    def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
    def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
  }
  
  @JSName("To")
  @js.native
  object ToNs extends js.Object {
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the bottom center position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the bottom left position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the bottom right position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the left bottom position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the left center position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the left top position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the right bottom position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the right center position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the right top position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the top center position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the top left position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    /**
      * Takes given Game Object and aligns it so that it is positioned next to the top right position of the other.
      * @param gameObject The Game Object that will be positioned.
      * @param alignTo The Game Object to base the alignment position on.
      * @param offsetX Optional horizontal offset from the position. Default 0.
      * @param offsetY Optional vertical offset from the position. Default 0.
      */
    def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
    def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
    def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
  }
  
}


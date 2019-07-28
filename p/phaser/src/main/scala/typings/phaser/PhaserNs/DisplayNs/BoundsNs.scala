package typings.phaser.PhaserNs.DisplayNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Display.Bounds")
@js.native
object BoundsNs extends js.Object {
  /**
    * Positions the Game Object so that it is centered on the given coordinates.
    * @param gameObject The Game Object that will be re-positioned.
    * @param x The horizontal coordinate to position the Game Object on.
    * @param y The vertical coordinate to position the Game Object on.
    */
  def CenterOn[G /* <: GameObject */](gameObject: G, x: Double, y: Double): G = js.native
  /**
    * Returns the bottom coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetBottom(gameObject: GameObject): Double = js.native
  /**
    * Returns the center x coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetCenterX(gameObject: GameObject): Double = js.native
  /**
    * Returns the center y coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetCenterY(gameObject: GameObject): Double = js.native
  /**
    * Returns the left coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetLeft(gameObject: GameObject): Double = js.native
  /**
    * Returns the amount the Game Object is visually offset from its x coordinate.
    * This is the same as `width * origin.x`.
    * This value will only be > 0 if `origin.x` is not equal to zero.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetOffsetX(gameObject: GameObject): Double = js.native
  /**
    * Returns the amount the Game Object is visually offset from its y coordinate.
    * This is the same as `width * origin.y`.
    * This value will only be > 0 if `origin.y` is not equal to zero.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetOffsetY(gameObject: GameObject): Double = js.native
  /**
    * Returns the right coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetRight(gameObject: GameObject): Double = js.native
  /**
    * Returns the top coordinate from the bounds of the Game Object.
    * @param gameObject The Game Object to get the bounds value from.
    */
  def GetTop(gameObject: GameObject): Double = js.native
  /**
    * Positions the Game Object so that the bottom of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param value The coordinate to position the Game Object bounds on.
    */
  def SetBottom[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
  /**
    * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param x The coordinate to position the Game Object bounds on.
    */
  def SetCenterX[G /* <: GameObject */](gameObject: G, x: Double): G = js.native
  /**
    * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param y The coordinate to position the Game Object bounds on.
    */
  def SetCenterY[G /* <: GameObject */](gameObject: G, y: Double): G = js.native
  /**
    * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param value The coordinate to position the Game Object bounds on.
    */
  def SetLeft[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
  /**
    * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param value The coordinate to position the Game Object bounds on.
    */
  def SetRight[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
  /**
    * Positions the Game Object so that the top of its bounds aligns with the given coordinate.
    * @param gameObject The Game Object that will be re-positioned.
    * @param value The coordinate to position the Game Object bounds on.
    */
  def SetTop[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
}


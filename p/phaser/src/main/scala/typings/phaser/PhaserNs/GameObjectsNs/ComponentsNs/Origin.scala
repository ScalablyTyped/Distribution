package typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for getting and setting the origin of a Game Object.
  * Values are normalized, given in the range 0 to 1.
  * Display values contain the calculated pixel values.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Origin extends js.Object {
  /**
    * The horizontal display origin of this Game Object.
    * The origin is a normalized value between 0 and 1.
    * The displayOrigin is a pixel value, based on the size of the Game Object combined with the origin.
    */
  var displayOriginX: Double = js.native
  /**
    * The vertical display origin of this Game Object.
    * The origin is a normalized value between 0 and 1.
    * The displayOrigin is a pixel value, based on the size of the Game Object combined with the origin.
    */
  var displayOriginY: Double = js.native
  /**
    * The horizontal origin of this Game Object.
    * The origin maps the relationship between the size and position of the Game Object.
    * The default value is 0.5, meaning all Game Objects are positioned based on their center.
    * Setting the value to 0 means the position now relates to the left of the Game Object.
    */
  var originX: Double = js.native
  /**
    * The vertical origin of this Game Object.
    * The origin maps the relationship between the size and position of the Game Object.
    * The default value is 0.5, meaning all Game Objects are positioned based on their center.
    * Setting the value to 0 means the position now relates to the top of the Game Object.
    */
  var originY: Double = js.native
  /**
    * Sets the display origin of this Game Object.
    * The difference between this and setting the origin is that you can use pixel values for setting the display origin.
    * @param x The horizontal display origin value. Default 0.
    * @param y The vertical display origin value. If not defined it will be set to the value of `x`. Default x.
    */
  def setDisplayOrigin(): this.type = js.native
  def setDisplayOrigin(x: Double): this.type = js.native
  def setDisplayOrigin(x: Double, y: Double): this.type = js.native
  /**
    * Sets the origin of this Game Object.
    * 
    * The values are given in the range 0 to 1.
    * @param x The horizontal origin value. Default 0.5.
    * @param y The vertical origin value. If not defined it will be set to the value of `x`. Default x.
    */
  def setOrigin(): this.type = js.native
  def setOrigin(x: Double): this.type = js.native
  def setOrigin(x: Double, y: Double): this.type = js.native
  /**
    * Sets the origin of this Game Object based on the Pivot values in its Frame.
    */
  def setOriginFromFrame(): this.type = js.native
  /**
    * Updates the Display Origin cached values internally stored on this Game Object.
    * You don't usually call this directly, but it is exposed for edge-cases where you may.
    */
  def updateDisplayOrigin(): this.type = js.native
}


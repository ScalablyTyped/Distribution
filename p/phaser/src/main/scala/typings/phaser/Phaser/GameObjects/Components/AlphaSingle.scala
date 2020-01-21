package typings.phaser.Phaser.GameObjects.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the alpha property of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait AlphaSingle extends js.Object {
  /**
    * The alpha value of the Game Object.
    * 
    * This is a global value, impacting the entire Game Object, not just a region of it.
    */
  var alpha: Double = js.native
  /**
    * Clears all alpha values associated with this Game Object.
    * 
    * Immediately sets the alpha levels back to 1 (fully opaque).
    */
  def clearAlpha(): this.type = js.native
  /**
    * Set the Alpha level of this Game Object. The alpha controls the opacity of the Game Object as it renders.
    * Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.
    * @param value The alpha value applied across the whole Game Object. Default 1.
    */
  def setAlpha(): this.type = js.native
  def setAlpha(value: Double): this.type = js.native
}


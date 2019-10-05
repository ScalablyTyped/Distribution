package typings.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the canvas features of the browser running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.canvasFeatures` from within any Scene.
  */
trait CanvasFeatures extends js.Object {
  /**
    * Set to true if the browser supports inversed alpha.
    */
  var supportInverseAlpha: Boolean
  /**
    * Set to true if the browser supports new canvas blend modes.
    */
  var supportNewBlendModes: Boolean
}

object CanvasFeatures {
  @scala.inline
  def apply(supportInverseAlpha: Boolean, supportNewBlendModes: Boolean): CanvasFeatures = {
    val __obj = js.Dynamic.literal(supportInverseAlpha = supportInverseAlpha, supportNewBlendModes = supportNewBlendModes)
  
    __obj.asInstanceOf[CanvasFeatures]
  }
}


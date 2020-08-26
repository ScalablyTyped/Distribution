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
@js.native
trait CanvasFeatures extends js.Object {
  /**
    * Set to true if the browser supports inversed alpha.
    */
  var supportInverseAlpha: Boolean = js.native
  /**
    * Set to true if the browser supports new canvas blend modes.
    */
  var supportNewBlendModes: Boolean = js.native
}

object CanvasFeatures {
  @scala.inline
  def apply(supportInverseAlpha: Boolean, supportNewBlendModes: Boolean): CanvasFeatures = {
    val __obj = js.Dynamic.literal(supportInverseAlpha = supportInverseAlpha.asInstanceOf[js.Any], supportNewBlendModes = supportNewBlendModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFeatures]
  }
  @scala.inline
  implicit class CanvasFeaturesOps[Self <: CanvasFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSupportInverseAlpha(value: Boolean): Self = this.set("supportInverseAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportNewBlendModes(value: Boolean): Self = this.set("supportNewBlendModes", value.asInstanceOf[js.Any])
  }
  
}


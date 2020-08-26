package typings.phaser.Phaser.Types.Cameras.Scene2D

import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraConfig extends js.Object {
  /**
    * A CSS color string controlling the Camera background color.
    */
  var backgroundColor: js.UndefOr[`false` | String] = js.native
  /**
    * Defines the Camera bounds.
    */
  var bounds: js.UndefOr[js.Object] = js.native
  /**
    * The height of the Camera bounds.
    */
  @JSName("bounds.height")
  var boundsDotheight: js.UndefOr[Double] = js.native
  /**
    * The width of the Camera bounds.
    */
  @JSName("bounds.width")
  var boundsDotwidth: js.UndefOr[Double] = js.native
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.x")
  var boundsDotx: js.UndefOr[Double] = js.native
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.y")
  var boundsDoty: js.UndefOr[Double] = js.native
  /**
    * The height of the Camera viewport.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * The name of the Camera.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The rotation of the Camera, in radians.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * Should the Camera round pixels before rendering?
    */
  var roundPixels: js.UndefOr[Boolean] = js.native
  /**
    * The horizontal scroll position of the Camera.
    */
  var scrollX: js.UndefOr[Double] = js.native
  /**
    * The vertical scroll position of the Camera.
    */
  var scrollY: js.UndefOr[Double] = js.native
  /**
    * The width of the Camera viewport.
    */
  var width: js.UndefOr[integer] = js.native
  /**
    * The horizontal position of the Camera viewport.
    */
  var x: js.UndefOr[integer] = js.native
  /**
    * The vertical position of the Camera viewport.
    */
  var y: js.UndefOr[integer] = js.native
  /**
    * The default zoom level of the Camera.
    */
  var zoom: js.UndefOr[Double] = js.native
}

object CameraConfig {
  @scala.inline
  def apply(): CameraConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraConfig]
  }
  @scala.inline
  implicit class CameraConfigOps[Self <: CameraConfig] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: `false` | String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBounds(value: js.Object): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setBoundsDotheight(value: Double): Self = this.set("bounds.height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsDotheight: Self = this.set("bounds.height", js.undefined)
    @scala.inline
    def setBoundsDotwidth(value: Double): Self = this.set("bounds.width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsDotwidth: Self = this.set("bounds.width", js.undefined)
    @scala.inline
    def setBoundsDotx(value: Double): Self = this.set("bounds.x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsDotx: Self = this.set("bounds.x", js.undefined)
    @scala.inline
    def setBoundsDoty(value: Double): Self = this.set("bounds.y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsDoty: Self = this.set("bounds.y", js.undefined)
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setRoundPixels(value: Boolean): Self = this.set("roundPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundPixels: Self = this.set("roundPixels", js.undefined)
    @scala.inline
    def setScrollX(value: Double): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    @scala.inline
    def setScrollY(value: Double): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: integer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: integer): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}


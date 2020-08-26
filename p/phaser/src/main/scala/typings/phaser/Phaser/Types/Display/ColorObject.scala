package typings.phaser.Phaser.Types.Display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorObject extends js.Object {
  /**
    * The alpha color value in the range 0 to 255.
    */
  var a: Double = js.native
  /**
    * The blue color value in the range 0 to 255.
    */
  var b: Double = js.native
  /**
    * The green color value in the range 0 to 255.
    */
  var g: Double = js.native
  /**
    * The red color value in the range 0 to 255.
    */
  var r: Double = js.native
}

object ColorObject {
  @scala.inline
  def apply(a: Double, b: Double, g: Double, r: Double): ColorObject = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorObject]
  }
  @scala.inline
  implicit class ColorObjectOps[Self <: ColorObject] (val x: Self) extends AnyVal {
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
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: Double): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}


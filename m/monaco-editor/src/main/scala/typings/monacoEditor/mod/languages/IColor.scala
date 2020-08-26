package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColor extends js.Object {
  /**
    * The alpha component in the range [0-1].
    */
  val alpha: Double = js.native
  /**
    * The blue component in the range [0-1].
    */
  val blue: Double = js.native
  /**
    * The green component in the range [0-1].
    */
  val green: Double = js.native
  /**
    * The red component in the range [0-1].
    */
  val red: Double = js.native
}

object IColor {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): IColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
  @scala.inline
  implicit class IColorOps[Self <: IColor] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlue(value: Double): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: Double): Self = this.set("red", value.asInstanceOf[js.Any])
  }
  
}


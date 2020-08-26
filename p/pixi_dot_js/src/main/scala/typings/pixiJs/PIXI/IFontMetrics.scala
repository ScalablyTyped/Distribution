package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A number, or a string containing a number.
  *
  * @memberof PIXI
  * @typedef IFontMetrics
  * @property {number} ascent - Font ascent
  * @property {number} descent - Font descent
  * @property {number} fontSize - Font size
  */
@js.native
trait IFontMetrics extends js.Object {
  var ascent: Double = js.native
  var descent: Double = js.native
  var fontSize: Double = js.native
}

object IFontMetrics {
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontMetrics]
  }
  @scala.inline
  implicit class IFontMetricsOps[Self <: IFontMetrics] (val x: Self) extends AnyVal {
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
    def setAscent(value: Double): Self = this.set("ascent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescent(value: Double): Self = this.set("descent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
  }
  
}


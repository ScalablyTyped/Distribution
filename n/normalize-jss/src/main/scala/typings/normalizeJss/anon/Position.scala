package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var fontSize: String = js.native
  var lineHeight: Double = js.native
  var position: String = js.native
  var verticalAlign: String = js.native
}

object Position {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double, position: String, verticalAlign: String): Position = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalAlign(value: String): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
}


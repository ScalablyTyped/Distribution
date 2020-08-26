package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rendered extends js.Object {
  var color: String = js.native
  var rendered: off | auto = js.native
}

object Rendered {
  @scala.inline
  def apply(color: String, rendered: off | auto): Rendered = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rendered]
  }
  @scala.inline
  implicit class RenderedOps[Self <: Rendered] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: off | auto): Self = this.set("rendered", value.asInstanceOf[js.Any])
  }
  
}


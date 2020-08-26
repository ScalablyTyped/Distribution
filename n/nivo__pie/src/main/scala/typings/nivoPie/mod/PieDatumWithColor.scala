package typings.nivoPie.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/pie.@nivo/pie.PieDatum & {  color :string} */
@js.native
trait PieDatumWithColor extends /* key */ StringDictionary[String | Double] {
  var color: String = js.native
  var id: String | Double = js.native
  var value: Double = js.native
}

object PieDatumWithColor {
  @scala.inline
  def apply(color: String, id: String | Double, value: Double): PieDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDatumWithColor]
  }
  @scala.inline
  implicit class PieDatumWithColorOps[Self <: PieDatumWithColor] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


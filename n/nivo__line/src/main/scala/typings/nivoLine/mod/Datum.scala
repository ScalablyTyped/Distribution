package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datum
  extends /* key */ StringDictionary[js.Any] {
  var x: js.UndefOr[DatumValue | Null] = js.native
  var y: js.UndefOr[DatumValue | Null] = js.native
}

object Datum {
  @scala.inline
  def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  @scala.inline
  implicit class DatumOps[Self <: Datum] (val x: Self) extends AnyVal {
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
    def setX(value: DatumValue): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXNull: Self = this.set("x", null)
    @scala.inline
    def setY(value: DatumValue): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYNull: Self = this.set("y", null)
  }
  
}


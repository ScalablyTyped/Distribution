package typings.nivoChord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonData extends js.Object {
  var id: String = js.native
  var source: RibbonSubject = js.native
  var target: RibbonSubject = js.native
}

object RibbonData {
  @scala.inline
  def apply(id: String, source: RibbonSubject, target: RibbonSubject): RibbonData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonData]
  }
  @scala.inline
  implicit class RibbonDataOps[Self <: RibbonData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: RibbonSubject): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: RibbonSubject): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}


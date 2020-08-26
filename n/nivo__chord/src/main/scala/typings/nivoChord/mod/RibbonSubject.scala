package typings.nivoChord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RibbonSubject extends ArcData {
  var subindex: Double = js.native
}

object RibbonSubject {
  @scala.inline
  def apply(
    color: String,
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    label: String,
    startAngle: Double,
    subindex: Double,
    value: Double
  ): RibbonSubject = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], subindex = subindex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonSubject]
  }
  @scala.inline
  implicit class RibbonSubjectOps[Self <: RibbonSubject] (val x: Self) extends AnyVal {
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
    def setSubindex(value: Double): Self = this.set("subindex", value.asInstanceOf[js.Any])
  }
  
}


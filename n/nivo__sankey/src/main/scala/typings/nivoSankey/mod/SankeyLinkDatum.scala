package typings.nivoSankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyLinkDatum extends js.Object {
  var color: String = js.native
  var index: Double = js.native
  var pos0: Double = js.native
  var pos1: Double = js.native
  var source: SankeyNodeDatum = js.native
  var target: SankeyNodeDatum = js.native
  var thickness: Double = js.native
  var value: Double = js.native
}

object SankeyLinkDatum {
  @scala.inline
  def apply(
    color: String,
    index: Double,
    pos0: Double,
    pos1: Double,
    source: SankeyNodeDatum,
    target: SankeyNodeDatum,
    thickness: Double,
    value: Double
  ): SankeyLinkDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pos0 = pos0.asInstanceOf[js.Any], pos1 = pos1.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyLinkDatum]
  }
  @scala.inline
  implicit class SankeyLinkDatumOps[Self <: SankeyLinkDatum] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos0(value: Double): Self = this.set("pos0", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos1(value: Double): Self = this.set("pos1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: SankeyNodeDatum): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: SankeyNodeDatum): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


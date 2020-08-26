package typings.nivoSankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyDataLink extends js.Object {
  var source: String | Double = js.native
  var target: String | Double = js.native
}

object SankeyDataLink {
  @scala.inline
  def apply(source: String | Double, target: String | Double): SankeyDataLink = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyDataLink]
  }
  @scala.inline
  implicit class SankeyDataLinkOps[Self <: SankeyDataLink] (val x: Self) extends AnyVal {
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
    def setSource(value: String | Double): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String | Double): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}


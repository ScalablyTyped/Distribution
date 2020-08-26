package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeNewProps extends js.Object {
  var raws: js.UndefOr[NodeRaws] = js.native
  var source: js.UndefOr[NodeSource] = js.native
}

object NodeNewProps {
  @scala.inline
  def apply(): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeNewProps]
  }
  @scala.inline
  implicit class NodeNewPropsOps[Self <: NodeNewProps] (val x: Self) extends AnyVal {
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
    def setRaws(value: NodeRaws): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaws: Self = this.set("raws", js.undefined)
    @scala.inline
    def setSource(value: NodeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}


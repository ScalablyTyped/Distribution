package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerNewProps extends NodeNewProps {
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.native
  @JSName("raws")
  var raws_ContainerNewProps: js.UndefOr[ContainerRaws] = js.native
}

object ContainerNewProps {
  @scala.inline
  def apply(): ContainerNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerNewProps]
  }
  @scala.inline
  implicit class ContainerNewPropsOps[Self <: ContainerNewProps] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: ChildNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[ChildNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setRaws(value: ContainerRaws): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaws: Self = this.set("raws", js.undefined)
  }
  
}


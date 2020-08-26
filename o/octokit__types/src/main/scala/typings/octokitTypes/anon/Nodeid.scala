package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodeid extends js.Object {
  var node_id: String = js.native
  var `object`: ShaType = js.native
  var ref: String = js.native
  var url: String = js.native
}

object Nodeid {
  @scala.inline
  def apply(node_id: String, `object`: ShaType, ref: String, url: String): Nodeid = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodeid]
  }
  @scala.inline
  implicit class NodeidOps[Self <: Nodeid] (val x: Self) extends AnyVal {
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
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ShaType): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


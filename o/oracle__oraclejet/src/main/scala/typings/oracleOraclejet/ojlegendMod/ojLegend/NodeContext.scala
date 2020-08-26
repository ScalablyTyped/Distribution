package typings.oracleOraclejet.ojlegendMod.ojLegend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait NodeContext extends js.Object {
  var itemIndex: Double = js.native
  var sectionIndexPath: js.Array[Double] = js.native
  var subId: String = js.native
}

object NodeContext {
  @scala.inline
  def apply(itemIndex: Double, sectionIndexPath: js.Array[Double], subId: String): NodeContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndexPath = sectionIndexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContext]
  }
  @scala.inline
  implicit class NodeContextOps[Self <: NodeContext] (val x: Self) extends AnyVal {
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionIndexPathVarargs(value: Double*): Self = this.set("sectionIndexPath", js.Array(value :_*))
    @scala.inline
    def setSectionIndexPath(value: js.Array[Double]): Self = this.set("sectionIndexPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubId(value: String): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
  
}


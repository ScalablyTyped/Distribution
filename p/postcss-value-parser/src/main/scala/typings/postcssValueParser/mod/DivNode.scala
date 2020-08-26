package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivNode
  extends BaseNode
     with AdjacentAwareNode
     with Node {
  var `type`: div = js.native
}

object DivNode {
  @scala.inline
  def apply(after: String, before: String, sourceIndex: Double, `type`: div, value: String): DivNode = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivNode]
  }
  @scala.inline
  implicit class DivNodeOps[Self <: DivNode] (val x: Self) extends AnyVal {
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
    def setType(value: div): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


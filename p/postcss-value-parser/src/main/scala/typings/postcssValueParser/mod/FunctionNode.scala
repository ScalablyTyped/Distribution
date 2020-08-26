package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionNode
  extends BaseNode
     with ClosableNode
     with AdjacentAwareNode
     with Node {
  /**
    * Nodes inside the function
    */
  var nodes: js.Array[Node] = js.native
  var `type`: function = js.native
}

object FunctionNode {
  @scala.inline
  def apply(
    after: String,
    before: String,
    nodes: js.Array[Node],
    sourceIndex: Double,
    `type`: function,
    value: String
  ): FunctionNode = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNode]
  }
  @scala.inline
  implicit class FunctionNodeOps[Self <: FunctionNode] (val x: Self) extends AnyVal {
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
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: function): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


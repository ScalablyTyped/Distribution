package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigntext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultTreeTextNode extends DefaultTreeChildNode {
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeTextNode: Numbersigntext = js.native
  /**
    * Text node source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
  /**
    * Text content.
    */
  var value: String = js.native
}

object DefaultTreeTextNode {
  @scala.inline
  def apply(nodeName: Numbersigntext, parentNode: DefaultTreeParentNode, value: String): DefaultTreeTextNode = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeTextNode]
  }
  @scala.inline
  implicit class DefaultTreeTextNodeOps[Self <: DefaultTreeTextNode] (val x: Self) extends AnyVal {
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
    def setNodeName(value: Numbersigntext): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
  
}


package typings.parse5.mod

import typings.parse5.parse5Strings.Numbersigncomment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultTreeCommentNode extends DefaultTreeChildNode {
  
  /**
    * Comment text.
    */
  var data: String = js.native
  
  /**
    * The name of the node.
    */
  @JSName("nodeName")
  var nodeName_DefaultTreeCommentNode: Numbersigncomment = js.native
  
  /**
    * Comment source code location info. Available if location info is enabled via {@link ParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
}
object DefaultTreeCommentNode {
  
  @scala.inline
  def apply(data: String, nodeName: Numbersigncomment, parentNode: DefaultTreeParentNode): DefaultTreeCommentNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultTreeCommentNode]
  }
  
  @scala.inline
  implicit class DefaultTreeCommentNodeOps[Self <: DefaultTreeCommentNode] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: Numbersigncomment): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
}

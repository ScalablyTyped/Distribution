package typings.nunjucks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockEnd extends js.Object {
  
  var blockEnd: js.UndefOr[String] = js.native
  
  var blockStart: js.UndefOr[String] = js.native
  
  var commentEnd: js.UndefOr[String] = js.native
  
  var commentStart: js.UndefOr[String] = js.native
  
  var variableEnd: js.UndefOr[String] = js.native
  
  var variableStart: js.UndefOr[String] = js.native
}
object BlockEnd {
  
  @scala.inline
  def apply(): BlockEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockEnd]
  }
  
  @scala.inline
  implicit class BlockEndOps[Self <: BlockEnd] (val x: Self) extends AnyVal {
    
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
    def setBlockEnd(value: String): Self = this.set("blockEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockEnd: Self = this.set("blockEnd", js.undefined)
    
    @scala.inline
    def setBlockStart(value: String): Self = this.set("blockStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockStart: Self = this.set("blockStart", js.undefined)
    
    @scala.inline
    def setCommentEnd(value: String): Self = this.set("commentEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentEnd: Self = this.set("commentEnd", js.undefined)
    
    @scala.inline
    def setCommentStart(value: String): Self = this.set("commentStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentStart: Self = this.set("commentStart", js.undefined)
    
    @scala.inline
    def setVariableEnd(value: String): Self = this.set("variableEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableEnd: Self = this.set("variableEnd", js.undefined)
    
    @scala.inline
    def setVariableStart(value: String): Self = this.set("variableStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableStart: Self = this.set("variableStart", js.undefined)
  }
}

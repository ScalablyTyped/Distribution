package typings.nodeHtmlParser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHtmlParser.nodeHtmlParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<node-html-parser.node-html-parser/dist/nodes/html.Options> & {  noFix :false} */
@js.native
trait PartialOptionsnoFixfalse extends js.Object {
  
  var blockTextElements: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var comment: js.UndefOr[Boolean] = js.native
  
  var lowerCaseTagName: js.UndefOr[Boolean] = js.native
  
  var noFix: `false` = js.native
}
object PartialOptionsnoFixfalse {
  
  @scala.inline
  def apply(noFix: `false`): PartialOptionsnoFixfalse = {
    val __obj = js.Dynamic.literal(noFix = noFix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsnoFixfalse]
  }
  
  @scala.inline
  implicit class PartialOptionsnoFixfalseOps[Self <: PartialOptionsnoFixfalse] (val x: Self) extends AnyVal {
    
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
    def setNoFix(value: `false`): Self = this.set("noFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockTextElements(value: StringDictionary[Boolean]): Self = this.set("blockTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockTextElements: Self = this.set("blockTextElements", js.undefined)
    
    @scala.inline
    def setComment(value: Boolean): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setLowerCaseTagName(value: Boolean): Self = this.set("lowerCaseTagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseTagName: Self = this.set("lowerCaseTagName", js.undefined)
  }
}

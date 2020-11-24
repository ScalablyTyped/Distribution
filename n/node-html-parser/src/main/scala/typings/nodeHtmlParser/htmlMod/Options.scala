package typings.nodeHtmlParser.htmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var blockTextElements: StringDictionary[Boolean] = js.native
  
  var comment: Boolean = js.native
  
  var lowerCaseTagName: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(blockTextElements: StringDictionary[Boolean], comment: Boolean, lowerCaseTagName: Boolean): Options = {
    val __obj = js.Dynamic.literal(blockTextElements = blockTextElements.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], lowerCaseTagName = lowerCaseTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBlockTextElements(value: StringDictionary[Boolean]): Self = this.set("blockTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Boolean): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerCaseTagName(value: Boolean): Self = this.set("lowerCaseTagName", value.asInstanceOf[js.Any])
  }
}

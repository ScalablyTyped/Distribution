package typings.mdv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Warnings extends js.Object {
  
  var anchorsWithNoLinks: js.Array[Anchor] = js.native
  
  var codeBlocksWithNoLanguage: Double = js.native
}
object Warnings {
  
  @scala.inline
  def apply(anchorsWithNoLinks: js.Array[Anchor], codeBlocksWithNoLanguage: Double): Warnings = {
    val __obj = js.Dynamic.literal(anchorsWithNoLinks = anchorsWithNoLinks.asInstanceOf[js.Any], codeBlocksWithNoLanguage = codeBlocksWithNoLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warnings]
  }
  
  @scala.inline
  implicit class WarningsOps[Self <: Warnings] (val x: Self) extends AnyVal {
    
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
    def setAnchorsWithNoLinksVarargs(value: Anchor*): Self = this.set("anchorsWithNoLinks", js.Array(value :_*))
    
    @scala.inline
    def setAnchorsWithNoLinks(value: js.Array[Anchor]): Self = this.set("anchorsWithNoLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeBlocksWithNoLanguage(value: Double): Self = this.set("codeBlocksWithNoLanguage", value.asInstanceOf[js.Any])
  }
}

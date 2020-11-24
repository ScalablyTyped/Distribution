package typings.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasteHTMLOptions extends js.Object {
  
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.native
  
  var cleanTags: js.UndefOr[js.Array[String]] = js.native
  
  var unwrapTags: js.UndefOr[js.Array[String]] = js.native
}
object PasteHTMLOptions {
  
  @scala.inline
  def apply(): PasteHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteHTMLOptions]
  }
  
  @scala.inline
  implicit class PasteHTMLOptionsOps[Self <: PasteHTMLOptions] (val x: Self) extends AnyVal {
    
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
    def setCleanAttrsVarargs(value: String*): Self = this.set("cleanAttrs", js.Array(value :_*))
    
    @scala.inline
    def setCleanAttrs(value: js.Array[String]): Self = this.set("cleanAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanAttrs: Self = this.set("cleanAttrs", js.undefined)
    
    @scala.inline
    def setCleanTagsVarargs(value: String*): Self = this.set("cleanTags", js.Array(value :_*))
    
    @scala.inline
    def setCleanTags(value: js.Array[String]): Self = this.set("cleanTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanTags: Self = this.set("cleanTags", js.undefined)
    
    @scala.inline
    def setUnwrapTagsVarargs(value: String*): Self = this.set("unwrapTags", js.Array(value :_*))
    
    @scala.inline
    def setUnwrapTags(value: js.Array[String]): Self = this.set("unwrapTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnwrapTags: Self = this.set("unwrapTags", js.undefined)
  }
}

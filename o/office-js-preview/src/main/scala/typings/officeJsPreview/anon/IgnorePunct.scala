package typings.officeJsPreview.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnorePunct extends js.Object {
  
  var ignorePunct: js.UndefOr[Boolean] = js.native
  
  var ignoreSpace: js.UndefOr[Boolean] = js.native
  
  var matchCase: js.UndefOr[Boolean] = js.native
  
  var matchPrefix: js.UndefOr[Boolean] = js.native
  
  var matchSuffix: js.UndefOr[Boolean] = js.native
  
  var matchWholeWord: js.UndefOr[Boolean] = js.native
  
  var matchWildcards: js.UndefOr[Boolean] = js.native
}
object IgnorePunct {
  
  @scala.inline
  def apply(): IgnorePunct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnorePunct]
  }
  
  @scala.inline
  implicit class IgnorePunctOps[Self <: IgnorePunct] (val x: Self) extends AnyVal {
    
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
    def setIgnorePunct(value: Boolean): Self = this.set("ignorePunct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePunct: Self = this.set("ignorePunct", js.undefined)
    
    @scala.inline
    def setIgnoreSpace(value: Boolean): Self = this.set("ignoreSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSpace: Self = this.set("ignoreSpace", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMatchPrefix(value: Boolean): Self = this.set("matchPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPrefix: Self = this.set("matchPrefix", js.undefined)
    
    @scala.inline
    def setMatchSuffix(value: Boolean): Self = this.set("matchSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchSuffix: Self = this.set("matchSuffix", js.undefined)
    
    @scala.inline
    def setMatchWholeWord(value: Boolean): Self = this.set("matchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWholeWord: Self = this.set("matchWholeWord", js.undefined)
    
    @scala.inline
    def setMatchWildcards(value: Boolean): Self = this.set("matchWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWildcards: Self = this.set("matchWildcards", js.undefined)
  }
}

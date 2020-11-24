package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Head extends js.Object {
  
  var Head: js.UndefOr[Boolean] = js.native
  
  var Html: js.UndefOr[Boolean] = js.native
  
  var Main: js.UndefOr[Boolean] = js.native
  
  var NextScript: js.UndefOr[Boolean] = js.native
}
object Head {
  
  @scala.inline
  def apply(): Head = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Head]
  }
  
  @scala.inline
  implicit class HeadOps[Self <: Head] (val x: Self) extends AnyVal {
    
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
    def setHead(value: Boolean): Self = this.set("Head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("Head", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("Html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("Html", js.undefined)
    
    @scala.inline
    def setMain(value: Boolean): Self = this.set("Main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("Main", js.undefined)
    
    @scala.inline
    def setNextScript(value: Boolean): Self = this.set("NextScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextScript: Self = this.set("NextScript", js.undefined)
  }
}

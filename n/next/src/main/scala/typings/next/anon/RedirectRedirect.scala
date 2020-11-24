package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectRedirect
  extends GetServerSidePropsResult[js.Any] {
  
  var redirect: typings.next.mod.Redirect = js.native
}
object RedirectRedirect {
  
  @scala.inline
  def apply(redirect: typings.next.mod.Redirect): RedirectRedirect = {
    val __obj = js.Dynamic.literal(redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectRedirect]
  }
  
  @scala.inline
  implicit class RedirectRedirectOps[Self <: RedirectRedirect] (val x: Self) extends AnyVal {
    
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
    def setRedirect(value: typings.next.mod.Redirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
  }
}

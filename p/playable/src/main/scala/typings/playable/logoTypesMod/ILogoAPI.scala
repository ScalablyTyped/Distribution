package typings.playable.logoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogoAPI extends js.Object {
  
  var setLogo: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.native
  
  var setLogoClickCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
}
object ILogoAPI {
  
  @scala.inline
  def apply(): ILogoAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILogoAPI]
  }
  
  @scala.inline
  implicit class ILogoAPIOps[Self <: ILogoAPI] (val x: Self) extends AnyVal {
    
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
    def setSetLogo(value: /* src */ String => Unit): Self = this.set("setLogo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLogo: Self = this.set("setLogo", js.undefined)
    
    @scala.inline
    def setSetLogoClickCallback(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = this.set("setLogoClickCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLogoClickCallback: Self = this.set("setLogoClickCallback", js.undefined)
  }
}

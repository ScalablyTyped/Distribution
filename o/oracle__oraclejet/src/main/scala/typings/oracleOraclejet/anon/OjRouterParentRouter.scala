package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OjRouterParentRouter extends js.Object {
  
  var ojRouter: ParentRouter = js.native
}
object OjRouterParentRouter {
  
  @scala.inline
  def apply(ojRouter: ParentRouter): OjRouterParentRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouterParentRouter]
  }
  
  @scala.inline
  implicit class OjRouterParentRouterOps[Self <: OjRouterParentRouter] (val x: Self) extends AnyVal {
    
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
    def setOjRouter(value: ParentRouter): Self = this.set("ojRouter", value.asInstanceOf[js.Any])
  }
}

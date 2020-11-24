package typings.nextServer.apiUtilsMod

import typings.nextServer.libUtilsMod.NextApiRequest
import typings.nextServer.serverRouterMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazyProps extends js.Object {
  
  var params: js.UndefOr[Params | Boolean] = js.native
  
  var req: NextApiRequest = js.native
}
object LazyProps {
  
  @scala.inline
  def apply(req: NextApiRequest): LazyProps = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyProps]
  }
  
  @scala.inline
  implicit class LazyPropsOps[Self <: LazyProps] (val x: Self) extends AnyVal {
    
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
    def setReq(value: NextApiRequest): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Params | Boolean): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}

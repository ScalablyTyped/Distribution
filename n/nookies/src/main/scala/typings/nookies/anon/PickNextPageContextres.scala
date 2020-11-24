package typings.nookies.anon

import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next.NextPageContext, 'res'> */
@js.native
trait PickNextPageContextres extends js.Object {
  
  var res: js.UndefOr[ServerResponse] = js.native
}
object PickNextPageContextres {
  
  @scala.inline
  def apply(): PickNextPageContextres = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickNextPageContextres]
  }
  
  @scala.inline
  implicit class PickNextPageContextresOps[Self <: PickNextPageContextres] (val x: Self) extends AnyVal {
    
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
    def setRes(value: ServerResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
  }
}

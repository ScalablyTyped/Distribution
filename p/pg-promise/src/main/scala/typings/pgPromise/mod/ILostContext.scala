package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILostContext[C /* <: IClient */] extends js.Object {
  
  var client: C = js.native
  
  var cn: String = js.native
  
  var dc: js.Any = js.native
  
  var start: Date = js.native
}
object ILostContext {
  
  @scala.inline
  def apply[C /* <: IClient */](client: C, cn: String, dc: js.Any, start: Date): ILostContext[C] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILostContext[C]]
  }
  
  @scala.inline
  implicit class ILostContextOps[Self <: ILostContext[_], C /* <: IClient */] (val x: Self with ILostContext[C]) extends AnyVal {
    
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
    def setClient(value: C): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCn(value: String): Self = this.set("cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDc(value: js.Any): Self = this.set("dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}

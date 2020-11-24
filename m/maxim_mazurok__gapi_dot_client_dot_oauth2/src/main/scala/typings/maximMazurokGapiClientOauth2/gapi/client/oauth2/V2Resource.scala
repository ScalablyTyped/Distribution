package typings.maximMazurokGapiClientOauth2.gapi.client.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V2Resource extends js.Object {
  
  var me: MeResource = js.native
}
object V2Resource {
  
  @scala.inline
  def apply(me: MeResource): V2Resource = {
    val __obj = js.Dynamic.literal(me = me.asInstanceOf[js.Any])
    __obj.asInstanceOf[V2Resource]
  }
  
  @scala.inline
  implicit class V2ResourceOps[Self <: V2Resource] (val x: Self) extends AnyVal {
    
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
    def setMe(value: MeResource): Self = this.set("me", value.asInstanceOf[js.Any])
  }
}

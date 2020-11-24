package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HangoutsChatInfo extends js.Object {
  
  /** A set of rooms to search. */
  var roomId: js.UndefOr[js.Array[String]] = js.native
}
object HangoutsChatInfo {
  
  @scala.inline
  def apply(): HangoutsChatInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HangoutsChatInfo]
  }
  
  @scala.inline
  implicit class HangoutsChatInfoOps[Self <: HangoutsChatInfo] (val x: Self) extends AnyVal {
    
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
    def setRoomIdVarargs(value: String*): Self = this.set("roomId", js.Array(value :_*))
    
    @scala.inline
    def setRoomId(value: js.Array[String]): Self = this.set("roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoomId: Self = this.set("roomId", js.undefined)
  }
}

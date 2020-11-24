package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeldHangoutsChatQuery extends js.Object {
  
  /** If true, include rooms the user has participated in. */
  var includeRooms: js.UndefOr[Boolean] = js.native
}
object HeldHangoutsChatQuery {
  
  @scala.inline
  def apply(): HeldHangoutsChatQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldHangoutsChatQuery]
  }
  
  @scala.inline
  implicit class HeldHangoutsChatQueryOps[Self <: HeldHangoutsChatQuery] (val x: Self) extends AnyVal {
    
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
    def setIncludeRooms(value: Boolean): Self = this.set("includeRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeRooms: Self = this.set("includeRooms", js.undefined)
  }
}

package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEFAULTMEDIARECEIVERAPPID extends js.Object {
  
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String = js.native
}
object DEFAULTMEDIARECEIVERAPPID {
  
  @scala.inline
  def apply(DEFAULT_MEDIA_RECEIVER_APP_ID: String): DEFAULTMEDIARECEIVERAPPID = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTMEDIARECEIVERAPPID]
  }
  
  @scala.inline
  implicit class DEFAULTMEDIARECEIVERAPPIDOps[Self <: DEFAULTMEDIARECEIVERAPPID] (val x: Self) extends AnyVal {
    
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
    def setDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = this.set("DEFAULT_MEDIA_RECEIVER_APP_ID", value.asInstanceOf[js.Any])
  }
}

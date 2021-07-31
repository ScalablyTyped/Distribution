package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULTMEDIARECEIVERAPPID extends StObject {
  
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String
}
object DEFAULTMEDIARECEIVERAPPID {
  
  @scala.inline
  def apply(DEFAULT_MEDIA_RECEIVER_APP_ID: String): DEFAULTMEDIARECEIVERAPPID = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTMEDIARECEIVERAPPID]
  }
  
  @scala.inline
  implicit class DEFAULTMEDIARECEIVERAPPIDMutableBuilder[Self <: DEFAULTMEDIARECEIVERAPPID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = StObject.set(x, "DEFAULT_MEDIA_RECEIVER_APP_ID", value.asInstanceOf[js.Any])
  }
}

package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEFAULTMEDIARECEIVERAPPID extends StObject {
  
  var DEFAULT_MEDIA_RECEIVER_APP_ID: String
}
object DEFAULTMEDIARECEIVERAPPID {
  
  inline def apply(DEFAULT_MEDIA_RECEIVER_APP_ID: String): DEFAULTMEDIARECEIVERAPPID = {
    val __obj = js.Dynamic.literal(DEFAULT_MEDIA_RECEIVER_APP_ID = DEFAULT_MEDIA_RECEIVER_APP_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULTMEDIARECEIVERAPPID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DEFAULTMEDIARECEIVERAPPID] (val x: Self) extends AnyVal {
    
    inline def setDEFAULT_MEDIA_RECEIVER_APP_ID(value: String): Self = StObject.set(x, "DEFAULT_MEDIA_RECEIVER_APP_ID", value.asInstanceOf[js.Any])
  }
}

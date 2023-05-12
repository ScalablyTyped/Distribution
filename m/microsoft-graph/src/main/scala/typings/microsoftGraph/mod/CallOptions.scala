package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptions extends StObject {
  
  // Indicates whether to hide the app after the call is escalated.
  var hideBotAfterEscalation: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether content sharing notifications should be enabled for the call.
  var isContentSharingNotificationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CallOptions {
  
  inline def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    inline def setHideBotAfterEscalation(value: NullableOption[Boolean]): Self = StObject.set(x, "hideBotAfterEscalation", value.asInstanceOf[js.Any])
    
    inline def setHideBotAfterEscalationNull: Self = StObject.set(x, "hideBotAfterEscalation", null)
    
    inline def setHideBotAfterEscalationUndefined: Self = StObject.set(x, "hideBotAfterEscalation", js.undefined)
    
    inline def setIsContentSharingNotificationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isContentSharingNotificationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsContentSharingNotificationEnabledNull: Self = StObject.set(x, "isContentSharingNotificationEnabled", null)
    
    inline def setIsContentSharingNotificationEnabledUndefined: Self = StObject.set(x, "isContentSharingNotificationEnabled", js.undefined)
  }
}

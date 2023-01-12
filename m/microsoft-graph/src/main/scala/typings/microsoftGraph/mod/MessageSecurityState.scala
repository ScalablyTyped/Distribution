package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSecurityState extends StObject {
  
  var connectingIP: js.UndefOr[NullableOption[String]] = js.undefined
  
  var deliveryAction: js.UndefOr[NullableOption[String]] = js.undefined
  
  var deliveryLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  var directionality: js.UndefOr[NullableOption[String]] = js.undefined
  
  var internetMessageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var messageFingerprint: js.UndefOr[NullableOption[String]] = js.undefined
  
  var messageReceivedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var messageSubject: js.UndefOr[NullableOption[String]] = js.undefined
  
  var networkMessageId: js.UndefOr[NullableOption[String]] = js.undefined
}
object MessageSecurityState {
  
  inline def apply(): MessageSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageSecurityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSecurityState] (val x: Self) extends AnyVal {
    
    inline def setConnectingIP(value: NullableOption[String]): Self = StObject.set(x, "connectingIP", value.asInstanceOf[js.Any])
    
    inline def setConnectingIPNull: Self = StObject.set(x, "connectingIP", null)
    
    inline def setConnectingIPUndefined: Self = StObject.set(x, "connectingIP", js.undefined)
    
    inline def setDeliveryAction(value: NullableOption[String]): Self = StObject.set(x, "deliveryAction", value.asInstanceOf[js.Any])
    
    inline def setDeliveryActionNull: Self = StObject.set(x, "deliveryAction", null)
    
    inline def setDeliveryActionUndefined: Self = StObject.set(x, "deliveryAction", js.undefined)
    
    inline def setDeliveryLocation(value: NullableOption[String]): Self = StObject.set(x, "deliveryLocation", value.asInstanceOf[js.Any])
    
    inline def setDeliveryLocationNull: Self = StObject.set(x, "deliveryLocation", null)
    
    inline def setDeliveryLocationUndefined: Self = StObject.set(x, "deliveryLocation", js.undefined)
    
    inline def setDirectionality(value: NullableOption[String]): Self = StObject.set(x, "directionality", value.asInstanceOf[js.Any])
    
    inline def setDirectionalityNull: Self = StObject.set(x, "directionality", null)
    
    inline def setDirectionalityUndefined: Self = StObject.set(x, "directionality", js.undefined)
    
    inline def setInternetMessageId(value: NullableOption[String]): Self = StObject.set(x, "internetMessageId", value.asInstanceOf[js.Any])
    
    inline def setInternetMessageIdNull: Self = StObject.set(x, "internetMessageId", null)
    
    inline def setInternetMessageIdUndefined: Self = StObject.set(x, "internetMessageId", js.undefined)
    
    inline def setMessageFingerprint(value: NullableOption[String]): Self = StObject.set(x, "messageFingerprint", value.asInstanceOf[js.Any])
    
    inline def setMessageFingerprintNull: Self = StObject.set(x, "messageFingerprint", null)
    
    inline def setMessageFingerprintUndefined: Self = StObject.set(x, "messageFingerprint", js.undefined)
    
    inline def setMessageReceivedDateTime(value: NullableOption[String]): Self = StObject.set(x, "messageReceivedDateTime", value.asInstanceOf[js.Any])
    
    inline def setMessageReceivedDateTimeNull: Self = StObject.set(x, "messageReceivedDateTime", null)
    
    inline def setMessageReceivedDateTimeUndefined: Self = StObject.set(x, "messageReceivedDateTime", js.undefined)
    
    inline def setMessageSubject(value: NullableOption[String]): Self = StObject.set(x, "messageSubject", value.asInstanceOf[js.Any])
    
    inline def setMessageSubjectNull: Self = StObject.set(x, "messageSubject", null)
    
    inline def setMessageSubjectUndefined: Self = StObject.set(x, "messageSubject", js.undefined)
    
    inline def setNetworkMessageId(value: NullableOption[String]): Self = StObject.set(x, "networkMessageId", value.asInstanceOf[js.Any])
    
    inline def setNetworkMessageIdNull: Self = StObject.set(x, "networkMessageId", null)
    
    inline def setNetworkMessageIdUndefined: Self = StObject.set(x, "networkMessageId", js.undefined)
  }
}

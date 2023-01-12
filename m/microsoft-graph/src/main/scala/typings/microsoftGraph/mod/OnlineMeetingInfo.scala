package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineMeetingInfo extends StObject {
  
  // The ID of the conference.
  var conferenceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The external link that launches the online meeting. This is a URL that clients will launch into a browser and will
    * redirect the user to join the meeting.
    */
  var joinUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // All of the phone numbers associated with this conference.
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.undefined
  
  // The pre-formatted quickdial for this call.
  var quickDial: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The toll free numbers that can be used to join the conference.
  var tollFreeNumbers: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The toll number that can be used to join the conference.
  var tollNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnlineMeetingInfo {
  
  inline def apply(): OnlineMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeetingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineMeetingInfo] (val x: Self) extends AnyVal {
    
    inline def setConferenceId(value: NullableOption[String]): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    inline def setJoinUrl(value: NullableOption[String]): Self = StObject.set(x, "joinUrl", value.asInstanceOf[js.Any])
    
    inline def setJoinUrlNull: Self = StObject.set(x, "joinUrl", null)
    
    inline def setJoinUrlUndefined: Self = StObject.set(x, "joinUrl", js.undefined)
    
    inline def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value*))
    
    inline def setQuickDial(value: NullableOption[String]): Self = StObject.set(x, "quickDial", value.asInstanceOf[js.Any])
    
    inline def setQuickDialNull: Self = StObject.set(x, "quickDial", null)
    
    inline def setQuickDialUndefined: Self = StObject.set(x, "quickDial", js.undefined)
    
    inline def setTollFreeNumbers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tollFreeNumbers", value.asInstanceOf[js.Any])
    
    inline def setTollFreeNumbersNull: Self = StObject.set(x, "tollFreeNumbers", null)
    
    inline def setTollFreeNumbersUndefined: Self = StObject.set(x, "tollFreeNumbers", js.undefined)
    
    inline def setTollFreeNumbersVarargs(value: String*): Self = StObject.set(x, "tollFreeNumbers", js.Array(value*))
    
    inline def setTollNumber(value: NullableOption[String]): Self = StObject.set(x, "tollNumber", value.asInstanceOf[js.Any])
    
    inline def setTollNumberNull: Self = StObject.set(x, "tollNumber", null)
    
    inline def setTollNumberUndefined: Self = StObject.set(x, "tollNumber", js.undefined)
  }
}

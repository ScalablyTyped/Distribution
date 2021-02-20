package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnlineMeetingInfo extends StObject {
  
  // The ID of the conference.
  var conferenceId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The external link that launches the online meeting. This is a URL that clients will launch into a browser and will
    * redirect the user to join the meeting.
    */
  var joinUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // All of the phone numbers associated with this conference.
  var phones: js.UndefOr[NullableOption[js.Array[Phone]]] = js.native
  
  // The pre-formatted quickdial for this call.
  var quickDial: js.UndefOr[NullableOption[String]] = js.native
  
  // The toll free numbers that can be used to join the conference.
  var tollFreeNumbers: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // The toll number that can be used to join the conference.
  var tollNumber: js.UndefOr[NullableOption[String]] = js.native
}
object OnlineMeetingInfo {
  
  @scala.inline
  def apply(): OnlineMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineMeetingInfo]
  }
  
  @scala.inline
  implicit class OnlineMeetingInfoMutableBuilder[Self <: OnlineMeetingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceId(value: NullableOption[String]): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    @scala.inline
    def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    @scala.inline
    def setJoinUrl(value: NullableOption[String]): Self = StObject.set(x, "joinUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinUrlNull: Self = StObject.set(x, "joinUrl", null)
    
    @scala.inline
    def setJoinUrlUndefined: Self = StObject.set(x, "joinUrl", js.undefined)
    
    @scala.inline
    def setPhones(value: NullableOption[js.Array[Phone]]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    @scala.inline
    def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: Phone*): Self = StObject.set(x, "phones", js.Array(value :_*))
    
    @scala.inline
    def setQuickDial(value: NullableOption[String]): Self = StObject.set(x, "quickDial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickDialNull: Self = StObject.set(x, "quickDial", null)
    
    @scala.inline
    def setQuickDialUndefined: Self = StObject.set(x, "quickDial", js.undefined)
    
    @scala.inline
    def setTollFreeNumbers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tollFreeNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollFreeNumbersNull: Self = StObject.set(x, "tollFreeNumbers", null)
    
    @scala.inline
    def setTollFreeNumbersUndefined: Self = StObject.set(x, "tollFreeNumbers", js.undefined)
    
    @scala.inline
    def setTollFreeNumbersVarargs(value: String*): Self = StObject.set(x, "tollFreeNumbers", js.Array(value :_*))
    
    @scala.inline
    def setTollNumber(value: NullableOption[String]): Self = StObject.set(x, "tollNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollNumberNull: Self = StObject.set(x, "tollNumber", null)
    
    @scala.inline
    def setTollNumberUndefined: Self = StObject.set(x, "tollNumber", js.undefined)
  }
}

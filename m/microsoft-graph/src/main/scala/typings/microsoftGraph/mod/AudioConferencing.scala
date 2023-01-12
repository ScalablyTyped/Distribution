package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConferencing extends StObject {
  
  // The conference id of the online meeting.
  var conferenceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A URL to the externally-accessible web page that contains dial-in information.
  var dialinUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var tollFreeNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of toll-free numbers that are displayed in the meeting invite.
  var tollFreeNumbers: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var tollNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of toll numbers that are displayed in the meeting invite.
  var tollNumbers: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AudioConferencing {
  
  inline def apply(): AudioConferencing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConferencing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioConferencing] (val x: Self) extends AnyVal {
    
    inline def setConferenceId(value: NullableOption[String]): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    inline def setDialinUrl(value: NullableOption[String]): Self = StObject.set(x, "dialinUrl", value.asInstanceOf[js.Any])
    
    inline def setDialinUrlNull: Self = StObject.set(x, "dialinUrl", null)
    
    inline def setDialinUrlUndefined: Self = StObject.set(x, "dialinUrl", js.undefined)
    
    inline def setTollFreeNumber(value: NullableOption[String]): Self = StObject.set(x, "tollFreeNumber", value.asInstanceOf[js.Any])
    
    inline def setTollFreeNumberNull: Self = StObject.set(x, "tollFreeNumber", null)
    
    inline def setTollFreeNumberUndefined: Self = StObject.set(x, "tollFreeNumber", js.undefined)
    
    inline def setTollFreeNumbers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tollFreeNumbers", value.asInstanceOf[js.Any])
    
    inline def setTollFreeNumbersNull: Self = StObject.set(x, "tollFreeNumbers", null)
    
    inline def setTollFreeNumbersUndefined: Self = StObject.set(x, "tollFreeNumbers", js.undefined)
    
    inline def setTollFreeNumbersVarargs(value: String*): Self = StObject.set(x, "tollFreeNumbers", js.Array(value*))
    
    inline def setTollNumber(value: NullableOption[String]): Self = StObject.set(x, "tollNumber", value.asInstanceOf[js.Any])
    
    inline def setTollNumberNull: Self = StObject.set(x, "tollNumber", null)
    
    inline def setTollNumberUndefined: Self = StObject.set(x, "tollNumber", js.undefined)
    
    inline def setTollNumbers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "tollNumbers", value.asInstanceOf[js.Any])
    
    inline def setTollNumbersNull: Self = StObject.set(x, "tollNumbers", null)
    
    inline def setTollNumbersUndefined: Self = StObject.set(x, "tollNumbers", js.undefined)
    
    inline def setTollNumbersVarargs(value: String*): Self = StObject.set(x, "tollNumbers", js.Array(value*))
  }
}

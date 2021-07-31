package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConferencing extends StObject {
  
  var conferenceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A URL to the externally-accessible web page that contains dial-in information.
  var dialinUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The toll-free number that connects to the Audio Conference Provider.
  var tollFreeNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The toll number that connects to the Audio Conference Provider.
  var tollNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object AudioConferencing {
  
  @scala.inline
  def apply(): AudioConferencing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConferencing]
  }
  
  @scala.inline
  implicit class AudioConferencingMutableBuilder[Self <: AudioConferencing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceId(value: NullableOption[String]): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    @scala.inline
    def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    @scala.inline
    def setDialinUrl(value: NullableOption[String]): Self = StObject.set(x, "dialinUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialinUrlNull: Self = StObject.set(x, "dialinUrl", null)
    
    @scala.inline
    def setDialinUrlUndefined: Self = StObject.set(x, "dialinUrl", js.undefined)
    
    @scala.inline
    def setTollFreeNumber(value: NullableOption[String]): Self = StObject.set(x, "tollFreeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollFreeNumberNull: Self = StObject.set(x, "tollFreeNumber", null)
    
    @scala.inline
    def setTollFreeNumberUndefined: Self = StObject.set(x, "tollFreeNumber", js.undefined)
    
    @scala.inline
    def setTollNumber(value: NullableOption[String]): Self = StObject.set(x, "tollNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollNumberNull: Self = StObject.set(x, "tollNumber", null)
    
    @scala.inline
    def setTollNumberUndefined: Self = StObject.set(x, "tollNumber", js.undefined)
  }
}

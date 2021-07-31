package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListTrialsResponse extends StObject {
  
  /** The trials associated with the study. */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.undefined
}
object GoogleCloudMlV1ListTrialsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListTrialsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListTrialsResponseMutableBuilder[Self <: GoogleCloudMlV1ListTrialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    @scala.inline
    def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value :_*))
  }
}

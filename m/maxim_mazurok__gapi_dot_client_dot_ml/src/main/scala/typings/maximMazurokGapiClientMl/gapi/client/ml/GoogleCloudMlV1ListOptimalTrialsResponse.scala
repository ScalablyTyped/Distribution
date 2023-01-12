package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListOptimalTrialsResponse extends StObject {
  
  /**
    * The pareto-optimal trials for multiple objective study or the optimal trial for single objective study. The definition of pareto-optimal can be checked in wiki page.
    * https://en.wikipedia.org/wiki/Pareto_efficiency
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.undefined
}
object GoogleCloudMlV1ListOptimalTrialsResponse {
  
  inline def apply(): GoogleCloudMlV1ListOptimalTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListOptimalTrialsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudMlV1ListOptimalTrialsResponse] (val x: Self) extends AnyVal {
    
    inline def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = StObject.set(x, "trials", value.asInstanceOf[js.Any])
    
    inline def setTrialsUndefined: Self = StObject.set(x, "trials", js.undefined)
    
    inline def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = StObject.set(x, "trials", js.Array(value*))
  }
}

package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.dismissed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningUpdateAlertEndpoint extends StObject {
  
  /**
    * The code scanning alert number.
    */
  var alert_number: js.UndefOr[Double] = js.undefined
  
  /**
    * **Required when the state is dismissed.** The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
    */
  var dismissed_reason: js.UndefOr[String | Null] = js.undefined
  
  var owner: String
  
  var repo: String
  
  /**
    * Sets the state of the code scanning alert. Can be one of `open` or `dismissed`. You must provide `dismissed_reason` when you set the state to `dismissed`.
    */
  var state: open | dismissed
}
object CodeScanningUpdateAlertEndpoint {
  
  inline def apply(owner: String, repo: String, state: open | dismissed): CodeScanningUpdateAlertEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningUpdateAlertEndpoint]
  }
  
  extension [Self <: CodeScanningUpdateAlertEndpoint](x: Self) {
    
    inline def setAlert_number(value: Double): Self = StObject.set(x, "alert_number", value.asInstanceOf[js.Any])
    
    inline def setAlert_numberUndefined: Self = StObject.set(x, "alert_number", js.undefined)
    
    inline def setDismissed_reason(value: String): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}

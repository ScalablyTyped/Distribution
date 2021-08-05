package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningGetAlertEndpoint extends StObject {
  
  /**
    * The code scanning alert number.
    */
  var alert_number: js.UndefOr[Double] = js.undefined
  
  var owner: String
  
  var repo: String
}
object CodeScanningGetAlertEndpoint {
  
  inline def apply(owner: String, repo: String): CodeScanningGetAlertEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningGetAlertEndpoint]
  }
  
  extension [Self <: CodeScanningGetAlertEndpoint](x: Self) {
    
    inline def setAlert_number(value: Double): Self = StObject.set(x, "alert_number", value.asInstanceOf[js.Any])
    
    inline def setAlert_numberUndefined: Self = StObject.set(x, "alert_number", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}

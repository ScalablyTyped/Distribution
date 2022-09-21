package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstanceDecisionItemServicePrincipalResource
  extends StObject
     with AccessReviewInstanceDecisionItemResource {
  
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInstanceDecisionItemServicePrincipalResource {
  
  inline def apply(): AccessReviewInstanceDecisionItemServicePrincipalResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstanceDecisionItemServicePrincipalResource]
  }
  
  extension [Self <: AccessReviewInstanceDecisionItemServicePrincipalResource](x: Self) {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
  }
}

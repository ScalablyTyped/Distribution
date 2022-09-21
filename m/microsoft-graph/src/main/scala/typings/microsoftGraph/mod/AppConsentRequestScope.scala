package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppConsentRequestScope extends StObject {
  
  // The name of the scope.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AppConsentRequestScope {
  
  inline def apply(): AppConsentRequestScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppConsentRequestScope]
  }
  
  extension [Self <: AppConsentRequestScope](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}

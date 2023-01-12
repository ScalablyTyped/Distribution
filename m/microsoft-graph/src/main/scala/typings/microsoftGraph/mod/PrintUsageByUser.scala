package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintUsageByUser
  extends StObject
     with PrintUsage {
  
  // The UPN of the user represented by these statistics.
  var userPrincipalName: js.UndefOr[String] = js.undefined
}
object PrintUsageByUser {
  
  inline def apply(): PrintUsageByUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintUsageByUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintUsageByUser] (val x: Self) extends AnyVal {
    
    inline def setUserPrincipalName(value: String): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}

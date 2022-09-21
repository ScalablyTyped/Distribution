package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointIdentity
  extends StObject
     with Identity {
  
  // The sign in name of the SharePoint identity.
  var loginName: js.UndefOr[NullableOption[String]] = js.undefined
}
object SharePointIdentity {
  
  inline def apply(): SharePointIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharePointIdentity]
  }
  
  extension [Self <: SharePointIdentity](x: Self) {
    
    inline def setLoginName(value: NullableOption[String]): Self = StObject.set(x, "loginName", value.asInstanceOf[js.Any])
    
    inline def setLoginNameNull: Self = StObject.set(x, "loginName", null)
    
    inline def setLoginNameUndefined: Self = StObject.set(x, "loginName", js.undefined)
  }
}

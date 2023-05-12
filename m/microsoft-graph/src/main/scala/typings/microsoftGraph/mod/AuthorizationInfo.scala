package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationInfo extends StObject {
  
  var certificateUserIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AuthorizationInfo {
  
  inline def apply(): AuthorizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationInfo] (val x: Self) extends AnyVal {
    
    inline def setCertificateUserIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "certificateUserIds", value.asInstanceOf[js.Any])
    
    inline def setCertificateUserIdsNull: Self = StObject.set(x, "certificateUserIds", null)
    
    inline def setCertificateUserIdsUndefined: Self = StObject.set(x, "certificateUserIds", js.undefined)
    
    inline def setCertificateUserIdsVarargs(value: String*): Self = StObject.set(x, "certificateUserIds", js.Array(value*))
  }
}

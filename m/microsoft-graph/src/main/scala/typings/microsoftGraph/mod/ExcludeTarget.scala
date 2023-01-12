package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeTarget extends StObject {
  
  // The object identifier of an Azure Active Directory user or group.
  var id: js.UndefOr[String] = js.undefined
  
  // The type of the authentication method target. Possible values are: user, group, unknownFutureValue.
  var targetType: js.UndefOr[AuthenticationMethodTargetType] = js.undefined
}
object ExcludeTarget {
  
  inline def apply(): ExcludeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludeTarget] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTargetType(value: AuthenticationMethodTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}

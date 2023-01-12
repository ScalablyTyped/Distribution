package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimsParameter extends StObject {
  
  var id_token: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
  
  var userinfo: js.UndefOr[StringDictionary[Null | ClaimsParameterMember]] = js.undefined
}
object ClaimsParameter {
  
  inline def apply(): ClaimsParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimsParameter] (val x: Self) extends AnyVal {
    
    inline def setId_token(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    inline def setUserinfo(value: StringDictionary[Null | ClaimsParameterMember]): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
    
    inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
  }
}

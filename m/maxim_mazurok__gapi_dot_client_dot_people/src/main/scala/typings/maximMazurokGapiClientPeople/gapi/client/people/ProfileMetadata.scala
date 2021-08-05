package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileMetadata extends StObject {
  
  /** Output only. The profile object type. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /** Output only. The user types. */
  var userTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ProfileMetadata {
  
  inline def apply(): ProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileMetadata]
  }
  
  extension [Self <: ProfileMetadata](x: Self) {
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setUserTypes(value: js.Array[String]): Self = StObject.set(x, "userTypes", value.asInstanceOf[js.Any])
    
    inline def setUserTypesUndefined: Self = StObject.set(x, "userTypes", js.undefined)
    
    inline def setUserTypesVarargs(value: String*): Self = StObject.set(x, "userTypes", js.Array(value :_*))
  }
}

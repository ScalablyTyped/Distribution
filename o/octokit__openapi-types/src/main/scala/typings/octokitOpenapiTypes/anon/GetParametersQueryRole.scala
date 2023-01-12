package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryRole extends StObject {
  
  /** List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned. */
  var get: ParametersQueryRole
}
object GetParametersQueryRole {
  
  inline def apply(get: ParametersQueryRole): GetParametersQueryRole = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryRole] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryRole): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

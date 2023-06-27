package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters101 extends StObject {
  
  /**
    * List organization members
    * @description List all users who are members of an organization. If the authenticated user is also a member of this organization then both concealed and public members will be returned.
    */
  var get: Parameters101
}
object GetParameters101 {
  
  inline def apply(get: Parameters101): GetParameters101 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters101]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters101] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters101): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

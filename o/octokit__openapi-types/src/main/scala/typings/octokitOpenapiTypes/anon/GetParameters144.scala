package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters144 extends StObject {
  
  /**
    * List team members
    * @description Team members will include the members of child teams.
    *
    * To list members in a team, the team must be visible to the authenticated user.
    */
  var get: Parameters144
}
object GetParameters144 {
  
  inline def apply(get: Parameters144): GetParameters144 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters144]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters144] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters144): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}

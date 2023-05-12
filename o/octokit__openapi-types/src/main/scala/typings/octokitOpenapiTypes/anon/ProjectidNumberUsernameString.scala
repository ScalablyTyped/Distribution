package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidNumberUsernameString extends StObject {
  
  var project_id: Double
  
  var username: String
}
object ProjectidNumberUsernameString {
  
  inline def apply(project_id: Double, username: String): ProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidNumberUsernameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectidNumberUsernameString] (val x: Self) extends AnyVal {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

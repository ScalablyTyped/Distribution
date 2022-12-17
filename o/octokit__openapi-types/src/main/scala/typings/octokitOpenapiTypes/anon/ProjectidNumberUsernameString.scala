package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidNumberUsernameString extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: Double
  
  /** The handle for the GitHub user account. */
  var username: String
}
object ProjectidNumberUsernameString {
  
  inline def apply(project_id: Double, username: String): ProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidNumberUsernameString]
  }
  
  extension [Self <: ProjectidNumberUsernameString](x: Self) {
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

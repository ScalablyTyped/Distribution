package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collaborators extends StObject {
  
  var collaborators: Double
  
  var name: String
  
  var private_repos: Double
  
  var space: Double
}
object Collaborators {
  
  inline def apply(collaborators: Double, name: String, private_repos: Double, space: Double): Collaborators = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaborators]
  }
  
  extension [Self <: Collaborators](x: Self) {
    
    inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}

package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorResource extends StObject {
  
  var projects: ProjectsResource
}
object CursorResource {
  
  inline def apply(projects: ProjectsResource): CursorResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CursorResource] (val x: Self) extends AnyVal {
    
    inline def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

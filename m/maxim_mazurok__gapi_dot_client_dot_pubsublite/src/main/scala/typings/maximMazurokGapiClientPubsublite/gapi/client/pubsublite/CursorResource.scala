package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorResource extends StObject {
  
  var projects: ProjectsResource = js.native
}
object CursorResource {
  
  @scala.inline
  def apply(projects: ProjectsResource): CursorResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorResource]
  }
  
  @scala.inline
  implicit class CursorResourceMutableBuilder[Self <: CursorResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

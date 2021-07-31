package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminResource extends StObject {
  
  var projects: ProjectsResource
}
object AdminResource {
  
  @scala.inline
  def apply(projects: ProjectsResource): AdminResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResource]
  }
  
  @scala.inline
  implicit class AdminResourceMutableBuilder[Self <: AdminResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicStatsResource extends StObject {
  
  var projects: ProjectsResource
}
object TopicStatsResource {
  
  @scala.inline
  def apply(projects: ProjectsResource): TopicStatsResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicStatsResource]
  }
  
  @scala.inline
  implicit class TopicStatsResourceMutableBuilder[Self <: TopicStatsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

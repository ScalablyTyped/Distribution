package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicStatsResource extends StObject {
  
  var projects: ProjectsResource
}
object TopicStatsResource {
  
  inline def apply(projects: ProjectsResource): TopicStatsResource = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicStatsResource]
  }
  
  extension [Self <: TopicStatsResource](x: Self) {
    
    inline def setProjects(value: ProjectsResource): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}

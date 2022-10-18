package typings.onfleetNodeOnfleet.resourcesTasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer
  - typings.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer
  - typings.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer
*/
trait TaskContainer extends StObject
object TaskContainer {
  
  inline def OrganizationTaskContainer(organization: String): typings.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ORGANIZATION")
    __obj.asInstanceOf[typings.onfleetNodeOnfleet.resourcesTasksMod.OrganizationTaskContainer]
  }
  
  inline def TeamTaskContainer(team: String): typings.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer = {
    val __obj = js.Dynamic.literal(team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TEAM")
    __obj.asInstanceOf[typings.onfleetNodeOnfleet.resourcesTasksMod.TeamTaskContainer]
  }
  
  inline def WorkerTaskContainer(worker: String): typings.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WORKER")
    __obj.asInstanceOf[typings.onfleetNodeOnfleet.resourcesTasksMod.WorkerTaskContainer]
  }
}

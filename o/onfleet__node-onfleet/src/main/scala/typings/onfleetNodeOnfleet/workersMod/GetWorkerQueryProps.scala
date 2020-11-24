package typings.onfleetNodeOnfleet.workersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @prop filter - Optional. A comma-separated list of fields to return, if all are not desired. For example, name, location
  * @prop phones - Optional. A comma-separated list of workers' phone numbers.
  * @prop states - Optional. A comma-separated list of worker states, where 0 is off-duty,
  * 1 is idle (on-duty, no active task) and 2 is active (on-duty, active task).
  * @prop teams - Optional. A comma-separated list of the team IDs that workers must be part of.
  */
@js.native
trait GetWorkerQueryProps extends js.Object {
  
  var filter: js.UndefOr[String] = js.native
  
  var phones: js.UndefOr[String] = js.native
  
  var states: js.UndefOr[String] = js.native
  
  var teams: js.UndefOr[String] = js.native
}
object GetWorkerQueryProps {
  
  @scala.inline
  def apply(): GetWorkerQueryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkerQueryProps]
  }
  
  @scala.inline
  implicit class GetWorkerQueryPropsOps[Self <: GetWorkerQueryProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setPhones(value: String): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setStates(value: String): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setTeams(value: String): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeams: Self = this.set("teams", js.undefined)
  }
}

package typings.onfleetNodeOnfleet.teamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop managers - An array of managing administrator IDs.
  * @prop name - A unique name for the team.
  * @prop workers - An array of worker IDs.
  * @prop hub - Optional. The ID of the team's hub.
  */
@js.native
trait CreateTeamProps extends js.Object {
  var hub: js.UndefOr[String] = js.native
  var managers: js.Array[String] = js.native
  var name: String = js.native
  var workers: js.Array[String] = js.native
}

object CreateTeamProps {
  @scala.inline
  def apply(managers: js.Array[String], name: String, workers: js.Array[String]): CreateTeamProps = {
    val __obj = js.Dynamic.literal(managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTeamProps]
  }
  @scala.inline
  implicit class CreateTeamPropsOps[Self <: CreateTeamProps] (val x: Self) extends AnyVal {
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
    def setManagersVarargs(value: String*): Self = this.set("managers", js.Array(value :_*))
    @scala.inline
    def setManagers(value: js.Array[String]): Self = this.set("managers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkersVarargs(value: String*): Self = this.set("workers", js.Array(value :_*))
    @scala.inline
    def setWorkers(value: js.Array[String]): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHub(value: String): Self = this.set("hub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHub: Self = this.set("hub", js.undefined)
  }
  
}


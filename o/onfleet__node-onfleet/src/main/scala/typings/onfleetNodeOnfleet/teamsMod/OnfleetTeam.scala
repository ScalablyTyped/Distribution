package typings.onfleetNodeOnfleet.teamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetTeam extends js.Object {
  var hub: String = js.native
  var id: String = js.native
  var managers: js.Array[String] = js.native
  var name: String = js.native
  var timeCreated: Double = js.native
  var timeLastModified: Double = js.native
  var workers: js.Array[String] = js.native
}

object OnfleetTeam {
  @scala.inline
  def apply(
    hub: String,
    id: String,
    managers: js.Array[String],
    name: String,
    timeCreated: Double,
    timeLastModified: Double,
    workers: js.Array[String]
  ): OnfleetTeam = {
    val __obj = js.Dynamic.literal(hub = hub.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetTeam]
  }
  @scala.inline
  implicit class OnfleetTeamOps[Self <: OnfleetTeam] (val x: Self) extends AnyVal {
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
    def setHub(value: String): Self = this.set("hub", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagersVarargs(value: String*): Self = this.set("managers", js.Array(value :_*))
    @scala.inline
    def setManagers(value: js.Array[String]): Self = this.set("managers", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkersVarargs(value: String*): Self = this.set("workers", js.Array(value :_*))
    @scala.inline
    def setWorkers(value: js.Array[String]): Self = this.set("workers", value.asInstanceOf[js.Any])
  }
  
}


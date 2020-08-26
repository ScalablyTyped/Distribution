package typings.onfleetNodeOnfleet.teamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTeamProps extends js.Object {
  var hub: js.UndefOr[String] = js.native
  var managers: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var workers: js.UndefOr[js.Array[String]] = js.native
}

object UpdateTeamProps {
  @scala.inline
  def apply(): UpdateTeamProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTeamProps]
  }
  @scala.inline
  implicit class UpdateTeamPropsOps[Self <: UpdateTeamProps] (val x: Self) extends AnyVal {
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
    def deleteHub: Self = this.set("hub", js.undefined)
    @scala.inline
    def setManagersVarargs(value: String*): Self = this.set("managers", js.Array(value :_*))
    @scala.inline
    def setManagers(value: js.Array[String]): Self = this.set("managers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagers: Self = this.set("managers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setWorkersVarargs(value: String*): Self = this.set("workers", js.Array(value :_*))
    @scala.inline
    def setWorkers(value: js.Array[String]): Self = this.set("workers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
  }
  
}


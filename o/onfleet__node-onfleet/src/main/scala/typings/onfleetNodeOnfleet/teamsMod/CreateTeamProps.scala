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
trait CreateTeamProps extends js.Object {
  var hub: js.UndefOr[String] = js.undefined
  var managers: js.Array[String]
  var name: String
  var workers: js.Array[String]
}

object CreateTeamProps {
  @scala.inline
  def apply(managers: js.Array[String], name: String, workers: js.Array[String], hub: String = null): CreateTeamProps = {
    val __obj = js.Dynamic.literal(managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
    if (hub != null) __obj.updateDynamic("hub")(hub.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTeamProps]
  }
}


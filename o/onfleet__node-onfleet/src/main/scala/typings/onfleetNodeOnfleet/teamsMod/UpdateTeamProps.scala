package typings.onfleetNodeOnfleet.teamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTeamProps extends js.Object {
  var hub: js.UndefOr[String] = js.undefined
  var managers: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var workers: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateTeamProps {
  @scala.inline
  def apply(
    hub: String = null,
    managers: js.Array[String] = null,
    name: String = null,
    workers: js.Array[String] = null
  ): UpdateTeamProps = {
    val __obj = js.Dynamic.literal()
    if (hub != null) __obj.updateDynamic("hub")(hub.asInstanceOf[js.Any])
    if (managers != null) __obj.updateDynamic("managers")(managers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTeamProps]
  }
}


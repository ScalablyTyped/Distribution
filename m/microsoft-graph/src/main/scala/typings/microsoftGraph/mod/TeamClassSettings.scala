package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamClassSettings extends js.Object {
  var notifyGuardiansAboutAssignments: js.UndefOr[Boolean] = js.undefined
}

object TeamClassSettings {
  @scala.inline
  def apply(notifyGuardiansAboutAssignments: js.UndefOr[Boolean] = js.undefined): TeamClassSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(notifyGuardiansAboutAssignments)) __obj.updateDynamic("notifyGuardiansAboutAssignments")(notifyGuardiansAboutAssignments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamClassSettings]
  }
}


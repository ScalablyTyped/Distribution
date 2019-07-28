package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblem extends js.Object {
  var locations: js.UndefOr[js.Array[IProblemLocation]] = js.undefined
  var message: String
  var name: String
  var severity: String
}

object IProblem {
  @scala.inline
  def apply(message: String, name: String, severity: String, locations: js.Array[IProblemLocation] = null): IProblem = {
    val __obj = js.Dynamic.literal(message = message, name = name, severity = severity)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[IProblem]
  }
}


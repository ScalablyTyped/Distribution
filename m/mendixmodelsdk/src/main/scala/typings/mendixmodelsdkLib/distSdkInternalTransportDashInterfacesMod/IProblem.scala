package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblem extends js.Object {
  var locations: js.UndefOr[js.Array[IProblemLocation]] = js.undefined
  var message: java.lang.String
  var name: java.lang.String
  var severity: java.lang.String
}

object IProblem {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    severity: java.lang.String,
    locations: js.Array[IProblemLocation] = null
  ): IProblem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("severity")(severity)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[IProblem]
  }
}


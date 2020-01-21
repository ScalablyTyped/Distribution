package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblem extends js.Object {
  var arguments: js.UndefOr[IProblemArguments] = js.undefined
  var errorCode: js.UndefOr[String] = js.undefined
  var locations: js.UndefOr[js.Array[IProblemLocation]] = js.undefined
  var message: String
  var name: String
  var severity: String
}

object IProblem {
  @scala.inline
  def apply(
    message: String,
    name: String,
    severity: String,
    arguments: IProblemArguments = null,
    errorCode: String = null,
    locations: js.Array[IProblemLocation] = null
  ): IProblem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProblem]
  }
}


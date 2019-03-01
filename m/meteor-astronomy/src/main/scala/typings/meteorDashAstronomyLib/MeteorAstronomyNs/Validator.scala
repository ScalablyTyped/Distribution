package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  var param: js.Any
  var `type`: java.lang.String
}

object Validator {
  @scala.inline
  def apply(param: js.Any, `type`: java.lang.String): Validator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[Validator]
  }
}


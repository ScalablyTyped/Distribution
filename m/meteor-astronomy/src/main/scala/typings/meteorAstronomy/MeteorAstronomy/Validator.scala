package typings.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  var param: js.Any
  var `type`: String
}

object Validator {
  @scala.inline
  def apply(param: js.Any, `type`: String): Validator = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
}


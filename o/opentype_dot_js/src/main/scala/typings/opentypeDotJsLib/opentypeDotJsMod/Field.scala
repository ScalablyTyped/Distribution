package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
  var value: js.Any
}

object Field {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, value: js.Any): Field = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Field]
  }
}


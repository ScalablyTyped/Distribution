package typings
package orientjsLib.orientjsMod.orientjsNs.errorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseError extends js.Object {
  var name: java.lang.String
  def init(name: java.lang.String): scala.Unit
}

object BaseError {
  @scala.inline
  def apply(init: js.Function1[java.lang.String, scala.Unit], name: java.lang.String): BaseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BaseError]
  }
}


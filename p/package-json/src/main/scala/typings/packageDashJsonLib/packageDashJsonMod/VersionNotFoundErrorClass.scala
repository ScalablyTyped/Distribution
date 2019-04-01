package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionNotFoundErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_VersionNotFoundErrorClass: packageDashJsonLib.packageDashJsonLibStrings.VersionNotFoundError
}

object VersionNotFoundErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: packageDashJsonLib.packageDashJsonLibStrings.VersionNotFoundError,
    stack: java.lang.String = null
  ): VersionNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[VersionNotFoundErrorClass]
  }
}


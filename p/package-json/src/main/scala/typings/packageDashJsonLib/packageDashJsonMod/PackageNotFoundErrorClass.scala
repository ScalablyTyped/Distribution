package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageNotFoundErrorClass
  extends stdLib.Error {
  @JSName("name")
  val name_PackageNotFoundErrorClass: packageDashJsonLib.packageDashJsonLibStrings.PackageNotFoundError
}

object PackageNotFoundErrorClass {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: packageDashJsonLib.packageDashJsonLibStrings.PackageNotFoundError,
    stack: java.lang.String = null
  ): PackageNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PackageNotFoundErrorClass]
  }
}


package typings.packageDashJson.packageDashJsonMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageNotFoundErrorClass extends Error {
  @JSName("name")
  val name_PackageNotFoundErrorClass: typings.packageDashJson.packageDashJsonStrings.PackageNotFoundError
}

object PackageNotFoundErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typings.packageDashJson.packageDashJsonStrings.PackageNotFoundError,
    stack: String = null
  ): PackageNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PackageNotFoundErrorClass]
  }
}


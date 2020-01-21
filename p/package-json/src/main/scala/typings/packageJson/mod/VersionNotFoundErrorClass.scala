package typings.packageJson.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionNotFoundErrorClass extends Error {
  @JSName("name")
  val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError
}

object VersionNotFoundErrorClass {
  @scala.inline
  def apply(
    message: String,
    name: typings.packageJson.packageJsonStrings.VersionNotFoundError,
    stack: String = null
  ): VersionNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionNotFoundErrorClass]
  }
}


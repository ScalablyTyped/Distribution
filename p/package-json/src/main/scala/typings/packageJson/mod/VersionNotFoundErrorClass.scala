package typings.packageJson.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionNotFoundErrorClass extends Error {
  @JSName("name")
  val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError = js.native
}

object VersionNotFoundErrorClass {
  @scala.inline
  def apply(message: String, name: typings.packageJson.packageJsonStrings.VersionNotFoundError): VersionNotFoundErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionNotFoundErrorClass]
  }
  @scala.inline
  implicit class VersionNotFoundErrorClassOps[Self <: VersionNotFoundErrorClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.packageJson.packageJsonStrings.VersionNotFoundError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}


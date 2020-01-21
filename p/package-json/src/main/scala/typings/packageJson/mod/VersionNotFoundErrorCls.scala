package typings.packageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	The error thrown when the given package version cannot be found.
	*/
@JSImport("package-json", "VersionNotFoundError")
@js.native
class VersionNotFoundErrorCls protected () extends VersionNotFoundErrorClass {
  def this(packageName: String, version: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override val name_VersionNotFoundErrorClass: typings.packageJson.packageJsonStrings.VersionNotFoundError = js.native
}


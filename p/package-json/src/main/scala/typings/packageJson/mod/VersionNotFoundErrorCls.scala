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
}


package typings.packageDashJson.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	The error thrown when the given package name cannot be found.
	*/
@JSImport("package-json", "PackageNotFoundError")
@js.native
class PackageNotFoundErrorCls protected () extends PackageNotFoundErrorClass {
  def this(packageName: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  @JSName("name")
  override val name_PackageNotFoundErrorClass: typings.packageDashJson.packageDashJsonStrings.PackageNotFoundError = js.native
}


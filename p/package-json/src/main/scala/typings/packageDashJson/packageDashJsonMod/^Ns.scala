package typings.packageDashJson.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("package-json", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  /**
  	The error thrown when the given package name cannot be found.
  	*/
  @js.native
  class PackageNotFoundError protected () extends PackageNotFoundErrorClass {
    def this(packageName: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_PackageNotFoundErrorClass: typings.packageDashJson.packageDashJsonStrings.PackageNotFoundError = js.native
  }
  
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  @js.native
  class VersionNotFoundError protected () extends VersionNotFoundErrorClass {
    def this(packageName: String, version: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_VersionNotFoundErrorClass: typings.packageDashJson.packageDashJsonStrings.VersionNotFoundError = js.native
  }
  
}


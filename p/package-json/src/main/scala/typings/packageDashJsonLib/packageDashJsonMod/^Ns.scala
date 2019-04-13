package typings
package packageDashJsonLib.packageDashJsonMod

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
  class PackageNotFoundError protected ()
    extends packageDashJsonLib.packageDashJsonMod.PackageNotFoundErrorClass {
    def this(packageName: java.lang.String) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_PackageNotFoundErrorClass: packageDashJsonLib.packageDashJsonLibStrings.PackageNotFoundError = js.native
  }
  
  /**
  	The error thrown when the given package version cannot be found.
  	*/
  @js.native
  class VersionNotFoundError protected ()
    extends packageDashJsonLib.packageDashJsonMod.VersionNotFoundErrorClass {
    def this(packageName: java.lang.String, version: java.lang.String) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_VersionNotFoundErrorClass: packageDashJsonLib.packageDashJsonLibStrings.VersionNotFoundError = js.native
  }
  
}


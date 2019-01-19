package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("package-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Get metadata of a package from the npm registry.
    *
    * @param name Name of the package.
    */
  def apply(name: java.lang.String): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.PackageJson] = js.native
  def apply(name: java.lang.String, options: packageDashJsonLib.packageDashJsonMod.packageJsonNs.Options): js.Promise[packageDashJsonLib.packageDashJsonMod.packageJsonNs.PackageJson] = js.native
}


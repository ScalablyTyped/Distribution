package typings
package pkgDashConfLib.pkgDashConfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkg-conf", JSImport.Namespace)
@js.native
object pkgDashConfModMembers extends js.Object {
  // Returns a Promise for the config.
  def apply(namespace: java.lang.String): stdLib.Promise[pkgDashConfLib.pkgDashConfMod.pkgConfNs.JsonMap] = js.native
  // Returns a Promise for the config.
  def apply(namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Options): stdLib.Promise[pkgDashConfLib.pkgDashConfMod.pkgConfNs.JsonMap] = js.native
  // Pass in the config returned from any of the above methods.
  // Returns the filepath to the package.json file or null when not found.
  def filepath(config: pkgDashConfLib.pkgDashConfMod.pkgConfNs.JsonMap): java.lang.String | scala.Null = js.native
  // Returns the config.
  def sync(namespace: java.lang.String): pkgDashConfLib.pkgDashConfMod.pkgConfNs.JsonMap = js.native
  // Returns the config.
  def sync(namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.pkgConfNs.Options): pkgDashConfLib.pkgDashConfMod.pkgConfNs.JsonMap = js.native
}


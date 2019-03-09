package typings
package pkgDashConfLib.pkgDashConfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkg-conf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.Config */](namespace: java.lang.String): js.Promise[ConfigType with pkgDashConfLib.pkgDashConfMod.Config] = js.native
  def default[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.Config */](namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.Options[ConfigType]): js.Promise[ConfigType with pkgDashConfLib.pkgDashConfMod.Config] = js.native
  def filepath(config: pkgDashConfLib.pkgDashConfMod.Config): java.lang.String | scala.Null = js.native
  def sync[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.Config */](namespace: java.lang.String): ConfigType with pkgDashConfLib.pkgDashConfMod.Config = js.native
  def sync[ConfigType /* <: pkgDashConfLib.pkgDashConfMod.Config */](namespace: java.lang.String, options: pkgDashConfLib.pkgDashConfMod.Options[ConfigType]): ConfigType with pkgDashConfLib.pkgDashConfMod.Config = js.native
}


package typings
package pkgDashConfLib.pkgDashConfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkg-conf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ConfigType /* <: Config */](namespace: java.lang.String): js.Promise[ConfigType with Config] = js.native
  def default[ConfigType /* <: Config */](namespace: java.lang.String, options: Options[ConfigType]): js.Promise[ConfigType with Config] = js.native
  def filepath(config: Config): java.lang.String | scala.Null = js.native
  def sync[ConfigType /* <: Config */](namespace: java.lang.String): ConfigType with Config = js.native
  def sync[ConfigType /* <: Config */](namespace: java.lang.String, options: Options[ConfigType]): ConfigType with Config = js.native
}


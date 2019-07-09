package typings
package atNodelibFsDotStatLib.atNodelibFsDotStatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def stat(path: java.lang.String, callback: AsyncCallback): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotStatLib.outSettingsMod.Options,
    callback: AsyncCallback
  ): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotStatLib.outSettingsMod.default,
    callback: AsyncCallback
  ): scala.Unit = js.native
  def statSync(path: java.lang.String): atNodelibFsDotStatLib.outTypesMod.Stats = js.native
  def statSync(path: java.lang.String, optionsOrSettings: atNodelibFsDotStatLib.outSettingsMod.Options): atNodelibFsDotStatLib.outTypesMod.Stats = js.native
  def statSync(path: java.lang.String, optionsOrSettings: atNodelibFsDotStatLib.outSettingsMod.default): atNodelibFsDotStatLib.outTypesMod.Stats = js.native
}


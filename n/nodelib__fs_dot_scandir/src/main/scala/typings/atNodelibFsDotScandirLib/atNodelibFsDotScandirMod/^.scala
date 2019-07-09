package typings
package atNodelibFsDotScandirLib.atNodelibFsDotScandirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def scandir(path: java.lang.String, callback: AsyncCallback): scala.Unit = js.native
  def scandir(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.Options,
    callback: AsyncCallback
  ): scala.Unit = js.native
  def scandir(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.default,
    callback: AsyncCallback
  ): scala.Unit = js.native
  def scandirSync(path: java.lang.String): js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry] = js.native
  def scandirSync(path: java.lang.String, optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.Options): js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry] = js.native
  def scandirSync(path: java.lang.String, optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.default): js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry] = js.native
}


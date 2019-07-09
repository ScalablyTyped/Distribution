package typings
package atNodelibFsDotWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(path: java.lang.String, callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback): scala.Unit = js.native
  def apply(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.Options,
    callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback
  ): scala.Unit = js.native
  def apply(
    path: java.lang.String,
    optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.default,
    callback: atNodelibFsDotScandirLib.atNodelibFsDotScandirMod.AsyncCallback
  ): scala.Unit = js.native
  def __promisify__(path: java.lang.String): js.Promise[js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry]] = js.native
  def __promisify__(path: java.lang.String, optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.Options): js.Promise[js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry]] = js.native
  def __promisify__(path: java.lang.String, optionsOrSettings: atNodelibFsDotScandirLib.outSettingsMod.default): js.Promise[js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry]] = js.native
}


package typings
package atNodelibFsDotWalkLib.atNodelibFsDotWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def walk(dir: java.lang.String, callback: atNodelibFsDotWalkLib.outProvidersAsyncMod.AsyncCallback): scala.Unit = js.native
  def walk(
    dir: java.lang.String,
    optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.Options,
    callback: atNodelibFsDotWalkLib.outProvidersAsyncMod.AsyncCallback
  ): scala.Unit = js.native
  def walk(
    dir: java.lang.String,
    optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.default,
    callback: atNodelibFsDotWalkLib.outProvidersAsyncMod.AsyncCallback
  ): scala.Unit = js.native
  def walkStream(dir: java.lang.String): nodeLib.streamMod.Readable = js.native
  def walkStream(dir: java.lang.String, optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.Options): nodeLib.streamMod.Readable = js.native
  def walkStream(dir: java.lang.String, optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.default): nodeLib.streamMod.Readable = js.native
  def walkSync(dir: java.lang.String): js.Array[atNodelibFsDotWalkLib.outTypesMod.Entry] = js.native
  def walkSync(dir: java.lang.String, optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.Options): js.Array[atNodelibFsDotWalkLib.outTypesMod.Entry] = js.native
  def walkSync(dir: java.lang.String, optionsOrSettings: atNodelibFsDotWalkLib.outSettingsMod.default): js.Array[atNodelibFsDotWalkLib.outTypesMod.Entry] = js.native
}


package typings.atNodelibFsDotStat.atNodelibFsDotStatMod

import typings.atNodelibFsDotStat.outSettingsMod.Options
import typings.atNodelibFsDotStat.outSettingsMod.default
import typings.atNodelibFsDotStat.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def stat(path: String, callback: AsyncCallback): Unit = js.native
  def stat(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def stat(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def statSync(path: String): Stats = js.native
  def statSync(path: String, optionsOrSettings: Options): Stats = js.native
  def statSync(path: String, optionsOrSettings: default): Stats = js.native
}


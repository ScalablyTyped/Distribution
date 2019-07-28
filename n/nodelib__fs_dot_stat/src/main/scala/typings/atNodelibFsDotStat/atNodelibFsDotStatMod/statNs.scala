package typings.atNodelibFsDotStat.atNodelibFsDotStatMod

import typings.atNodelibFsDotStat.outSettingsMod.Options
import typings.atNodelibFsDotStat.outSettingsMod.default
import typings.atNodelibFsDotStat.outTypesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", "stat")
@js.native
object statNs extends js.Object {
  def __promisify__(path: String): js.Promise[Stats] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[Stats] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[Stats] = js.native
}


package typings.atNodelibFsDotWalk.atNodelibFsDotWalkMod

import typings.atNodelibFsDotWalk.outSettingsMod.Options
import typings.atNodelibFsDotWalk.outSettingsMod.default
import typings.atNodelibFsDotWalk.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk", "walk")
@js.native
object walkNs extends js.Object {
  def __promisify__(dir: String): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(dir: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(dir: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
}


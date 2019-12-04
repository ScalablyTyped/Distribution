package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_OptionsOrSettings extends js.Object {
  def apply(path: String): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
}


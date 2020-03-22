package typings.nodelibFsWalk

import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(path: String): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def apply(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
}


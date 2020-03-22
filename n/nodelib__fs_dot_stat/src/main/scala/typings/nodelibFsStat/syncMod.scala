package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  def read(path: String, settings: default): Stats = js.native
}


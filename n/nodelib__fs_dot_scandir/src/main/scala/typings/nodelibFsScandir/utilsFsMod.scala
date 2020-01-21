package typings.nodelibFsScandir

import typings.nodelibFsScandir.typesMod.Dirent
import typings.nodelibFsScandir.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/utils/fs", JSImport.Namespace)
@js.native
object utilsFsMod extends js.Object {
  def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
}


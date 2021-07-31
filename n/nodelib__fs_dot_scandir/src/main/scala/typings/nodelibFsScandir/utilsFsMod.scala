package typings.nodelibFsScandir

import typings.nodelibFsScandir.typesMod.Dirent
import typings.nodelibFsScandir.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsFsMod {
  
  @JSImport("@nodelib/fs.scandir/out/utils/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createDirentFromStats(name: String, stats: Stats): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirentFromStats")(name.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Dirent]
}

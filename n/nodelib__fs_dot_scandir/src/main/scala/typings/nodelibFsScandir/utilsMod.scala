package typings.nodelibFsScandir

import typings.nodelibFsScandir.typesMod.Dirent
import typings.nodelibFsScandir.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object fs {
    
    @JSImport("@nodelib/fs.scandir/out/utils", "fs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDirentFromStats(name: String, stats: Stats): Dirent = (^.asInstanceOf[js.Dynamic].applyDynamic("createDirentFromStats")(name.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Dirent]
  }
}

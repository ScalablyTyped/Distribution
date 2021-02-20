package typings.nodelibFsScandir

import typings.nodelibFsScandir.typesMod.Dirent
import typings.nodelibFsScandir.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object fs {
    
    @JSImport("@nodelib/fs.scandir/out/utils", "fs.createDirentFromStats")
    @js.native
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
}

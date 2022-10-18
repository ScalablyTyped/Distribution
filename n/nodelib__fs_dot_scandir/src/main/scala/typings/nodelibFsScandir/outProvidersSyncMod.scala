package typings.nodelibFsScandir

import typings.nodelibFsScandir.outSettingsMod.default
import typings.nodelibFsScandir.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersSyncMod {
  
  @JSImport("@nodelib/fs.scandir/out/providers/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(directory: String, settings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  inline def readdir(directory: String, settings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  inline def readdirWithFileTypes(directory: String, settings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirWithFileTypes")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
}

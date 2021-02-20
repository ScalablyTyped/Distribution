package typings.nodelibFsScandir

import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("@nodelib/fs.scandir/out/providers/sync", "read")
  @js.native
  def read(directory: String, settings: default): js.Array[Entry] = js.native
  
  @JSImport("@nodelib/fs.scandir/out/providers/sync", "readdir")
  @js.native
  def readdir(directory: String, settings: default): js.Array[Entry] = js.native
  
  @JSImport("@nodelib/fs.scandir/out/providers/sync", "readdirWithFileTypes")
  @js.native
  def readdirWithFileTypes(directory: String, settings: default): js.Array[Entry] = js.native
}

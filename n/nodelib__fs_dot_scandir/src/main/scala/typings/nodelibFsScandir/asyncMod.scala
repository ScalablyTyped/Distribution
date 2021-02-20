package typings.nodelibFsScandir

import typings.node.NodeJS.ErrnoException
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@nodelib/fs.scandir/out/providers/async", "read")
  @js.native
  def read(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  @JSImport("@nodelib/fs.scandir/out/providers/async", "readdir")
  @js.native
  def readdir(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  @JSImport("@nodelib/fs.scandir/out/providers/async", "readdirWithFileTypes")
  @js.native
  def readdirWithFileTypes(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}

package typings.nodelibFsScandir

import typings.node.NodeJS.ErrnoException
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.scandir/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  
  def read(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  def readdir(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  def readdirWithFileTypes(directory: String, settings: default, callback: AsyncCallback): Unit = js.native
  
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}

package typings.nodelibFsScandir

import typings.node.NodeJS.ErrnoException
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@nodelib/fs.scandir/out/providers/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def read(directory: String, settings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readdir(directory: String, settings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readdirWithFileTypes(directory: String, settings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirWithFileTypes")(directory.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}

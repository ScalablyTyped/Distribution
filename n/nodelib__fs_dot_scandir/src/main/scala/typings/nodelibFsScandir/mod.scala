package typings.nodelibFsScandir

import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.scandir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.scandir", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  inline def scandir(path: String, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scandir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scandir(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scandir")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scandir(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scandir")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scandirSync(path: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
  inline def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  inline def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  type AsyncCallback = typings.nodelibFsScandir.asyncMod.AsyncCallback
}

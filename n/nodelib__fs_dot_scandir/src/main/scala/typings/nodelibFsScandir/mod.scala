package typings.nodelibFsScandir

import typings.nodelibFsScandir.outSettingsMod.Options
import typings.nodelibFsScandir.outSettingsMod.default
import typings.nodelibFsScandir.outTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.scandir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.scandir", "Settings")
  @js.native
  open class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  inline def scandirSync(path: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
  inline def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  inline def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("scandirSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  type AsyncCallback = typings.nodelibFsScandir.outProvidersAsyncMod.AsyncCallback
}

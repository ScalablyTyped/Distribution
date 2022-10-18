package typings.nodelibFsStat

import typings.nodelibFsStat.outSettingsMod.Options
import typings.nodelibFsStat.outSettingsMod.default
import typings.nodelibFsStat.outTypesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.stat", "Settings")
  @js.native
  open class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  inline def statSync(path: String): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[Stats]
  inline def statSync(path: String, optionsOrSettings: Options): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Stats]
  inline def statSync(path: String, optionsOrSettings: default): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Stats]
  
  type AsyncCallback = typings.nodelibFsStat.outProvidersAsyncMod.AsyncCallback
}

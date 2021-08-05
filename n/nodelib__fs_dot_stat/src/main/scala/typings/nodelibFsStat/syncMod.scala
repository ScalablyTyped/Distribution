package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("@nodelib/fs.stat/out/providers/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(path: String, settings: default): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Stats]
}

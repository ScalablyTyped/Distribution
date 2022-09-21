package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.ErrnoException
import typings.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@nodelib/fs.stat/out/providers/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(path: String, settings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AsyncCallback = js.Function2[/* error */ ErrnoException, /* stats */ Stats, Unit]
}

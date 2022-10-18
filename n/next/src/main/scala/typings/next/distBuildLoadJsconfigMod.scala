package typings.next

import typings.next.anon.JsConfig
import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildLoadJsconfigMod {
  
  @JSImport("next/dist/build/load-jsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dir: String, config: NextConfigComplete): js.Promise[JsConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dir.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JsConfig]]
}

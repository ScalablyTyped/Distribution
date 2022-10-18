package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerOptimizeAmpMod {
  
  @JSImport("next/dist/server/optimize-amp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String, config: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}

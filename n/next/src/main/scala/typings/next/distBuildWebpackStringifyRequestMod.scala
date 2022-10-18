package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackStringifyRequestMod {
  
  @JSImport("next/dist/build/webpack/stringify-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyRequest(loaderContext: Any, request: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRequest")(loaderContext.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[String]
}

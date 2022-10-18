package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsRemovePathPrefixMod {
  
  @JSImport("next/dist/shared/lib/router/utils/remove-path-prefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removePathPrefix(path: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removePathPrefix")(path.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsPathHasPrefixMod {
  
  @JSImport("next/dist/shared/lib/router/utils/path-has-prefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pathHasPrefix(path: String, prefix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathHasPrefix")(path.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

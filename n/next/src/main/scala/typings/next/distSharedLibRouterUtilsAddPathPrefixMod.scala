package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsAddPathPrefixMod {
  
  @JSImport("next/dist/shared/lib/router/utils/add-path-prefix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPathPrefix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addPathPrefix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addPathPrefix(path: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathPrefix")(path.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
}

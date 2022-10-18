package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsAddPathSuffixMod {
  
  @JSImport("next/dist/shared/lib/router/utils/add-path-suffix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPathSuffix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addPathSuffix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addPathSuffix(path: String, suffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathSuffix")(path.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[String]
}

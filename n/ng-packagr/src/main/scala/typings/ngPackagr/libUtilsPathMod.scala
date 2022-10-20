package typings.ngPackagr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPathMod {
  
  @JSImport("ng-packagr/lib/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureUnixPath(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureUnixPath")().asInstanceOf[String | Null]
  inline def ensureUnixPath(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureUnixPath")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}

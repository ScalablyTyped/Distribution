package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientHasBasePathMod {
  
  @JSImport("next/dist/client/has-base-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasBasePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRemoveBasePathMod {
  
  @JSImport("next/dist/client/remove-base-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeBasePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}

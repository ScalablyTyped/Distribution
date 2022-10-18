package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientAddBasePathMod {
  
  @JSImport("next/dist/client/add-base-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBasePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addBasePath(path: String, required: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addBasePath")(path.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String]
}

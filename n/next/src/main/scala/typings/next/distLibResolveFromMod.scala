package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibResolveFromMod {
  
  @JSImport("next/dist/lib/resolve-from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveFrom(fromDirectory: String, moduleId: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFrom")(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolveFrom(fromDirectory: String, moduleId: String, silent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFrom")(fromDirectory.asInstanceOf[js.Any], moduleId.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[Any]
}

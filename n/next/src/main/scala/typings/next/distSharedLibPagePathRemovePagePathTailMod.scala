package typings.next

import typings.next.anon.KeepIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibPagePathRemovePagePathTailMod {
  
  @JSImport("next/dist/shared/lib/page-path/remove-page-path-tail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removePagePathTail(pagePath: String, options: KeepIndex): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removePagePathTail")(pagePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}

package typings.next

import typings.next.anon.Extensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibPagePathAbsolutePathToPageMod {
  
  @JSImport("next/dist/shared/lib/page-path/absolute-path-to-page", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def absolutePathToPage(pagePath: String, options: Extensions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absolutePathToPage")(pagePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}

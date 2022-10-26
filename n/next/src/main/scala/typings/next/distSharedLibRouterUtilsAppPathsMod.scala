package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsAppPathsMod {
  
  @JSImport("next/dist/shared/lib/router/utils/app-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeAppPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAppPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeRscPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRscPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalizeRscPath(pathname: String, enabled: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRscPath")(pathname.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[String]
}

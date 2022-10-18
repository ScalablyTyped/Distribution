package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsGetRouteFromAssetPathMod {
  
  @JSImport("next/dist/shared/lib/router/utils/get-route-from-asset-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(assetPath: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(assetPath.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
}

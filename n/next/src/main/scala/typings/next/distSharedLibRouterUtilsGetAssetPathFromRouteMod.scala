package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsGetAssetPathFromRouteMod {
  
  @JSImport("next/dist/shared/lib/router/utils/get-asset-path-from-route", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(route: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(route.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(route: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(route.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
}

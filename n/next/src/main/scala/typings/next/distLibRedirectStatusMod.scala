package typings.next

import typings.next.anon.Permanent
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRedirectStatusMod {
  
  @JSImport("next/dist/lib/redirect-status", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/lib/redirect-status", "allowedStatusCodes")
  @js.native
  val allowedStatusCodes: Set[Double] = js.native
  
  inline def getRedirectStatus(route: Permanent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectStatus")(route.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def modifyRouteRegex(regex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyRouteRegex")(regex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def modifyRouteRegex(regex: String, restrictedPaths: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyRouteRegex")(regex.asInstanceOf[js.Any], restrictedPaths.asInstanceOf[js.Any])).asInstanceOf[String]
}

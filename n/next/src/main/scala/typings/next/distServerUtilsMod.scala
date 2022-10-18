package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerUtilsMod {
  
  @JSImport("next/dist/server/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanAmpPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAmpPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBlockedPage(pathname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockedPage")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTargetLikeServerless(target: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTargetLikeServerless")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("next/dist/server/utils", "shouldUseReactRoot")
  @js.native
  val shouldUseReactRoot: Boolean = js.native
}

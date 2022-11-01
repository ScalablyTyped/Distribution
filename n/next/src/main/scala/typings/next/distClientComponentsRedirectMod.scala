package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsRedirectMod {
  
  @JSImport("next/dist/client/components/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/redirect", "REDIRECT_ERROR_CODE")
  @js.native
  val REDIRECT_ERROR_CODE: /* "NEXT_REDIRECT" */ String = js.native
  
  inline def redirect(url: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}

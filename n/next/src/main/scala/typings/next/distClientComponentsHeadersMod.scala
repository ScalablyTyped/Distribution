package typings.next

import typings.next.distServerWebSpecExtensionCookiesMod.NextCookies
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsHeadersMod {
  
  @JSImport("next/dist/client/components/headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cookies(): NextCookies = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")().asInstanceOf[NextCookies]
  
  inline def headers(): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[Headers]
  
  inline def previewData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("previewData")().asInstanceOf[Any]
}

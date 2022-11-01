package typings.next

import typings.next.distServerAppRenderMod.ReadonlyHeaders
import typings.next.distServerAppRenderMod.ReadonlyRequestCookies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsHeadersMod {
  
  @JSImport("next/dist/client/components/headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cookies(): ReadonlyRequestCookies = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")().asInstanceOf[ReadonlyRequestCookies]
  
  inline def headers(): ReadonlyHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")().asInstanceOf[ReadonlyHeaders]
  
  inline def previewData(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("previewData")().asInstanceOf[Any]
}

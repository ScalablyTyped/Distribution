package typings.next

import typings.next.anon.AppMod
import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackLoadersNextEdgeSsrLoaderRenderMod {
  
  @JSImport("next/dist/build/webpack/loaders/next-edge-ssr-loader/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRender(param0: AppMod): js.Function1[/* request */ Request, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRender")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* request */ Request, js.Promise[Response]]]
}

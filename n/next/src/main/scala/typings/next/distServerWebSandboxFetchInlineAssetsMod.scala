package typings.next

import typings.next.anon.Input
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSandboxFetchInlineAssetsMod {
  
  @JSImport("next/dist/server/web/sandbox/fetch-inline-assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchInlineAsset(options: Input): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchInlineAsset")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
}

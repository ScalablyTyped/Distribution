package typings.next

import typings.std.IdleRequestCallback
import typings.std.IdleRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRequestIdleCallbackMod {
  
  @JSImport("next/dist/client/request-idle-callback", "cancelIdleCallback")
  @js.native
  val cancelIdleCallback: (js.Function1[/* handle */ Double, Unit]) & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.cancelIdleCallback */ Any) = js.native
  
  @JSImport("next/dist/client/request-idle-callback", "requestIdleCallback")
  @js.native
  val requestIdleCallback: (js.Function2[
    /* callback */ IdleRequestCallback, 
    /* options */ js.UndefOr[IdleRequestOptions], 
    Double
  ]) & (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.requestIdleCallback */ Any) = js.native
}

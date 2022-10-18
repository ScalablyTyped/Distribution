package typings.next

import typings.next.anon.Handler
import typings.next.distServerWebTypesMod.FetchEventResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebAdapterMod {
  
  @JSImport("next/dist/server/web/adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adapter(params: Handler): js.Promise[FetchEventResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("adapter")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FetchEventResult]]
  
  inline def blockUnallowedResponse(promise: js.Promise[FetchEventResult]): js.Promise[FetchEventResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockUnallowedResponse")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FetchEventResult]]
  
  inline def enhanceGlobals(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enhanceGlobals")().asInstanceOf[Unit]
}

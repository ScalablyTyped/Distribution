package typings.nextAuth

import typings.nextAuth.anon.SessionStore
import typings.nextAuth.coreMod.OutgoingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesSignoutMod {
  
  @JSImport("next-auth/core/routes/signout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: SessionStore): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
}

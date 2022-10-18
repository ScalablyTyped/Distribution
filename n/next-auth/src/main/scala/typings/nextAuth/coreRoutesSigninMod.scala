package typings.nextAuth

import typings.nextAuth.anon.BodyOptions
import typings.nextAuth.coreMod.OutgoingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesSigninMod {
  
  @JSImport("next-auth/core/routes/signin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: BodyOptions): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
}

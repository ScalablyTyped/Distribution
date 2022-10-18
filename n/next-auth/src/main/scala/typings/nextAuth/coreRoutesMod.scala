package typings.nextAuth

import typings.nextAuth.anon.BodyOptions
import typings.nextAuth.anon.Method
import typings.nextAuth.anon.SessionStore
import typings.nextAuth.coreMod.OutgoingResponse
import typings.nextAuth.coreRoutesProvidersMod.PublicProvider
import typings.nextAuth.coreRoutesSessionMod.SessionParams
import typings.nextAuth.coreTypesMod.Session
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesMod {
  
  @JSImport("next-auth/core/routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callback(params: Method): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("callback")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
  
  inline def providers(
    providers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
    ]
  ): OutgoingResponse[Record[String, PublicProvider]] = ^.asInstanceOf[js.Dynamic].applyDynamic("providers")(providers.asInstanceOf[js.Any]).asInstanceOf[OutgoingResponse[Record[String, PublicProvider]]]
  
  inline def session(params: SessionParams): js.Promise[OutgoingResponse[Session | js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("session")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Session | js.Object]]]
  
  inline def signin(params: BodyOptions): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("signin")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
  
  inline def signout(params: SessionStore): js.Promise[OutgoingResponse[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("signout")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OutgoingResponse[Any]]]
}

package typings.nextAuth

import typings.nextAuth.adaptersMod.AdapterUser
import typings.nextAuth.anon.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibEmailGetUserFromEmailMod {
  
  @JSImport("next-auth/core/lib/email/getUserFromEmail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasEmailAdapter: Adapter): js.Promise[AdapterUser] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasEmailAdapter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdapterUser]]
}

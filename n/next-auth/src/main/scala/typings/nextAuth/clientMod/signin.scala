package typings.nextAuth.clientMod

import typings.nextAuth.anon.GenericObjectcallbackUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth/client", "signin")
@js.native
object signin extends js.Object {
  
  def apply(): js.Promise[Unit] = js.native
  def apply(provider: js.UndefOr[scala.Nothing], data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
  def apply(provider: String): js.Promise[Unit] = js.native
  def apply(provider: String, data: GenericObjectcallbackUrls): js.Promise[Unit] = js.native
}

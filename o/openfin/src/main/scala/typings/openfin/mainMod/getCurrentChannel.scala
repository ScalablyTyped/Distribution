package typings.openfin.mainMod

import typings.openfin.contextChannelsMod.Channel
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "getCurrentChannel")
@js.native
object getCurrentChannel extends js.Object {
  
  def apply(): js.Promise[Channel] = js.native
  def apply(identity: Identity): js.Promise[Channel] = js.native
}

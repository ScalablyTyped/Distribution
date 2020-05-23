package typings.openfin.utilsMod

import typings.openfin.identityMod.Identity
import typings.openfin.v2MainMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "promisifyViewLoadEvents")
@js.native
object promisifyViewLoadEvents extends js.Object {
  def apply(view: View, windowIdentity: Identity): js.Promise[LayoutEventPayload] = js.native
}


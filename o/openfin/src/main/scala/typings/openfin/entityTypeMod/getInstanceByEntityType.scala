package typings.openfin.entityTypeMod

import typings.openfin.frameFrameMod.Frame
import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.default
import typings.openfin.viewViewMod.View
import typings.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/util/entity-type", "getInstanceByEntityType")
@js.native
object getInstanceByEntityType extends js.Object {
  def apply(entityType: String, wire: default, identity: Identity): View | Window | Frame = js.native
}


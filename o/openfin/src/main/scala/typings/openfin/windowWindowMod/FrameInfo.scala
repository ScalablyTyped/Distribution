package typings.openfin.windowWindowMod

import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameInfo extends js.Object {
  var entityType: EntityType
  var name: String
  var parent: js.UndefOr[Identity] = js.undefined
  var uuid: String
}

object FrameInfo {
  @scala.inline
  def apply(entityType: EntityType, name: String, uuid: String, parent: Identity = null): FrameInfo = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameInfo]
  }
}


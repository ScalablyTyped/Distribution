package typings.openfin.frameFrameMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameInfo extends js.Object {
  var entityType: EntityType
  var name: String
  var parent: Identity
  var uuid: String
}

object FrameInfo {
  @scala.inline
  def apply(entityType: EntityType, name: String, parent: Identity, uuid: String): FrameInfo = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameInfo]
  }
}


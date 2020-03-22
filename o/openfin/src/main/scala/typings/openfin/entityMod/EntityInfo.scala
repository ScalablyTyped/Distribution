package typings.openfin.entityMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityInfo extends js.Object {
  var entityType: String
  var name: String
  var parent: Identity
  var uuid: String
}

object EntityInfo {
  @scala.inline
  def apply(entityType: String, name: String, parent: Identity, uuid: String): EntityInfo = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityInfo]
  }
}


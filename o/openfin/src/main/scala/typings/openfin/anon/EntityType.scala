package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityType extends js.Object {
  var entityType: String
  var name: String
  var parentFrame: String
  var uuid: String
}

object EntityType {
  @scala.inline
  def apply(entityType: String, name: String, parentFrame: String, uuid: String): EntityType = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentFrame = parentFrame.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityType]
  }
}


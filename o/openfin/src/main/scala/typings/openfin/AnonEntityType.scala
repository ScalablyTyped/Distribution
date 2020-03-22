package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntityType extends js.Object {
  var entityType: String
  var name: String
  var parentFrame: String
  var uuid: String
}

object AnonEntityType {
  @scala.inline
  def apply(entityType: String, name: String, parentFrame: String, uuid: String): AnonEntityType = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentFrame = parentFrame.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEntityType]
  }
}


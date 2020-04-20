package typings.mongodb

import typings.mongodb.mongodbStrings.date
import typings.mongodb.mongodbStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  @JSName("$type")
  var $type: date | timestamp
}

object AnonType {
  @scala.inline
  def apply($type: date | timestamp): AnonType = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}


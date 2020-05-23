package typings.mongodb.anon

import typings.mongodb.mongodbStrings.date
import typings.mongodb.mongodbStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  @JSName("$type")
  var $type: date | timestamp
}

object Type {
  @scala.inline
  def apply($type: date | timestamp): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}


package typings.mongodb

import typings.mongodb.mongodbStrings.date
import typings.mongodb.mongodbStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  @JSName("$type")
  var $type: date | timestamp
}

object Anon_Date {
  @scala.inline
  def apply($type: date | timestamp): Anon_Date = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Date]
  }
}


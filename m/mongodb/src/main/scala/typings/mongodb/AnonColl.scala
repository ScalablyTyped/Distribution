package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColl extends js.Object {
  var coll: String
  var db: String
}

object AnonColl {
  @scala.inline
  def apply(coll: String, db: String): AnonColl = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColl]
  }
}


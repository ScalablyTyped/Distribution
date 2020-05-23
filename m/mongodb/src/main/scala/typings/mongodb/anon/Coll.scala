package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coll extends js.Object {
  var coll: String
  var db: String
}

object Coll {
  @scala.inline
  def apply(coll: String, db: String): Coll = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coll]
  }
}


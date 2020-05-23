package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: js.Array[String]
  var deleted: js.Array[String]
  var updated: js.Array[String]
}

object Created {
  @scala.inline
  def apply(created: js.Array[String], deleted: js.Array[String], updated: js.Array[String]): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}


package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelProperties extends js.Object {
  /** Collection the model uses. */
  var collection: Collection
  /** Connection the model uses. */
  var db: Connection_
  /** Schema the model uses. */
  var schema: Schema[_]
}

object ModelProperties {
  @scala.inline
  def apply(collection: Collection, db: Connection_, schema: Schema[_]): ModelProperties = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelProperties]
  }
}


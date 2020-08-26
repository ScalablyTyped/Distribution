package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelProperties extends js.Object {
  /** Collection the model uses. */
  var collection: Collection = js.native
  /** Connection the model uses. */
  var db: Connection_ = js.native
  /** Schema the model uses. */
  var schema: Schema[_] = js.native
}

object ModelProperties {
  @scala.inline
  def apply(collection: Collection, db: Connection_, schema: Schema[_]): ModelProperties = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelProperties]
  }
  @scala.inline
  implicit class ModelPropertiesOps[Self <: ModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollection(value: Collection): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDb(value: Connection_): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: Schema[_]): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}


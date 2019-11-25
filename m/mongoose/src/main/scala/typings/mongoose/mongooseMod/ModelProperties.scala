package typings.mongoose.mongooseMod

import typings.mongoose.Typeofmongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelProperties extends js.Object {
  /** Base Mongoose instance the model uses. */
  var base: Typeofmongoose
  /**
    * If this is a discriminator model, baseModelName is the
    * name of the base model.
    */
  var baseModelName: js.UndefOr[String] = js.undefined
  /** Collection the model uses. */
  var collection: Collection
  /** Connection the model uses. */
  var db: Connection
  /** Registered discriminators for this model. */
  var discriminators: js.Any
  /** The name of the model */
  var modelName: String
  /** Schema the model uses. */
  var schema: Schema[_]
}

object ModelProperties {
  @scala.inline
  def apply(
    base: Typeofmongoose,
    collection: Collection,
    db: Connection,
    discriminators: js.Any,
    modelName: String,
    schema: Schema[_],
    baseModelName: String = null
  ): ModelProperties = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], discriminators = discriminators.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (baseModelName != null) __obj.updateDynamic("baseModelName")(baseModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelProperties]
  }
}


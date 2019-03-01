package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelProperties extends js.Object {
  /** Base Mongoose instance the model uses. */
  var base: mongooseLib.Anon_Args
  /**
    * If this is a discriminator model, baseModelName is the
    * name of the base model.
    */
  var baseModelName: js.UndefOr[java.lang.String]
  /** Collection the model uses. */
  var collection: Collection
  /** Connection the model uses. */
  var db: Connection
  /** Registered discriminators for this model. */
  var discriminators: js.Any
  /** The name of the model */
  var modelName: java.lang.String
  /** Schema the model uses. */
  var schema: Schema[_]
}

object ModelProperties {
  @scala.inline
  def apply(
    base: mongooseLib.Anon_Args,
    collection: Collection,
    db: Connection,
    discriminators: js.Any,
    modelName: java.lang.String,
    schema: Schema[_],
    baseModelName: java.lang.String = null
  ): ModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("base")(base)
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("db")(db)
    __obj.updateDynamic("discriminators")(discriminators)
    __obj.updateDynamic("modelName")(modelName)
    __obj.updateDynamic("schema")(schema)
    if (baseModelName != null) __obj.updateDynamic("baseModelName")(baseModelName)
    __obj.asInstanceOf[ModelProperties]
  }
}


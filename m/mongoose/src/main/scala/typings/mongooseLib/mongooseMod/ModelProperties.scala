package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModelProperties extends js.Object {
  /** Base Mongoose instance the model uses. */
  var base: js.Any
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
  var schema: Schema
}


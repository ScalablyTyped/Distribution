package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/buffer.js
  * http://mongoosejs.com/docs/api.html#schema-buffer-js
  */
@js.native
trait Buffer
  extends mongooseLib.mongooseMod.SchemaType {
  /**
    * Check if the given value satisfies a required validator. To satisfy a
    * required validator, a buffer must not be null or undefined and have
    * non-zero length.
    */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
}


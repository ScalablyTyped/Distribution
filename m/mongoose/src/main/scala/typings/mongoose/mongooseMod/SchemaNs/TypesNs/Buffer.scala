package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.MongooseDocument
import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/buffer.js
  * http://mongoosejs.com/docs/api.html#schema-buffer-js
  */
@js.native
trait Buffer extends SchemaType {
  /**
    * Check if the given value satisfies a required validator. To satisfy a
    * required validator, a buffer must not be null or undefined and have
    * non-zero length.
    */
  def checkRequired(value: js.Any, doc: MongooseDocument): scala.Boolean = js.native
}


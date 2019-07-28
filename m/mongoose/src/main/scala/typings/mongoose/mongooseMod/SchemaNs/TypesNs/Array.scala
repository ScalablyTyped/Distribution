package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.Anon_Length
import typings.mongoose.mongooseMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/array.js
  * http://mongoosejs.com/docs/api.html#schema-array-js
  */
@js.native
trait Array extends SchemaType {
  /**
    * Check if the given value satisfies a required validator. The given value
    * must be not null nor undefined, and have a non-zero length.
    */
  def checkRequired[T /* <: Anon_Length */](value: T): scala.Boolean = js.native
}


package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/array.js
  * http://mongoosejs.com/docs/api.html#schema-array-js
  */
@js.native
trait Array
  extends mongooseLib.mongooseMod.SchemaType {
  /**
    * Check if the given value satisfies a required validator. The given value
    * must be not null nor undefined, and have a non-zero length.
    */
  def checkRequired[T /* <: mongooseLib.Anon_Length */](value: T): scala.Boolean = js.native
}


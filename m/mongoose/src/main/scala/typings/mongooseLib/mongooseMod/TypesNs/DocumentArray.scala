package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/documentarray.js
  * http://mongoosejs.com/docs/api.html#types-documentarray-js
  */
@js.native
trait DocumentArray[T /* <: mongooseLib.mongooseMod.MongooseDocument */] extends Array[T] {
  /**
    * Creates a subdocument casted to this schema.
    * This is the same subdocument constructor used for casting.
    * @param obj the value to cast to this arrays SubDocument schema
    */
  def create(obj: js.Any): T = js.native
  def id(id: java.lang.String): T = js.native
  def id(id: mongooseLib.mongooseMod.NativeBuffer): T = js.native
  /**
    * Searches array items for the first document with a matching _id.
    * @returns the subdocument or null if not found.
    */
  def id(id: ObjectId): T = js.native
  def id(id: scala.Double): T = js.native
}


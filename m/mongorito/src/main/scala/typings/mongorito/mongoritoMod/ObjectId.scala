package typings.mongorito.mongoritoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "ObjectId")
@js.native
/**
  * Create a new ObjectId instance
  * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectId ()
  extends typings.mongodb.mongodbMod.ObjectId {
  def this(id: String) = this()
  def this(id: Double) = this()
  def this(id: typings.bson.bsonMod.ObjectId) = this()
}

/* static members */
@JSImport("mongorito", "ObjectId")
@js.native
object ObjectId extends js.Object {
  /** If true cache the hex string representation of ObjectId */
  var cacheHexString: js.UndefOr[Boolean] = js.native
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromHexString(hexString: String): typings.bson.bsonMod.ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromTime(time: Double): typings.bson.bsonMod.ObjectId = js.native
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  def generate(): Buffer = js.native
  def generate(time: Double): Buffer = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  def isValid(id: String): Boolean = js.native
  def isValid(id: Double): Boolean = js.native
  def isValid(id: typings.bson.bsonMod.ObjectId): Boolean = js.native
}


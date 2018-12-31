package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "ObjectId")
@js.native
/**
  * Create a new ObjectID instance
  * @param {(string|number|ObjectID)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectId ()
  extends mongodbLib.mongodbMod.ObjectId {
  def this(id: bsonLib.bsonMod.ObjectID) = this()
  def this(id: java.lang.String) = this()
  def this(id: scala.Double) = this()
}

@JSImport("mongorito", "ObjectId")
@js.native
object ObjectId extends js.Object {
  /** If true cache the hex string representation of ObjectID */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectID from a hex string representation of an ObjectID.
    * @param {string} hexString create a ObjectID from a passed in 24 byte hexstring.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectID = js.native
  /**
    * Creates an ObjectID from a second based number, with the rest of the ObjectID zeroed out. Used for comparisons or sorting the ObjectID.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectID} return the created ObjectID
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectID = js.native
  def isValid(id: bsonLib.bsonMod.ObjectID): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectID
    *
    * @return {boolean} return true if the value is a valid bson ObjectID, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}


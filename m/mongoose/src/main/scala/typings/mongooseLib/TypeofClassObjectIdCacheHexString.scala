package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassObjectIdCacheHexString
  extends org.scalablytyped.runtime.Instantiable0[mongodbLib.mongodbMod.ObjectId] {
  /** If true cache the hex string representation of ObjectId */
  var cacheHexString: js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromHexString(hexString: java.lang.String): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  def createFromTime(time: scala.Double): bsonLib.bsonMod.ObjectId = js.native
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  def generate(): nodeLib.Buffer = js.native
  def generate(time: scala.Double): nodeLib.Buffer = js.native
  def isValid(id: bsonLib.bsonMod.ObjectId): scala.Boolean = js.native
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  def isValid(id: java.lang.String): scala.Boolean = js.native
  def isValid(id: scala.Double): scala.Boolean = js.native
}


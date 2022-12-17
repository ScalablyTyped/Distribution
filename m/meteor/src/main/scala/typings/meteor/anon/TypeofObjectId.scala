package typings.meteor.anon

import typings.bson.mod.ObjectId
import typings.bson.mod.ObjectIdLike
import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObjectId extends StObject {
  
  /* Excluded from this release type: index */
  /* static member */
  var cacheHexString: Boolean = js.native
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    *
    * @param hexString - create a ObjectId from a passed in 24 character hexstring.
    */
  /* static member */
  def createFromHexString(hexString: String): ObjectId = js.native
  
  /* Excluded from this release type: createPk */
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    *
    * @param time - an integer number representing a number of seconds.
    */
  /* static member */
  def createFromTime(time: Double): ObjectId = js.native
  
  /* Excluded from this release type: getInc */
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    *
    * @param time - pass in a second based timestamp.
    */
  /* static member */
  def generate(): Buffer = js.native
  def generate(time: Double): Buffer = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @param id - ObjectId instance to validate.
    */
  /* static member */
  def isValid(id: String): Boolean = js.native
  def isValid(id: js.typedarray.Uint8Array): Boolean = js.native
  def isValid(id: Double): Boolean = js.native
  def isValid(id: ObjectId): Boolean = js.native
  def isValid(id: ObjectIdLike): Boolean = js.native
  def isValid(id: Buffer): Boolean = js.native
}

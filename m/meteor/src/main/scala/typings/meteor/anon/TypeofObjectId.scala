package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.bson.mod.ObjectIdLike
import typings.mongodb.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObjectId
  extends StObject
     with Instantiable0[ObjectId] {
  
  /* Excluded from this release type: index */
  var cacheHexString: Boolean = js.native
  
  /** Creates an ObjectId instance from a base64 string */
  def createFromBase64(base64: String): typings.bson.mod.ObjectId = js.native
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    *
    * @param hexString - create a ObjectId from a passed in 24 character hexstring.
    */
  def createFromHexString(hexString: String): typings.bson.mod.ObjectId = js.native
  
  /* Excluded from this release type: createPk */
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    *
    * @param time - an integer number representing a number of seconds.
    */
  def createFromTime(time: Double): typings.bson.mod.ObjectId = js.native
  
  /* Excluded from this release type: getInc */
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    *
    * @param time - pass in a second based timestamp.
    */
  def generate(): js.typedarray.Uint8Array = js.native
  def generate(time: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @param id - ObjectId instance to validate.
    */
  def isValid(id: String): Boolean = js.native
  def isValid(id: js.typedarray.Uint8Array): Boolean = js.native
  def isValid(id: Double): Boolean = js.native
  def isValid(id: typings.bson.mod.ObjectId): Boolean = js.native
  def isValid(id: ObjectIdLike): Boolean = js.native
}

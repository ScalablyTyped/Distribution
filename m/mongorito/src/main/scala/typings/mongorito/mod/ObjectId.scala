package typings.mongorito.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "ObjectId")
@js.native
/**
  * Create a new ObjectId instance
  * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectId ()
  extends typings.mongodb.mod.ObjectId {
  def this(id: String) = this()
  def this(id: Double) = this()
  def this(id: typings.bson.mod.ObjectId) = this()
}
/* static members */
object ObjectId {
  
  @JSImport("mongorito", "ObjectId")
  @js.native
  val ^ : js.Any = js.native
  
  /** If true cache the hex string representation of ObjectId */
  @JSImport("mongorito", "ObjectId.cacheHexString")
  @js.native
  def cacheHexString: js.UndefOr[Boolean] = js.native
  @scala.inline
  def cacheHexString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  @JSImport("mongorito", "ObjectId.createFromHexString")
  @js.native
  def createFromHexString(hexString: String): typings.bson.mod.ObjectId = js.native
  
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  @JSImport("mongorito", "ObjectId.createFromTime")
  @js.native
  def createFromTime(time: Double): typings.bson.mod.ObjectId = js.native
  
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  @JSImport("mongorito", "ObjectId.generate")
  @js.native
  def generate(): Buffer = js.native
  @JSImport("mongorito", "ObjectId.generate")
  @js.native
  def generate(time: Double): Buffer = js.native
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  @JSImport("mongorito", "ObjectId.isValid")
  @js.native
  def isValid(id: String): Boolean = js.native
  @JSImport("mongorito", "ObjectId.isValid")
  @js.native
  def isValid(id: Double): Boolean = js.native
  @JSImport("mongorito", "ObjectId.isValid")
  @js.native
  def isValid(id: typings.bson.mod.ObjectId): Boolean = js.native
}

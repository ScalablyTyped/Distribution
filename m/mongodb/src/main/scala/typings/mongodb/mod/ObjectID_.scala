package typings.mongodb.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ObjectID")
@js.native
/**
  * Create a new ObjectId instance
  * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
  */
class ObjectID_ ()
  extends typings.bson.mod.ObjectID_ {
  def this(id: String) = this()
  def this(id: scala.Double) = this()
  def this(id: typings.bson.mod.ObjectId) = this()
}
/* static members */
object ObjectID_ {
  
  @JSImport("mongodb", "ObjectID")
  @js.native
  val ^ : js.Any = js.native
  
  /** If true cache the hex string representation of ObjectId */
  @JSImport("mongodb", "ObjectID.cacheHexString")
  @js.native
  def cacheHexString: js.UndefOr[Boolean] = js.native
  inline def cacheHexString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
    * @return {ObjectId} return the created ObjectId
    */
  inline def createFromHexString(hexString: String): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    * @param {number} time an integer number representing a number of seconds.
    * @return {ObjectId} return the created ObjectId
    */
  inline def createFromTime(time: scala.Double): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /**
    * Generate a 12 byte id string used in ObjectId's
    * @param {number} time optional parameter allowing to pass in a second based timestamp.
    * @return {string} return the 12 byte id binary string.
    */
  inline def generate(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Buffer]
  inline def generate(time: scala.Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
    */
  inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: scala.Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: typings.bson.mod.ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

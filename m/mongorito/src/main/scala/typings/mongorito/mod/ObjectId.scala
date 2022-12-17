package typings.mongorito.mod

import typings.bson.mod.ObjectIdLike
import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class representation of the BSON ObjectId type.
  * @public
  * @category BSONType
  */
@JSImport("mongorito", "ObjectId")
@js.native
/* Excluded from this release type: [kId] */
/* Excluded from this release type: __id */
/**
  * Create an ObjectId type
  *
  * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
  */
open class ObjectId ()
  extends typings.mongodb.mod.ObjectId {
  def this(inputId: String) = this()
  def this(inputId: js.typedarray.Uint8Array) = this()
  def this(inputId: Double) = this()
  def this(inputId: typings.bson.mod.ObjectId) = this()
  def this(inputId: ObjectIdLike) = this()
  def this(inputId: Buffer) = this()
}
object ObjectId {
  
  @JSImport("mongorito", "ObjectId")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: index */
  /* static member */
  @JSImport("mongorito", "ObjectId.cacheHexString")
  @js.native
  def cacheHexString: Boolean = js.native
  inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    *
    * @param hexString - create a ObjectId from a passed in 24 character hexstring.
    */
  /* static member */
  inline def createFromHexString(hexString: String): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /* Excluded from this release type: createPk */
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    *
    * @param time - an integer number representing a number of seconds.
    */
  /* static member */
  inline def createFromTime(time: Double): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /* Excluded from this release type: getInc */
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    *
    * @param time - pass in a second based timestamp.
    */
  /* static member */
  inline def generate(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Buffer]
  inline def generate(time: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @param id - ObjectId instance to validate.
    */
  /* static member */
  inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: typings.bson.mod.ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: ObjectIdLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

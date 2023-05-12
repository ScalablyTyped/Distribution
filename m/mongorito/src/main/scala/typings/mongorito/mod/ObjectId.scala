package typings.mongorito.mod

import typings.bson.mod.ObjectIdLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
/* static members */
object ObjectId {
  
  @JSImport("mongorito", "ObjectId")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: index */
  @JSImport("mongorito", "ObjectId.cacheHexString")
  @js.native
  def cacheHexString: Boolean = js.native
  inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
  
  /** Creates an ObjectId instance from a base64 string */
  inline def createFromBase64(base64: String): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /**
    * Creates an ObjectId from a hex string representation of an ObjectId.
    *
    * @param hexString - create a ObjectId from a passed in 24 character hexstring.
    */
  inline def createFromHexString(hexString: String): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /* Excluded from this release type: createPk */
  /**
    * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
    *
    * @param time - an integer number representing a number of seconds.
    */
  inline def createFromTime(time: Double): typings.bson.mod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[typings.bson.mod.ObjectId]
  
  /* Excluded from this release type: getInc */
  /**
    * Generate a 12 byte id buffer used in ObjectId's
    *
    * @param time - pass in a second based timestamp.
    */
  inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
  inline def generate(time: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Checks if a value is a valid bson ObjectId
    *
    * @param id - ObjectId instance to validate.
    */
  inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: typings.bson.mod.ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValid(id: ObjectIdLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

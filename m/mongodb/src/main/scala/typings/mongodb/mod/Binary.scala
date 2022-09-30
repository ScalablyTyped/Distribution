package typings.mongodb.mod

import typings.bson.mod.BinarySequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Binary")
@js.native
/**
  * Create a new Binary instance.
  *
  * This constructor can accept a string as its first argument. In this case,
  * this string will be encoded using ISO-8859-1, **not** using UTF-8.
  * This is almost certainly not what you want. Use `new Binary(Buffer.from(string))`
  * instead to convert the string to a Buffer using UTF-8 first.
  *
  * @param buffer - a buffer object containing the binary data.
  * @param subType - the option binary type.
  */
open class Binary ()
  extends typings.bson.mod.Binary {
  def this(buffer: String) = this()
  def this(buffer: BinarySequence) = this()
  def this(buffer: String, subType: scala.Double) = this()
  def this(buffer: Unit, subType: scala.Double) = this()
  def this(buffer: BinarySequence, subType: scala.Double) = this()
}
/* static members */
object Binary {
  
  /* Excluded from this release type: BSON_BINARY_SUBTYPE_DEFAULT */
  /** Initial buffer default size */
  @JSImport("mongodb", "Binary.BUFFER_SIZE")
  @js.native
  val BUFFER_SIZE: /* 256 */ scala.Double = js.native
  
  /** Byte Array BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_BYTE_ARRAY")
  @js.native
  val SUBTYPE_BYTE_ARRAY: /* 2 */ scala.Double = js.native
  
  /** Column BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_COLUMN")
  @js.native
  val SUBTYPE_COLUMN: /* 7 */ scala.Double = js.native
  
  /** Default BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_DEFAULT")
  @js.native
  val SUBTYPE_DEFAULT: /* 0 */ scala.Double = js.native
  
  /** Encrypted BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_ENCRYPTED")
  @js.native
  val SUBTYPE_ENCRYPTED: /* 6 */ scala.Double = js.native
  
  /** Function BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_FUNCTION")
  @js.native
  val SUBTYPE_FUNCTION: /* 1 */ scala.Double = js.native
  
  /** MD5 BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_MD5")
  @js.native
  val SUBTYPE_MD5: /* 5 */ scala.Double = js.native
  
  /** User BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_USER_DEFINED")
  @js.native
  val SUBTYPE_USER_DEFINED: /* 128 */ scala.Double = js.native
  
  /** UUID BSON type */
  @JSImport("mongodb", "Binary.SUBTYPE_UUID")
  @js.native
  val SUBTYPE_UUID: /* 4 */ scala.Double = js.native
  
  /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
  @JSImport("mongodb", "Binary.SUBTYPE_UUID_OLD")
  @js.native
  val SUBTYPE_UUID_OLD: /* 3 */ scala.Double = js.native
}

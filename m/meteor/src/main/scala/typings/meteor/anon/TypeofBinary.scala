package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.mongodb.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBinary
  extends StObject
     with Instantiable0[Binary] {
  
  /* Excluded from this release type: BSON_BINARY_SUBTYPE_DEFAULT */
  /** Initial buffer default size */
  val BUFFER_SIZE: /* 256 */ Double = js.native
  
  /** Byte Array BSON type */
  val SUBTYPE_BYTE_ARRAY: /* 2 */ Double = js.native
  
  /** Column BSON type */
  val SUBTYPE_COLUMN: /* 7 */ Double = js.native
  
  /** Default BSON type */
  val SUBTYPE_DEFAULT: /* 0 */ Double = js.native
  
  /** Encrypted BSON type */
  val SUBTYPE_ENCRYPTED: /* 6 */ Double = js.native
  
  /** Function BSON type */
  val SUBTYPE_FUNCTION: /* 1 */ Double = js.native
  
  /** MD5 BSON type */
  val SUBTYPE_MD5: /* 5 */ Double = js.native
  
  /** User BSON type */
  val SUBTYPE_USER_DEFINED: /* 128 */ Double = js.native
  
  /** UUID BSON type */
  val SUBTYPE_UUID: /* 4 */ Double = js.native
  
  /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
  val SUBTYPE_UUID_OLD: /* 3 */ Double = js.native
}

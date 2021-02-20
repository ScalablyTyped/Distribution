package typings.mongodb.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Binary")
@js.native
class Binary protected ()
  extends typings.bson.mod.Binary {
  /**
    * @param buffer A buffer object containing the binary data
    * @param subType Binary data subtype
    */
  def this(buffer: Buffer) = this()
  def this(buffer: Buffer, subType: scala.Double) = this()
}
/* static members */
object Binary {
  
  @JSImport("mongodb", "Binary.SUBTYPE_BYTE_ARRAY")
  @js.native
  val SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_DEFAULT")
  @js.native
  val SUBTYPE_DEFAULT: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_FUNCTION")
  @js.native
  val SUBTYPE_FUNCTION: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_MD5")
  @js.native
  val SUBTYPE_MD5: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_USER_DEFINED")
  @js.native
  val SUBTYPE_USER_DEFINED: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_UUID")
  @js.native
  val SUBTYPE_UUID: scala.Double = js.native
  
  @JSImport("mongodb", "Binary.SUBTYPE_UUID_OLD")
  @js.native
  val SUBTYPE_UUID_OLD: scala.Double = js.native
}

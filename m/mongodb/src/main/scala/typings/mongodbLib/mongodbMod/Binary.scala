package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Binary")
@js.native
class Binary protected ()
  extends bsonLib.bsonMod.Binary {
  /**
       * @param buffer A buffer object containing the binary data
       * @param subType Binary data subtype
       */
  def this(buffer: nodeLib.Buffer) = this()
  /**
       * @param buffer A buffer object containing the binary data
       * @param subType Binary data subtype
       */
  def this(buffer: nodeLib.Buffer, subType: scala.Double) = this()
}

@JSImport("mongodb", "Binary")
@js.native
object Binary extends js.Object {
  val SUBTYPE_BYTE_ARRAY: scala.Double = js.native
  val SUBTYPE_DEFAULT: scala.Double = js.native
  val SUBTYPE_FUNCTION: scala.Double = js.native
  val SUBTYPE_MD5: scala.Double = js.native
  val SUBTYPE_USER_DEFINED: scala.Double = js.native
  val SUBTYPE_UUID: scala.Double = js.native
  val SUBTYPE_UUID_OLD: scala.Double = js.native
}


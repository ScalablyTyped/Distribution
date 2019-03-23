package typings
package ndnDashJsLib.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSImport("ndn-js/data", "ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait BLOB
    extends ndnDashJsLib.dataMod.ContentType
  
  @js.native
  sealed trait KEY
    extends ndnDashJsLib.dataMod.ContentType
  
  @js.native
  sealed trait LINK
    extends ndnDashJsLib.dataMod.ContentType
  
  @js.native
  sealed trait NACK
    extends ndnDashJsLib.dataMod.ContentType
  
  @js.native
  sealed trait OTHER_CODE
    extends ndnDashJsLib.dataMod.ContentType
  
  /* 0 */ val BLOB: BLOB with scala.Double = js.native
  /* 2 */ val KEY: KEY with scala.Double = js.native
  /* 1 */ val LINK: LINK with scala.Double = js.native
  /* 3 */ val NACK: NACK with scala.Double = js.native
  /* 0x7fff */ val OTHER_CODE: OTHER_CODE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.dataMod.ContentType with scala.Double] = js.native
}


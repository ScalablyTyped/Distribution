package typings.ndnDashJs.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentType extends js.Object

@JSImport("ndn-js/data", "ContentType")
@js.native
object ContentType extends js.Object {
  @js.native
  sealed trait BLOB extends ContentType
  
  @js.native
  sealed trait KEY extends ContentType
  
  @js.native
  sealed trait LINK extends ContentType
  
  @js.native
  sealed trait NACK extends ContentType
  
  @js.native
  sealed trait OTHER_CODE extends ContentType
  
  /* 0 */ val BLOB: typings.ndnDashJs.dataMod.ContentType.BLOB with Double = js.native
  /* 2 */ val KEY: typings.ndnDashJs.dataMod.ContentType.KEY with Double = js.native
  /* 1 */ val LINK: typings.ndnDashJs.dataMod.ContentType.LINK with Double = js.native
  /* 3 */ val NACK: typings.ndnDashJs.dataMod.ContentType.NACK with Double = js.native
  /* 0x7fff */ val OTHER_CODE: typings.ndnDashJs.dataMod.ContentType.OTHER_CODE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
}


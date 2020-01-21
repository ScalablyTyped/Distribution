package typings.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "ContentType")
@js.native
object ContentType extends js.Object {
  /* 0 */ val BLOB: typings.ndnJs.dataMod.ContentType.BLOB with Double = js.native
  /* 2 */ val KEY: typings.ndnJs.dataMod.ContentType.KEY with Double = js.native
  /* 1 */ val LINK: typings.ndnJs.dataMod.ContentType.LINK with Double = js.native
  /* 3 */ val NACK: typings.ndnJs.dataMod.ContentType.NACK with Double = js.native
  /* 0x7fff */ val OTHER_CODE: typings.ndnJs.dataMod.ContentType.OTHER_CODE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ndnJs.dataMod.ContentType with Double] = js.native
}


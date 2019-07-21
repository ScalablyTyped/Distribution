package typings
package maxmindLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/reader", JSImport.Default)
@js.native
class default[T /* <: maxmindLib.libReaderResponseMod.Response */] protected () extends Reader[T] {
  def this(db: nodeLib.Buffer) = this()
  def this(db: nodeLib.Buffer, opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify OpenOpts */ js.Any) = this()
  /* CompleteClass */
  override var db: js.Any = js.native
  /* CompleteClass */
  override var decoder: js.Any = js.native
  /* CompleteClass */
  override var metadata: maxmindLib.libMetadataMod.Metadata = js.native
  /* CompleteClass */
  override var walker: js.Any = js.native
  /* CompleteClass */
  override def findAddressInTree(ipAddress: java.lang.String): scala.Double | scala.Null = js.native
  /* CompleteClass */
  override def get(ipAddress: java.lang.String): T | scala.Null = js.native
  /* CompleteClass */
  override def load(db: nodeLib.Buffer, opts: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def resolveDataPointer(pointer: scala.Double): js.Any = js.native
}


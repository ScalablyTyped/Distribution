package typings.maxmind.libReaderMod

import typings.maxmind.libMetadataMod.Metadata
import typings.maxmind.libReaderResponseMod.Response
import typings.maxmind.maxmindMod.OpenOpts
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/reader", JSImport.Default)
@js.native
class default[T /* <: Response */] protected () extends Reader[T] {
  def this(db: Buffer) = this()
  def this(db: Buffer, opts: OpenOpts) = this()
  /* CompleteClass */
  override var db: js.Any = js.native
  /* CompleteClass */
  override var decoder: js.Any = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  /* CompleteClass */
  override var walker: js.Any = js.native
  /* CompleteClass */
  override def findAddressInTree(ipAddress: String): Double | Null = js.native
  /* CompleteClass */
  override def get(ipAddress: String): T | Null = js.native
  /* CompleteClass */
  override def load(db: Buffer, opts: js.Object): Unit = js.native
  /* CompleteClass */
  override def resolveDataPointer(pointer: Double): js.Any = js.native
}


package typings.maxmind.readerMod

import typings.maxmind.metadataMod.Metadata
import typings.maxmind.mod.OpenOpts
import typings.maxmind.responseMod.Response
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
  override var findAddressInTree: js.Any = js.native
  /* CompleteClass */
  override var ipv4Start: js.Any = js.native
  /* CompleteClass */
  override var ipv4StartNodeNumber: js.Any = js.native
  /* CompleteClass */
  override var metadata: Metadata = js.native
  /* CompleteClass */
  override var resolveDataPointer: js.Any = js.native
  /* CompleteClass */
  override var walker: js.Any = js.native
  /* CompleteClass */
  override def get(ipAddress: String): T | Null = js.native
  /* CompleteClass */
  override def getWithPrefixLength(ipAddress: String): js.Tuple2[T | Null, Double] = js.native
  /* CompleteClass */
  override def load(db: Buffer, opts: js.Object): Unit = js.native
}


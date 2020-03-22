package typings.maxmind.decoderMod

import typings.maxmind.mod.OpenOpts
import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/decoder", JSImport.Default)
@js.native
class default protected () extends Decoder {
  def this(db: Buffer) = this()
  def this(db: Buffer, baseOffset: Double) = this()
  def this(db: Buffer, baseOffset: Double, opts: OpenOpts) = this()
  /* CompleteClass */
  override var baseOffset: js.Any = js.native
  /* CompleteClass */
  override var cache: js.Any = js.native
  /* CompleteClass */
  override var db: js.Any = js.native
  /* CompleteClass */
  override var decodeArray: js.Any = js.native
  /* CompleteClass */
  override var decodeBigUint: js.Any = js.native
  /* CompleteClass */
  override var decodeBoolean: js.Any = js.native
  /* CompleteClass */
  override var decodeByType: js.Any = js.native
  /* CompleteClass */
  override var decodeBytes: js.Any = js.native
  /* CompleteClass */
  override var decodeDouble: js.Any = js.native
  /* CompleteClass */
  override var decodeFloat: js.Any = js.native
  /* CompleteClass */
  override var decodeInt32: js.Any = js.native
  /* CompleteClass */
  override var decodeMap: js.Any = js.native
  /* CompleteClass */
  override var decodePointer: js.Any = js.native
  /* CompleteClass */
  override var decodeString: js.Any = js.native
  /* CompleteClass */
  override var decodeUint: js.Any = js.native
  /* CompleteClass */
  override var sizeFromCtrlByte: js.Any = js.native
  /* CompleteClass */
  override var telemetry: Record[String, _] = js.native
  /* CompleteClass */
  override def decode(offset: Double): js.Any = js.native
  /* CompleteClass */
  override def decodeFast(offset: Double): js.Any = js.native
}


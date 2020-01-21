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
  override var telemetry: Record[String, _] = js.native
  /* CompleteClass */
  override def decode(offset: Double): js.Any = js.native
  /* CompleteClass */
  override def decodeArray(size: Double, offset: Double): Cursor = js.native
  /* CompleteClass */
  override def decodeBigUint(offset: Double, size: Double): String = js.native
  /* CompleteClass */
  override def decodeBoolean(size: Double): Boolean = js.native
  /* CompleteClass */
  override def decodeByType(`type`: String, offset: Double, size: Double): Cursor = js.native
  /* CompleteClass */
  override def decodeBytes(offset: Double, size: Double): Buffer = js.native
  /* CompleteClass */
  override def decodeDouble(offset: Double): Double = js.native
  /* CompleteClass */
  override def decodeFast(offset: Double): js.Any = js.native
  /* CompleteClass */
  override def decodeFloat(offset: Double): Double = js.native
  /* CompleteClass */
  override def decodeInt32(offset: Double, size: Double): Double = js.native
  /* CompleteClass */
  override def decodeMap(size: Double, offset: Double): Cursor = js.native
  /* CompleteClass */
  override def decodePointer(ctrlByte: Double, offset: Double): Cursor = js.native
  /* CompleteClass */
  override def decodeString(offset: Double, size: Double): js.Any = js.native
  /* CompleteClass */
  override def decodeUint(offset: Double, size: Double): String | Double = js.native
  /* CompleteClass */
  override def sizeFromCtrlByte(ctrlByte: Double, offset: Double): Cursor = js.native
}


package typings.maxmind.decoderMod

import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder extends js.Object {
  var baseOffset: js.Any
  var cache: js.Any
  var db: js.Any
  var telemetry: Record[String, _]
  def decode(offset: Double): js.Any
  def decodeArray(size: Double, offset: Double): Cursor
  def decodeBigUint(offset: Double, size: Double): String
  def decodeBoolean(size: Double): Boolean
  def decodeByType(`type`: String, offset: Double, size: Double): Cursor
  def decodeBytes(offset: Double, size: Double): Buffer
  def decodeDouble(offset: Double): Double
  def decodeFast(offset: Double): js.Any
  def decodeFloat(offset: Double): Double
  def decodeInt32(offset: Double, size: Double): Double
  def decodeMap(size: Double, offset: Double): Cursor
  def decodePointer(ctrlByte: Double, offset: Double): Cursor
  def decodeString(offset: Double, size: Double): js.Any
  def decodeUint(offset: Double, size: Double): String | Double
  def sizeFromCtrlByte(ctrlByte: Double, offset: Double): Cursor
}

object Decoder {
  @scala.inline
  def apply(
    baseOffset: js.Any,
    cache: js.Any,
    db: js.Any,
    decode: Double => js.Any,
    decodeArray: (Double, Double) => Cursor,
    decodeBigUint: (Double, Double) => String,
    decodeBoolean: Double => Boolean,
    decodeByType: (String, Double, Double) => Cursor,
    decodeBytes: (Double, Double) => Buffer,
    decodeDouble: Double => Double,
    decodeFast: Double => js.Any,
    decodeFloat: Double => Double,
    decodeInt32: (Double, Double) => Double,
    decodeMap: (Double, Double) => Cursor,
    decodePointer: (Double, Double) => Cursor,
    decodeString: (Double, Double) => js.Any,
    decodeUint: (Double, Double) => String | Double,
    sizeFromCtrlByte: (Double, Double) => Cursor,
    telemetry: Record[String, _]
  ): Decoder = {
    val __obj = js.Dynamic.literal(baseOffset = baseOffset.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), decodeArray = js.Any.fromFunction2(decodeArray), decodeBigUint = js.Any.fromFunction2(decodeBigUint), decodeBoolean = js.Any.fromFunction1(decodeBoolean), decodeByType = js.Any.fromFunction3(decodeByType), decodeBytes = js.Any.fromFunction2(decodeBytes), decodeDouble = js.Any.fromFunction1(decodeDouble), decodeFast = js.Any.fromFunction1(decodeFast), decodeFloat = js.Any.fromFunction1(decodeFloat), decodeInt32 = js.Any.fromFunction2(decodeInt32), decodeMap = js.Any.fromFunction2(decodeMap), decodePointer = js.Any.fromFunction2(decodePointer), decodeString = js.Any.fromFunction2(decodeString), decodeUint = js.Any.fromFunction2(decodeUint), sizeFromCtrlByte = js.Any.fromFunction2(sizeFromCtrlByte), telemetry = telemetry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Decoder]
  }
}


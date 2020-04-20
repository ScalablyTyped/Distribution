package typings.maxmind.decoderMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder extends js.Object {
  var baseOffset: js.Any
  var cache: js.Any
  var db: js.Any
  var decodeArray: js.Any
  var decodeBigUint: js.Any
  var decodeBoolean: js.Any
  var decodeByType: js.Any
  var decodeBytes: js.Any
  var decodeDouble: js.Any
  var decodeFloat: js.Any
  var decodeInt32: js.Any
  var decodeMap: js.Any
  var decodePointer: js.Any
  var decodeString: js.Any
  var decodeUint: js.Any
  var sizeFromCtrlByte: js.Any
  var telemetry: Record[String, _]
  def decode(offset: Double): js.Any
  def decodeFast(offset: Double): js.Any
}

object Decoder {
  @scala.inline
  def apply(
    baseOffset: js.Any,
    cache: js.Any,
    db: js.Any,
    decode: Double => js.Any,
    decodeArray: js.Any,
    decodeBigUint: js.Any,
    decodeBoolean: js.Any,
    decodeByType: js.Any,
    decodeBytes: js.Any,
    decodeDouble: js.Any,
    decodeFast: Double => js.Any,
    decodeFloat: js.Any,
    decodeInt32: js.Any,
    decodeMap: js.Any,
    decodePointer: js.Any,
    decodeString: js.Any,
    decodeUint: js.Any,
    sizeFromCtrlByte: js.Any,
    telemetry: Record[String, _]
  ): Decoder = {
    val __obj = js.Dynamic.literal(baseOffset = baseOffset.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), decodeArray = decodeArray.asInstanceOf[js.Any], decodeBigUint = decodeBigUint.asInstanceOf[js.Any], decodeBoolean = decodeBoolean.asInstanceOf[js.Any], decodeByType = decodeByType.asInstanceOf[js.Any], decodeBytes = decodeBytes.asInstanceOf[js.Any], decodeDouble = decodeDouble.asInstanceOf[js.Any], decodeFast = js.Any.fromFunction1(decodeFast), decodeFloat = decodeFloat.asInstanceOf[js.Any], decodeInt32 = decodeInt32.asInstanceOf[js.Any], decodeMap = decodeMap.asInstanceOf[js.Any], decodePointer = decodePointer.asInstanceOf[js.Any], decodeString = decodeString.asInstanceOf[js.Any], decodeUint = decodeUint.asInstanceOf[js.Any], sizeFromCtrlByte = sizeFromCtrlByte.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decoder]
  }
}


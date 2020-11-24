package typings.mmdbLib.decoderMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decoder extends js.Object {
  
  var baseOffset: js.Any = js.native
  
  var cache: js.Any = js.native
  
  var db: js.Any = js.native
  
  def decode(offset: Double): Cursor = js.native
  
  var decodeArray: js.Any = js.native
  
  var decodeBigUint: js.Any = js.native
  
  var decodeBoolean: js.Any = js.native
  
  var decodeByType: js.Any = js.native
  
  var decodeBytes: js.Any = js.native
  
  var decodeDouble: js.Any = js.native
  
  def decodeFast(offset: Double): js.Any = js.native
  
  var decodeFloat: js.Any = js.native
  
  var decodeInt32: js.Any = js.native
  
  var decodeMap: js.Any = js.native
  
  var decodePointer: js.Any = js.native
  
  var decodeString: js.Any = js.native
  
  var decodeUint: js.Any = js.native
  
  var sizeFromCtrlByte: js.Any = js.native
  
  var telemetry: Record[String, _] = js.native
}
object Decoder {
  
  @scala.inline
  def apply(
    baseOffset: js.Any,
    cache: js.Any,
    db: js.Any,
    decode: Double => Cursor,
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
  
  @scala.inline
  implicit class DecoderOps[Self <: Decoder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseOffset(value: js.Any): Self = this.set("baseOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: js.Any): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: js.Any): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecode(value: Double => Cursor): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeArray(value: js.Any): Self = this.set("decodeArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeBigUint(value: js.Any): Self = this.set("decodeBigUint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeBoolean(value: js.Any): Self = this.set("decodeBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeByType(value: js.Any): Self = this.set("decodeByType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeBytes(value: js.Any): Self = this.set("decodeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeDouble(value: js.Any): Self = this.set("decodeDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeFast(value: Double => js.Any): Self = this.set("decodeFast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeFloat(value: js.Any): Self = this.set("decodeFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeInt32(value: js.Any): Self = this.set("decodeInt32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeMap(value: js.Any): Self = this.set("decodeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodePointer(value: js.Any): Self = this.set("decodePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeString(value: js.Any): Self = this.set("decodeString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeUint(value: js.Any): Self = this.set("decodeUint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFromCtrlByte(value: js.Any): Self = this.set("sizeFromCtrlByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetry(value: Record[String, _]): Self = this.set("telemetry", value.asInstanceOf[js.Any])
  }
}

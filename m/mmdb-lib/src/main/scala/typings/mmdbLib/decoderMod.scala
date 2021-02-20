package typings.mmdbLib

import typings.mmdbLib.typesMod.Cache
import typings.node.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoderMod {
  
  @JSImport("mmdb-lib/lib/decoder", JSImport.Default)
  @js.native
  class default protected () extends Decoder {
    def this(db: Buffer) = this()
    def this(db: Buffer, baseOffset: Double) = this()
    def this(db: Buffer, baseOffset: js.UndefOr[scala.Nothing], cache: Cache) = this()
    def this(db: Buffer, baseOffset: Double, cache: Cache) = this()
  }
  
  @js.native
  trait Cursor extends StObject {
    
    var offset: Double = js.native
    
    var value: js.Any = js.native
  }
  object Cursor {
    
    @scala.inline
    def apply(offset: Double, value: js.Any): Cursor = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    @scala.inline
    implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Decoder extends StObject {
    
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
    implicit class DecoderMutableBuilder[Self <: Decoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseOffset(value: js.Any): Self = StObject.set(x, "baseOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDb(value: js.Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecode(value: Double => Cursor): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeArray(value: js.Any): Self = StObject.set(x, "decodeArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeBigUint(value: js.Any): Self = StObject.set(x, "decodeBigUint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeBoolean(value: js.Any): Self = StObject.set(x, "decodeBoolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeByType(value: js.Any): Self = StObject.set(x, "decodeByType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeBytes(value: js.Any): Self = StObject.set(x, "decodeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeDouble(value: js.Any): Self = StObject.set(x, "decodeDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeFast(value: Double => js.Any): Self = StObject.set(x, "decodeFast", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeFloat(value: js.Any): Self = StObject.set(x, "decodeFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeInt32(value: js.Any): Self = StObject.set(x, "decodeInt32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeMap(value: js.Any): Self = StObject.set(x, "decodeMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodePointer(value: js.Any): Self = StObject.set(x, "decodePointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeString(value: js.Any): Self = StObject.set(x, "decodeString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUint(value: js.Any): Self = StObject.set(x, "decodeUint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeFromCtrlByte(value: js.Any): Self = StObject.set(x, "sizeFromCtrlByte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelemetry(value: Record[String, _]): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    }
  }
}

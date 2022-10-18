package typings.mmdbLib

import typings.mmdbLib.libTypesMod.Cache
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoderMod {
  
  @JSImport("mmdb-lib/lib/decoder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Decoder {
    def this(db: Buffer) = this()
    def this(db: Buffer, baseOffset: Double) = this()
    def this(db: Buffer, baseOffset: Double, cache: Cache) = this()
    def this(db: Buffer, baseOffset: Unit, cache: Cache) = this()
    
    /* private */ /* CompleteClass */
    var baseOffset: Any = js.native
    
    /* private */ /* CompleteClass */
    var cache: Any = js.native
    
    /* private */ /* CompleteClass */
    var db: Any = js.native
    
    /* CompleteClass */
    override def decode(offset: Double): Cursor = js.native
    
    /* private */ /* CompleteClass */
    var decodeArray: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeBigUint: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeBoolean: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeByType: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeBytes: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeDouble: Any = js.native
    
    /* CompleteClass */
    override def decodeFast(offset: Double): Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeFloat: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeInt32: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeMap: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodePointer: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeString: Any = js.native
    
    /* private */ /* CompleteClass */
    var decodeUint: Any = js.native
    
    /* private */ /* CompleteClass */
    var sizeFromCtrlByte: Any = js.native
    
    /* CompleteClass */
    var telemetry: Record[String, Any] = js.native
  }
  
  trait Cursor extends StObject {
    
    var offset: Double
    
    var value: Any
  }
  object Cursor {
    
    inline def apply(offset: Double, value: Any): Cursor = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cursor]
    }
    
    extension [Self <: Cursor](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Decoder extends StObject {
    
    /* private */ var baseOffset: Any
    
    /* private */ var cache: Any
    
    /* private */ var db: Any
    
    def decode(offset: Double): Cursor
    
    /* private */ var decodeArray: Any
    
    /* private */ var decodeBigUint: Any
    
    /* private */ var decodeBoolean: Any
    
    /* private */ var decodeByType: Any
    
    /* private */ var decodeBytes: Any
    
    /* private */ var decodeDouble: Any
    
    def decodeFast(offset: Double): Any
    
    /* private */ var decodeFloat: Any
    
    /* private */ var decodeInt32: Any
    
    /* private */ var decodeMap: Any
    
    /* private */ var decodePointer: Any
    
    /* private */ var decodeString: Any
    
    /* private */ var decodeUint: Any
    
    /* private */ var sizeFromCtrlByte: Any
    
    var telemetry: Record[String, Any]
  }
  object Decoder {
    
    inline def apply(
      baseOffset: Any,
      cache: Any,
      db: Any,
      decode: Double => Cursor,
      decodeArray: Any,
      decodeBigUint: Any,
      decodeBoolean: Any,
      decodeByType: Any,
      decodeBytes: Any,
      decodeDouble: Any,
      decodeFast: Double => Any,
      decodeFloat: Any,
      decodeInt32: Any,
      decodeMap: Any,
      decodePointer: Any,
      decodeString: Any,
      decodeUint: Any,
      sizeFromCtrlByte: Any,
      telemetry: Record[String, Any]
    ): Decoder = {
      val __obj = js.Dynamic.literal(baseOffset = baseOffset.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), decodeArray = decodeArray.asInstanceOf[js.Any], decodeBigUint = decodeBigUint.asInstanceOf[js.Any], decodeBoolean = decodeBoolean.asInstanceOf[js.Any], decodeByType = decodeByType.asInstanceOf[js.Any], decodeBytes = decodeBytes.asInstanceOf[js.Any], decodeDouble = decodeDouble.asInstanceOf[js.Any], decodeFast = js.Any.fromFunction1(decodeFast), decodeFloat = decodeFloat.asInstanceOf[js.Any], decodeInt32 = decodeInt32.asInstanceOf[js.Any], decodeMap = decodeMap.asInstanceOf[js.Any], decodePointer = decodePointer.asInstanceOf[js.Any], decodeString = decodeString.asInstanceOf[js.Any], decodeUint = decodeUint.asInstanceOf[js.Any], sizeFromCtrlByte = sizeFromCtrlByte.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoder]
    }
    
    extension [Self <: Decoder](x: Self) {
      
      inline def setBaseOffset(value: Any): Self = StObject.set(x, "baseOffset", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setDb(value: Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDecode(value: Double => Cursor): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDecodeArray(value: Any): Self = StObject.set(x, "decodeArray", value.asInstanceOf[js.Any])
      
      inline def setDecodeBigUint(value: Any): Self = StObject.set(x, "decodeBigUint", value.asInstanceOf[js.Any])
      
      inline def setDecodeBoolean(value: Any): Self = StObject.set(x, "decodeBoolean", value.asInstanceOf[js.Any])
      
      inline def setDecodeByType(value: Any): Self = StObject.set(x, "decodeByType", value.asInstanceOf[js.Any])
      
      inline def setDecodeBytes(value: Any): Self = StObject.set(x, "decodeBytes", value.asInstanceOf[js.Any])
      
      inline def setDecodeDouble(value: Any): Self = StObject.set(x, "decodeDouble", value.asInstanceOf[js.Any])
      
      inline def setDecodeFast(value: Double => Any): Self = StObject.set(x, "decodeFast", js.Any.fromFunction1(value))
      
      inline def setDecodeFloat(value: Any): Self = StObject.set(x, "decodeFloat", value.asInstanceOf[js.Any])
      
      inline def setDecodeInt32(value: Any): Self = StObject.set(x, "decodeInt32", value.asInstanceOf[js.Any])
      
      inline def setDecodeMap(value: Any): Self = StObject.set(x, "decodeMap", value.asInstanceOf[js.Any])
      
      inline def setDecodePointer(value: Any): Self = StObject.set(x, "decodePointer", value.asInstanceOf[js.Any])
      
      inline def setDecodeString(value: Any): Self = StObject.set(x, "decodeString", value.asInstanceOf[js.Any])
      
      inline def setDecodeUint(value: Any): Self = StObject.set(x, "decodeUint", value.asInstanceOf[js.Any])
      
      inline def setSizeFromCtrlByte(value: Any): Self = StObject.set(x, "sizeFromCtrlByte", value.asInstanceOf[js.Any])
      
      inline def setTelemetry(value: Record[String, Any]): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    }
  }
}

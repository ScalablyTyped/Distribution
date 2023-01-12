package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCryptoHmacMod {
  
  inline def apply(hash: String, key: String): Unit = (^.asInstanceOf[js.Dynamic].apply(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(hash: String, key: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].apply(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(hash: String, key: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].apply(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/crypto/HMAC", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with HMAC {
    def this(hash: String, key: String) = this()
    def this(hash: String, key: js.typedarray.ArrayBuffer) = this()
    def this(hash: String, key: js.typedarray.Uint8Array) = this()
  }
  @JSImport("@nginstack/engine/lib/crypto/HMAC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digest(hash: String, key: String, data: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: String, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: String, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.ArrayBuffer): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.ArrayBuffer, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.ArrayBuffer, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.Uint8Array, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: String, data: js.typedarray.Uint8Array, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: String, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: String, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.ArrayBuffer): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.ArrayBuffer, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(
    hash: String,
    key: js.typedarray.ArrayBuffer,
    data: js.typedarray.ArrayBuffer,
    resultType: DigestType
  ): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.Uint8Array, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(
    hash: String,
    key: js.typedarray.ArrayBuffer,
    data: js.typedarray.Uint8Array,
    resultType: DigestType
  ): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: String, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: String, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.ArrayBuffer): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.ArrayBuffer, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(
    hash: String,
    key: js.typedarray.Uint8Array,
    data: js.typedarray.ArrayBuffer,
    resultType: DigestType
  ): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(
    hash: String,
    key: js.typedarray.Uint8Array,
    data: js.typedarray.Uint8Array,
    resultType: DigestType
  ): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  
  inline def hexDigest(hash: String, key: String, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: String, data: js.typedarray.ArrayBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: String, data: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.ArrayBuffer, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.ArrayBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.ArrayBuffer, data: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.Uint8Array, data: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.ArrayBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDigest(hash: String, key: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(hash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DigestType extends StObject {
    
    var ARRAY_BUFFER: String
    
    var BINARY_STRING: String
    
    var UINT8_ARRAY: String
  }
  object DigestType {
    
    inline def apply(ARRAY_BUFFER: String, BINARY_STRING: String, UINT8_ARRAY: String): DigestType = {
      val __obj = js.Dynamic.literal(ARRAY_BUFFER = ARRAY_BUFFER.asInstanceOf[js.Any], BINARY_STRING = BINARY_STRING.asInstanceOf[js.Any], UINT8_ARRAY = UINT8_ARRAY.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigestType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DigestType] (val x: Self) extends AnyVal {
      
      inline def setARRAY_BUFFER(value: String): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setBINARY_STRING(value: String): Self = StObject.set(x, "BINARY_STRING", value.asInstanceOf[js.Any])
      
      inline def setUINT8_ARRAY(value: String): Self = StObject.set(x, "UINT8_ARRAY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HMAC extends StObject {
    
    def digest(digestType: Any): String = js.native
    
    def hexDigest(): String = js.native
    
    def update(data: String): HMAC = js.native
    def update(data: js.typedarray.ArrayBuffer): HMAC = js.native
    def update(data: js.typedarray.Uint8Array): HMAC = js.native
  }
}

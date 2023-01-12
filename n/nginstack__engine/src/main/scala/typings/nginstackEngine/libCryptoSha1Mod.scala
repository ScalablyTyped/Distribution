package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCryptoSha1Mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/crypto/SHA1", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SHA1
  @JSImport("@nginstack/engine/lib/crypto/SHA1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digest(data: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: String, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: String, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.ArrayBuffer): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.ArrayBuffer, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.ArrayBuffer, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.Uint8Array, resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  inline def digest(data: js.typedarray.Uint8Array, resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], resultType.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer]
  
  inline def hexDigest(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexDigest(data: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexDigest(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  trait SHA1 extends StObject {
    
    def digest(): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = js.native
    def digest(resultType: String): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = js.native
    def digest(resultType: DigestType): String | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer = js.native
    
    def hexDigest(): String = js.native
    
    def update(data: String): SHA1 = js.native
    def update(data: js.typedarray.ArrayBuffer): SHA1 = js.native
    def update(data: js.typedarray.Uint8Array): SHA1 = js.native
  }
}

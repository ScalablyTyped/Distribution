package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object md5Mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/crypto/MD5", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MD5
  @JSImport("@nginstack/engine/lib/crypto/MD5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def digest(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def digest(data: String, digestType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], digestType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def digest(data: String, digestType: DigestType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(data.asInstanceOf[js.Any], digestType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexDigest(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDigest")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    extension [Self <: DigestType](x: Self) {
      
      inline def setARRAY_BUFFER(value: String): Self = StObject.set(x, "ARRAY_BUFFER", value.asInstanceOf[js.Any])
      
      inline def setBINARY_STRING(value: String): Self = StObject.set(x, "BINARY_STRING", value.asInstanceOf[js.Any])
      
      inline def setUINT8_ARRAY(value: String): Self = StObject.set(x, "UINT8_ARRAY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MD5 extends StObject {
    
    def digest(): String = js.native
    def digest(digestType: String): String = js.native
    def digest(digestType: DigestType): String = js.native
    
    def hexDigest(): String = js.native
    
    def update(data: String): js.Object = js.native
  }
}

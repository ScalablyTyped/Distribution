package typings.nodeForge.mod

import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipher {
  
  @JSImport("node-forge", "cipher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCipher(algorithm: Algorithm, payload: Bytes): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  inline def createCipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  
  inline def createDecipher(algorithm: Algorithm, payload: Bytes): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  inline def createDecipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[BlockCipher]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeForge.nodeForgeStrings.`AES-ECB`
    - typings.nodeForge.nodeForgeStrings.`AES-CBC`
    - typings.nodeForge.nodeForgeStrings.`AES-CFB`
    - typings.nodeForge.nodeForgeStrings.`AES-OFB`
    - typings.nodeForge.nodeForgeStrings.`AES-CTR`
    - typings.nodeForge.nodeForgeStrings.`AES-GCM`
    - typings.nodeForge.nodeForgeStrings.`3DES-ECB`
    - typings.nodeForge.nodeForgeStrings.`3DES-CBC`
    - typings.nodeForge.nodeForgeStrings.`DES-ECB`
    - typings.nodeForge.nodeForgeStrings.`DES-CBC`
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    inline def `3DES-CBC`: typings.nodeForge.nodeForgeStrings.`3DES-CBC` = "3DES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`3DES-CBC`]
    
    inline def `3DES-ECB`: typings.nodeForge.nodeForgeStrings.`3DES-ECB` = "3DES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`3DES-ECB`]
    
    inline def `AES-CBC`: typings.nodeForge.nodeForgeStrings.`AES-CBC` = "AES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CBC`]
    
    inline def `AES-CFB`: typings.nodeForge.nodeForgeStrings.`AES-CFB` = "AES-CFB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CFB`]
    
    inline def `AES-CTR`: typings.nodeForge.nodeForgeStrings.`AES-CTR` = "AES-CTR".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CTR`]
    
    inline def `AES-ECB`: typings.nodeForge.nodeForgeStrings.`AES-ECB` = "AES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-ECB`]
    
    inline def `AES-GCM`: typings.nodeForge.nodeForgeStrings.`AES-GCM` = "AES-GCM".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-GCM`]
    
    inline def `AES-OFB`: typings.nodeForge.nodeForgeStrings.`AES-OFB` = "AES-OFB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-OFB`]
    
    inline def `DES-CBC`: typings.nodeForge.nodeForgeStrings.`DES-CBC` = "DES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`DES-CBC`]
    
    inline def `DES-ECB`: typings.nodeForge.nodeForgeStrings.`DES-ECB` = "DES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`DES-ECB`]
  }
  
  @js.native
  trait BlockCipher extends StObject {
    
    def finish(): Boolean = js.native
    
    var mode: Mode = js.native
    
    var output: ByteStringBuffer = js.native
    
    def start(): Unit = js.native
    def start(options: StartOptions): Unit = js.native
    
    def update(payload: ByteBuffer): Unit = js.native
  }
  
  trait Mode extends StObject {
    
    var tag: ByteStringBuffer
  }
  object Mode {
    
    inline def apply(tag: ByteStringBuffer): Mode = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      inline def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartOptions extends StObject {
    
    var additionalData: js.UndefOr[String] = js.undefined
    
    var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.undefined
    
    var tag: js.UndefOr[ByteStringBuffer] = js.undefined
    
    var tagLength: js.UndefOr[Double] = js.undefined
  }
  object StartOptions {
    
    inline def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      inline def setIv(value: ByteBuffer | js.Array[Byte] | Bytes): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setIvVarargs(value: Byte*): Self = StObject.set(x, "iv", js.Array(value*))
      
      inline def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
      
      inline def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

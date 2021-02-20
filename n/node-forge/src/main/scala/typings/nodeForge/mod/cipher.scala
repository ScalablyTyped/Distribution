package typings.nodeForge.mod

import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cipher {
  
  @JSImport("node-forge", "cipher.createCipher")
  @js.native
  def createCipher(algorithm: Algorithm, payload: Bytes): BlockCipher = js.native
  @JSImport("node-forge", "cipher.createCipher")
  @js.native
  def createCipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = js.native
  
  @JSImport("node-forge", "cipher.createDecipher")
  @js.native
  def createDecipher(algorithm: Algorithm, payload: Bytes): BlockCipher = js.native
  @JSImport("node-forge", "cipher.createDecipher")
  @js.native
  def createDecipher(algorithm: Algorithm, payload: ByteBuffer): BlockCipher = js.native
  
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
    
    @scala.inline
    def `3DES-CBC`: typings.nodeForge.nodeForgeStrings.`3DES-CBC` = "3DES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`3DES-CBC`]
    
    @scala.inline
    def `3DES-ECB`: typings.nodeForge.nodeForgeStrings.`3DES-ECB` = "3DES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`3DES-ECB`]
    
    @scala.inline
    def `AES-CBC`: typings.nodeForge.nodeForgeStrings.`AES-CBC` = "AES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CBC`]
    
    @scala.inline
    def `AES-CFB`: typings.nodeForge.nodeForgeStrings.`AES-CFB` = "AES-CFB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CFB`]
    
    @scala.inline
    def `AES-CTR`: typings.nodeForge.nodeForgeStrings.`AES-CTR` = "AES-CTR".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-CTR`]
    
    @scala.inline
    def `AES-ECB`: typings.nodeForge.nodeForgeStrings.`AES-ECB` = "AES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-ECB`]
    
    @scala.inline
    def `AES-GCM`: typings.nodeForge.nodeForgeStrings.`AES-GCM` = "AES-GCM".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-GCM`]
    
    @scala.inline
    def `AES-OFB`: typings.nodeForge.nodeForgeStrings.`AES-OFB` = "AES-OFB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`AES-OFB`]
    
    @scala.inline
    def `DES-CBC`: typings.nodeForge.nodeForgeStrings.`DES-CBC` = "DES-CBC".asInstanceOf[typings.nodeForge.nodeForgeStrings.`DES-CBC`]
    
    @scala.inline
    def `DES-ECB`: typings.nodeForge.nodeForgeStrings.`DES-ECB` = "DES-ECB".asInstanceOf[typings.nodeForge.nodeForgeStrings.`DES-ECB`]
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
  
  @js.native
  trait Mode extends StObject {
    
    var tag: ByteStringBuffer = js.native
  }
  object Mode {
    
    @scala.inline
    def apply(tag: ByteStringBuffer): Mode = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mode]
    }
    
    @scala.inline
    implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StartOptions extends StObject {
    
    var additionalData: js.UndefOr[String] = js.native
    
    var iv: js.UndefOr[ByteBuffer | js.Array[Byte] | Bytes] = js.native
    
    var tag: js.UndefOr[ByteStringBuffer] = js.native
    
    var tagLength: js.UndefOr[Double] = js.native
  }
  object StartOptions {
    
    @scala.inline
    def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    @scala.inline
    implicit class StartOptionsMutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalData(value: String): Self = StObject.set(x, "additionalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalDataUndefined: Self = StObject.set(x, "additionalData", js.undefined)
      
      @scala.inline
      def setIv(value: ByteBuffer | js.Array[Byte] | Bytes): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setIvVarargs(value: Byte*): Self = StObject.set(x, "iv", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: ByteStringBuffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagLength(value: Double): Self = StObject.set(x, "tagLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagLengthUndefined: Self = StObject.set(x, "tagLength", js.undefined)
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

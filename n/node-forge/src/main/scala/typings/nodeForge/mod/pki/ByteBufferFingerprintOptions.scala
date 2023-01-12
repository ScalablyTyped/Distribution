package typings.nodeForge.mod.pki

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.nodeForgeStrings.RSAPublicKey
import typings.nodeForge.nodeForgeStrings.SubjectPublicKeyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteBufferFingerprintOptions extends StObject {
  
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.undefined
  
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.undefined
  
  /**
    * @description The type of fingerprint. If not specified, defaults to 'RSAPublicKey'
    */
  var `type`: js.UndefOr[SubjectPublicKeyInfo | RSAPublicKey] = js.undefined
}
object ByteBufferFingerprintOptions {
  
  inline def apply(): ByteBufferFingerprintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteBufferFingerprintOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ByteBufferFingerprintOptions] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setMd(value: MessageDigest): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
    
    inline def setType(value: SubjectPublicKeyInfo | RSAPublicKey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAlgorithm extends StObject {
  
  /** The encryption algorithm. */
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  
  /** SHA256 hash value of the encryption key. */
  var keySha256: js.UndefOr[String] = js.native
}
object EncryptionAlgorithm {
  
  @scala.inline
  def apply(): EncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionAlgorithm]
  }
  
  @scala.inline
  implicit class EncryptionAlgorithmMutableBuilder[Self <: EncryptionAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setKeySha256(value: String): Self = StObject.set(x, "keySha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySha256Undefined: Self = StObject.set(x, "keySha256", js.undefined)
  }
}

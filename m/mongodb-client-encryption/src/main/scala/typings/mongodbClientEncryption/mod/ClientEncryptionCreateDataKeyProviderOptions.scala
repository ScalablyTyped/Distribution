package typings.mongodbClientEncryption.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEncryptionCreateDataKeyProviderOptions extends StObject {
  
  /**
    * An optional list of string alternate names used to reference a key.
    * If a key is created with alternate names, then encryption may refer to the key by the unique alternate name instead of by _id.
    */
  var keyAltNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @experimental */
  var keyMaterial: js.UndefOr[
    Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any)
  ] = js.undefined
  
  /**
    * Identifies a new KMS-specific key used to encrypt the new data key
    */
  var masterKey: js.UndefOr[AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions] = js.undefined
}
object ClientEncryptionCreateDataKeyProviderOptions {
  
  inline def apply(): ClientEncryptionCreateDataKeyProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientEncryptionCreateDataKeyProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientEncryptionCreateDataKeyProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyAltNames(value: js.Array[String]): Self = StObject.set(x, "keyAltNames", value.asInstanceOf[js.Any])
    
    inline def setKeyAltNamesUndefined: Self = StObject.set(x, "keyAltNames", js.undefined)
    
    inline def setKeyAltNamesVarargs(value: String*): Self = StObject.set(x, "keyAltNames", js.Array(value*))
    
    inline def setKeyMaterial(
      value: Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any)
    ): Self = StObject.set(x, "keyMaterial", value.asInstanceOf[js.Any])
    
    inline def setKeyMaterialUndefined: Self = StObject.set(x, "keyMaterial", js.undefined)
    
    inline def setMasterKey(value: AWSEncryptionKeyOptions | AzureEncryptionKeyOptions | GCPEncryptionKeyOptions): Self = StObject.set(x, "masterKey", value.asInstanceOf[js.Any])
    
    inline def setMasterKeyUndefined: Self = StObject.set(x, "masterKey", js.undefined)
  }
}

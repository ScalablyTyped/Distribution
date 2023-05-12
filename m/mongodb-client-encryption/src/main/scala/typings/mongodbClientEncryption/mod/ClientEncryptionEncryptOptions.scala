package typings.mongodbClientEncryption.mod

import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.Indexed
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.RangePreview
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.Unindexed
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.`AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic`
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.`AEAD_AES_256_CBC_HMAC_SHA_512-Random`
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.equality
import typings.mongodbClientEncryption.mongodbClientEncryptionStrings.rangePreview_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEncryptionEncryptOptions extends StObject {
  
  /**
    * The algorithm to use for encryption.
    */
  var algorithm: `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic` | `AEAD_AES_256_CBC_HMAC_SHA_512-Random` | Indexed | Unindexed | RangePreview
  
  /** The contention factor. */
  var contentionFactor: js.UndefOr[js.BigInt | Double] = js.undefined
  
  /**
    * A unique string name corresponding to an already existing dataKey.
    */
  var keyAltName: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the Binary dataKey to use for encryption
    */
  var keyId: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ] = js.undefined
  
  /**
    * The query type supported.  Only the queryType `equality` is stable.
    *
    * @experimental Public Technical Preview: The queryType `rangePreview` is experimental.
    */
  var queryType: js.UndefOr[equality | rangePreview_] = js.undefined
  
  /** @experimental Public Technical Preview: The index options for a Queryable Encryption field supporting "rangePreview" queries.*/
  var rangeOptions: js.UndefOr[RangeOptions] = js.undefined
}
object ClientEncryptionEncryptOptions {
  
  inline def apply(
    algorithm: `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic` | `AEAD_AES_256_CBC_HMAC_SHA_512-Random` | Indexed | Unindexed | RangePreview
  ): ClientEncryptionEncryptOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEncryptionEncryptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientEncryptionEncryptOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(
      value: `AEAD_AES_256_CBC_HMAC_SHA_512-Deterministic` | `AEAD_AES_256_CBC_HMAC_SHA_512-Random` | Indexed | Unindexed | RangePreview
    ): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setContentionFactor(value: js.BigInt | Double): Self = StObject.set(x, "contentionFactor", value.asInstanceOf[js.Any])
    
    inline def setContentionFactorUndefined: Self = StObject.set(x, "contentionFactor", js.undefined)
    
    inline def setKeyAltName(value: String): Self = StObject.set(x, "keyAltName", value.asInstanceOf[js.Any])
    
    inline def setKeyAltNameUndefined: Self = StObject.set(x, "keyAltName", js.undefined)
    
    inline def setKeyId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
    ): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setQueryType(value: equality | rangePreview_): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setRangeOptions(value: RangeOptions): Self = StObject.set(x, "rangeOptions", value.asInstanceOf[js.Any])
    
    inline def setRangeOptionsUndefined: Self = StObject.set(x, "rangeOptions", js.undefined)
  }
}

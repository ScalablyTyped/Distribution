package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPrivateKey extends StObject {
  
  var key: KeyLike
  
  /**
    * @default 'sha1'
    */
  var oaepHash: js.UndefOr[String] = js.undefined
  
  var oaepLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.TypedArray */ Any
  ] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
}
object RsaPrivateKey {
  
  inline def apply(key: KeyLike): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
  
  extension [Self <: RsaPrivateKey](x: Self) {
    
    inline def setKey(value: KeyLike): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOaepHash(value: String): Self = StObject.set(x, "oaepHash", value.asInstanceOf[js.Any])
    
    inline def setOaepHashUndefined: Self = StObject.set(x, "oaepHash", js.undefined)
    
    inline def setOaepLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.TypedArray */ Any
    ): Self = StObject.set(x, "oaepLabel", value.asInstanceOf[js.Any])
    
    inline def setOaepLabelUndefined: Self = StObject.set(x, "oaepLabel", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}

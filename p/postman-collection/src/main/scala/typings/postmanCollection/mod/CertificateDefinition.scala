package typings.postmanCollection.mod

import typings.postmanCollection.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateDefinition
  extends StObject
     with PropertyDefinition {
  
  var cert: js.UndefOr[Src | String] = js.undefined
  
  var key: js.UndefOr[Src | String] = js.undefined
  
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
}
object CertificateDefinition {
  
  inline def apply(): CertificateDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDefinition]
  }
  
  extension [Self <: CertificateDefinition](x: Self) {
    
    inline def setCert(value: Src | String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setKey(value: Src | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMatches(value: js.Array[String] | UrlMatchPatternList): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}

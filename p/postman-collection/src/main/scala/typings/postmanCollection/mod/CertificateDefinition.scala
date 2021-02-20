package typings.postmanCollection.mod

import typings.postmanCollection.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateDefinition extends PropertyDefinition {
  
  var cert: js.UndefOr[Src | String] = js.native
  
  var key: js.UndefOr[Src | String] = js.native
  
  var matches: js.UndefOr[js.Array[String] | UrlMatchPatternList] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
}
object CertificateDefinition {
  
  @scala.inline
  def apply(): CertificateDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDefinition]
  }
  
  @scala.inline
  implicit class CertificateDefinitionMutableBuilder[Self <: CertificateDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: Src | String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setKey(value: Src | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMatches(value: js.Array[String] | UrlMatchPatternList): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    @scala.inline
    def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value :_*))
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}

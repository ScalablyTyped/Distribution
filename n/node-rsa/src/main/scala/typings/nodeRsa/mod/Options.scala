package typings.nodeRsa.mod

import typings.nodeRsa.nodeRsaStrings.browser
import typings.nodeRsa.nodeRsaStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  /**
    * Padding scheme for encrypt/decrypt. Default is 'pkcs1_oaep'.
    */
  var encryptionScheme: js.UndefOr[EncryptionScheme | AdvancedEncryptionScheme] = js.native
  
  /**
    * Working environment. (auto detects by default)
    */
  var environment: js.UndefOr[browser | node] = js.native
  
  /**
    * scheme used for signing and verifying.. Default 'pkcs1-sha256', or, if chosen pss: 'pss-sha1'.
    */
  var signingScheme: js.UndefOr[SigningScheme | SigningSchemeHash | AdvancedSigningScheme] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionScheme(value: EncryptionScheme | AdvancedEncryptionScheme): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionSchemeUndefined: Self = StObject.set(x, "encryptionScheme", js.undefined)
    
    @scala.inline
    def setEnvironment(value: browser | node): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setSigningScheme(value: SigningScheme | SigningSchemeHash | AdvancedSigningScheme): Self = StObject.set(x, "signingScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningSchemeUndefined: Self = StObject.set(x, "signingScheme", js.undefined)
  }
}

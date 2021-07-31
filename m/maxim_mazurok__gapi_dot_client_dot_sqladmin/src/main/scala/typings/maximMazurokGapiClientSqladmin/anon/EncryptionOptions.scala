package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionOptions extends StObject {
  
  var encryptionOptions: js.UndefOr[CertPath] = js.undefined
}
object EncryptionOptions {
  
  @scala.inline
  def apply(): EncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionOptions]
  }
  
  @scala.inline
  implicit class EncryptionOptionsMutableBuilder[Self <: EncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionOptions(value: CertPath): Self = StObject.set(x, "encryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptionsUndefined: Self = StObject.set(x, "encryptionOptions", js.undefined)
  }
}

package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICopyVaultJobOutputInfo extends StObject {
  
  val VaultProperties: IVaultProperties
}
object ICopyVaultJobOutputInfo {
  
  @scala.inline
  def apply(VaultProperties: IVaultProperties): ICopyVaultJobOutputInfo = {
    val __obj = js.Dynamic.literal(VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJobOutputInfo]
  }
  
  @scala.inline
  implicit class ICopyVaultJobOutputInfoMutableBuilder[Self <: ICopyVaultJobOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVaultProperties(value: IVaultProperties): Self = StObject.set(x, "VaultProperties", value.asInstanceOf[js.Any])
  }
}

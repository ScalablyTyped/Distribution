package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Confirmation extends StObject {
  
  var confirmation: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var info: js.UndefOr[String] = js.native
  
  var warning: js.UndefOr[String] = js.native
}
object Confirmation {
  
  @scala.inline
  def apply(): Confirmation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confirmation]
  }
  
  @scala.inline
  implicit class ConfirmationMutableBuilder[Self <: Confirmation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmation(value: String): Self = StObject.set(x, "confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmationUndefined: Self = StObject.set(x, "confirmation", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}

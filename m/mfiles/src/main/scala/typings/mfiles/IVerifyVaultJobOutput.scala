package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVerifyVaultJobOutput extends StObject {
  
  val Errors: IStrings = js.native
}
object IVerifyVaultJobOutput {
  
  @scala.inline
  def apply(Errors: IStrings): IVerifyVaultJobOutput = {
    val __obj = js.Dynamic.literal(Errors = Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerifyVaultJobOutput]
  }
  
  @scala.inline
  implicit class IVerifyVaultJobOutputMutableBuilder[Self <: IVerifyVaultJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: IStrings): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
  }
}

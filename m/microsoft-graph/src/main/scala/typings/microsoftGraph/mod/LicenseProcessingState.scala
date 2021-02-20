package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseProcessingState extends StObject {
  
  var state: js.UndefOr[NullableOption[String]] = js.native
}
object LicenseProcessingState {
  
  @scala.inline
  def apply(): LicenseProcessingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseProcessingState]
  }
  
  @scala.inline
  implicit class LicenseProcessingStateMutableBuilder[Self <: LicenseProcessingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

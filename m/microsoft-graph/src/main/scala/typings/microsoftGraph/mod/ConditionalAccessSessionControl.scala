package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessSessionControl extends StObject {
  
  // Specifies whether the session control is enabled.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
}
object ConditionalAccessSessionControl {
  
  @scala.inline
  def apply(): ConditionalAccessSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessSessionControl]
  }
  
  @scala.inline
  implicit class ConditionalAccessSessionControlMutableBuilder[Self <: ConditionalAccessSessionControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}

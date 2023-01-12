package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseProcessingState extends StObject {
  
  var state: js.UndefOr[NullableOption[String]] = js.undefined
}
object LicenseProcessingState {
  
  inline def apply(): LicenseProcessingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseProcessingState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseProcessingState] (val x: Self) extends AnyVal {
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

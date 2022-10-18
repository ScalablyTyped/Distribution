package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedButtonId extends StObject {
  
  /**
    * Id of selected ToggleButton
    */
  var selectedButtonId: js.UndefOr[String] = js.undefined
}
object SelectedButtonId {
  
  inline def apply(): SelectedButtonId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedButtonId]
  }
  
  extension [Self <: SelectedButtonId](x: Self) {
    
    inline def setSelectedButtonId(value: String): Self = StObject.set(x, "selectedButtonId", value.asInstanceOf[js.Any])
    
    inline def setSelectedButtonIdUndefined: Self = StObject.set(x, "selectedButtonId", js.undefined)
  }
}

package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOverlayWidgetPosition extends StObject {
  
  /**
    * The position preference for the overlay widget.
    */
  var preference: OverlayWidgetPositionPreference | Null
}
object IOverlayWidgetPosition {
  
  inline def apply(): IOverlayWidgetPosition = {
    val __obj = js.Dynamic.literal(preference = null)
    __obj.asInstanceOf[IOverlayWidgetPosition]
  }
  
  extension [Self <: IOverlayWidgetPosition](x: Self) {
    
    inline def setPreference(value: OverlayWidgetPositionPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    inline def setPreferenceNull: Self = StObject.set(x, "preference", null)
  }
}

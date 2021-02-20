package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayWidgetPosition extends StObject {
  
  /**
    * The position preference for the overlay widget.
    */
  var preference: OverlayWidgetPositionPreference | Null = js.native
}
object IOverlayWidgetPosition {
  
  @scala.inline
  def apply(): IOverlayWidgetPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayWidgetPosition]
  }
  
  @scala.inline
  implicit class IOverlayWidgetPositionMutableBuilder[Self <: IOverlayWidgetPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreference(value: OverlayWidgetPositionPreference): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceNull: Self = StObject.set(x, "preference", null)
  }
}

package typings.monacoEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  /**
    * Controls the visibility of the status bar at the bottom of the suggest widget.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Visible {
  
  inline def apply(): Visible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visible]
  }
  
  extension [Self <: Visible](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

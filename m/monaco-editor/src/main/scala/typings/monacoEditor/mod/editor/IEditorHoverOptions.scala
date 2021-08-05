package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorHoverOptions extends StObject {
  
  /**
    * Delay for showing the hover.
    * Defaults to 300.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable the hover.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is the hover sticky such that it can be clicked and its contents selected?
    * Defaults to true.
    */
  var sticky: js.UndefOr[Boolean] = js.undefined
}
object IEditorHoverOptions {
  
  inline def apply(): IEditorHoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorHoverOptions]
  }
  
  extension [Self <: IEditorHoverOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
  }
}

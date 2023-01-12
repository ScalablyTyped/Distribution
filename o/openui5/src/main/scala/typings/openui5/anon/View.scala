package typings.openui5.anon

import typings.openui5.sapUiCoreMvcViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  /**
    * The initialized view.
    */
  var view: js.UndefOr[default] = js.undefined
}
object View {
  
  inline def apply(): View = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    inline def setView(value: default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

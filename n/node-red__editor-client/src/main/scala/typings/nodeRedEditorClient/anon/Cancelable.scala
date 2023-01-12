package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var updateMenu: js.UndefOr[Boolean] = js.undefined
}
object Cancelable {
  
  inline def apply(): Cancelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setUpdateMenu(value: Boolean): Self = StObject.set(x, "updateMenu", value.asInstanceOf[js.Any])
    
    inline def setUpdateMenuUndefined: Self = StObject.set(x, "updateMenu", js.undefined)
  }
}

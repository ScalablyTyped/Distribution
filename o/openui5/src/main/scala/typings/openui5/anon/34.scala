package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  /**
    * The reason object as returned by the component promise
    */
  var reason: js.UndefOr[js.Object] = js.undefined
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `34`] (val x: Self) extends AnyVal {
    
    inline def setReason(value: js.Object): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}

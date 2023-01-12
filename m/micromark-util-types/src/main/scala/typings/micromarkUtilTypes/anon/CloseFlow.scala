package typings.micromarkUtilTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseFlow extends StObject {
  
  var _closeFlow: js.UndefOr[Boolean] = js.undefined
}
object CloseFlow {
  
  inline def apply(): CloseFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseFlow] (val x: Self) extends AnyVal {
    
    inline def set_closeFlow(value: Boolean): Self = StObject.set(x, "_closeFlow", value.asInstanceOf[js.Any])
    
    inline def set_closeFlowUndefined: Self = StObject.set(x, "_closeFlow", js.undefined)
  }
}

package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilter extends StObject {
  
  var conditions: js.UndefOr[Any] = js.undefined
}
object IFilter {
  
  inline def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: Any): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
  }
}

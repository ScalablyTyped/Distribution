package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `266` extends StObject {
  
  var labels: js.UndefOr[js.Array[NameString]] = js.undefined
}
object `266` {
  
  inline def apply(): `266` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`266`]
  }
  
  extension [Self <: `266`](x: Self) {
    
    inline def setLabels(value: js.Array[NameString]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: NameString*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}

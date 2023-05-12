package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `280` extends StObject {
  
  var labels: js.UndefOr[js.Array[Name]] = js.undefined
}
object `280` {
  
  inline def apply(): `280` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`280`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `280`] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: js.Array[Name]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Name*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}

package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  var data: js.Array[Description]
}
object DataArray {
  
  inline def apply(data: js.Array[Description]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  extension [Self <: DataArray](x: Self) {
    
    inline def setData(value: js.Array[Description]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Description*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}

package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray[D /* <: SerieDatum */] extends StObject {
  
  var data: js.Array[DataD[D]]
}
object DataArray {
  
  inline def apply[D /* <: SerieDatum */](data: js.Array[DataD[D]]): DataArray[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray[D]]
  }
  
  extension [Self <: DataArray[?], D /* <: SerieDatum */](x: Self & DataArray[D]) {
    
    inline def setData(value: js.Array[DataD[D]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DataD[D]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}

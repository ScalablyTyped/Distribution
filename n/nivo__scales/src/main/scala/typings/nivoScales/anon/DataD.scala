package typings.nivoScales.anon

import typings.nivoScales.computeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataD[D /* <: SerieDatum */] extends StObject {
  
  var data: D
}
object DataD {
  
  inline def apply[D /* <: SerieDatum */](data: D): DataD[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataD[D]]
  }
  
  extension [Self <: DataD[?], D /* <: SerieDatum */](x: Self & DataD[D]) {
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

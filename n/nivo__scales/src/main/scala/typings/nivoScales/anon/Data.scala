package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[D /* <: SerieDatum */] extends StObject {
  
  var data: D
  
  var position: X
}
object Data {
  
  inline def apply[D /* <: SerieDatum */](data: D, position: X): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  
  extension [Self <: Data[?], D /* <: SerieDatum */](x: Self & Data[D]) {
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

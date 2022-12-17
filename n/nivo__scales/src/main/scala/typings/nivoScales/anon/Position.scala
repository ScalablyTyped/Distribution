package typings.nivoScales.anon

import typings.nivoScales.distTypesComputeMod.SerieDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position[D /* <: SerieDatum */] extends StObject {
  
  var data: D
  
  var position: Y
}
object Position {
  
  inline def apply[D /* <: SerieDatum */](data: D, position: Y): Position[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position[D]]
  }
  
  extension [Self <: Position[?], D /* <: SerieDatum */](x: Self & Position[D]) {
    
    inline def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

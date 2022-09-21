package typings.nivoLine.mod

import typings.nivoLine.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedDatum extends StObject {
  
  var data: Datum
  
  var position: X
}
object ComputedDatum {
  
  inline def apply(data: Datum, position: X): ComputedDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum]
  }
  
  extension [Self <: ComputedDatum](x: Self) {
    
    inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

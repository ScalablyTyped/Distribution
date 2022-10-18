package typings.nivoLine.mod

import typings.nivoLine.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedDatum extends StObject {
  
  var data: Datum
  
  var position: Y
}
object ComputedDatum {
  
  inline def apply(data: Datum, position: Y): ComputedDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedDatum]
  }
  
  extension [Self <: ComputedDatum](x: Self) {
    
    inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}

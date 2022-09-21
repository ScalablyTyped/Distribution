package typings.nivoWaffle.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum extends StObject {
  
  var id: DatumId
  
  var label: DatumLabel
  
  var value: DatumValue
}
object Datum {
  
  inline def apply(id: DatumId, label: DatumLabel, value: DatumValue): Datum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: DatumLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DatumValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

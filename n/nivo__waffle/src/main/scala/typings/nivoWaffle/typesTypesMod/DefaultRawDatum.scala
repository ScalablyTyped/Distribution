package typings.nivoWaffle.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRawDatum
  extends StObject
     with Datum {
  
  @JSName("id")
  var id_DefaultRawDatum: String
  
  @JSName("label")
  var label_DefaultRawDatum: String
  
  @JSName("value")
  var value_DefaultRawDatum: Double
}
object DefaultRawDatum {
  
  inline def apply(id: String, label: String, value: Double): DefaultRawDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRawDatum]
  }
  
  extension [Self <: DefaultRawDatum](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

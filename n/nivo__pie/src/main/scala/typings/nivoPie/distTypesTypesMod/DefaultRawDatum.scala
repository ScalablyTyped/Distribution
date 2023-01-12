package typings.nivoPie.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRawDatum extends StObject {
  
  var id: DatumId
  
  var value: Double
}
object DefaultRawDatum {
  
  inline def apply(id: DatumId, value: Double): DefaultRawDatum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRawDatum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultRawDatum] (val x: Self) extends AnyVal {
    
    inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

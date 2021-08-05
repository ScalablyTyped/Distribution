package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedRange extends StObject {
  
  /** The name of the named range. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ID of the named range. */
  var namedRangeId: js.UndefOr[String] = js.undefined
  
  /** The range this represents. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object NamedRange {
  
  inline def apply(): NamedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedRange]
  }
  
  extension [Self <: NamedRange](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}

package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLocations extends StObject {
  
  /** The list of regional locations in which data is placed. */
  var dataLocations: js.UndefOr[js.Array[String]] = js.undefined
}
object DataLocations {
  
  inline def apply(): DataLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLocations]
  }
  
  extension [Self <: DataLocations](x: Self) {
    
    inline def setDataLocations(value: js.Array[String]): Self = StObject.set(x, "dataLocations", value.asInstanceOf[js.Any])
    
    inline def setDataLocationsUndefined: Self = StObject.set(x, "dataLocations", js.undefined)
    
    inline def setDataLocationsVarargs(value: String*): Self = StObject.set(x, "dataLocations", js.Array(value*))
  }
}

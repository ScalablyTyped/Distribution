package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceColumnReference extends StObject {
  
  /** The display name of the column. It should be unique within a data source. */
  var name: js.UndefOr[String] = js.undefined
}
object DataSourceColumnReference {
  
  inline def apply(): DataSourceColumnReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceColumnReference]
  }
  
  extension [Self <: DataSourceColumnReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

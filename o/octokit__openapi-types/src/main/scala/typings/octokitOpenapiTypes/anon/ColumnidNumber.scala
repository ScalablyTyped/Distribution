package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnidNumber extends StObject {
  
  /** The unique identifier of the column. */
  var column_id: Double
}
object ColumnidNumber {
  
  inline def apply(column_id: Double): ColumnidNumber = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidNumber]
  }
  
  extension [Self <: ColumnidNumber](x: Self) {
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
  }
}

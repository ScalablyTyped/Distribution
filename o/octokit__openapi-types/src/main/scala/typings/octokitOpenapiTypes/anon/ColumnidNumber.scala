package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnidNumber extends StObject {
  
  var column_id: Double
}
object ColumnidNumber {
  
  inline def apply(column_id: Double): ColumnidNumber = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnidNumber] (val x: Self) extends AnyVal {
    
    inline def setColumn_id(value: Double): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
  }
}

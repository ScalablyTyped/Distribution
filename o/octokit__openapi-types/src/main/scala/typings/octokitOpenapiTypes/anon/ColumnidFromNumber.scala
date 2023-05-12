package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnidFromNumber extends StObject {
  
  var column_id: FromNumber
}
object ColumnidFromNumber {
  
  inline def apply(column_id: FromNumber): ColumnidFromNumber = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidFromNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnidFromNumber] (val x: Self) extends AnyVal {
    
    inline def setColumn_id(value: FromNumber): Self = StObject.set(x, "column_id", value.asInstanceOf[js.Any])
  }
}

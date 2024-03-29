package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnNumber extends StObject {
  
  var column: Double
}
object ColumnNumber {
  
  inline def apply(column: Double): ColumnNumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnNumber] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}

package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnNumber extends StObject {
  
  var column: Double = js.native
}
object ColumnNumber {
  
  @scala.inline
  def apply(column: Double): ColumnNumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnNumber]
  }
  
  @scala.inline
  implicit class ColumnNumberMutableBuilder[Self <: ColumnNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}

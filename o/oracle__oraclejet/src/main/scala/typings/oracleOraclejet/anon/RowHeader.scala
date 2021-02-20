package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowHeader extends StObject {
  
  var rowHeader: String = js.native
}
object RowHeader {
  
  @scala.inline
  def apply(rowHeader: String): RowHeader = {
    val __obj = js.Dynamic.literal(rowHeader = rowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeader]
  }
  
  @scala.inline
  implicit class RowHeaderMutableBuilder[Self <: RowHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowHeader(value: String): Self = StObject.set(x, "rowHeader", value.asInstanceOf[js.Any])
  }
}

package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowHeader extends StObject {
  
  var rowHeader: String
}
object RowHeader {
  
  inline def apply(rowHeader: String): RowHeader = {
    val __obj = js.Dynamic.literal(rowHeader = rowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeader]
  }
  
  extension [Self <: RowHeader](x: Self) {
    
    inline def setRowHeader(value: String): Self = StObject.set(x, "rowHeader", value.asInstanceOf[js.Any])
  }
}

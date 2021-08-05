package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnswer extends StObject {
  
  var affectedRows: Double
  
  var table: String
}
object DeleteAnswer {
  
  inline def apply(affectedRows: Double, table: String): DeleteAnswer = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnswer]
  }
  
  extension [Self <: DeleteAnswer](x: Self) {
    
    inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}

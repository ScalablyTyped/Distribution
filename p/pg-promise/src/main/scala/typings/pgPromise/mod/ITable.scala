package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITable extends StObject {
  
  var schema: js.UndefOr[String] = js.undefined
  
  var table: String
}
object ITable {
  
  inline def apply(table: String): ITable = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITable]
  }
  
  extension [Self <: ITable](x: Self) {
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}

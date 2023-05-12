package typings.nodeSqlParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var as: String | Null
  
  var db: String | Null
  
  var table: String
}
object From {
  
  inline def apply(table: String): From = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], as = null, db = null)
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsNull: Self = StObject.set(x, "as", null)
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setDbNull: Self = StObject.set(x, "db", null)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}

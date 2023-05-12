package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Use
  extends StObject
     with AST {
  
  var db: String
  
  var `type`: use
}
object Use {
  
  inline def apply(db: String): Use = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("use")
    __obj.asInstanceOf[Use]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Use] (val x: Self) extends AnyVal {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setType(value: use): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

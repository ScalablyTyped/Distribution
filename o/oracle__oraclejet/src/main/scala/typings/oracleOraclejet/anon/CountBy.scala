package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountBy extends StObject {
  
  var countBy: String
}
object CountBy {
  
  inline def apply(countBy: String): CountBy = {
    val __obj = js.Dynamic.literal(countBy = countBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountBy] (val x: Self) extends AnyVal {
    
    inline def setCountBy(value: String): Self = StObject.set(x, "countBy", value.asInstanceOf[js.Any])
  }
}

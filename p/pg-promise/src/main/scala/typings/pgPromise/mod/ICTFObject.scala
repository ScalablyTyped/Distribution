package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Custom-Type Formatting object
// API: https://github.com/vitaly-t/pg-promise#custom-type-formatting
trait ICTFObject extends StObject {
  
  def toPostgres(a: Any): Any
}
object ICTFObject {
  
  inline def apply(toPostgres: Any => Any): ICTFObject = {
    val __obj = js.Dynamic.literal(toPostgres = js.Any.fromFunction1(toPostgres))
    __obj.asInstanceOf[ICTFObject]
  }
  
  extension [Self <: ICTFObject](x: Self) {
    
    inline def setToPostgres(value: Any => Any): Self = StObject.set(x, "toPostgres", js.Any.fromFunction1(value))
  }
}

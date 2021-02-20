package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Custom-Type Formatting object
// API: https://github.com/vitaly-t/pg-promise#custom-type-formatting
@js.native
trait ICTFObject extends StObject {
  
  def toPostgres(a: js.Any): js.Any = js.native
}
object ICTFObject {
  
  @scala.inline
  def apply(toPostgres: js.Any => js.Any): ICTFObject = {
    val __obj = js.Dynamic.literal(toPostgres = js.Any.fromFunction1(toPostgres))
    __obj.asInstanceOf[ICTFObject]
  }
  
  @scala.inline
  implicit class ICTFObjectMutableBuilder[Self <: ICTFObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToPostgres(value: js.Any => js.Any): Self = StObject.set(x, "toPostgres", js.Any.fromFunction1(value))
  }
}

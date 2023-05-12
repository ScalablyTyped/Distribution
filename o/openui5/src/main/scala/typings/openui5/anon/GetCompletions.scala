package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompletions extends StObject {
  
  var getCompletions: js.Function
}
object GetCompletions {
  
  inline def apply(getCompletions: js.Function): GetCompletions = {
    val __obj = js.Dynamic.literal(getCompletions = getCompletions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCompletions] (val x: Self) extends AnyVal {
    
    inline def setGetCompletions(value: js.Function): Self = StObject.set(x, "getCompletions", value.asInstanceOf[js.Any])
  }
}

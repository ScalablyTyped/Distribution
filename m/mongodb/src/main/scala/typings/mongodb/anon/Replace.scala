package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  var replace: String
}
object Replace {
  
  inline def apply(replace: String): Replace = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  
  extension [Self <: Replace](x: Self) {
    
    inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}

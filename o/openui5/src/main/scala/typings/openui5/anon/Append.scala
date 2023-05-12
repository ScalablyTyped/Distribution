package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Append extends StObject {
  
  var append: Boolean
  
  var value: String
}
object Append {
  
  inline def apply(append: Boolean, value: String): Append = {
    val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Append]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Append] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

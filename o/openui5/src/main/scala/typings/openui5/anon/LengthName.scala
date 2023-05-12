package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthName extends StObject {
  
  var length: int
  
  var name: String
}
object LengthName {
  
  inline def apply(length: int, name: String): LengthName = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LengthName] (val x: Self) extends AnyVal {
    
    inline def setLength(value: int): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

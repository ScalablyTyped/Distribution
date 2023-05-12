package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameFromString extends StObject {
  
  var name: FromString
}
object NameFromString {
  
  inline def apply(name: FromString): NameFromString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameFromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameFromString] (val x: Self) extends AnyVal {
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

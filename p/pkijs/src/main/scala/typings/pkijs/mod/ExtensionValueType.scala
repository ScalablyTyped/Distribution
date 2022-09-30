package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionValueType extends StObject {
  
  var name: String
  
  var `type`: ExtensionValueConstructor
}
object ExtensionValueType {
  
  inline def apply(name: String, `type`: ExtensionValueConstructor): ExtensionValueType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionValueType]
  }
  
  extension [Self <: ExtensionValueType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExtensionValueConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

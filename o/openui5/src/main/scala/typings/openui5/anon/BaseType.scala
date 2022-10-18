package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseType extends StObject {
  
  /**
    * qualified name of a base class
    */
  var baseType: String
  
  /**
    * array of names of public methods
    */
  var publicMethods: js.Array[String]
}
object BaseType {
  
  inline def apply(baseType: String, publicMethods: js.Array[String]): BaseType = {
    val __obj = js.Dynamic.literal(baseType = baseType.asInstanceOf[js.Any], publicMethods = publicMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType]
  }
  
  extension [Self <: BaseType](x: Self) {
    
    inline def setBaseType(value: String): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setPublicMethods(value: js.Array[String]): Self = StObject.set(x, "publicMethods", value.asInstanceOf[js.Any])
    
    inline def setPublicMethodsVarargs(value: String*): Self = StObject.set(x, "publicMethods", js.Array(value*))
  }
}

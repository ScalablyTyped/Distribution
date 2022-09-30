package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubjectDirectoryAttributes extends StObject {
  
  var attributes: js.Array[Attribute]
}
object ISubjectDirectoryAttributes {
  
  inline def apply(attributes: js.Array[Attribute]): ISubjectDirectoryAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubjectDirectoryAttributes]
  }
  
  extension [Self <: ISubjectDirectoryAttributes](x: Self) {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}

package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectDirectoryAttributesJson extends StObject {
  
  var attributes: js.Array[AttributeJson]
}
object SubjectDirectoryAttributesJson {
  
  inline def apply(attributes: js.Array[AttributeJson]): SubjectDirectoryAttributesJson = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectDirectoryAttributesJson]
  }
  
  extension [Self <: SubjectDirectoryAttributesJson](x: Self) {
    
    inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
  }
}

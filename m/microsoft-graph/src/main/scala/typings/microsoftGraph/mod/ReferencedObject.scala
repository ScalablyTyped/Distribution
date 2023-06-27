package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedObject extends StObject {
  
  var referencedObjectName: js.UndefOr[NullableOption[String]] = js.undefined
  
  var referencedProperty: js.UndefOr[NullableOption[String]] = js.undefined
}
object ReferencedObject {
  
  inline def apply(): ReferencedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferencedObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferencedObject] (val x: Self) extends AnyVal {
    
    inline def setReferencedObjectName(value: NullableOption[String]): Self = StObject.set(x, "referencedObjectName", value.asInstanceOf[js.Any])
    
    inline def setReferencedObjectNameNull: Self = StObject.set(x, "referencedObjectName", null)
    
    inline def setReferencedObjectNameUndefined: Self = StObject.set(x, "referencedObjectName", js.undefined)
    
    inline def setReferencedProperty(value: NullableOption[String]): Self = StObject.set(x, "referencedProperty", value.asInstanceOf[js.Any])
    
    inline def setReferencedPropertyNull: Self = StObject.set(x, "referencedProperty", null)
    
    inline def setReferencedPropertyUndefined: Self = StObject.set(x, "referencedProperty", js.undefined)
  }
}

package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISubjectDirectoryAttributes> */
trait SubjectDirectoryAttributesParameters extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object SubjectDirectoryAttributesParameters {
  
  inline def apply(): SubjectDirectoryAttributesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDirectoryAttributesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectDirectoryAttributesParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

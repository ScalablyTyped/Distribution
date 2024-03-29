package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.INameConstraints> */
trait NameConstraintsParameters extends StObject {
  
  var excludedSubtrees: js.UndefOr[js.Array[GeneralSubtree]] = js.undefined
  
  var permittedSubtrees: js.UndefOr[js.Array[GeneralSubtree]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object NameConstraintsParameters {
  
  inline def apply(): NameConstraintsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameConstraintsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameConstraintsParameters] (val x: Self) extends AnyVal {
    
    inline def setExcludedSubtrees(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "excludedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setExcludedSubtreesUndefined: Self = StObject.set(x, "excludedSubtrees", js.undefined)
    
    inline def setExcludedSubtreesVarargs(value: GeneralSubtree*): Self = StObject.set(x, "excludedSubtrees", js.Array(value*))
    
    inline def setPermittedSubtrees(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "permittedSubtrees", value.asInstanceOf[js.Any])
    
    inline def setPermittedSubtreesUndefined: Self = StObject.set(x, "permittedSubtrees", js.undefined)
    
    inline def setPermittedSubtreesVarargs(value: GeneralSubtree*): Self = StObject.set(x, "permittedSubtrees", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

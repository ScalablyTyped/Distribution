package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IGeneralNames> */
trait GeneralNamesParameters extends StObject {
  
  var names: js.UndefOr[js.Array[GeneralName]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object GeneralNamesParameters {
  
  inline def apply(): GeneralNamesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralNamesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneralNamesParameters] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[GeneralName]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: GeneralName*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

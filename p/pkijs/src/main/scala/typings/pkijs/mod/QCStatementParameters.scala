package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IQCStatement> */
trait QCStatementParameters extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var `type`: js.UndefOr[Any] = js.undefined
}
object QCStatementParameters {
  
  inline def apply(): QCStatementParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QCStatementParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QCStatementParameters] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

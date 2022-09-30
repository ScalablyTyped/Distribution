package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PkiObjectParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PkiObjectParameters {
  
  inline def apply(): PkiObjectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PkiObjectParameters]
  }
  
  extension [Self <: PkiObjectParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ITime> */
trait TimeParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var `type`: js.UndefOr[TimeType] = js.undefined
  
  var value: js.UndefOr[js.Date] = js.undefined
}
object TimeParameters {
  
  inline def apply(): TimeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeParameters] (val x: Self) extends AnyVal {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: TimeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

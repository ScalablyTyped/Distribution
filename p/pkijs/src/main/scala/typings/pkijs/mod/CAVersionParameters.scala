package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICAVersion> */
trait CAVersionParameters extends StObject {
  
  var certificateIndex: js.UndefOr[Double] = js.undefined
  
  var keyIndex: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CAVersionParameters {
  
  inline def apply(): CAVersionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CAVersionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CAVersionParameters] (val x: Self) extends AnyVal {
    
    inline def setCertificateIndex(value: Double): Self = StObject.set(x, "certificateIndex", value.asInstanceOf[js.Any])
    
    inline def setCertificateIndexUndefined: Self = StObject.set(x, "certificateIndex", js.undefined)
    
    inline def setKeyIndex(value: Double): Self = StObject.set(x, "keyIndex", value.asInstanceOf[js.Any])
    
    inline def setKeyIndexUndefined: Self = StObject.set(x, "keyIndex", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

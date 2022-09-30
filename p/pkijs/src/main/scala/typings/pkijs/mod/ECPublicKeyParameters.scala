package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IECPublicKey> & {  json :pkijs.pkijs.ECPublicKeyJson | undefined} */
trait ECPublicKeyParameters extends StObject {
  
  var json: js.UndefOr[ECPublicKeyJson] = js.undefined
  
  var namedCurve: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var x: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var y: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object ECPublicKeyParameters {
  
  inline def apply(): ECPublicKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECPublicKeyParameters]
  }
  
  extension [Self <: ECPublicKeyParameters](x: Self) {
    
    inline def setJson(value: ECPublicKeyJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setX(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

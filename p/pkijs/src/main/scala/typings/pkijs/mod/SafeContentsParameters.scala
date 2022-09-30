package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISafeContents> */
trait SafeContentsParameters extends StObject {
  
  var safeBags: js.UndefOr[js.Array[SafeBag[BagType]]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object SafeContentsParameters {
  
  inline def apply(): SafeContentsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeContentsParameters]
  }
  
  extension [Self <: SafeContentsParameters](x: Self) {
    
    inline def setSafeBags(value: js.Array[SafeBag[BagType]]): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    inline def setSafeBagsUndefined: Self = StObject.set(x, "safeBags", js.undefined)
    
    inline def setSafeBagsVarargs(value: SafeBag[BagType]*): Self = StObject.set(x, "safeBags", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

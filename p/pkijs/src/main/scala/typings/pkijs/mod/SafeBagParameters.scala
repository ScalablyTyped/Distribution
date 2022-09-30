package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISafeBag<T>> */
trait SafeBagParameters[T /* <: BagType */] extends StObject {
  
  var bagAttributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var bagId: js.UndefOr[String] = js.undefined
  
  var bagValue: js.UndefOr[T] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object SafeBagParameters {
  
  inline def apply[T /* <: BagType */](): SafeBagParameters[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeBagParameters[T]]
  }
  
  extension [Self <: SafeBagParameters[?], T /* <: BagType */](x: Self & SafeBagParameters[T]) {
    
    inline def setBagAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "bagAttributes", value.asInstanceOf[js.Any])
    
    inline def setBagAttributesUndefined: Self = StObject.set(x, "bagAttributes", js.undefined)
    
    inline def setBagAttributesVarargs(value: Attribute*): Self = StObject.set(x, "bagAttributes", js.Array(value*))
    
    inline def setBagId(value: String): Self = StObject.set(x, "bagId", value.asInstanceOf[js.Any])
    
    inline def setBagIdUndefined: Self = StObject.set(x, "bagId", js.undefined)
    
    inline def setBagValue(value: T): Self = StObject.set(x, "bagValue", value.asInstanceOf[js.Any])
    
    inline def setBagValueUndefined: Self = StObject.set(x, "bagValue", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

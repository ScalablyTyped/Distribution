package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IExtensions> */
trait ExtensionsParameters extends StObject {
  
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object ExtensionsParameters {
  
  inline def apply(): ExtensionsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionsParameters]
  }
  
  extension [Self <: ExtensionsParameters](x: Self) {
    
    inline def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}

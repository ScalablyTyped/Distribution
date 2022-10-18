package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeType extends StObject {
  
  var `@type`: String
  
  var name: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object TypeType {
  
  inline def apply(`@type`: String, name: String): TypeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeType]
  }
  
  extension [Self <: TypeType](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

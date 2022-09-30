package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mappings extends StObject {
  
  var mappings: js.UndefOr[String] = js.undefined
}
object Mappings {
  
  inline def apply(): Mappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mappings]
  }
  
  extension [Self <: Mappings](x: Self) {
    
    inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
  }
}

package typings.openseadragon.anon

import typings.openseadragon.openseadragonStrings.openstreetmaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: openstreetmaps
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("openstreetmaps")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: openstreetmaps): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

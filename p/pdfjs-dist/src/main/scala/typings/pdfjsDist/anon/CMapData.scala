package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMapData extends StObject {
  
  var cMapData: Any
  
  var compressionType: Any
}
object CMapData {
  
  inline def apply(cMapData: Any, compressionType: Any): CMapData = {
    val __obj = js.Dynamic.literal(cMapData = cMapData.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMapData]
  }
  
  extension [Self <: CMapData](x: Self) {
    
    inline def setCMapData(value: Any): Self = StObject.set(x, "cMapData", value.asInstanceOf[js.Any])
    
    inline def setCompressionType(value: Any): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
  }
}

package typings.parcelTypes.mod

import typings.parcelSourceMap.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOutput extends StObject {
  
  val content: Blob
  
  val map: js.UndefOr[default | Null] = js.undefined
}
object GenerateOutput {
  
  inline def apply(content: Blob): GenerateOutput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOutput]
  }
  
  extension [Self <: GenerateOutput](x: Self) {
    
    inline def setContent(value: Blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMap(value: default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}

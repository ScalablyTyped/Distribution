package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UBOElement extends StObject {
  
  var data: IUniformData
  
  var dataLen: Double
  
  var dirty: Double
  
  var offset: Double
}
object UBOElement {
  
  inline def apply(data: IUniformData, dataLen: Double, dirty: Double, offset: Double): UBOElement = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataLen = dataLen.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[UBOElement]
  }
  
  extension [Self <: UBOElement](x: Self) {
    
    inline def setData(value: IUniformData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataLen(value: Double): Self = StObject.set(x, "dataLen", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: Double): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}

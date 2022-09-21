package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var dataType: Double
  
  var name: String
  
  var normalize: Boolean
  
  var numComponents: Double
  
  var offset: Any
  
  var size: Double
  
  var stride: Any
}
object DataType {
  
  inline def apply(
    dataType: Double,
    name: String,
    normalize: Boolean,
    numComponents: Double,
    offset: Any,
    size: Double,
    stride: Any
  ): DataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], numComponents = numComponents.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  extension [Self <: DataType](x: Self) {
    
    inline def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNumComponents(value: Double): Self = StObject.set(x, "numComponents", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStride(value: Any): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}

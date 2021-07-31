package typings.playcanvas.anon

import typings.playcanvas.pc.ScopeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var dataType: Double
  
  var name: String
  
  var normalize: Boolean
  
  var numComponents: Double
  
  var offset: Double
  
  var scopeId: ScopeId
  
  var size: Double
  
  var stride: Double
}
object DataType {
  
  @scala.inline
  def apply(
    dataType: Double,
    name: String,
    normalize: Boolean,
    numComponents: Double,
    offset: Double,
    scopeId: ScopeId,
    size: Double,
    stride: Double
  ): DataType = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normalize = normalize.asInstanceOf[js.Any], numComponents = numComponents.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit class DataTypeMutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: Double): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumComponents(value: Double): Self = StObject.set(x, "numComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeId(value: ScopeId): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
  }
}

package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.transform
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformModule
  extends StObject
     with PlotlyModule {
  
  var attributes: Record[String, Any]
  
  var calcTransform: Any
  
  var moduleType: transform
  
  var name: String
  
  var supplyDefaults: Any
  
  var transform: Any
}
object TransformModule {
  
  inline def apply(
    attributes: Record[String, Any],
    calcTransform: Any,
    name: String,
    supplyDefaults: Any,
    transform: Any
  ): TransformModule = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], calcTransform = calcTransform.asInstanceOf[js.Any], moduleType = "transform", name = name.asInstanceOf[js.Any], supplyDefaults = supplyDefaults.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformModule] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Record[String, Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCalcTransform(value: Any): Self = StObject.set(x, "calcTransform", value.asInstanceOf[js.Any])
    
    inline def setModuleType(value: transform): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupplyDefaults(value: Any): Self = StObject.set(x, "supplyDefaults", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Any): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}

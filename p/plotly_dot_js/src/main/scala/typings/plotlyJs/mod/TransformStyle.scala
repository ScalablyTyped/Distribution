package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPlotDataAutobinx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformStyle extends StObject {
  
  var target: Double | String | (js.Array[Double | String])
  
  var value: PartialPlotDataAutobinx
}
object TransformStyle {
  
  inline def apply(target: Double | String | (js.Array[Double | String]), value: PartialPlotDataAutobinx): TransformStyle = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStyle]
  }
  
  extension [Self <: TransformStyle](x: Self) {
    
    inline def setTarget(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(value: (Double | String)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    inline def setValue(value: PartialPlotDataAutobinx): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

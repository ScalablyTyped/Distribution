package typings.plotlyJs.anon

import typings.plotlyJs.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Frame> */
trait PartialFrame extends StObject {
  
  var baseframe: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Array[Data]] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[PartialLayoutAngularaxis] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var traces: js.UndefOr[js.Array[Double]] = js.undefined
}
object PartialFrame {
  
  inline def apply(): PartialFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFrame] (val x: Self) extends AnyVal {
    
    inline def setBaseframe(value: String): Self = StObject.set(x, "baseframe", value.asInstanceOf[js.Any])
    
    inline def setBaseframeUndefined: Self = StObject.set(x, "baseframe", js.undefined)
    
    inline def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLayout(value: PartialLayoutAngularaxis): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTraces(value: js.Array[Double]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
    
    inline def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
    
    inline def setTracesVarargs(value: Double*): Self = StObject.set(x, "traces", js.Array(value*))
  }
}

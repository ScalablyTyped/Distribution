package typings.plotlyJs.anon

import typings.plotlyJs.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Frame> */
@js.native
trait PartialFrame extends StObject {
  
  var baseframe: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[Data]] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[PartialLayoutAngularaxis] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var traces: js.UndefOr[js.Array[Double]] = js.native
}
object PartialFrame {
  
  @scala.inline
  def apply(): PartialFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFrame]
  }
  
  @scala.inline
  implicit class PartialFrameMutableBuilder[Self <: PartialFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseframe(value: String): Self = StObject.set(x, "baseframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseframeUndefined: Self = StObject.set(x, "baseframe", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setLayout(value: PartialLayoutAngularaxis): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTraces(value: js.Array[Double]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
    
    @scala.inline
    def setTracesVarargs(value: Double*): Self = StObject.set(x, "traces", js.Array(value :_*))
  }
}

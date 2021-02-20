package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View[D] extends StObject {
  
  var map: js.UndefOr[String | DocumentInfer[D]] = js.native
  
  var reduce: js.UndefOr[String | DocumentInfer[D]] = js.native
}
object View {
  
  @scala.inline
  def apply[D](): View[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View[D]]
  }
  
  @scala.inline
  implicit class ViewMutableBuilder[Self <: View[_], D] (val x: Self with View[D]) extends AnyVal {
    
    @scala.inline
    def setMap(value: String | DocumentInfer[D]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapFunction1(value: /* doc */ D with Document => Unit): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setReduce(value: String | DocumentInfer[D]): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceFunction1(value: /* doc */ D with Document => Unit): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
  }
}

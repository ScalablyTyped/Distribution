package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.arraydraw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Padding> */
trait PartialPadding extends StObject {
  
  var b: js.UndefOr[Double] = js.undefined
  
  var editType: js.UndefOr[arraydraw] = js.undefined
  
  var l: js.UndefOr[Double] = js.undefined
  
  var r: js.UndefOr[Double] = js.undefined
  
  var t: js.UndefOr[Double] = js.undefined
}
object PartialPadding {
  
  @scala.inline
  def apply(): PartialPadding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPadding]
  }
  
  @scala.inline
  implicit class PartialPaddingMutableBuilder[Self <: PartialPadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    @scala.inline
    def setEditType(value: arraydraw): Self = StObject.set(x, "editType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditTypeUndefined: Self = StObject.set(x, "editType", js.undefined)
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}

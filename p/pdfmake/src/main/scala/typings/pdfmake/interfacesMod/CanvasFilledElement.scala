package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasFilledElement extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var linearGradient: js.UndefOr[js.Array[String]] = js.native
}
object CanvasFilledElement {
  
  @scala.inline
  def apply(): CanvasFilledElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasFilledElement]
  }
  
  @scala.inline
  implicit class CanvasFilledElementMutableBuilder[Self <: CanvasFilledElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setLinearGradient(value: js.Array[String]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGradientUndefined: Self = StObject.set(x, "linearGradient", js.undefined)
    
    @scala.inline
    def setLinearGradientVarargs(value: String*): Self = StObject.set(x, "linearGradient", js.Array(value :_*))
  }
}

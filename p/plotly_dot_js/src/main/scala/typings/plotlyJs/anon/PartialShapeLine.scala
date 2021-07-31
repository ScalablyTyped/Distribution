package typings.plotlyJs.anon

import typings.plotlyJs.mod.Dash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ShapeLine> */
trait PartialShapeLine extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dash: js.UndefOr[Dash] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialShapeLine {
  
  @scala.inline
  def apply(): PartialShapeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShapeLine]
  }
  
  @scala.inline
  implicit class PartialShapeLineMutableBuilder[Self <: PartialShapeLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

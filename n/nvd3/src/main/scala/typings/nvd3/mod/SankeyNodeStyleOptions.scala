package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyNodeStyleOptions extends StObject {
  
  var fillColor: js.UndefOr[js.Any] = js.undefined
  
  var strokeColor: js.UndefOr[js.Any] = js.undefined
  
  var title: js.UndefOr[js.Any] = js.undefined
}
object SankeyNodeStyleOptions {
  
  @scala.inline
  def apply(): SankeyNodeStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyNodeStyleOptions]
  }
  
  @scala.inline
  implicit class SankeyNodeStyleOptionsMutableBuilder[Self <: SankeyNodeStyleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: js.Any): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: js.Any): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

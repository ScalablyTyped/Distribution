package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSvg
  extends StObject
     with ContentBase
     with _Content {
  
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var svg: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContentSvg {
  
  @scala.inline
  def apply(svg: String): ContentSvg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSvg]
  }
  
  @scala.inline
  implicit class ContentSvgMutableBuilder[Self <: ContentSvg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

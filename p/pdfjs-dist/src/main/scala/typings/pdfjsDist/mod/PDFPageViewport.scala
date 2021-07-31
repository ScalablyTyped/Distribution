package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFPageViewport extends StObject {
  
  def clone(options: PDFPageViewportOptions): PDFPageViewport
  
  // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double]
  
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double]
  
  // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double]
  
  var height: Double
  
  var scale: Double
  
  var transforms: js.Array[Double]
  
  var width: Double
}
object PDFPageViewport {
  
  @scala.inline
  def apply(
    clone_ : PDFPageViewportOptions => PDFPageViewport,
    convertToPdfPoint: (Double, Double) => js.Array[Double],
    convertToViewportPoint: (Double, Double) => js.Array[Double],
    convertToViewportRectangle: js.Array[Double] => js.Array[Double],
    height: Double,
    scale: Double,
    transforms: js.Array[Double],
    width: Double
  ): PDFPageViewport = {
    val __obj = js.Dynamic.literal(convertToPdfPoint = js.Any.fromFunction2(convertToPdfPoint), convertToViewportPoint = js.Any.fromFunction2(convertToViewportPoint), convertToViewportRectangle = js.Any.fromFunction1(convertToViewportRectangle), height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[PDFPageViewport]
  }
  
  @scala.inline
  implicit class PDFPageViewportMutableBuilder[Self <: PDFPageViewport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: PDFPageViewportOptions => PDFPageViewport): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToPdfPoint(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "convertToPdfPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertToViewportPoint(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "convertToViewportPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertToViewportRectangle(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "convertToViewportRectangle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransforms(value: js.Array[Double]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformsVarargs(value: Double*): Self = StObject.set(x, "transforms", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

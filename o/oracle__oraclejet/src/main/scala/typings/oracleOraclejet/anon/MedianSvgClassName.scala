package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedianSvgClassName extends StObject {
  
  var medianSvgClassName: String
  
  var medianSvgStyle: js.Object
  
  var whiskerEndLength: String
  
  var whiskerEndSvgClassName: String
  
  var whiskerEndSvgStyle: js.Object
  
  var whiskerSvgClassName: String
  
  var whiskerSvgStyle: js.Object
}
object MedianSvgClassName {
  
  inline def apply(
    medianSvgClassName: String,
    medianSvgStyle: js.Object,
    whiskerEndLength: String,
    whiskerEndSvgClassName: String,
    whiskerEndSvgStyle: js.Object,
    whiskerSvgClassName: String,
    whiskerSvgStyle: js.Object
  ): MedianSvgClassName = {
    val __obj = js.Dynamic.literal(medianSvgClassName = medianSvgClassName.asInstanceOf[js.Any], medianSvgStyle = medianSvgStyle.asInstanceOf[js.Any], whiskerEndLength = whiskerEndLength.asInstanceOf[js.Any], whiskerEndSvgClassName = whiskerEndSvgClassName.asInstanceOf[js.Any], whiskerEndSvgStyle = whiskerEndSvgStyle.asInstanceOf[js.Any], whiskerSvgClassName = whiskerSvgClassName.asInstanceOf[js.Any], whiskerSvgStyle = whiskerSvgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedianSvgClassName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedianSvgClassName] (val x: Self) extends AnyVal {
    
    inline def setMedianSvgClassName(value: String): Self = StObject.set(x, "medianSvgClassName", value.asInstanceOf[js.Any])
    
    inline def setMedianSvgStyle(value: js.Object): Self = StObject.set(x, "medianSvgStyle", value.asInstanceOf[js.Any])
    
    inline def setWhiskerEndLength(value: String): Self = StObject.set(x, "whiskerEndLength", value.asInstanceOf[js.Any])
    
    inline def setWhiskerEndSvgClassName(value: String): Self = StObject.set(x, "whiskerEndSvgClassName", value.asInstanceOf[js.Any])
    
    inline def setWhiskerEndSvgStyle(value: js.Object): Self = StObject.set(x, "whiskerEndSvgStyle", value.asInstanceOf[js.Any])
    
    inline def setWhiskerSvgClassName(value: String): Self = StObject.set(x, "whiskerSvgClassName", value.asInstanceOf[js.Any])
    
    inline def setWhiskerSvgStyle(value: js.Object): Self = StObject.set(x, "whiskerSvgStyle", value.asInstanceOf[js.Any])
  }
}

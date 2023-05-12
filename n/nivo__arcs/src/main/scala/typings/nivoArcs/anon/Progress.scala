package typings.nivoArcs.anon

import typings.reactSpringWeb.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: SpringValue[Double]
  
  var textColor: String
  
  var transform: Interpolation[String, Any]
}
object Progress {
  
  inline def apply(progress: SpringValue[Double], textColor: String, transform: Interpolation[String, Any]): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: SpringValue[Double]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Interpolation[String, Any]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}

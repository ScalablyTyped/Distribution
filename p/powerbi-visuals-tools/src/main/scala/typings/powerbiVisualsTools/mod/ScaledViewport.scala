package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaledViewport
  extends StObject
     with IViewport {
  
  var scale: Double
}
object ScaledViewport {
  
  inline def apply(height: Double, scale: Double, width: Double): ScaledViewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledViewport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaledViewport] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}

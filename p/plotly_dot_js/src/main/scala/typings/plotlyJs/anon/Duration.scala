package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var redraw: Boolean
}
object Duration {
  
  @scala.inline
  def apply(duration: Double, redraw: Boolean): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], redraw = redraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedraw(value: Boolean): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
  }
}

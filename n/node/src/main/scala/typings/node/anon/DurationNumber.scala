package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationNumber extends StObject {
  
  /**
    * The duration of the test in milliseconds.
    */
  var duration: Double
}
object DurationNumber {
  
  inline def apply(duration: Double): DurationNumber = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationNumber] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}

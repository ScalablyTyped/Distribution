package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishedBoolean extends StObject {
  
  var finished: Boolean
}
object FinishedBoolean {
  
  inline def apply(finished: Boolean): FinishedBoolean = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinishedBoolean]
  }
  
  extension [Self <: FinishedBoolean](x: Self) {
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
  }
}

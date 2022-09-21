package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version_ extends StObject {
  
  def copy(other: Any): Unit
  
  var globalId: Double
  
  def reset(): Unit
  
  var revision: Double
}
object Version_ {
  
  inline def apply(copy: Any => Unit, globalId: Double, reset: () => Unit, revision: Double): Version_ = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), globalId = globalId.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version_]
  }
  
  extension [Self <: Version_](x: Self) {
    
    inline def setCopy(value: Any => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setGlobalId(value: Double): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}

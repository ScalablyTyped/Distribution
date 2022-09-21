package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicTextTrack extends StObject {
  
  def augmentPayload(payload: Any, startTime: Double, endTime: Double): Unit
  
  var label: String
  
  var language: String
  
  var stream: Any
}
object DynamicTextTrack {
  
  inline def apply(augmentPayload: (Any, Double, Double) => Unit, label: String, language: String, stream: Any): DynamicTextTrack = {
    val __obj = js.Dynamic.literal(augmentPayload = js.Any.fromFunction3(augmentPayload), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTextTrack]
  }
  
  extension [Self <: DynamicTextTrack](x: Self) {
    
    inline def setAugmentPayload(value: (Any, Double, Double) => Unit): Self = StObject.set(x, "augmentPayload", js.Any.fromFunction3(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}

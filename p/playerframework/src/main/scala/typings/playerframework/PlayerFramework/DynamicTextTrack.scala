package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicTextTrack extends StObject {
  
  def augmentPayload(payload: js.Any, startTime: Double, endTime: Double): Unit
  
  var label: String
  
  var language: String
  
  var stream: js.Any
}
object DynamicTextTrack {
  
  @scala.inline
  def apply(augmentPayload: (js.Any, Double, Double) => Unit, label: String, language: String, stream: js.Any): DynamicTextTrack = {
    val __obj = js.Dynamic.literal(augmentPayload = js.Any.fromFunction3(augmentPayload), label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicTextTrack]
  }
  
  @scala.inline
  implicit class DynamicTextTrackMutableBuilder[Self <: DynamicTextTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAugmentPayload(value: (js.Any, Double, Double) => Unit): Self = StObject.set(x, "augmentPayload", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}

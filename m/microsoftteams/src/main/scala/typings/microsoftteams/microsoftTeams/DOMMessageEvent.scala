package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  * Shim in definitions used for browser-compat
  */
/**
  * Meant for Message objects that are sent to children without id
  */
trait DOMMessageEvent extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var func: String
  
  var origin: js.UndefOr[Any] = js.undefined
  
  var originalEvent: DOMMessageEvent
  
  var source: js.UndefOr[Any] = js.undefined
}
object DOMMessageEvent {
  
  inline def apply(func: String, originalEvent: DOMMessageEvent): DOMMessageEvent = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMessageEvent]
  }
  
  extension [Self <: DOMMessageEvent](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFunc(value: String): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Any): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginalEvent(value: DOMMessageEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

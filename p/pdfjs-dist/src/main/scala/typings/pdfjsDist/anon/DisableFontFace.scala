package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFontFace extends StObject {
  
  var disableFontFace: js.UndefOr[Boolean] = js.undefined
  
  var fontRegistry: js.UndefOr[Null] = js.undefined
  
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  
  var isEvalSupported: js.UndefOr[Boolean] = js.undefined
  
  var onUnsupportedFeature: Any
}
object DisableFontFace {
  
  inline def apply(onUnsupportedFeature: Any): DisableFontFace = {
    val __obj = js.Dynamic.literal(onUnsupportedFeature = onUnsupportedFeature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableFontFace]
  }
  
  extension [Self <: DisableFontFace](x: Self) {
    
    inline def setDisableFontFace(value: Boolean): Self = StObject.set(x, "disableFontFace", value.asInstanceOf[js.Any])
    
    inline def setDisableFontFaceUndefined: Self = StObject.set(x, "disableFontFace", js.undefined)
    
    inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    inline def setIsEvalSupported(value: Boolean): Self = StObject.set(x, "isEvalSupported", value.asInstanceOf[js.Any])
    
    inline def setIsEvalSupportedUndefined: Self = StObject.set(x, "isEvalSupported", js.undefined)
    
    inline def setOnUnsupportedFeature(value: Any): Self = StObject.set(x, "onUnsupportedFeature", value.asInstanceOf[js.Any])
  }
}

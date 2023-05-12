package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFontFace extends StObject {
  
  var disableFontFace: js.UndefOr[Boolean] = js.undefined
  
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  
  var inspectFont: js.UndefOr[Null] = js.undefined
  
  var isEvalSupported: js.UndefOr[Boolean] = js.undefined
}
object DisableFontFace {
  
  inline def apply(): DisableFontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFontFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableFontFace] (val x: Self) extends AnyVal {
    
    inline def setDisableFontFace(value: Boolean): Self = StObject.set(x, "disableFontFace", value.asInstanceOf[js.Any])
    
    inline def setDisableFontFaceUndefined: Self = StObject.set(x, "disableFontFace", js.undefined)
    
    inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    inline def setIsEvalSupported(value: Boolean): Self = StObject.set(x, "isEvalSupported", value.asInstanceOf[js.Any])
    
    inline def setIsEvalSupportedUndefined: Self = StObject.set(x, "isEvalSupported", js.undefined)
  }
}

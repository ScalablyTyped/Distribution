package typings.nightwatch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preview extends StObject {
  
  var preview: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useGlobal: js.UndefOr[Boolean] = js.undefined
}
object Preview {
  
  inline def apply(): Preview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Preview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Preview] (val x: Self) extends AnyVal {
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseGlobal(value: Boolean): Self = StObject.set(x, "useGlobal", value.asInstanceOf[js.Any])
    
    inline def setUseGlobalUndefined: Self = StObject.set(x, "useGlobal", js.undefined)
  }
}

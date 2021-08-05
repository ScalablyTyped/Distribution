package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutReference extends StObject {
  
  /** Layout ID: the object ID of one of the layouts in the presentation. */
  var layoutId: js.UndefOr[String] = js.undefined
  
  /** Predefined layout. */
  var predefinedLayout: js.UndefOr[String] = js.undefined
}
object LayoutReference {
  
  inline def apply(): LayoutReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutReference]
  }
  
  extension [Self <: LayoutReference](x: Self) {
    
    inline def setLayoutId(value: String): Self = StObject.set(x, "layoutId", value.asInstanceOf[js.Any])
    
    inline def setLayoutIdUndefined: Self = StObject.set(x, "layoutId", js.undefined)
    
    inline def setPredefinedLayout(value: String): Self = StObject.set(x, "predefinedLayout", value.asInstanceOf[js.Any])
    
    inline def setPredefinedLayoutUndefined: Self = StObject.set(x, "predefinedLayout", js.undefined)
  }
}

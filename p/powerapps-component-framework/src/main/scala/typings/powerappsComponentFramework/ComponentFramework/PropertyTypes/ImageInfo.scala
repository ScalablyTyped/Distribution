package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The structure returned by getCellImageInfo and propagated down to the control to display conditional images.
  */
trait ImageInfo extends StObject {
  
  /**
    * The tooltip associated with that image.
    */
  var Tooltip: String
  
  /**
    * The Url of the conditional image.
    */
  var Url: String
}
object ImageInfo {
  
  inline def apply(Tooltip: String, Url: String): ImageInfo = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageInfo]
  }
  
  extension [Self <: ImageInfo](x: Self) {
    
    inline def setTooltip(value: String): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}

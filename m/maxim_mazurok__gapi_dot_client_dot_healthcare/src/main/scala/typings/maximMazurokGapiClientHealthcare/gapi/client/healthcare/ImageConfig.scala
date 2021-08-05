package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig extends StObject {
  
  /** Determines how to redact text from image. */
  var textRedactionMode: js.UndefOr[String] = js.undefined
}
object ImageConfig {
  
  inline def apply(): ImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfig]
  }
  
  extension [Self <: ImageConfig](x: Self) {
    
    inline def setTextRedactionMode(value: String): Self = StObject.set(x, "textRedactionMode", value.asInstanceOf[js.Any])
    
    inline def setTextRedactionModeUndefined: Self = StObject.set(x, "textRedactionMode", js.undefined)
  }
}

package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfig extends StObject {
  
  /** Determines how to redact text from image. */
  var textRedactionMode: js.UndefOr[String] = js.native
}
object ImageConfig {
  
  @scala.inline
  def apply(): ImageConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageConfig]
  }
  
  @scala.inline
  implicit class ImageConfigMutableBuilder[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextRedactionMode(value: String): Self = StObject.set(x, "textRedactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRedactionModeUndefined: Self = StObject.set(x, "textRedactionMode", js.undefined)
  }
}

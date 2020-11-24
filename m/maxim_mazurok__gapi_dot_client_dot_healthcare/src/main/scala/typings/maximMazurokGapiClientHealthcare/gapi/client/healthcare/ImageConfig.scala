package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageConfig extends js.Object {
  
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
  implicit class ImageConfigOps[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTextRedactionMode(value: String): Self = this.set("textRedactionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRedactionMode: Self = this.set("textRedactionMode", js.undefined)
  }
}

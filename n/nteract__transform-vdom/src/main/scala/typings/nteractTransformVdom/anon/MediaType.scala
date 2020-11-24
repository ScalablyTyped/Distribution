package typings.nteractTransformVdom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaType extends js.Object {
  
  var mediaType: String = js.native
  
  def onVDOMEvent(): Unit = js.native
}
object MediaType {
  
  @scala.inline
  def apply(mediaType: String, onVDOMEvent: () => Unit): MediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], onVDOMEvent = js.Any.fromFunction0(onVDOMEvent))
    __obj.asInstanceOf[MediaType]
  }
  
  @scala.inline
  implicit class MediaTypeOps[Self <: MediaType] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnVDOMEvent(value: () => Unit): Self = this.set("onVDOMEvent", js.Any.fromFunction0(value))
  }
}

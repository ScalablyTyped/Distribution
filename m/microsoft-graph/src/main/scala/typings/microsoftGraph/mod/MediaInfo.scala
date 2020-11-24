package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaInfo extends js.Object {
  
  /**
    * Optional. Used to uniquely identity the resource. If passed in, the prompt uri will be cached against this resourceId
    * as a key.
    */
  var resourceId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Path to the prompt that will be played. Currently supports only Wave file (.wav) format, single-channel, 16-bit samples
    * with a 16,000 (16KHz) sampling rate.
    */
  var uri: js.UndefOr[String] = js.native
}
object MediaInfo {
  
  @scala.inline
  def apply(): MediaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInfo]
  }
  
  @scala.inline
  implicit class MediaInfoOps[Self <: MediaInfo] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: NullableOption[String]): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceIdNull: Self = this.set("resourceId", null)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}

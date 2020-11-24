package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceHostedMediaConfig extends MediaConfig {
  
  // The list of media to pre-fetch.
  var preFetchMedia: js.UndefOr[NullableOption[js.Array[MediaInfo]]] = js.native
}
object ServiceHostedMediaConfig {
  
  @scala.inline
  def apply(): ServiceHostedMediaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHostedMediaConfig]
  }
  
  @scala.inline
  implicit class ServiceHostedMediaConfigOps[Self <: ServiceHostedMediaConfig] (val x: Self) extends AnyVal {
    
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
    def setPreFetchMediaVarargs(value: MediaInfo*): Self = this.set("preFetchMedia", js.Array(value :_*))
    
    @scala.inline
    def setPreFetchMedia(value: NullableOption[js.Array[MediaInfo]]): Self = this.set("preFetchMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreFetchMedia: Self = this.set("preFetchMedia", js.undefined)
    
    @scala.inline
    def setPreFetchMediaNull: Self = this.set("preFetchMedia", null)
  }
}

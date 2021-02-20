package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ServiceHostedMediaConfigMutableBuilder[Self <: ServiceHostedMediaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreFetchMedia(value: NullableOption[js.Array[MediaInfo]]): Self = StObject.set(x, "preFetchMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreFetchMediaNull: Self = StObject.set(x, "preFetchMedia", null)
    
    @scala.inline
    def setPreFetchMediaUndefined: Self = StObject.set(x, "preFetchMedia", js.undefined)
    
    @scala.inline
    def setPreFetchMediaVarargs(value: MediaInfo*): Self = StObject.set(x, "preFetchMedia", js.Array(value :_*))
  }
}

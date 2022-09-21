package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceHostedMediaConfig
  extends StObject
     with MediaConfig {
  
  // The list of media to pre-fetch.
  var preFetchMedia: js.UndefOr[NullableOption[js.Array[MediaInfo]]] = js.undefined
}
object ServiceHostedMediaConfig {
  
  inline def apply(): ServiceHostedMediaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHostedMediaConfig]
  }
  
  extension [Self <: ServiceHostedMediaConfig](x: Self) {
    
    inline def setPreFetchMedia(value: NullableOption[js.Array[MediaInfo]]): Self = StObject.set(x, "preFetchMedia", value.asInstanceOf[js.Any])
    
    inline def setPreFetchMediaNull: Self = StObject.set(x, "preFetchMedia", null)
    
    inline def setPreFetchMediaUndefined: Self = StObject.set(x, "preFetchMedia", js.undefined)
    
    inline def setPreFetchMediaVarargs(value: MediaInfo*): Self = StObject.set(x, "preFetchMedia", js.Array(value*))
  }
}

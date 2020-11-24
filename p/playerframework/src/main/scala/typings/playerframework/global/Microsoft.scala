package typings.playerframework.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft")
@js.native
object Microsoft extends js.Object {
  
  @js.native
  object PlayerFramework extends js.Object {
    
    @js.native
    object Js extends js.Object {
      
      @js.native
      object Advertising extends js.Object {
        
        /**
          * Provides an ad source that requires a Url to be downloaded and turned into a stream before passing to the ad handler.
          **/
        @js.native
        class RemoteAdSource ()
          extends typings.playerframework.Microsoft.PlayerFramework.Js.Advertising.RemoteAdSource
      }
    }
  }
  
  @js.native
  object VideoAdvertising extends js.Object {
    
    @js.native
    class Extensions ()
      extends typings.playerframework.Microsoft.VideoAdvertising.Extensions
    /* static members */
    @js.native
    object Extensions extends js.Object {
      
      var defaultUserAgent: String = js.native
    }
    
    @js.native
    class VastAdPayloadHandler ()
      extends typings.playerframework.Microsoft.VideoAdvertising.VastAdPayloadHandler
    /* static members */
    @js.native
    object VastAdPayloadHandler extends js.Object {
      
      var adType: String = js.native
    }
  }
}

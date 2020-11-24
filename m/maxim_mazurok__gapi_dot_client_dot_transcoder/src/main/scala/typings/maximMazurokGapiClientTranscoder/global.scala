package typings.maximMazurokGapiClientTranscoder

import typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder.ProjectsResource
import typings.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.transcoder
import typings.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.v1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Transcoder API v1beta1 */
      def load(name: transcoder, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: transcoder, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object transcoder extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

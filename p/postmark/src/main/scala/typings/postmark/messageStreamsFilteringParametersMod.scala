package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/streams/MessageStreamsFilteringParameters", JSImport.Namespace)
@js.native
object messageStreamsFilteringParametersMod extends js.Object {
  
  @js.native
  class MessageStreamsFilteringParameters () extends js.Object {
    def this(messageStreamType: String) = this()
    def this(messageStreamType: js.UndefOr[scala.Nothing], includeArchivedStreams: Boolean) = this()
    def this(messageStreamType: String, includeArchivedStreams: Boolean) = this()
    
    var includeArchivedStreams: js.UndefOr[Boolean] = js.native
    
    var messageStreamType: js.UndefOr[String] = js.native
  }
}

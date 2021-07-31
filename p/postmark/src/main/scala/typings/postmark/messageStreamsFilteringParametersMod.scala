package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageStreamsFilteringParametersMod {
  
  @JSImport("postmark/dist/client/models/streams/MessageStreamsFilteringParameters", "MessageStreamsFilteringParameters")
  @js.native
  class MessageStreamsFilteringParameters () extends StObject {
    def this(messageStreamType: String) = this()
    def this(messageStreamType: String, includeArchivedStreams: Boolean) = this()
    def this(messageStreamType: Unit, includeArchivedStreams: Boolean) = this()
    
    var includeArchivedStreams: js.UndefOr[Boolean] = js.native
    
    var messageStreamType: js.UndefOr[String] = js.native
  }
}

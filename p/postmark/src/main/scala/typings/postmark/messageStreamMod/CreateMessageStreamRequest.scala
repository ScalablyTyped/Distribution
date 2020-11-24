package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/streams/MessageStream", "CreateMessageStreamRequest")
@js.native
class CreateMessageStreamRequest protected () extends js.Object {
  def this(id: String, name: String, messageStreamType: String) = this()
  def this(id: String, name: String, messageStreamType: String, description: String) = this()
  
  var Description: js.UndefOr[String] = js.native
  
  var ID: String = js.native
  
  var MessageStreamType: String = js.native
  
  var Name: String = js.native
}

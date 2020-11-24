package typings.postmark.messageStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/streams/MessageStream", "UpdateMessageStreamRequest")
@js.native
class UpdateMessageStreamRequest () extends js.Object {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], description: String) = this()
  def this(name: String, description: String) = this()
  
  var Description: js.UndefOr[String] = js.native
  
  var Name: js.UndefOr[String] = js.native
}

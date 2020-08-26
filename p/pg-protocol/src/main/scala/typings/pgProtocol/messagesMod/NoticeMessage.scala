package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-protocol/dist/messages", "NoticeMessage")
@js.native
class NoticeMessage protected ()
  extends BackendMessage
     with NoticeOrError {
  def this(length: Double) = this()
  def this(length: Double, message: String) = this()
  @JSName("name")
  val name_NoticeMessage: String | Double = js.native
}


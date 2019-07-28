package typings.nodeDashSlack.nodeDashSlackMod

import typings.request.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slack extends js.Object {
  def respond(query: Query): TextResponse = js.native
  def respond(query: Query, callback: ResponseCallback): TextResponse = js.native
  def send(message: Message): js.Any = js.native
   //TODO: Here comes deferred's promise as a return type
  def send(message: Message, callback: SendCallback): Request = js.native
}


package typings
package nodeDashSlackLib.nodeDashSlackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slack extends js.Object {
  def respond(query: nodeDashSlackLib.nodeDashSlackMod.SlackNs.Query): nodeDashSlackLib.nodeDashSlackMod.SlackNs.TextResponse = js.native
  def respond(
    query: nodeDashSlackLib.nodeDashSlackMod.SlackNs.Query,
    callback: nodeDashSlackLib.nodeDashSlackMod.SlackNs.ResponseCallback
  ): nodeDashSlackLib.nodeDashSlackMod.SlackNs.TextResponse = js.native
  def send(message: nodeDashSlackLib.nodeDashSlackMod.SlackNs.Message): js.Any = js.native
   //TODO: Here comes deferred's promise as a return type
  def send(
    message: nodeDashSlackLib.nodeDashSlackMod.SlackNs.Message,
    callback: nodeDashSlackLib.nodeDashSlackMod.SlackNs.SendCallback
  ): requestLib.requestMod.requestNs.Request = js.native
}


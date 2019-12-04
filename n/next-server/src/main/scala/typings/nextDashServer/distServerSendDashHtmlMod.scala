package typings.nextDashServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/server/send-html", JSImport.Namespace)
@js.native
object distServerSendDashHtmlMod extends js.Object {
  def sendHTML(
    req: IncomingMessage,
    res: ServerResponse,
    html: String,
    hasGenerateEtagsPoweredByHeader: Anon_GenerateEtags
  ): Unit = js.native
}


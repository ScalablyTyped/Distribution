package typings.parseurl

import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parseurl", JSImport.Namespace)
@js.native
object parseurlMod extends js.Object {
  def apply(req: IncomingMessage): js.UndefOr[Url] = js.native
  def original(req: IncomingMessage): js.UndefOr[Url] = js.native
}


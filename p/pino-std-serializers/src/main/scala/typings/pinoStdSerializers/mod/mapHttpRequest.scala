package typings.pinoStdSerializers.mod

import typings.node.httpMod.IncomingMessage
import typings.pinoStdSerializers.anon.Req
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", "mapHttpRequest")
@js.native
object mapHttpRequest extends js.Object {
  def apply(req: IncomingMessage): Req = js.native
}


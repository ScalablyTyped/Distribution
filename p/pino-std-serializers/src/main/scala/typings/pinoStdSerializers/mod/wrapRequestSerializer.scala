package typings.pinoStdSerializers.mod

import typings.node.httpMod.IncomingMessage
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino-std-serializers", "wrapRequestSerializer")
@js.native
object wrapRequestSerializer extends js.Object {
  
  def apply(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
}

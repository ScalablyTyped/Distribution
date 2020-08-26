package typings.peekReadable

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peek-readable/lib/EndOfFileStream", JSImport.Namespace)
@js.native
object endOfFileStreamMod extends js.Object {
  @js.native
  class EndOfStreamError () extends Error
  
  val defaultMessages: /* "End-Of-Stream" */ String = js.native
}


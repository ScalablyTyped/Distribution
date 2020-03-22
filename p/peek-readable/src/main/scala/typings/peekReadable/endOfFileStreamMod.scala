package typings.peekReadable

import typings.peekReadable.peekReadableStrings.`End-Of-Stream`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("peek-readable/lib/EndOfFileStream", JSImport.Namespace)
@js.native
object endOfFileStreamMod extends js.Object {
  @js.native
  class EndOfStreamError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  val defaultMessages: `End-Of-Stream` = js.native
}


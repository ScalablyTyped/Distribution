package typings.node.replMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
  *
  * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
  */
@JSImport("repl", "Recoverable")
@js.native
class Recoverable protected () extends Error {
  def this(err: Error) = this()
  var err: Error = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}


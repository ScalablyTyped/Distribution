package typings.node.replMod

import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
  *
  * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
  */
trait Recoverable
  extends typings.std.Error {
  var err: Error
}

object Recoverable {
  @scala.inline
  def apply(err: Error, message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): Recoverable = {
    val __obj = js.Dynamic.literal(err = err, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Recoverable]
  }
}


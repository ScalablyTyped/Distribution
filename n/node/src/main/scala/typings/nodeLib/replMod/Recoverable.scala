package typings
package nodeLib.replMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Indicates a recoverable error that a `REPLServer` can use to support multi-line input.
  *
  * @see https://nodejs.org/dist/latest-v10.x/docs/api/repl.html#repl_recoverable_errors
  */
trait Recoverable
  extends stdLib.Error {
  var err: nodeLib.Error
}

object Recoverable {
  @scala.inline
  def apply(
    err: nodeLib.Error,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): Recoverable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(err)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Recoverable]
  }
}


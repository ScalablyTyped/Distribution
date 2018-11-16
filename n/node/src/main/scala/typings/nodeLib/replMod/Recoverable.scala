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


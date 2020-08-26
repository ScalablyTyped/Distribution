package typings.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", "types.Error")
@js.native
class ErrorCls protected () extends Error {
  /**
    * An error return value for async functions.
    * For synchronous functions, this can be returned or a standard error object can be thrown.
    */
  def this(message: java.lang.String) = this()
}


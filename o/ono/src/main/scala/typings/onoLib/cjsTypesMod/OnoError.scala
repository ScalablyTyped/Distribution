package typings
package onoLib.cjsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoError[T] extends ErrorPOJO {
  /**
    * Returns a JSON representation of the error, including all built-in error properties,
    * as well as properties that were dynamically added.
    */
  def toJSON(): ErrorPOJO with T = js.native
}


package typings
package prandoLib.prandoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prando", JSImport.Default)
@js.native
class default () extends Prando {
  /**
       * Generate a new Prando pseudo-random number generator.
       *
       * @param seed - A number or string seed that determines which pseudo-random number sequence will be created. Defaults to current time.
       */
  def this(seed: java.lang.String) = this()
  /**
       * Generate a new Prando pseudo-random number generator.
       *
       * @param seed - A number or string seed that determines which pseudo-random number sequence will be created. Defaults to current time.
       */
  def this(seed: scala.Double) = this()
}

@JSImport("prando", JSImport.Default)
@js.native
object default extends js.Object {
  var MAX: js.Any = js.native
  var MIN: js.Any = js.native
}


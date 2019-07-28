package typings.prando.prandoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prando", JSImport.Default)
@js.native
/**
  * Generate a new Prando pseudo-random number generator.
  *
  * @param seed - A number or string seed that determines which pseudo-random number sequence will be created. Defaults to current time.
  */
class default () extends Prando {
  def this(seed: String) = this()
  def this(seed: Double) = this()
}

/* static members */
@JSImport("prando", JSImport.Default)
@js.native
object default extends js.Object {
  var MAX: js.Any = js.native
  var MIN: js.Any = js.native
}


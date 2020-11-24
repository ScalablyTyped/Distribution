package typings.mersenneTwister.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mersenne-twister", JSImport.Namespace)
@js.native
/**
  * constructs mt with a number
  * @params seed
  */
class ^ () extends MersenneTwister {
  def this(seed: js.Array[Double]) = this()
  def this(seed: Double) = this()
}

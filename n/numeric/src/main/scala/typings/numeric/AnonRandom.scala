package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRandom extends js.Object {
  def random(): Double = js.native
  def seedrandom(seed: String): String = js.native
  def seedrandom(seed: String, useEntropy: Boolean): String = js.native
  def seedrandom(seed: Double): String = js.native
  def seedrandom(seed: Double, useEntropy: Boolean): String = js.native
}


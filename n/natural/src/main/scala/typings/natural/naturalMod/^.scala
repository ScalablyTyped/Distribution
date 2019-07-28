package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DiceCoefficient(str1: String, str2: String): Double = js.native
  def JaroWinklerDistance(s1: String, s2: String): Double = js.native
  def JaroWinklerDistance(s1: String, s2: String, dt: Double): Double = js.native
  def LevenshteinDistance(source: String, target: String): Double = js.native
  def LevenshteinDistance(source: String, target: String, options: js.Any): Double = js.native
}


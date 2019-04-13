package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def DiceCoefficient(str1: java.lang.String, str2: java.lang.String): scala.Double = js.native
  def JaroWinklerDistance(s1: java.lang.String, s2: java.lang.String): scala.Double = js.native
  def JaroWinklerDistance(s1: java.lang.String, s2: java.lang.String, dt: scala.Double): scala.Double = js.native
  def LevenshteinDistance(source: java.lang.String, target: java.lang.String): scala.Double = js.native
  def LevenshteinDistance(source: java.lang.String, target: java.lang.String, options: js.Any): scala.Double = js.native
}


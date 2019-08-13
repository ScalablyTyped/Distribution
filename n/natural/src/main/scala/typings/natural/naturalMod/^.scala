package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var LancasterStemmer: Stemmer = js.native
  var PorterStemmer: Stemmer = js.native
  var PorterStemmerEs: Stemmer = js.native
  var PorterStemmerFa: Stemmer = js.native
  var PorterStemmerFr: Stemmer = js.native
  var PorterStemmerIt: Stemmer = js.native
  var PorterStemmerNo: Stemmer = js.native
  var PorterStemmerPt: Stemmer = js.native
  var PorterStemmerRu: Stemmer = js.native
  def DiceCoefficient(str1: String, str2: String): Double = js.native
  def JaroWinklerDistance(s1: String, s2: String): Double = js.native
  def JaroWinklerDistance(s1: String, s2: String, dt: Double): Double = js.native
  def LevenshteinDistance(source: String, target: String): Double = js.native
  def LevenshteinDistance(source: String, target: String, options: js.Any): Double = js.native
}


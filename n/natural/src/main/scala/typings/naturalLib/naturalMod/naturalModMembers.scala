package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", JSImport.Namespace)
@js.native
object naturalModMembers extends js.Object {
  var CountInflector: naturalLib.Anon_I = js.native
  var DoubleMetaphone: naturalLib.Anon_CompareMaxLength = js.native
  var LancasterStemmer: naturalLib.Anon_Stem = js.native
  var Metaphone: naturalLib.Anon_Compare = js.native
  var NGrams: naturalLib.Anon_Bigrams = js.native
  var NGramsZH: naturalLib.Anon_Bigrams = js.native
  var PorterStemmer: naturalLib.Anon_Stem = js.native
  var PorterStemmerEs: naturalLib.Anon_Stem = js.native
  var PorterStemmerFa: naturalLib.Anon_Stem = js.native
  var PorterStemmerFr: naturalLib.Anon_Stem = js.native
  var PorterStemmerIt: naturalLib.Anon_Stem = js.native
  var PorterStemmerNo: naturalLib.Anon_Stem = js.native
  var PorterStemmerPt: naturalLib.Anon_Stem = js.native
  var PorterStemmerRu: naturalLib.Anon_Stem = js.native
  var SoundEx: naturalLib.Anon_Compare = js.native
  def DiceCoefficient(str1: java.lang.String, str2: java.lang.String): scala.Double = js.native
  def JaroWinklerDistance(s1: java.lang.String, s2: java.lang.String): scala.Double = js.native
  def JaroWinklerDistance(s1: java.lang.String, s2: java.lang.String, dt: scala.Double): scala.Double = js.native
  def LevenshteinDistance(source: java.lang.String, target: java.lang.String): scala.Double = js.native
  def LevenshteinDistance(source: java.lang.String, target: java.lang.String, options: js.Any): scala.Double = js.native
}


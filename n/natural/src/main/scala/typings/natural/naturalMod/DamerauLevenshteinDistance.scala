package typings.natural.naturalMod

import typings.natural.Anon_SearchBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "DamerauLevenshteinDistance")
@js.native
object DamerauLevenshteinDistance extends js.Object {
  def apply(source: String, target: String): Double = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistanceOptions with Anon_SearchBoolean): Double | SubstringDistanceResult = js.native
}


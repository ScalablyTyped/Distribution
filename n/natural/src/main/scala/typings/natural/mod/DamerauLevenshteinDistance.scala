package typings.natural.mod

import typings.natural.anon.DamerauLevenshteinDistanc
import typings.natural.anon.DamerauLevenshteinDistancDeletioncost
import typings.natural.anon.DamerauLevenshteinDistancInsertioncost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "DamerauLevenshteinDistance")
@js.native
object DamerauLevenshteinDistance extends js.Object {
  def apply(source: String, target: String): Double = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistanc): SubstringDistanceResult = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistancDeletioncost): Double = js.native
  def apply(source: String, target: String, options: DamerauLevenshteinDistancInsertioncost): Double | SubstringDistanceResult = js.native
}


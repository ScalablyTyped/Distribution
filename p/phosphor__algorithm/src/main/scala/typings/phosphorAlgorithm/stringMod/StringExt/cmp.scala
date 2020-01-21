package typings.phosphorAlgorithm.stringMod.StringExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/string", "StringExt.cmp")
@js.native
object cmp extends js.Object {
  /**
    * A 3-way string comparison function.
    *
    * @param a - The first string of interest.
    *
    * @param b - The second string of interest.
    *
    * @returns `-1` if `a < b`, else `1` if `a > b`, else `0`.
    */
  def apply(a: String, b: String): Double = js.native
}


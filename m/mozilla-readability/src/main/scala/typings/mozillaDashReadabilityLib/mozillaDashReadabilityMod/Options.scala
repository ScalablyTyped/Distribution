package typings
package mozillaDashReadabilityLib.mozillaDashReadabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var classesToPreserve: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var maxElemsToParse: js.UndefOr[scala.Double] = js.undefined
  var nbTopCandidates: js.UndefOr[scala.Double] = js.undefined
  var wordThreshold: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classesToPreserve: js.Array[java.lang.String] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    maxElemsToParse: scala.Int | scala.Double = null,
    nbTopCandidates: scala.Int | scala.Double = null,
    wordThreshold: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classesToPreserve != null) __obj.updateDynamic("classesToPreserve")(classesToPreserve)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (maxElemsToParse != null) __obj.updateDynamic("maxElemsToParse")(maxElemsToParse.asInstanceOf[js.Any])
    if (nbTopCandidates != null) __obj.updateDynamic("nbTopCandidates")(nbTopCandidates.asInstanceOf[js.Any])
    if (wordThreshold != null) __obj.updateDynamic("wordThreshold")(wordThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


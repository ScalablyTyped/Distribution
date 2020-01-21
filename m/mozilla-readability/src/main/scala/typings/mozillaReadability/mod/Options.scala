package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var classesToPreserve: js.UndefOr[js.Array[String]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var maxElemsToParse: js.UndefOr[Double] = js.undefined
  var nbTopCandidates: js.UndefOr[Double] = js.undefined
  var wordThreshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    classesToPreserve: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    maxElemsToParse: Int | Double = null,
    nbTopCandidates: Int | Double = null,
    wordThreshold: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classesToPreserve != null) __obj.updateDynamic("classesToPreserve")(classesToPreserve.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (maxElemsToParse != null) __obj.updateDynamic("maxElemsToParse")(maxElemsToParse.asInstanceOf[js.Any])
    if (nbTopCandidates != null) __obj.updateDynamic("nbTopCandidates")(nbTopCandidates.asInstanceOf[js.Any])
    if (wordThreshold != null) __obj.updateDynamic("wordThreshold")(wordThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


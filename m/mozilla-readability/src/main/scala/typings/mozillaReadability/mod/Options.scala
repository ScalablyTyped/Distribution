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
    maxElemsToParse: js.UndefOr[Double] = js.undefined,
    nbTopCandidates: js.UndefOr[Double] = js.undefined,
    wordThreshold: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (classesToPreserve != null) __obj.updateDynamic("classesToPreserve")(classesToPreserve.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxElemsToParse)) __obj.updateDynamic("maxElemsToParse")(maxElemsToParse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nbTopCandidates)) __obj.updateDynamic("nbTopCandidates")(nbTopCandidates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordThreshold)) __obj.updateDynamic("wordThreshold")(wordThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Minimum number of characters in the extracted textContent in order to
    * consider the article correctly identified. If the threshold is not met then
    * the extraction process will automatically run again with different flags.
    *
    * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L1208
    *
    * Changed from wordThreshold in https://github.com/mozilla/readability/commit/3ff9a166fb27928f222c4c0722e730eda412658a
    */
  var charThreshold: js.UndefOr[Double] = js.undefined
  /**
    * parse() removes the class="" attribute from every element in the given
    * subtree, except those that match CLASSES_TO_PRESERVE and
    * the classesToPreserve array from the options object.
    */
  var classesToPreserve: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Control whether log messages are sent to the console
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * By default Readability will strip all classes from the HTML elements in the
    * processed article. By setting this to `true` the classes will be retained.
    *
    * This is a blanket alternative to `classesToPreserve`.
    *
    * Added in https://github.com/mozilla/readability/commit/2982216913af2c66b0690e88606b03116553ad92
    */
  var keepClasses: js.UndefOr[Boolean] = js.undefined
  /**
    * Set a maximum size on the documents that will be processed. This size is
    * checked before any parsing operations occur. If the number of elements in
    * the document exceeds this threshold then an Error will be thrown.
    *
    * See implementation details at https://github.com/mozilla/readability/blob/52ab9b5c8916c306a47b2119270dcdabebf9d203/Readability.js#L2019
    */
  var maxElemsToParse: js.UndefOr[Double] = js.undefined
  var nbTopCandidates: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    charThreshold: js.UndefOr[Double] = js.undefined,
    classesToPreserve: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    keepClasses: js.UndefOr[Boolean] = js.undefined,
    maxElemsToParse: js.UndefOr[Double] = js.undefined,
    nbTopCandidates: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(charThreshold)) __obj.updateDynamic("charThreshold")(charThreshold.get.asInstanceOf[js.Any])
    if (classesToPreserve != null) __obj.updateDynamic("classesToPreserve")(classesToPreserve.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepClasses)) __obj.updateDynamic("keepClasses")(keepClasses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxElemsToParse)) __obj.updateDynamic("maxElemsToParse")(maxElemsToParse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nbTopCandidates)) __obj.updateDynamic("nbTopCandidates")(nbTopCandidates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


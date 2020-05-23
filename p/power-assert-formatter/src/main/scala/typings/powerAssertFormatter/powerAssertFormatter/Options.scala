package typings.powerAssertFormatter.powerAssertFormatter

import typings.powerAssertFormatter.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.undefined
  var anonymous: js.UndefOr[String] = js.undefined
  var circular: js.UndefOr[String] = js.undefined
  var diff: js.UndefOr[js.Function] = js.undefined
  var lineDiffThreshold: js.UndefOr[Double] = js.undefined
  var lineSeparator: js.UndefOr[String] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var outputOffset: js.UndefOr[Double] = js.undefined
  var renderers: js.UndefOr[js.Array[_]] = js.undefined
  var stringify: js.UndefOr[js.Function] = js.undefined
  var widthOf: js.UndefOr[js.Function] = js.undefined
  var writerClass: js.UndefOr[Instantiable] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ambiguousEastAsianCharWidth: js.UndefOr[Double] = js.undefined,
    anonymous: String = null,
    circular: String = null,
    diff: js.Function = null,
    lineDiffThreshold: js.UndefOr[Double] = js.undefined,
    lineSeparator: String = null,
    maxDepth: js.UndefOr[Double] = js.undefined,
    outputOffset: js.UndefOr[Double] = js.undefined,
    renderers: js.Array[_] = null,
    stringify: js.Function = null,
    widthOf: js.Function = null,
    writerClass: Instantiable = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ambiguousEastAsianCharWidth)) __obj.updateDynamic("ambiguousEastAsianCharWidth")(ambiguousEastAsianCharWidth.get.asInstanceOf[js.Any])
    if (anonymous != null) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    if (diff != null) __obj.updateDynamic("diff")(diff.asInstanceOf[js.Any])
    if (!js.isUndefined(lineDiffThreshold)) __obj.updateDynamic("lineDiffThreshold")(lineDiffThreshold.get.asInstanceOf[js.Any])
    if (lineSeparator != null) __obj.updateDynamic("lineSeparator")(lineSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outputOffset)) __obj.updateDynamic("outputOffset")(outputOffset.get.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(stringify.asInstanceOf[js.Any])
    if (widthOf != null) __obj.updateDynamic("widthOf")(widthOf.asInstanceOf[js.Any])
    if (writerClass != null) __obj.updateDynamic("writerClass")(writerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


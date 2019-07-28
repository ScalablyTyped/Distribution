package typings.powerDashAssertDashFormatter.powerAssertFormatterNs

import typings.powerDashAssertDashFormatter.Anon_Any
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
  var writerClass: js.UndefOr[Anon_Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ambiguousEastAsianCharWidth: Int | Double = null,
    anonymous: String = null,
    circular: String = null,
    diff: js.Function = null,
    lineDiffThreshold: Int | Double = null,
    lineSeparator: String = null,
    maxDepth: Int | Double = null,
    outputOffset: Int | Double = null,
    renderers: js.Array[_] = null,
    stringify: js.Function = null,
    widthOf: js.Function = null,
    writerClass: Anon_Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ambiguousEastAsianCharWidth != null) __obj.updateDynamic("ambiguousEastAsianCharWidth")(ambiguousEastAsianCharWidth.asInstanceOf[js.Any])
    if (anonymous != null) __obj.updateDynamic("anonymous")(anonymous)
    if (circular != null) __obj.updateDynamic("circular")(circular)
    if (diff != null) __obj.updateDynamic("diff")(diff)
    if (lineDiffThreshold != null) __obj.updateDynamic("lineDiffThreshold")(lineDiffThreshold.asInstanceOf[js.Any])
    if (lineSeparator != null) __obj.updateDynamic("lineSeparator")(lineSeparator)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (outputOffset != null) __obj.updateDynamic("outputOffset")(outputOffset.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers)
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (widthOf != null) __obj.updateDynamic("widthOf")(widthOf)
    if (writerClass != null) __obj.updateDynamic("writerClass")(writerClass)
    __obj.asInstanceOf[Options]
  }
}


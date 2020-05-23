package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeSass.nodeSassStrings.compact
import typings.nodeSass.nodeSassStrings.compressed
import typings.nodeSass.nodeSassStrings.expanded
import typings.nodeSass.nodeSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var functions: js.UndefOr[FunctionDeclarations[SassFunction]] = js.undefined
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.undefined
  var includePaths: js.UndefOr[js.Array[String]] = js.undefined
  var indentType: js.UndefOr[String] = js.undefined
  var indentWidth: js.UndefOr[Double] = js.undefined
  var indentedSyntax: js.UndefOr[Boolean] = js.undefined
  var linefeed: js.UndefOr[String] = js.undefined
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined
  var outFile: js.UndefOr[String] = js.undefined
  var outputStyle: js.UndefOr[compact | compressed | expanded | nested] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var sourceComments: js.UndefOr[Boolean] = js.undefined
  var sourceMap: js.UndefOr[Boolean | String] = js.undefined
  var sourceMapContents: js.UndefOr[Boolean] = js.undefined
  var sourceMapEmbed: js.UndefOr[Boolean] = js.undefined
  var sourceMapRoot: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    data: String = null,
    file: String = null,
    functions: FunctionDeclarations[SassFunction] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[String] = null,
    indentType: String = null,
    indentWidth: js.UndefOr[Double] = js.undefined,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: js.UndefOr[Double] = js.undefined,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    if (indentType != null) __obj.updateDynamic("indentType")(indentType.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax.get.asInstanceOf[js.Any])
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed.asInstanceOf[js.Any])
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl.get.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments.get.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed.get.asInstanceOf[js.Any])
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


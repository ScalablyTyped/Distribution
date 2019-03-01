package typings
package nodeDashSassLib.nodeDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var file: js.UndefOr[java.lang.String] = js.undefined
  var functions: js.UndefOr[FunctionDeclarations[SassFunction]] = js.undefined
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.undefined
  var includePaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indentType: js.UndefOr[java.lang.String] = js.undefined
  var indentWidth: js.UndefOr[scala.Double] = js.undefined
  var indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined
  var linefeed: js.UndefOr[java.lang.String] = js.undefined
  var omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  var outputStyle: js.UndefOr[
    nodeDashSassLib.nodeDashSassLibStrings.compact | nodeDashSassLib.nodeDashSassLibStrings.compressed | nodeDashSassLib.nodeDashSassLibStrings.expanded | nodeDashSassLib.nodeDashSassLibStrings.nested
  ] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var sourceComments: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined
  var sourceMapRoot: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    data: java.lang.String = null,
    file: java.lang.String = null,
    functions: FunctionDeclarations[SassFunction] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[java.lang.String] = null,
    indentType: java.lang.String = null,
    indentWidth: scala.Int | scala.Double = null,
    indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    linefeed: java.lang.String = null,
    omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined,
    outFile: java.lang.String = null,
    outputStyle: nodeDashSassLib.nodeDashSassLibStrings.compact | nodeDashSassLib.nodeDashSassLibStrings.compressed | nodeDashSassLib.nodeDashSassLibStrings.expanded | nodeDashSassLib.nodeDashSassLibStrings.nested = null,
    precision: scala.Int | scala.Double = null,
    sourceComments: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: scala.Boolean | java.lang.String = null,
    sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapRoot: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (data != null) __obj.updateDynamic("data")(data)
    if (file != null) __obj.updateDynamic("file")(file)
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths)
    if (indentType != null) __obj.updateDynamic("indentType")(indentType)
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax)
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed)
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl)
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents)
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed)
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot)
    __obj.asInstanceOf[Options]
  }
}


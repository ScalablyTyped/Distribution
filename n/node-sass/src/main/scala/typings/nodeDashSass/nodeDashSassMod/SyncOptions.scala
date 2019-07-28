package typings.nodeDashSass.nodeDashSassMod

import typings.nodeDashSass.nodeDashSassStrings.compact
import typings.nodeDashSass.nodeDashSassStrings.compressed
import typings.nodeDashSass.nodeDashSassStrings.expanded
import typings.nodeDashSass.nodeDashSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends Options {
  @JSName("functions")
  var functions_SyncOptions: js.UndefOr[FunctionDeclarations[SyncSassFunction]] = js.undefined
  @JSName("importer")
  var importer_SyncOptions: js.UndefOr[SyncImporter | js.Array[SyncImporter]] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    data: String = null,
    file: String = null,
    functions: FunctionDeclarations[SyncSassFunction] = null,
    importer: SyncImporter | js.Array[SyncImporter] = null,
    includePaths: js.Array[String] = null,
    indentType: String = null,
    indentWidth: Int | Double = null,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: Int | Double = null,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[SyncOptions]
  }
}


package typings
package nodeDashSassLib.nodeDashSassMod

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
    data: java.lang.String = null,
    file: java.lang.String = null,
    functions: FunctionDeclarations[SyncSassFunction] = null,
    importer: SyncImporter | js.Array[SyncImporter] = null,
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


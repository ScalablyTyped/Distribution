package typings
package nodeDashSassDashMiddlewareLib.nodeDashSassDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodeDashSassLib.nodeDashSassMod.Options {
  /**
    * 
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 
    */
  var error: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 
    */
  var response: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 
    */
  var src: java.lang.String
}

object Options {
  @scala.inline
  def apply(
    src: java.lang.String,
    data: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dest: java.lang.String = null,
    error: () => scala.Unit = null,
    file: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    functions: nodeDashSassLib.nodeDashSassMod.FunctionDeclarations[nodeDashSassLib.nodeDashSassMod.SassFunction] = null,
    importer: nodeDashSassLib.nodeDashSassMod.Importer | js.Array[nodeDashSassLib.nodeDashSassMod.Importer] = null,
    includePaths: js.Array[java.lang.String] = null,
    indentType: java.lang.String = null,
    indentWidth: scala.Int | scala.Double = null,
    indentedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    linefeed: java.lang.String = null,
    omitSourceMapUrl: js.UndefOr[scala.Boolean] = js.undefined,
    outFile: java.lang.String = null,
    outputStyle: nodeDashSassLib.nodeDashSassLibStrings.compact | nodeDashSassLib.nodeDashSassLibStrings.compressed | nodeDashSassLib.nodeDashSassLibStrings.expanded | nodeDashSassLib.nodeDashSassLibStrings.nested = null,
    precision: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    response: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    sourceComments: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: scala.Boolean | java.lang.String = null,
    sourceMapContents: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMapRoot: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(src = src)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction0(error))
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
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
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(response)) __obj.updateDynamic("response")(response)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments)
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents)
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed)
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot)
    __obj.asInstanceOf[Options]
  }
}


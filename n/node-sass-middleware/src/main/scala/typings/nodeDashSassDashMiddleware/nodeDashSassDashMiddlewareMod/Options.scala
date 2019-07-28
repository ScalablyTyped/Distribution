package typings.nodeDashSassDashMiddleware.nodeDashSassDashMiddlewareMod

import typings.nodeDashSass.nodeDashSassMod.FunctionDeclarations
import typings.nodeDashSass.nodeDashSassMod.Importer
import typings.nodeDashSass.nodeDashSassMod.SassFunction
import typings.nodeDashSass.nodeDashSassStrings.compact
import typings.nodeDashSass.nodeDashSassStrings.compressed
import typings.nodeDashSass.nodeDashSassStrings.expanded
import typings.nodeDashSass.nodeDashSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.nodeDashSass.nodeDashSassMod.Options {
  /**
    * 
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var error: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var response: js.UndefOr[Boolean] = js.undefined
  /**
    * 
    */
  var root: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var src: String
}

object Options {
  @scala.inline
  def apply(
    src: String,
    data: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    error: () => Unit = null,
    file: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    functions: FunctionDeclarations[SassFunction] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[String] = null,
    indentType: String = null,
    indentWidth: Int | Double = null,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: Int | Double = null,
    prefix: String = null,
    response: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null
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


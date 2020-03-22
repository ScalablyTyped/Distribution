package typings.poi

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.mod.MinifyOptions
import typings.htmlWebpackPlugin.mod.TemplateParametersAssets
import typings.poi.poiBooleans.`false`
import typings.poi.poiStrings.all
import typings.poi.poiStrings.auto
import typings.poi.poiStrings.body
import typings.poi.poiStrings.dependency
import typings.poi.poiStrings.head
import typings.poi.poiStrings.manual
import typings.poi.poiStrings.none
import typings.webpack.mod.compilation.Chunk
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<html-webpack-plugin.html-webpack-plugin.Options> & {  entry  :string,   chunks ? :std.Array<string>} */
trait PartialOptionsentrystring extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var chunks: js.UndefOr[(all | js.Array[String]) with js.Array[String]] = js.undefined
  var chunksSortMode: js.UndefOr[
    none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double])
  ] = js.undefined
  var entry: String
  var excludeChunks: js.UndefOr[js.Array[String]] = js.undefined
  var favicon: js.UndefOr[`false` | String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var hash: js.UndefOr[Boolean] = js.undefined
  var inject: js.UndefOr[body | head | Boolean] = js.undefined
  var meta: js.UndefOr[`false` | StringDictionary[js.Any]] = js.undefined
  var minify: js.UndefOr[`false` | MinifyOptions] = js.undefined
  var showErrors: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateContent: js.UndefOr[`false` | String | js.Promise[String]] = js.undefined
  var templateParameters: js.UndefOr[
    `false` | (js.Function3[
      /* compilation */ Compilation, 
      /* assets */ TemplateParametersAssets, 
      /* options */ this.type, 
      _
    ]) | StringDictionary[js.Any]
  ] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var xhtml: js.UndefOr[Boolean] = js.undefined
}

object PartialOptionsentrystring {
  @scala.inline
  def apply(
    entry: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    chunks: (all | js.Array[String]) with js.Array[String] = null,
    chunksSortMode: none | auto | dependency | manual | (js.Function2[/* a */ Chunk, /* b */ Chunk, Double]) = null,
    excludeChunks: js.Array[String] = null,
    favicon: `false` | String = null,
    filename: String = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    inject: body | head | Boolean = null,
    meta: `false` | StringDictionary[js.Any] = null,
    minify: `false` | MinifyOptions = null,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateContent: `false` | String | js.Promise[String] = null,
    templateParameters: `false` | (js.Function3[
      /* compilation */ Compilation, 
      /* assets */ TemplateParametersAssets, 
      PartialOptionsentrystring, 
      _
    ]) | StringDictionary[js.Any] = null,
    title: String = null,
    xhtml: js.UndefOr[Boolean] = js.undefined
  ): PartialOptionsentrystring = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (chunksSortMode != null) __obj.updateDynamic("chunksSortMode")(chunksSortMode.asInstanceOf[js.Any])
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks.asInstanceOf[js.Any])
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateContent != null) __obj.updateDynamic("templateContent")(templateContent.asInstanceOf[js.Any])
    if (templateParameters != null) __obj.updateDynamic("templateParameters")(templateParameters.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtml)) __obj.updateDynamic("xhtml")(xhtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsentrystring]
  }
}


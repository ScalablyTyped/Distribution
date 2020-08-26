package typings.poi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.anon.BodyTags
import typings.htmlWebpackPlugin.anon.Css
import typings.htmlWebpackPlugin.mod.MinifyOptions
import typings.htmlWebpackPlugin.mod.ProcessedOptions
import typings.poi.poiBooleans.`false`
import typings.poi.poiBooleans.`true`
import typings.poi.poiStrings.all
import typings.poi.poiStrings.auto
import typings.poi.poiStrings.blocking
import typings.poi.poiStrings.body
import typings.poi.poiStrings.defer
import typings.poi.poiStrings.head
import typings.poi.poiStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<html-webpack-plugin.html-webpack-plugin.Options> & {  entry :string,   chunks :std.Array<string> | undefined} */
@js.native
trait PartialOptionsentrystring extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var chunks: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]] = js.native
  var chunksSortMode: js.UndefOr[
    auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
  ] = js.native
  var entry: String = js.native
  var excludeChunks: js.UndefOr[js.Array[String]] = js.native
  var favicon: js.UndefOr[`false` | String] = js.native
  var filename: js.UndefOr[String] = js.native
  var hash: js.UndefOr[Boolean] = js.native
  var inject: js.UndefOr[`false` | `true` | body | head] = js.native
  var meta: js.UndefOr[
    `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
  ] = js.native
  var minify: js.UndefOr[auto | Boolean | MinifyOptions] = js.native
  var scriptLoading: js.UndefOr[blocking | defer] = js.native
  var showErrors: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateContent: js.UndefOr[
    `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
  ] = js.native
  var templateParameters: js.UndefOr[
    `false` | (js.Function4[
      /* compilation */ js.Any, 
      /* assets */ Css, 
      /* assetTags */ BodyTags, 
      /* options */ ProcessedOptions, 
      StringDictionary[_] | js.Promise[StringDictionary[_]]
    ]) | StringDictionary[js.Any]
  ] = js.native
  var title: js.UndefOr[String] = js.native
  var xhtml: js.UndefOr[Boolean] = js.native
}

object PartialOptionsentrystring {
  @scala.inline
  def apply(chunks: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]], entry: String): PartialOptionsentrystring = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsentrystring]
  }
  @scala.inline
  implicit class PartialOptionsentrystringOps[Self <: PartialOptionsentrystring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunks(value: (js.UndefOr[all | js.Array[String]]) with js.UndefOr[js.Array[String]]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntry(value: String): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = this.set("chunksSortMode", js.Any.fromFunction2(value))
    @scala.inline
    def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = this.set("chunksSortMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunksSortMode: Self = this.set("chunksSortMode", js.undefined)
    @scala.inline
    def setExcludeChunksVarargs(value: String*): Self = this.set("excludeChunks", js.Array(value :_*))
    @scala.inline
    def setExcludeChunks(value: js.Array[String]): Self = this.set("excludeChunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeChunks: Self = this.set("excludeChunks", js.undefined)
    @scala.inline
    def setFavicon(value: `false` | String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavicon: Self = this.set("favicon", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setInject(value: `false` | `true` | body | head): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setMinify(value: auto | Boolean | MinifyOptions): Self = this.set("minify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    @scala.inline
    def setScriptLoading(value: blocking | defer): Self = this.set("scriptLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptLoading: Self = this.set("scriptLoading", js.undefined)
    @scala.inline
    def setShowErrors(value: Boolean): Self = this.set("showErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowErrors: Self = this.set("showErrors", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[js.Any] => String | js.Promise[String]): Self = this.set("templateContent", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplateContent(
      value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
    ): Self = this.set("templateContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateContent: Self = this.set("templateContent", js.undefined)
    @scala.inline
    def setTemplateParametersFunction4(
      value: (/* compilation */ js.Any, /* assets */ Css, /* assetTags */ BodyTags, /* options */ ProcessedOptions) => StringDictionary[_] | js.Promise[StringDictionary[_]]
    ): Self = this.set("templateParameters", js.Any.fromFunction4(value))
    @scala.inline
    def setTemplateParameters(
      value: `false` | (js.Function4[
          /* compilation */ js.Any, 
          /* assets */ Css, 
          /* assetTags */ BodyTags, 
          /* options */ ProcessedOptions, 
          StringDictionary[_] | js.Promise[StringDictionary[_]]
        ]) | StringDictionary[js.Any]
    ): Self = this.set("templateParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateParameters: Self = this.set("templateParameters", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setXhtml(value: Boolean): Self = this.set("xhtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhtml: Self = this.set("xhtml", js.undefined)
  }
  
}


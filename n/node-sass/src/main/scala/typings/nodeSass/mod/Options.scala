package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeSass.nodeSassStrings.compact
import typings.nodeSass.nodeSassStrings.compressed
import typings.nodeSass.nodeSassStrings.expanded
import typings.nodeSass.nodeSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var functions: js.UndefOr[FunctionDeclarations[SassFunction]] = js.native
  var importer: js.UndefOr[Importer | js.Array[Importer]] = js.native
  var includePaths: js.UndefOr[js.Array[String]] = js.native
  var indentType: js.UndefOr[String] = js.native
  var indentWidth: js.UndefOr[Double] = js.native
  var indentedSyntax: js.UndefOr[Boolean] = js.native
  var linefeed: js.UndefOr[String] = js.native
  var omitSourceMapUrl: js.UndefOr[Boolean] = js.native
  var outFile: js.UndefOr[String] = js.native
  var outputStyle: js.UndefOr[compact | compressed | expanded | nested] = js.native
  var precision: js.UndefOr[Double] = js.native
  var sourceComments: js.UndefOr[Boolean] = js.native
  var sourceMap: js.UndefOr[Boolean | String] = js.native
  var sourceMapContents: js.UndefOr[Boolean] = js.native
  var sourceMapEmbed: js.UndefOr[Boolean] = js.native
  var sourceMapRoot: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFunctions(value: FunctionDeclarations[SassFunction]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setImporterVarargs(value: Importer*): Self = this.set("importer", js.Array(value :_*))
    @scala.inline
    def setImporter(value: Importer | js.Array[Importer]): Self = this.set("importer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImporter: Self = this.set("importer", js.undefined)
    @scala.inline
    def setIncludePathsVarargs(value: String*): Self = this.set("includePaths", js.Array(value :_*))
    @scala.inline
    def setIncludePaths(value: js.Array[String]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
    @scala.inline
    def setIndentType(value: String): Self = this.set("indentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentType: Self = this.set("indentType", js.undefined)
    @scala.inline
    def setIndentWidth(value: Double): Self = this.set("indentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentWidth: Self = this.set("indentWidth", js.undefined)
    @scala.inline
    def setIndentedSyntax(value: Boolean): Self = this.set("indentedSyntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentedSyntax: Self = this.set("indentedSyntax", js.undefined)
    @scala.inline
    def setLinefeed(value: String): Self = this.set("linefeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinefeed: Self = this.set("linefeed", js.undefined)
    @scala.inline
    def setOmitSourceMapUrl(value: Boolean): Self = this.set("omitSourceMapUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitSourceMapUrl: Self = this.set("omitSourceMapUrl", js.undefined)
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    @scala.inline
    def setOutputStyle(value: compact | compressed | expanded | nested): Self = this.set("outputStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputStyle: Self = this.set("outputStyle", js.undefined)
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setSourceComments(value: Boolean): Self = this.set("sourceComments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceComments: Self = this.set("sourceComments", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean | String): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    @scala.inline
    def setSourceMapContents(value: Boolean): Self = this.set("sourceMapContents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapContents: Self = this.set("sourceMapContents", js.undefined)
    @scala.inline
    def setSourceMapEmbed(value: Boolean): Self = this.set("sourceMapEmbed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapEmbed: Self = this.set("sourceMapEmbed", js.undefined)
    @scala.inline
    def setSourceMapRoot(value: String): Self = this.set("sourceMapRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMapRoot: Self = this.set("sourceMapRoot", js.undefined)
  }
  
}


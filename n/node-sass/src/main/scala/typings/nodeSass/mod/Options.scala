package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeSass.nodeSassStrings.compact
import typings.nodeSass.nodeSassStrings.compressed
import typings.nodeSass.nodeSassStrings.expanded
import typings.nodeSass.nodeSassStrings.nested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFunctions(value: FunctionDeclarations[SassFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setImporter(value: Importer | js.Array[Importer]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    @scala.inline
    def setImporterVarargs(value: Importer*): Self = StObject.set(x, "importer", js.Array(value :_*))
    
    @scala.inline
    def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
    
    @scala.inline
    def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
    
    @scala.inline
    def setIndentType(value: String): Self = StObject.set(x, "indentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentTypeUndefined: Self = StObject.set(x, "indentType", js.undefined)
    
    @scala.inline
    def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
    
    @scala.inline
    def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
    
    @scala.inline
    def setLinefeed(value: String): Self = StObject.set(x, "linefeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinefeedUndefined: Self = StObject.set(x, "linefeed", js.undefined)
    
    @scala.inline
    def setOmitSourceMapUrl(value: Boolean): Self = StObject.set(x, "omitSourceMapUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitSourceMapUrlUndefined: Self = StObject.set(x, "omitSourceMapUrl", js.undefined)
    
    @scala.inline
    def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
    
    @scala.inline
    def setOutputStyle(value: compact | compressed | expanded | nested): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setSourceComments(value: Boolean): Self = StObject.set(x, "sourceComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommentsUndefined: Self = StObject.set(x, "sourceComments", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean | String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapContents(value: Boolean): Self = StObject.set(x, "sourceMapContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapContentsUndefined: Self = StObject.set(x, "sourceMapContents", js.undefined)
    
    @scala.inline
    def setSourceMapEmbed(value: Boolean): Self = StObject.set(x, "sourceMapEmbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapEmbedUndefined: Self = StObject.set(x, "sourceMapEmbed", js.undefined)
    
    @scala.inline
    def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}

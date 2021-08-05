package typings.nodeSass.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeSass.nodeSassStrings.compact
import typings.nodeSass.nodeSassStrings.compressed
import typings.nodeSass.nodeSassStrings.expanded
import typings.nodeSass.nodeSassStrings.nested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
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
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFunctions(value: FunctionDeclarations[SassFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setImporter(value: Importer | js.Array[Importer]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setImporterVarargs(value: Importer*): Self = StObject.set(x, "importer", js.Array(value :_*))
    
    inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
    
    inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
    
    inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
    
    inline def setIndentType(value: String): Self = StObject.set(x, "indentType", value.asInstanceOf[js.Any])
    
    inline def setIndentTypeUndefined: Self = StObject.set(x, "indentType", js.undefined)
    
    inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
    
    inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
    
    inline def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
    
    inline def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
    
    inline def setLinefeed(value: String): Self = StObject.set(x, "linefeed", value.asInstanceOf[js.Any])
    
    inline def setLinefeedUndefined: Self = StObject.set(x, "linefeed", js.undefined)
    
    inline def setOmitSourceMapUrl(value: Boolean): Self = StObject.set(x, "omitSourceMapUrl", value.asInstanceOf[js.Any])
    
    inline def setOmitSourceMapUrlUndefined: Self = StObject.set(x, "omitSourceMapUrl", js.undefined)
    
    inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
    
    inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
    
    inline def setOutputStyle(value: compact | compressed | expanded | nested): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
    
    inline def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setSourceComments(value: Boolean): Self = StObject.set(x, "sourceComments", value.asInstanceOf[js.Any])
    
    inline def setSourceCommentsUndefined: Self = StObject.set(x, "sourceComments", js.undefined)
    
    inline def setSourceMap(value: Boolean | String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapContents(value: Boolean): Self = StObject.set(x, "sourceMapContents", value.asInstanceOf[js.Any])
    
    inline def setSourceMapContentsUndefined: Self = StObject.set(x, "sourceMapContents", js.undefined)
    
    inline def setSourceMapEmbed(value: Boolean): Self = StObject.set(x, "sourceMapEmbed", value.asInstanceOf[js.Any])
    
    inline def setSourceMapEmbedUndefined: Self = StObject.set(x, "sourceMapEmbed", js.undefined)
    
    inline def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}

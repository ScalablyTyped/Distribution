package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssProp extends StObject {
  
  var cssProp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enabled by default in development, disabled in production to reduce file size,
    * setting this will override the default for all environments.
    */
  var displayName: js.UndefOr[Boolean] = js.undefined
  
  var fileName: js.UndefOr[Boolean] = js.undefined
  
  var meaninglessFileNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var pure: js.UndefOr[Boolean] = js.undefined
  
  var ssr: js.UndefOr[Boolean] = js.undefined
  
  var topLevelImportPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var transpileTemplateLiterals: js.UndefOr[Boolean] = js.undefined
}
object CssProp {
  
  inline def apply(): CssProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssProp]
  }
  
  extension [Self <: CssProp](x: Self) {
    
    inline def setCssProp(value: Boolean): Self = StObject.set(x, "cssProp", value.asInstanceOf[js.Any])
    
    inline def setCssPropUndefined: Self = StObject.set(x, "cssProp", js.undefined)
    
    inline def setDisplayName(value: Boolean): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFileName(value: Boolean): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setMeaninglessFileNames(value: js.Array[String]): Self = StObject.set(x, "meaninglessFileNames", value.asInstanceOf[js.Any])
    
    inline def setMeaninglessFileNamesUndefined: Self = StObject.set(x, "meaninglessFileNames", js.undefined)
    
    inline def setMeaninglessFileNamesVarargs(value: String*): Self = StObject.set(x, "meaninglessFileNames", js.Array(value*))
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    inline def setTopLevelImportPaths(value: js.Array[String]): Self = StObject.set(x, "topLevelImportPaths", value.asInstanceOf[js.Any])
    
    inline def setTopLevelImportPathsUndefined: Self = StObject.set(x, "topLevelImportPaths", js.undefined)
    
    inline def setTopLevelImportPathsVarargs(value: String*): Self = StObject.set(x, "topLevelImportPaths", js.Array(value*))
    
    inline def setTranspileTemplateLiterals(value: Boolean): Self = StObject.set(x, "transpileTemplateLiterals", value.asInstanceOf[js.Any])
    
    inline def setTranspileTemplateLiteralsUndefined: Self = StObject.set(x, "transpileTemplateLiterals", js.undefined)
  }
}

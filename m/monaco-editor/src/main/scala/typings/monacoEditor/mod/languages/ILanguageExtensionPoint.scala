package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageExtensionPoint extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var configuration: js.UndefOr[Uri] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var filenamePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var filenames: js.UndefOr[js.Array[String]] = js.undefined
  
  var firstLine: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var mimetypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ILanguageExtensionPoint {
  
  inline def apply(id: String): ILanguageExtensionPoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
  
  extension [Self <: ILanguageExtensionPoint](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setConfiguration(value: Uri): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFilenamePatterns(value: js.Array[String]): Self = StObject.set(x, "filenamePatterns", value.asInstanceOf[js.Any])
    
    inline def setFilenamePatternsUndefined: Self = StObject.set(x, "filenamePatterns", js.undefined)
    
    inline def setFilenamePatternsVarargs(value: String*): Self = StObject.set(x, "filenamePatterns", js.Array(value*))
    
    inline def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
    
    inline def setFilenamesUndefined: Self = StObject.set(x, "filenames", js.undefined)
    
    inline def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value*))
    
    inline def setFirstLine(value: String): Self = StObject.set(x, "firstLine", value.asInstanceOf[js.Any])
    
    inline def setFirstLineUndefined: Self = StObject.set(x, "firstLine", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMimetypes(value: js.Array[String]): Self = StObject.set(x, "mimetypes", value.asInstanceOf[js.Any])
    
    inline def setMimetypesUndefined: Self = StObject.set(x, "mimetypes", js.undefined)
    
    inline def setMimetypesVarargs(value: String*): Self = StObject.set(x, "mimetypes", js.Array(value*))
  }
}

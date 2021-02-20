package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageExtensionPoint extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  var configuration: js.UndefOr[Uri] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var filenamePatterns: js.UndefOr[js.Array[String]] = js.native
  
  var filenames: js.UndefOr[js.Array[String]] = js.native
  
  var firstLine: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var mimetypes: js.UndefOr[js.Array[String]] = js.native
}
object ILanguageExtensionPoint {
  
  @scala.inline
  def apply(id: String): ILanguageExtensionPoint = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageExtensionPoint]
  }
  
  @scala.inline
  implicit class ILanguageExtensionPointMutableBuilder[Self <: ILanguageExtensionPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setConfiguration(value: Uri): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFilenamePatterns(value: js.Array[String]): Self = StObject.set(x, "filenamePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenamePatternsUndefined: Self = StObject.set(x, "filenamePatterns", js.undefined)
    
    @scala.inline
    def setFilenamePatternsVarargs(value: String*): Self = StObject.set(x, "filenamePatterns", js.Array(value :_*))
    
    @scala.inline
    def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenamesUndefined: Self = StObject.set(x, "filenames", js.undefined)
    
    @scala.inline
    def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value :_*))
    
    @scala.inline
    def setFirstLine(value: String): Self = StObject.set(x, "firstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLineUndefined: Self = StObject.set(x, "firstLine", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetypes(value: js.Array[String]): Self = StObject.set(x, "mimetypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetypesUndefined: Self = StObject.set(x, "mimetypes", js.undefined)
    
    @scala.inline
    def setMimetypesVarargs(value: String*): Self = StObject.set(x, "mimetypes", js.Array(value :_*))
  }
}

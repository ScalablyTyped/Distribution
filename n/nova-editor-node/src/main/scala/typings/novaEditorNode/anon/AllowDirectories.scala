package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowDirectories extends StObject {
  
  var allowDirectories: js.UndefOr[Boolean] = js.undefined
  
  var allowFiles: js.UndefOr[Boolean] = js.undefined
  
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  
  var filetype: js.UndefOr[js.Array[String]] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var relative: js.UndefOr[Boolean] = js.undefined
}
object AllowDirectories {
  
  inline def apply(): AllowDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDirectories]
  }
  
  extension [Self <: AllowDirectories](x: Self) {
    
    inline def setAllowDirectories(value: Boolean): Self = StObject.set(x, "allowDirectories", value.asInstanceOf[js.Any])
    
    inline def setAllowDirectoriesUndefined: Self = StObject.set(x, "allowDirectories", js.undefined)
    
    inline def setAllowFiles(value: Boolean): Self = StObject.set(x, "allowFiles", value.asInstanceOf[js.Any])
    
    inline def setAllowFilesUndefined: Self = StObject.set(x, "allowFiles", js.undefined)
    
    inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    inline def setFiletype(value: js.Array[String]): Self = StObject.set(x, "filetype", value.asInstanceOf[js.Any])
    
    inline def setFiletypeUndefined: Self = StObject.set(x, "filetype", js.undefined)
    
    inline def setFiletypeVarargs(value: String*): Self = StObject.set(x, "filetype", js.Array(value :_*))
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}

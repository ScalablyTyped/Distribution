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
  
  @scala.inline
  def apply(): AllowDirectories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDirectories]
  }
  
  @scala.inline
  implicit class AllowDirectoriesMutableBuilder[Self <: AllowDirectories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDirectories(value: Boolean): Self = StObject.set(x, "allowDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDirectoriesUndefined: Self = StObject.set(x, "allowDirectories", js.undefined)
    
    @scala.inline
    def setAllowFiles(value: Boolean): Self = StObject.set(x, "allowFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFilesUndefined: Self = StObject.set(x, "allowFiles", js.undefined)
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    @scala.inline
    def setFiletype(value: js.Array[String]): Self = StObject.set(x, "filetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiletypeUndefined: Self = StObject.set(x, "filetype", js.undefined)
    
    @scala.inline
    def setFiletypeVarargs(value: String*): Self = StObject.set(x, "filetype", js.Array(value :_*))
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}

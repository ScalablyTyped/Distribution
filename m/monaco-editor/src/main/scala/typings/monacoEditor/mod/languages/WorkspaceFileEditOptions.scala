package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFileEditOptions extends StObject {
  
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceFileEditOptions {
  
  @scala.inline
  def apply(): WorkspaceFileEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEditOptions]
  }
  
  @scala.inline
  implicit class WorkspaceFileEditOptionsMutableBuilder[Self <: WorkspaceFileEditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    @scala.inline
    def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}

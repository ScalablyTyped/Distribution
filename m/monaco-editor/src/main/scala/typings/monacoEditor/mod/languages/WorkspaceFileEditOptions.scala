package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFileEditOptions extends StObject {
  
  var copy: js.UndefOr[Boolean] = js.undefined
  
  var folder: js.UndefOr[Boolean] = js.undefined
  
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.undefined
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var skipTrashBin: js.UndefOr[Boolean] = js.undefined
}
object WorkspaceFileEditOptions {
  
  inline def apply(): WorkspaceFileEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEditOptions]
  }
  
  extension [Self <: WorkspaceFileEditOptions](x: Self) {
    
    inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setFolder(value: Boolean): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    inline def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setSkipTrashBin(value: Boolean): Self = StObject.set(x, "skipTrashBin", value.asInstanceOf[js.Any])
    
    inline def setSkipTrashBinUndefined: Self = StObject.set(x, "skipTrashBin", js.undefined)
  }
}

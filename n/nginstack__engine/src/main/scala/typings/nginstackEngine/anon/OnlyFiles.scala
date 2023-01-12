package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyFiles extends StObject {
  
  var onlyFiles: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object OnlyFiles {
  
  inline def apply(): OnlyFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlyFiles] (val x: Self) extends AnyVal {
    
    inline def setOnlyFiles(value: Boolean): Self = StObject.set(x, "onlyFiles", value.asInstanceOf[js.Any])
    
    inline def setOnlyFilesUndefined: Self = StObject.set(x, "onlyFiles", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}

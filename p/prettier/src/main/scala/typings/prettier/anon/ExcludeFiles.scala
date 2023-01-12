package typings.prettier.anon

import typings.prettier.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeFiles extends StObject {
  
  var excludeFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var files: String | js.Array[String]
  
  var options: js.UndefOr[Options] = js.undefined
}
object ExcludeFiles {
  
  inline def apply(files: String | js.Array[String]): ExcludeFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeFiles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludeFiles] (val x: Self) extends AnyVal {
    
    inline def setExcludeFiles(value: String | js.Array[String]): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
    
    inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
    
    inline def setExcludeFilesVarargs(value: String*): Self = StObject.set(x, "excludeFiles", js.Array(value*))
    
    inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

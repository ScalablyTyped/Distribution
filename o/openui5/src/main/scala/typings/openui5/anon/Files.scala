package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Files extends StObject {
  
  /**
    * Files.
    */
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * New file path value.
    */
  var newValue: js.UndefOr[String] = js.undefined
}
object Files {
  
  inline def apply(): Files = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Files]
  }
  
  extension [Self <: Files](x: Self) {
    
    inline def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
  }
}

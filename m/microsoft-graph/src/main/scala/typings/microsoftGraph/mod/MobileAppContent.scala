package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppContent
  extends StObject
     with Entity {
  
  // The list of files for this app content version.
  var files: js.UndefOr[NullableOption[js.Array[MobileAppContentFile]]] = js.undefined
}
object MobileAppContent {
  
  inline def apply(): MobileAppContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileAppContent] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: NullableOption[js.Array[MobileAppContentFile]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesNull: Self = StObject.set(x, "files", null)
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: MobileAppContentFile*): Self = StObject.set(x, "files", js.Array(value*))
  }
}

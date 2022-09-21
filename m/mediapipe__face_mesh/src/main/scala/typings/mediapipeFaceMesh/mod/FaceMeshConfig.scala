package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceMeshConfig extends StObject {
  
  var locateFile: js.UndefOr[js.Function2[/* path */ String, /* prefix */ js.UndefOr[String], String]] = js.undefined
}
object FaceMeshConfig {
  
  inline def apply(): FaceMeshConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceMeshConfig]
  }
  
  extension [Self <: FaceMeshConfig](x: Self) {
    
    inline def setLocateFile(value: (/* path */ String, /* prefix */ js.UndefOr[String]) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
    
    inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
  }
}

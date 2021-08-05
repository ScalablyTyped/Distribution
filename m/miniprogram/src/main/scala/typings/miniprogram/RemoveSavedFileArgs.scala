package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveSavedFileArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  var apFilePath: String
}
object RemoveSavedFileArgs {
  
  inline def apply(apFilePath: String): RemoveSavedFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSavedFileArgs]
  }
  
  extension [Self <: RemoveSavedFileArgs](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

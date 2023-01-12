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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveSavedFileArgs] (val x: Self) extends AnyVal {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

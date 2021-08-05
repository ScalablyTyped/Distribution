package typings.miniprogram

import typings.miniprogram.anon.ApFilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileArgs
  extends StObject
     with AsyncCallback[ApFilePath] {
  
  var apFilePath: String
}
object SaveFileArgs {
  
  inline def apply(apFilePath: String): SaveFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileArgs]
  }
  
  extension [Self <: SaveFileArgs](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

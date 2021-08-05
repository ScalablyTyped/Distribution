package typings.miniprogram

import typings.miniprogram.anon.CreateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileInfo
  extends StObject
     with AsyncCallback[CreateTime] {
  
  var apFilePath: String
}
object GetSavedFileInfo {
  
  inline def apply(apFilePath: String): GetSavedFileInfo = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSavedFileInfo]
  }
  
  extension [Self <: GetSavedFileInfo](x: Self) {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

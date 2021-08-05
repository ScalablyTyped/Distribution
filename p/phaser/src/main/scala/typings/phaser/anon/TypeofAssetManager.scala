package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAssetManager extends StObject {
  
  /* static member */
  var downloadBinary: js.Any
  
  /* static member */
  var downloadText: js.Any
}
object TypeofAssetManager {
  
  inline def apply(downloadBinary: js.Any, downloadText: js.Any): TypeofAssetManager = {
    val __obj = js.Dynamic.literal(downloadBinary = downloadBinary.asInstanceOf[js.Any], downloadText = downloadText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAssetManager]
  }
  
  extension [Self <: TypeofAssetManager](x: Self) {
    
    inline def setDownloadBinary(value: js.Any): Self = StObject.set(x, "downloadBinary", value.asInstanceOf[js.Any])
    
    inline def setDownloadText(value: js.Any): Self = StObject.set(x, "downloadText", value.asInstanceOf[js.Any])
  }
}

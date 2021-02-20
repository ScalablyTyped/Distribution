package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAssetManager extends StObject {
  
  /* static member */
  var downloadBinary: js.Any = js.native
  
  /* static member */
  var downloadText: js.Any = js.native
}
object TypeofAssetManager {
  
  @scala.inline
  def apply(downloadBinary: js.Any, downloadText: js.Any): TypeofAssetManager = {
    val __obj = js.Dynamic.literal(downloadBinary = downloadBinary.asInstanceOf[js.Any], downloadText = downloadText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAssetManager]
  }
  
  @scala.inline
  implicit class TypeofAssetManagerMutableBuilder[Self <: TypeofAssetManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadBinary(value: js.Any): Self = StObject.set(x, "downloadBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadText(value: js.Any): Self = StObject.set(x, "downloadText", value.asInstanceOf[js.Any])
  }
}

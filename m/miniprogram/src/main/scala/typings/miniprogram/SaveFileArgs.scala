package typings.miniprogram

import typings.miniprogram.anon.ApFilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileArgs extends AsyncCallback[ApFilePath] {
  
  var apFilePath: String = js.native
}
object SaveFileArgs {
  
  @scala.inline
  def apply(apFilePath: String): SaveFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileArgs]
  }
  
  @scala.inline
  implicit class SaveFileArgsMutableBuilder[Self <: SaveFileArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveSavedFileArgs extends AsyncCallback[Unit] {
  
  var apFilePath: String = js.native
}
object RemoveSavedFileArgs {
  
  @scala.inline
  def apply(apFilePath: String): RemoveSavedFileArgs = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSavedFileArgs]
  }
  
  @scala.inline
  implicit class RemoveSavedFileArgsMutableBuilder[Self <: RemoveSavedFileArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
  }
}

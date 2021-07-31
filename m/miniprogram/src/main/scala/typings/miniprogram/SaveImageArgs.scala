package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  var showActionSheet: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object SaveImageArgs {
  
  @scala.inline
  def apply(url: String): SaveImageArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageArgs]
  }
  
  @scala.inline
  implicit class SaveImageArgsMutableBuilder[Self <: SaveImageArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowActionSheet(value: Boolean): Self = StObject.set(x, "showActionSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowActionSheetUndefined: Self = StObject.set(x, "showActionSheet", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

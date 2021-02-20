package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBackgroundColorArgs extends AsyncCallback[Unit] {
  
  /**
    * Window background color.
    */
  var backgroundColor: String = js.native
  
  /**
    * Bottom window background color, supported in iOS only.
    */
  var backgroundColorBottom: String = js.native
  
  /**
    * Top window background color, supported in iOS only.
    */
  var backgroundColorTop: String = js.native
}
object SetBackgroundColorArgs {
  
  @scala.inline
  def apply(backgroundColor: String, backgroundColorBottom: String, backgroundColorTop: String): SetBackgroundColorArgs = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundColorBottom = backgroundColorBottom.asInstanceOf[js.Any], backgroundColorTop = backgroundColorTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBackgroundColorArgs]
  }
  
  @scala.inline
  implicit class SetBackgroundColorArgsMutableBuilder[Self <: SetBackgroundColorArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
  }
}

package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBackgroundColorArgs
  extends StObject
     with AsyncVoidCallback {
  
  /**
    * Window background color.
    */
  var backgroundColor: String
  
  /**
    * Bottom window background color, supported in iOS only.
    */
  var backgroundColorBottom: String
  
  /**
    * Top window background color, supported in iOS only.
    */
  var backgroundColorTop: String
}
object SetBackgroundColorArgs {
  
  inline def apply(backgroundColor: String, backgroundColorBottom: String, backgroundColorTop: String): SetBackgroundColorArgs = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundColorBottom = backgroundColorBottom.asInstanceOf[js.Any], backgroundColorTop = backgroundColorTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBackgroundColorArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetBackgroundColorArgs] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
  }
}

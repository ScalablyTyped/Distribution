package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message used in the `onVisibilityModeChanged` invocation.
  */
trait VisibilityModeChangedMessage extends StObject {
  
  /**
    * Visibility changed state.
    */
  var visibilityMode: VisibilityMode
}
object VisibilityModeChangedMessage {
  
  inline def apply(visibilityMode: VisibilityMode): VisibilityModeChangedMessage = {
    val __obj = js.Dynamic.literal(visibilityMode = visibilityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityModeChangedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibilityModeChangedMessage] (val x: Self) extends AnyVal {
    
    inline def setVisibilityMode(value: VisibilityMode): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
  }
}

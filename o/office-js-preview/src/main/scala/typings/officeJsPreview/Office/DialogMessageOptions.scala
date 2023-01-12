package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to send messages, in either direction, between a dialog and its parent.
  * 
  * @remarks
  * 
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-origin-requirement-sets | DialogOrigin 1.1}
  */
trait DialogMessageOptions extends StObject {
  
  /**
    * Specifies the intended recipient domain for a message sent, in either direction, between a dialog and its parent. For example, `https://resources.contoso.com`.
    */
  var targetOrigin: String
}
object DialogMessageOptions {
  
  inline def apply(targetOrigin: String): DialogMessageOptions = {
    val __obj = js.Dynamic.literal(targetOrigin = targetOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setTargetOrigin(value: String): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
  }
}

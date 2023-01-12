package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SErrorMessage extends StObject {
  
  /**
    * The message of the error.
    */
  var sErrorMessage: js.UndefOr[String] = js.undefined
}
object SErrorMessage {
  
  inline def apply(): SErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SErrorMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SErrorMessage] (val x: Self) extends AnyVal {
    
    inline def setSErrorMessage(value: String): Self = StObject.set(x, "sErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setSErrorMessageUndefined: Self = StObject.set(x, "sErrorMessage", js.undefined)
  }
}

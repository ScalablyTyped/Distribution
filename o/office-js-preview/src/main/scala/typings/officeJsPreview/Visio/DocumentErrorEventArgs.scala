package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about DocumentError event
  *
  * [Api set:  1.1]
  */
trait DocumentErrorEventArgs extends StObject {
  
  /**
    *
    * Visio Error code
    *
    * [Api set:  1.1]
    */
  var errorCode: Double
  
  /**
    *
    * Message about error that occured
    *
    * [Api set:  1.1]
    */
  var errorMessage: String
  
  /**
    *
    * Tells if the error is critical or not. If critical the session cannot continue.
    *
    * [Api set:  1.1]
    */
  var isCritical: Boolean
}
object DocumentErrorEventArgs {
  
  inline def apply(errorCode: Double, errorMessage: String, isCritical: Boolean): DocumentErrorEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], isCritical = isCritical.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentErrorEventArgs]
  }
  
  extension [Self <: DocumentErrorEventArgs](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setIsCritical(value: Boolean): Self = StObject.set(x, "isCritical", value.asInstanceOf[js.Any])
  }
}

package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Error object contains info about an error that is returned by the
  * Live Connect APIs.
  */
trait IError extends StObject {
  
  /**
    * Info about the error.
    */
  var error: Code
}
object IError {
  
  inline def apply(error: Code): IError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  extension [Self <: IError](x: Self) {
    
    inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

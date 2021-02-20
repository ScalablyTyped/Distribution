package typings.ngCordova.ngCordova

import typings.cordovaPluginFile.FileError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileError extends FileError {
  
  var message: String = js.native
}
object IFileError {
  
  @scala.inline
  def apply(code: Double, message: String): IFileError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileError]
  }
  
  @scala.inline
  implicit class IFileErrorMutableBuilder[Self <: IFileError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

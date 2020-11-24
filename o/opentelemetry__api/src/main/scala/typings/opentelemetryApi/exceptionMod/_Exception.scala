package typings.opentelemetryApi.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Exception extends js.Object
object _Exception {
  
  @scala.inline
  def ExceptionWithCode(code: String): _Exception = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Exception]
  }
  
  @scala.inline
  def ExceptionWithMessage(message: String): _Exception = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Exception]
  }
  
  @scala.inline
  def ExceptionWithName(name: String): _Exception = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Exception]
  }
}

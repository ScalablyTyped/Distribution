package typings.pRetry.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortErrorClass extends Error {
  
  @JSName("name")
  val name_AbortErrorClass: typings.pRetry.pRetryStrings.AbortError = js.native
  
  val originalError: Error = js.native
}
object AbortErrorClass {
  
  @scala.inline
  def apply(message: String, name: typings.pRetry.pRetryStrings.AbortError, originalError: Error): AbortErrorClass = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalError = originalError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortErrorClass]
  }
  
  @scala.inline
  implicit class AbortErrorClassOps[Self <: AbortErrorClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typings.pRetry.pRetryStrings.AbortError): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalError(value: Error): Self = this.set("originalError", value.asInstanceOf[js.Any])
  }
}

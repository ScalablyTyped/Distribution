package typings.oracleOraclejet.ojvalidationBaseMod

import typings.oracleOraclejet.ojmessagingMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConverterError extends js.Object {
  
  // constructor(summary: string, detail: string);
  def getMessage(): ^ = js.native
}
object ConverterError {
  
  @scala.inline
  def apply(getMessage: () => ^): ConverterError = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage))
    __obj.asInstanceOf[ConverterError]
  }
  
  @scala.inline
  implicit class ConverterErrorOps[Self <: ConverterError] (val x: Self) extends AnyVal {
    
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
    def setGetMessage(value: () => ^): Self = this.set("getMessage", js.Any.fromFunction0(value))
  }
}

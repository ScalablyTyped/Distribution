package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeHtmlProto extends js.Object {
  
  /**
    * IMPORTANT: Never set or read this field, even from tests, it is private. See documentation at the top of .proto file for programming language packages with which to create or read
    * this message.
    */
  var privateDoNotAccessOrElseSafeHtmlWrappedValue: js.UndefOr[String] = js.native
}
object SafeHtmlProto {
  
  @scala.inline
  def apply(): SafeHtmlProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeHtmlProto]
  }
  
  @scala.inline
  implicit class SafeHtmlProtoOps[Self <: SafeHtmlProto] (val x: Self) extends AnyVal {
    
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
    def setPrivateDoNotAccessOrElseSafeHtmlWrappedValue(value: String): Self = this.set("privateDoNotAccessOrElseSafeHtmlWrappedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateDoNotAccessOrElseSafeHtmlWrappedValue: Self = this.set("privateDoNotAccessOrElseSafeHtmlWrappedValue", js.undefined)
  }
}

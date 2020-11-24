package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NegativeKeyword extends js.Object {
  
  /**
    * Required. Immutable. The negatively targeted keyword, for example `car insurance`. Must be UTF-8 encoded with a maximum size of 255 bytes. Maximum number of characters is 80.
    * Maximum number of words is 10. Valid characters are restricted to ASCII characters only. The only URL-escaping permitted is for representing whitespace between words. Leading or
    * trailing whitespace is ignored.
    */
  var keywordValue: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the negative keyword. */
  var name: js.UndefOr[String] = js.native
}
object NegativeKeyword {
  
  @scala.inline
  def apply(): NegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NegativeKeyword]
  }
  
  @scala.inline
  implicit class NegativeKeywordOps[Self <: NegativeKeyword] (val x: Self) extends AnyVal {
    
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
    def setKeywordValue(value: String): Self = this.set("keywordValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywordValue: Self = this.set("keywordValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}

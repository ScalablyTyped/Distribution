package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataContentTypeInfo extends js.Object {
  
  /** gdata */
  var bestGuess: js.UndefOr[String] = js.native
  
  /** gdata */
  var fromBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var fromFileName: js.UndefOr[String] = js.native
  
  /** gdata */
  var fromHeader: js.UndefOr[String] = js.native
  
  /** gdata */
  var fromUrlPath: js.UndefOr[String] = js.native
}
object GdataContentTypeInfo {
  
  @scala.inline
  def apply(): GdataContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataContentTypeInfo]
  }
  
  @scala.inline
  implicit class GdataContentTypeInfoOps[Self <: GdataContentTypeInfo] (val x: Self) extends AnyVal {
    
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
    def setBestGuess(value: String): Self = this.set("bestGuess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBestGuess: Self = this.set("bestGuess", js.undefined)
    
    @scala.inline
    def setFromBytes(value: String): Self = this.set("fromBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromBytes: Self = this.set("fromBytes", js.undefined)
    
    @scala.inline
    def setFromFileName(value: String): Self = this.set("fromFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromFileName: Self = this.set("fromFileName", js.undefined)
    
    @scala.inline
    def setFromHeader(value: String): Self = this.set("fromHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromHeader: Self = this.set("fromHeader", js.undefined)
    
    @scala.inline
    def setFromUrlPath(value: String): Self = this.set("fromUrlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUrlPath: Self = this.set("fromUrlPath", js.undefined)
  }
}

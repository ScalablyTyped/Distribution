package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFooterRequest extends js.Object {
  
  /**
    * The location of the SectionBreak immediately preceding the section whose SectionStyle this footer should belong to. If this is unset or refers to the first section break in the
    * document, the footer applies to the document style.
    */
  var sectionBreakLocation: js.UndefOr[Location] = js.native
  
  /** The type of footer to create. */
  var `type`: js.UndefOr[String] = js.native
}
object CreateFooterRequest {
  
  @scala.inline
  def apply(): CreateFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFooterRequest]
  }
  
  @scala.inline
  implicit class CreateFooterRequestOps[Self <: CreateFooterRequest] (val x: Self) extends AnyVal {
    
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
    def setSectionBreakLocation(value: Location): Self = this.set("sectionBreakLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionBreakLocation: Self = this.set("sectionBreakLocation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

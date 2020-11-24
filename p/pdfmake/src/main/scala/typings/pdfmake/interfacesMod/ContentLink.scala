package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentLink extends js.Object {
  
  var link: js.UndefOr[String] = js.native
  
  var linkToDestination: js.UndefOr[String] = js.native
  
  var linkToPage: js.UndefOr[Double] = js.native
}
object ContentLink {
  
  @scala.inline
  def apply(): ContentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLink]
  }
  
  @scala.inline
  implicit class ContentLinkOps[Self <: ContentLink] (val x: Self) extends AnyVal {
    
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLinkToDestination(value: String): Self = this.set("linkToDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToDestination: Self = this.set("linkToDestination", js.undefined)
    
    @scala.inline
    def setLinkToPage(value: Double): Self = this.set("linkToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkToPage: Self = this.set("linkToPage", js.undefined)
  }
}

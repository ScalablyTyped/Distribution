package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentPageReference
  extends ContentBase
     with _Content {
  
  var pageReference: String = js.native
}
object ContentPageReference {
  
  @scala.inline
  def apply(pageReference: String): ContentPageReference = {
    val __obj = js.Dynamic.literal(pageReference = pageReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentPageReference]
  }
  
  @scala.inline
  implicit class ContentPageReferenceOps[Self <: ContentPageReference] (val x: Self) extends AnyVal {
    
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
    def setPageReference(value: String): Self = this.set("pageReference", value.asInstanceOf[js.Any])
  }
}

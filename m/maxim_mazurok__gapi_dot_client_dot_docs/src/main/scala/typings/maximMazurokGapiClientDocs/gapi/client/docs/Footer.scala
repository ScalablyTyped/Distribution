package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footer extends js.Object {
  
  /** The contents of the footer. The indexes for a footer's content begin at zero. */
  var content: js.UndefOr[js.Array[StructuralElement]] = js.native
  
  /** The ID of the footer. */
  var footerId: js.UndefOr[String] = js.native
}
object Footer {
  
  @scala.inline
  def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  
  @scala.inline
  implicit class FooterOps[Self <: Footer] (val x: Self) extends AnyVal {
    
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
    def setContentVarargs(value: StructuralElement*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[StructuralElement]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFooterId(value: String): Self = this.set("footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterId: Self = this.set("footerId", js.undefined)
  }
}

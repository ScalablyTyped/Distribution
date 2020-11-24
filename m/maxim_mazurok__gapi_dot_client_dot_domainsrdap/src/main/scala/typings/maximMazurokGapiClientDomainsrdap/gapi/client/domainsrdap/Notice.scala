package typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notice extends js.Object {
  
  /** Description of the notice. */
  var description: js.UndefOr[js.Array[String]] = js.native
  
  /** Link to a document containing more information. */
  var links: js.UndefOr[js.Array[Link]] = js.native
  
  /** Title of a notice. Example: "Terms of Service". */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Type values defined in [section 10.2.1 of RFC 7483](https://tools.ietf.org/html/rfc7483#section-10.2.1) specific to a whole response: "result set truncated due to authorization",
    * "result set truncated due to excessive load", "result set truncated due to unexplainable reasons".
    */
  var `type`: js.UndefOr[String] = js.native
}
object Notice {
  
  @scala.inline
  def apply(): Notice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notice]
  }
  
  @scala.inline
  implicit class NoticeOps[Self <: Notice] (val x: Self) extends AnyVal {
    
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
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

package typings.nodeZendesk.mod.Requests.Comments

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModel extends js.Object {
  
  var author_id: js.UndefOr[ZendeskID] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var html_body: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var request_id: js.UndefOr[Double] = js.native
  
  var uploads: js.UndefOr[js.Array[String]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object CreateModel {
  
  @scala.inline
  def apply(): CreateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModel]
  }
  
  @scala.inline
  implicit class CreateModelOps[Self <: CreateModel] (val x: Self) extends AnyVal {
    
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
    def setAuthor_id(value: ZendeskID): Self = this.set("author_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor_id: Self = this.set("author_id", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHtml_body(value: String): Self = this.set("html_body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml_body: Self = this.set("html_body", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setRequest_id(value: Double): Self = this.set("request_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_id: Self = this.set("request_id", js.undefined)
    
    @scala.inline
    def setUploadsVarargs(value: String*): Self = this.set("uploads", js.Array(value :_*))
    
    @scala.inline
    def setUploads(value: js.Array[String]): Self = this.set("uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

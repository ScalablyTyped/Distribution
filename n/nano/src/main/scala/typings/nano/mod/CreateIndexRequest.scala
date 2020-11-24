package typings.nano.mod

import typings.nano.anon.Fields
import typings.nano.nanoStrings.json
import typings.nano.nanoStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
@js.native
trait CreateIndexRequest extends js.Object {
  
  // Name of the design document in which the index will be created.
  var ddoc: js.UndefOr[String] = js.native
  
  // JSON object describing the index to create
  var index: Fields = js.native
  
  // Name of the index. If no name is provided, a name will be generated automatically.
  var name: js.UndefOr[String] = js.native
  
  // This field sets whether the created index will be a partitioned or global index.
  var partitioned: js.UndefOr[Boolean] = js.native
  
  // Can be "json" or "text". Defaults to json.
  var `type`: js.UndefOr[json | text] = js.native
}
object CreateIndexRequest {
  
  @scala.inline
  def apply(index: Fields): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  
  @scala.inline
  implicit class CreateIndexRequestOps[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Fields): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdoc(value: String): Self = this.set("ddoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdoc: Self = this.set("ddoc", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartitioned(value: Boolean): Self = this.set("partitioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitioned: Self = this.set("partitioned", js.undefined)
    
    @scala.inline
    def setType(value: json | text): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionGroupsResource extends js.Object {
  
  var fields: FieldsResource = js.native
  
  var indexes: IndexesResource = js.native
}
object CollectionGroupsResource {
  
  @scala.inline
  def apply(fields: FieldsResource, indexes: IndexesResource): CollectionGroupsResource = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionGroupsResource]
  }
  
  @scala.inline
  implicit class CollectionGroupsResourceOps[Self <: CollectionGroupsResource] (val x: Self) extends AnyVal {
    
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
    def setFields(value: FieldsResource): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexes(value: IndexesResource): Self = this.set("indexes", value.asInstanceOf[js.Any])
  }
}

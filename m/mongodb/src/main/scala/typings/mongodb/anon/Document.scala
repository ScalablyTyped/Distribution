package typings.mongodb.anon

import typings.mongodb.mod.OptionalId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document[TSchema] extends js.Object {
  
  var document: OptionalId[TSchema] = js.native
}
object Document {
  
  @scala.inline
  def apply[TSchema](document: OptionalId[TSchema]): Document[TSchema] = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document[TSchema]]
  }
  
  @scala.inline
  implicit class DocumentOps[Self <: Document[_], TSchema] (val x: Self with Document[TSchema]) extends AnyVal {
    
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
    def setDocument(value: OptionalId[TSchema]): Self = this.set("document", value.asInstanceOf[js.Any])
  }
}

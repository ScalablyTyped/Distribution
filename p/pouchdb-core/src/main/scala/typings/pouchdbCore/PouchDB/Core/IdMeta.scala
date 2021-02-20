package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdMeta extends StObject {
  
  var _id: DocumentId = js.native
}
object IdMeta {
  
  @scala.inline
  def apply(_id: DocumentId): IdMeta = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdMeta]
  }
  
  @scala.inline
  implicit class IdMetaMutableBuilder[Self <: IdMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}

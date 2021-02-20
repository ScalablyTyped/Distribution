package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Created extends StObject {
  
  var created: js.Array[String] = js.native
  
  var deleted: js.Array[String] = js.native
  
  var updated: js.Array[String] = js.native
}
object Created {
  
  @scala.inline
  def apply(created: js.Array[String], deleted: js.Array[String], updated: js.Array[String]): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  @scala.inline
  implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: js.Array[String]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedVarargs(value: String*): Self = StObject.set(x, "created", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value :_*))
    
    @scala.inline
    def setUpdated(value: js.Array[String]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedVarargs(value: String*): Self = StObject.set(x, "updated", js.Array(value :_*))
  }
}

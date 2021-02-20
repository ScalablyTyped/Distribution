package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditableModel extends TemporalModel {
  
  val updated_at: String | Null = js.native
}
object AuditableModel {
  
  @scala.inline
  def apply(created_at: String, id: ZendeskID): AuditableModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditableModel]
  }
  
  @scala.inline
  implicit class AuditableModelMutableBuilder[Self <: AuditableModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}

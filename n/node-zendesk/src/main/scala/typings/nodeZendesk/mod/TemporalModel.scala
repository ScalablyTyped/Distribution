package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalModel
  extends StObject
     with PersistableModel {
  
  val created_at: String
}
object TemporalModel {
  
  inline def apply(created_at: String, id: ZendeskID): TemporalModel = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalModel]
  }
  
  extension [Self <: TemporalModel](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
  }
}

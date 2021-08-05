package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistableModel extends StObject {
  
  val id: ZendeskID
}
object PersistableModel {
  
  inline def apply(id: ZendeskID): PersistableModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistableModel]
  }
  
  extension [Self <: PersistableModel](x: Self) {
    
    inline def setId(value: ZendeskID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

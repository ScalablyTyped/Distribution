package typings.postgres.anon

import typings.postgres.mod.RelationInfo
import typings.postgres.mod.ReplicationEvent
import typings.postgres.postgresStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key
  extends StObject
     with ReplicationEvent {
  
  var command: delete
  
  var key: Boolean
  
  var relation: RelationInfo
}
object Key {
  
  inline def apply(key: Boolean, relation: RelationInfo): Key = {
    val __obj = js.Dynamic.literal(command = "delete", key = key.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: delete): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRelation(value: RelationInfo): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
  }
}

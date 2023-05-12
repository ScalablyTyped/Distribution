package typings.postgres.anon

import typings.postgres.mod.RelationInfo
import typings.postgres.mod.ReplicationEvent
import typings.postgres.mod.Row
import typings.postgres.postgresStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Old
  extends StObject
     with ReplicationEvent {
  
  var command: update
  
  var key: Boolean
  
  var old: Row | Null
  
  var relation: RelationInfo
}
object Old {
  
  inline def apply(key: Boolean, relation: RelationInfo): Old = {
    val __obj = js.Dynamic.literal(command = "update", key = key.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], old = null)
    __obj.asInstanceOf[Old]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Old] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: update): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOld(value: Row): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldNull: Self = StObject.set(x, "old", null)
    
    inline def setRelation(value: RelationInfo): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
  }
}

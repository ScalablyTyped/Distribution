package typings.postgres.anon

import typings.postgres.mod.RelationInfo
import typings.postgres.mod.ReplicationEvent
import typings.postgres.postgresStrings.insert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command
  extends StObject
     with ReplicationEvent {
  
  var command: insert
  
  var relation: RelationInfo
}
object Command {
  
  inline def apply(relation: RelationInfo): Command = {
    val __obj = js.Dynamic.literal(command = "insert", relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: insert): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelation(value: RelationInfo): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
  }
}

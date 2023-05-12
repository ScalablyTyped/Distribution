package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.postgres.anon.Command
  - typings.postgres.anon.Key
  - typings.postgres.anon.Old
*/
trait ReplicationEvent extends StObject
object ReplicationEvent {
  
  inline def Command(relation: RelationInfo): typings.postgres.anon.Command = {
    val __obj = js.Dynamic.literal(command = "insert", relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.postgres.anon.Command]
  }
  
  inline def Key(key: Boolean, relation: RelationInfo): typings.postgres.anon.Key = {
    val __obj = js.Dynamic.literal(command = "delete", key = key.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.postgres.anon.Key]
  }
  
  inline def Old(key: Boolean, relation: RelationInfo): typings.postgres.anon.Old = {
    val __obj = js.Dynamic.literal(command = "update", key = key.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], old = null)
    __obj.asInstanceOf[typings.postgres.anon.Old]
  }
}

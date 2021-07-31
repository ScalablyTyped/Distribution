package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates
trait DatabaseUpdatesResultItem extends StObject {
  
  // Database name.
  var db_name: String
  
  // Update sequence of the event.
  var seq: js.Any
  
  // A database event is one of created, updated, deleted.
  var `type`: String
}
object DatabaseUpdatesResultItem {
  
  @scala.inline
  def apply(db_name: String, seq: js.Any, `type`: String): DatabaseUpdatesResultItem = {
    val __obj = js.Dynamic.literal(db_name = db_name.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseUpdatesResultItem]
  }
  
  @scala.inline
  implicit class DatabaseUpdatesResultItemMutableBuilder[Self <: DatabaseUpdatesResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb_name(value: String): Self = StObject.set(x, "db_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: js.Any): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

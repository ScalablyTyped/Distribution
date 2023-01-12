package typings.mongodb.mod

import typings.mongodb.anon.namestringsizeOnDisknumbe
import typings.mongodb.mongodbInts.`0`
import typings.mongodb.mongodbInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatabasesResult extends StObject {
  
  var databases: js.Array[namestringsizeOnDisknumbe]
  
  var ok: `1` | `0`
  
  var totalSize: js.UndefOr[scala.Double] = js.undefined
  
  var totalSizeMb: js.UndefOr[scala.Double] = js.undefined
}
object ListDatabasesResult {
  
  inline def apply(databases: js.Array[namestringsizeOnDisknumbe], ok: `1` | `0`): ListDatabasesResult = {
    val __obj = js.Dynamic.literal(databases = databases.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatabasesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatabasesResult] (val x: Self) extends AnyVal {
    
    inline def setDatabases(value: js.Array[namestringsizeOnDisknumbe]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesVarargs(value: namestringsizeOnDisknumbe*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setOk(value: `1` | `0`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: scala.Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeMb(value: scala.Double): Self = StObject.set(x, "totalSizeMb", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeMbUndefined: Self = StObject.set(x, "totalSizeMb", js.undefined)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}

package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexTablespace extends StObject {
  
  var dryRun: Boolean
  
  var indexTablespace: String
  
  var primaryKey: js.Array[String]
}
object IndexTablespace {
  
  inline def apply(dryRun: Boolean, indexTablespace: String, primaryKey: js.Array[String]): IndexTablespace = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], indexTablespace = indexTablespace.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexTablespace]
  }
  
  extension [Self <: IndexTablespace](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setIndexTablespace(value: String): Self = StObject.set(x, "indexTablespace", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
  }
}

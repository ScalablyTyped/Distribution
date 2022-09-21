package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DryRun extends StObject {
  
  var dryRun: Boolean
  
  var indexTablespace: String
  
  var primaryKey: js.Array[String]
  
  var tablespace: String
}
object DryRun {
  
  inline def apply(dryRun: Boolean, indexTablespace: String, primaryKey: js.Array[String], tablespace: String): DryRun = {
    val __obj = js.Dynamic.literal(dryRun = dryRun.asInstanceOf[js.Any], indexTablespace = indexTablespace.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], tablespace = tablespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DryRun]
  }
  
  extension [Self <: DryRun](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setIndexTablespace(value: String): Self = StObject.set(x, "indexTablespace", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: js.Array[String]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyVarargs(value: String*): Self = StObject.set(x, "primaryKey", js.Array(value*))
    
    inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
  }
}

package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  var database: js.UndefOr[typings.nginstackEngine.libDatabaseDbtrackerMod.Database] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var poolId: js.UndefOr[Double] = js.undefined
}
object Database {
  
  inline def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setDatabase(value: typings.nginstackEngine.libDatabaseDbtrackerMod.Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
  }
}

package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnerOptionUrl extends StObject {
  
  var databaseUrl: String | ClientConfig
}
object RunnerOptionUrl {
  
  inline def apply(databaseUrl: String | ClientConfig): RunnerOptionUrl = {
    val __obj = js.Dynamic.literal(databaseUrl = databaseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionUrl]
  }
  
  extension [Self <: RunnerOptionUrl](x: Self) {
    
    inline def setDatabaseUrl(value: String | ClientConfig): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
  }
}

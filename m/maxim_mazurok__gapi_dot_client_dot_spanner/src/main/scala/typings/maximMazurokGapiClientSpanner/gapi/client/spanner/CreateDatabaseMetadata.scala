package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatabaseMetadata extends StObject {
  
  /** The database being created. */
  var database: js.UndefOr[String] = js.undefined
}
object CreateDatabaseMetadata {
  
  inline def apply(): CreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseMetadata]
  }
  
  extension [Self <: CreateDatabaseMetadata](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
  }
}

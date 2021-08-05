package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlServerDatabaseDetails extends StObject {
  
  /** The version of SQL Server with which the database is to be made compatible */
  var compatibilityLevel: js.UndefOr[Double] = js.undefined
  
  /** The recovery model of a SQL Server database */
  var recoveryModel: js.UndefOr[String] = js.undefined
}
object SqlServerDatabaseDetails {
  
  inline def apply(): SqlServerDatabaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerDatabaseDetails]
  }
  
  extension [Self <: SqlServerDatabaseDetails](x: Self) {
    
    inline def setCompatibilityLevel(value: Double): Self = StObject.set(x, "compatibilityLevel", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityLevelUndefined: Self = StObject.set(x, "compatibilityLevel", js.undefined)
    
    inline def setRecoveryModel(value: String): Self = StObject.set(x, "recoveryModel", value.asInstanceOf[js.Any])
    
    inline def setRecoveryModelUndefined: Self = StObject.set(x, "recoveryModel", js.undefined)
  }
}

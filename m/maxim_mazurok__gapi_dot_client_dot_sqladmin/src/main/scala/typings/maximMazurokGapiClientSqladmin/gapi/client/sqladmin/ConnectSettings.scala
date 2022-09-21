package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectSettings extends StObject {
  
  /**
    * `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object
    * to determine the database type.
    */
  var backendType: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation. MySQL instances: `MYSQL_8_0`, `MYSQL_5_7` (default), or `MYSQL_5_6`.
    * PostgreSQL instances: `POSTGRES_9_6`, `POSTGRES_10`, `POSTGRES_11`, `POSTGRES_12` (default), `POSTGRES_13`, or `POSTGRES_14`. SQL Server instances: `SQLSERVER_2017_STANDARD`
    * (default), `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`, `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
    * `SQLSERVER_2019_WEB`.
    */
  var databaseVersion: js.UndefOr[String] = js.undefined
  
  /** The assigned IP addresses for the instance. */
  var ipAddresses: js.UndefOr[js.Array[IpMapping]] = js.undefined
  
  /** This is always `sql#connectSettings`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The cloud region for the instance. For example, `us-central1`, `europe-west1`. The region cannot be changed after instance creation. */
  var region: js.UndefOr[String] = js.undefined
  
  /** SSL configuration. */
  var serverCaCert: js.UndefOr[SslCert] = js.undefined
}
object ConnectSettings {
  
  inline def apply(): ConnectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectSettings]
  }
  
  extension [Self <: ConnectSettings](x: Self) {
    
    inline def setBackendType(value: String): Self = StObject.set(x, "backendType", value.asInstanceOf[js.Any])
    
    inline def setBackendTypeUndefined: Self = StObject.set(x, "backendType", js.undefined)
    
    inline def setDatabaseVersion(value: String): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    inline def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
    
    inline def setIpAddresses(value: js.Array[IpMapping]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
    
    inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
    
    inline def setIpAddressesVarargs(value: IpMapping*): Self = StObject.set(x, "ipAddresses", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setServerCaCert(value: SslCert): Self = StObject.set(x, "serverCaCert", value.asInstanceOf[js.Any])
    
    inline def setServerCaCertUndefined: Self = StObject.set(x, "serverCaCert", js.undefined)
  }
}

package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialiseOptions extends StObject {
  
  /**
    * This specifies the directory in which the Optional Oracle Net Configuration and Optional Oracle Client Configuration files reside. It is equivalent to setting the Oracle environment variable TNS_ADMIN to this value. Any value in that environment variable prior to the call to oracledb.initOracleClient() is ignored. If this attribute is not set, Oracle’s default configuration file search heuristics are used.
    */
  var configDir: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies the driver name value shown in database views, such as V$SESSION_CONNECT_INFO. It can be used by applications to identify themselves for tracing and monitoring purposes. The convention is to separate the product name from the product version by a colon and single space characters. If this attribute is not specified, the value “node-oracledb : version” is used.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#otherinit
    */
  var driverName: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies the URL that is included in the node-oracledb exception message if the Oracle Client libraries cannot be loaded. This allows applications that use node-oracledb to refer users to application-specific installation instructions. If this attribute is not specified, then the node-oracledb installation instructions URL is used.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#otherinit
    */
  var errorUrl: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies the directory containing the Oracle Client libraries. If libDir is not specified, the default library search mechanism is used. If your client libraries are in a full Oracle Client or Oracle Database installation, such as Oracle Database “XE” Express Edition, then you must have previously set environment variables like ORACLE_HOME before calling initOracleClient().
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracleclientloading
    */
  var libDir: js.UndefOr[String] = js.undefined
}
object InitialiseOptions {
  
  inline def apply(): InitialiseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialiseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialiseOptions] (val x: Self) extends AnyVal {
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigDirUndefined: Self = StObject.set(x, "configDir", js.undefined)
    
    inline def setDriverName(value: String): Self = StObject.set(x, "driverName", value.asInstanceOf[js.Any])
    
    inline def setDriverNameUndefined: Self = StObject.set(x, "driverName", js.undefined)
    
    inline def setErrorUrl(value: String): Self = StObject.set(x, "errorUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorUrlUndefined: Self = StObject.set(x, "errorUrl", js.undefined)
    
    inline def setLibDir(value: String): Self = StObject.set(x, "libDir", value.asInstanceOf[js.Any])
    
    inline def setLibDirUndefined: Self = StObject.set(x, "libDir", js.undefined)
  }
}

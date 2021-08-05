package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartupOptions extends StObject {
  
  /**
    * Shuts down a running database using oracledb.SHUTDOWN_MODE_ABORT before restarting the database. The database start up may require instance recovery. The default for force is false.
    * 
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path and filename for a text file containing Oracle Database initialization parameters. If pfile is not set, then the database server-side parameter file is used.
    */
  var pfile: js.UndefOr[String] = js.undefined
  
  /**
    * After the database is started, access is restricted to users who have the CREATE_SESSION and RESTRICTED SESSION privileges. The default is false.
    * 
    * @default false
    */
  var restrict: js.UndefOr[Boolean] = js.undefined
}
object StartupOptions {
  
  inline def apply(): StartupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartupOptions]
  }
  
  extension [Self <: StartupOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setPfile(value: String): Self = StObject.set(x, "pfile", value.asInstanceOf[js.Any])
    
    inline def setPfileUndefined: Self = StObject.set(x, "pfile", js.undefined)
    
    inline def setRestrict(value: Boolean): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
    
    inline def setRestrictUndefined: Self = StObject.set(x, "restrict", js.undefined)
  }
}

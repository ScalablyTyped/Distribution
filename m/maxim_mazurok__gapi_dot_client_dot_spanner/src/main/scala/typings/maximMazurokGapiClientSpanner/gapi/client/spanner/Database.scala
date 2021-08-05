package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Database extends StObject {
  
  /** Output only. If exists, the time at which the database creation started. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the database. Values are of the form `projects//instances//databases/`, where `` is as specified in the `CREATE DATABASE` statement. This name can be passed to
    * other API methods to identify the database.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Applicable only for restored databases. Contains information about the restore source. */
  var restoreInfo: js.UndefOr[RestoreInfo] = js.undefined
  
  /** Output only. The current database state. */
  var state: js.UndefOr[String] = js.undefined
}
object Database {
  
  inline def apply(): Database = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Database]
  }
  
  extension [Self <: Database](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestoreInfo(value: RestoreInfo): Self = StObject.set(x, "restoreInfo", value.asInstanceOf[js.Any])
    
    inline def setRestoreInfoUndefined: Self = StObject.set(x, "restoreInfo", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

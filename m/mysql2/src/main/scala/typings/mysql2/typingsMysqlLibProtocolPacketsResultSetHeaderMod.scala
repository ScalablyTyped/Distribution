package typings.mysql2

import typings.mysql2.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibProtocolPacketsResultSetHeaderMod {
  
  trait ResultSetHeader extends StObject {
    
    var affectedRows: Double
    
    var changedRows: js.UndefOr[Double] = js.undefined
    
    var constructor: `2`
    
    var fieldCount: Double
    
    var info: String
    
    var insertId: Double
    
    var serverStatus: Double
    
    var warningStatus: Double
  }
  object ResultSetHeader {
    
    inline def apply(
      affectedRows: Double,
      constructor: `2`,
      fieldCount: Double,
      info: String,
      insertId: Double,
      serverStatus: Double,
      warningStatus: Double
    ): ResultSetHeader = {
      val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], fieldCount = fieldCount.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any], warningStatus = warningStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSetHeader]
    }
    
    extension [Self <: ResultSetHeader](x: Self) {
      
      inline def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      inline def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
      
      inline def setChangedRowsUndefined: Self = StObject.set(x, "changedRows", js.undefined)
      
      inline def setConstructor(value: `2`): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setServerStatus(value: Double): Self = StObject.set(x, "serverStatus", value.asInstanceOf[js.Any])
      
      inline def setWarningStatus(value: Double): Self = StObject.set(x, "warningStatus", value.asInstanceOf[js.Any])
    }
  }
}

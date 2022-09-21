package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BIGINT extends StObject {
  
  var BIGINT: String
  
  var CHAR: String
  
  var CLOB: String
  
  var DATE: String
  
  var DOUBLE_PRECISION: String
  
  var INTEGER: String
  
  var NUMERIC: String
  
  var TIMESTAMP: String
  
  var TIMESTAMP_WITH_TIME_ZONE: String
  
  var VARCHAR: String
}
object BIGINT {
  
  inline def apply(
    BIGINT: String,
    CHAR: String,
    CLOB: String,
    DATE: String,
    DOUBLE_PRECISION: String,
    INTEGER: String,
    NUMERIC: String,
    TIMESTAMP: String,
    TIMESTAMP_WITH_TIME_ZONE: String,
    VARCHAR: String
  ): BIGINT = {
    val __obj = js.Dynamic.literal(BIGINT = BIGINT.asInstanceOf[js.Any], CHAR = CHAR.asInstanceOf[js.Any], CLOB = CLOB.asInstanceOf[js.Any], DATE = DATE.asInstanceOf[js.Any], DOUBLE_PRECISION = DOUBLE_PRECISION.asInstanceOf[js.Any], INTEGER = INTEGER.asInstanceOf[js.Any], NUMERIC = NUMERIC.asInstanceOf[js.Any], TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], TIMESTAMP_WITH_TIME_ZONE = TIMESTAMP_WITH_TIME_ZONE.asInstanceOf[js.Any], VARCHAR = VARCHAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIGINT]
  }
  
  extension [Self <: BIGINT](x: Self) {
    
    inline def setBIGINT(value: String): Self = StObject.set(x, "BIGINT", value.asInstanceOf[js.Any])
    
    inline def setCHAR(value: String): Self = StObject.set(x, "CHAR", value.asInstanceOf[js.Any])
    
    inline def setCLOB(value: String): Self = StObject.set(x, "CLOB", value.asInstanceOf[js.Any])
    
    inline def setDATE(value: String): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    inline def setDOUBLE_PRECISION(value: String): Self = StObject.set(x, "DOUBLE_PRECISION", value.asInstanceOf[js.Any])
    
    inline def setINTEGER(value: String): Self = StObject.set(x, "INTEGER", value.asInstanceOf[js.Any])
    
    inline def setNUMERIC(value: String): Self = StObject.set(x, "NUMERIC", value.asInstanceOf[js.Any])
    
    inline def setTIMESTAMP(value: String): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
    
    inline def setTIMESTAMP_WITH_TIME_ZONE(value: String): Self = StObject.set(x, "TIMESTAMP_WITH_TIME_ZONE", value.asInstanceOf[js.Any])
    
    inline def setVARCHAR(value: String): Self = StObject.set(x, "VARCHAR", value.asInstanceOf[js.Any])
  }
}

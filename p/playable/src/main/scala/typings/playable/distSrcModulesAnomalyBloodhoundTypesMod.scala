package typings.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesAnomalyBloodhoundTypesMod {
  
  type IReportReasons = StringDictionary[String]
  
  trait IReportType extends StObject {
    
    var id: String
    
    var timeoutTime: Double
  }
  object IReportType {
    
    inline def apply(id: String, timeoutTime: Double): IReportType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timeoutTime = timeoutTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReportType]
    }
    
    extension [Self <: IReportType](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTimeoutTime(value: Double): Self = StObject.set(x, "timeoutTime", value.asInstanceOf[js.Any])
    }
  }
  
  type IReportTypes = StringDictionary[IReportType]
  
  type ITimeoutMap = StringDictionary[Double]
}

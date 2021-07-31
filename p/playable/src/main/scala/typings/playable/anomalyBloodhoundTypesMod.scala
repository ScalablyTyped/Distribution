package typings.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anomalyBloodhoundTypesMod {
  
  type IReportReasons = StringDictionary[String]
  
  trait IReportType extends StObject {
    
    var id: String
    
    var timeoutTime: Double
  }
  object IReportType {
    
    @scala.inline
    def apply(id: String, timeoutTime: Double): IReportType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timeoutTime = timeoutTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReportType]
    }
    
    @scala.inline
    implicit class IReportTypeMutableBuilder[Self <: IReportType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutTime(value: Double): Self = StObject.set(x, "timeoutTime", value.asInstanceOf[js.Any])
    }
  }
  
  type IReportTypes = StringDictionary[IReportType]
  
  type ITimeoutMap = StringDictionary[Double]
}

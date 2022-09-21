package typings.metro.anon

import typings.metro.metroStrings.bundle_transform_progressed
import typings.metro.reportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalFileCount
  extends StObject
     with ReportableEvent {
  
  var buildID: String
  
  var totalFileCount: Double
  
  var transformedFileCount: Double
  
  var `type`: bundle_transform_progressed
}
object TotalFileCount {
  
  inline def apply(buildID: String, totalFileCount: Double, transformedFileCount: Double): TotalFileCount = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_transform_progressed")
    __obj.asInstanceOf[TotalFileCount]
  }
  
  extension [Self <: TotalFileCount](x: Self) {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setTotalFileCount(value: Double): Self = StObject.set(x, "totalFileCount", value.asInstanceOf[js.Any])
    
    inline def setTransformedFileCount(value: Double): Self = StObject.set(x, "transformedFileCount", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundle_transform_progressed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

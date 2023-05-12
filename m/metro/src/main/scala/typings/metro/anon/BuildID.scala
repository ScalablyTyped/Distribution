package typings.metro.anon

import typings.metro.metroStrings.bundle_transform_progressed_throttled
import typings.metro.srcLibTerminalReporterMod.TerminalReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildID
  extends StObject
     with TerminalReportableEvent {
  
  var buildID: String
  
  var totalFileCount: Double
  
  var transformedFileCount: Double
  
  var `type`: bundle_transform_progressed_throttled
}
object BuildID {
  
  inline def apply(buildID: String, totalFileCount: Double, transformedFileCount: Double): BuildID = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_transform_progressed_throttled")
    __obj.asInstanceOf[BuildID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildID] (val x: Self) extends AnyVal {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setTotalFileCount(value: Double): Self = StObject.set(x, "totalFileCount", value.asInstanceOf[js.Any])
    
    inline def setTransformedFileCount(value: Double): Self = StObject.set(x, "transformedFileCount", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundle_transform_progressed_throttled): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

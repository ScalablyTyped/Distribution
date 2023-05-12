package typings.metro.anon

import typings.metro.metroStrings.bundle_build_failed
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildIDType
  extends StObject
     with ReportableEvent {
  
  var buildID: String
  
  var `type`: bundle_build_failed
}
object BuildIDType {
  
  inline def apply(buildID: String): BuildIDType = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_build_failed")
    __obj.asInstanceOf[BuildIDType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildIDType] (val x: Self) extends AnyVal {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundle_build_failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

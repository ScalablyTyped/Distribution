package typings.metro.anon

import typings.metro.metroStrings.bundle_build_done
import typings.metro.reportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildID
  extends StObject
     with ReportableEvent {
  
  var buildID: String
  
  var `type`: bundle_build_done
}
object BuildID {
  
  inline def apply(buildID: String): BuildID = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_build_done")
    __obj.asInstanceOf[BuildID]
  }
  
  extension [Self <: BuildID](x: Self) {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundle_build_done): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

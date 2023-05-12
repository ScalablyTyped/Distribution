package typings.metro.anon

import typings.metro.metroStrings.bundle_build_started
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleDetails
  extends StObject
     with ReportableEvent {
  
  var buildID: String
  
  var bundleDetails: typings.metro.srcLibReportingMod.BundleDetails
  
  var `type`: bundle_build_started
}
object BundleDetails {
  
  inline def apply(buildID: String, bundleDetails: typings.metro.srcLibReportingMod.BundleDetails): BundleDetails = {
    val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], bundleDetails = bundleDetails.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bundle_build_started")
    __obj.asInstanceOf[BundleDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleDetails] (val x: Self) extends AnyVal {
    
    inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
    
    inline def setBundleDetails(value: typings.metro.srcLibReportingMod.BundleDetails): Self = StObject.set(x, "bundleDetails", value.asInstanceOf[js.Any])
    
    inline def setType(value: bundle_build_started): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

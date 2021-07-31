package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosMobileAppIdentifier
  extends StObject
     with MobileAppIdentifier {
  
  // The identifier for an app, as specified in the app store.
  var bundleId: js.UndefOr[String] = js.undefined
}
object IosMobileAppIdentifier {
  
  @scala.inline
  def apply(): IosMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppIdentifier]
  }
  
  @scala.inline
  implicit class IosMobileAppIdentifierMutableBuilder[Self <: IosMobileAppIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
  }
}

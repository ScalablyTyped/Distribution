package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidMobileAppIdentifier
  extends StObject
     with MobileAppIdentifier {
  
  // The identifier for an app, as specified in the play store.
  var packageId: js.UndefOr[String] = js.undefined
}
object AndroidMobileAppIdentifier {
  
  @scala.inline
  def apply(): AndroidMobileAppIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidMobileAppIdentifier]
  }
  
  @scala.inline
  implicit class AndroidMobileAppIdentifierMutableBuilder[Self <: AndroidMobileAppIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageId(value: String): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}

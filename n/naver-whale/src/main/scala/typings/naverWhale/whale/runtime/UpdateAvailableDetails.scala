package typings.naverWhale.whale.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAvailableDetails extends StObject {
  
  /** The version number of the available update. */
  var version: String
}
object UpdateAvailableDetails {
  
  inline def apply(version: String): UpdateAvailableDetails = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailableDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAvailableDetails] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

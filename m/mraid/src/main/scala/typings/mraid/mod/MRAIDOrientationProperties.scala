package typings.mraid.mod

import typings.mraid.mraidStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDOrientationProperties extends StObject {
  
  var allowOrientationChange: Boolean
  
  var forceOrientation: MRAIDOrientation | none
}
object MRAIDOrientationProperties {
  
  inline def apply(allowOrientationChange: Boolean, forceOrientation: MRAIDOrientation | none): MRAIDOrientationProperties = {
    val __obj = js.Dynamic.literal(allowOrientationChange = allowOrientationChange.asInstanceOf[js.Any], forceOrientation = forceOrientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDOrientationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MRAIDOrientationProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowOrientationChange(value: Boolean): Self = StObject.set(x, "allowOrientationChange", value.asInstanceOf[js.Any])
    
    inline def setForceOrientation(value: MRAIDOrientation | none): Self = StObject.set(x, "forceOrientation", value.asInstanceOf[js.Any])
  }
}

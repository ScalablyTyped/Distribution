package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDKEventOptions extends StObject {
  
  var shouldUploadEvent: Boolean
}
object SDKEventOptions {
  
  inline def apply(shouldUploadEvent: Boolean): SDKEventOptions = {
    val __obj = js.Dynamic.literal(shouldUploadEvent = shouldUploadEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDKEventOptions] (val x: Self) extends AnyVal {
    
    inline def setShouldUploadEvent(value: Boolean): Self = StObject.set(x, "shouldUploadEvent", value.asInstanceOf[js.Any])
  }
}

package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceWebAudioApi extends StObject {
  
  var forceWebAudioApi: js.UndefOr[Boolean] = js.undefined
}
object ForceWebAudioApi {
  
  inline def apply(): ForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceWebAudioApi]
  }
  
  extension [Self <: ForceWebAudioApi](x: Self) {
    
    inline def setForceWebAudioApi(value: Boolean): Self = StObject.set(x, "forceWebAudioApi", value.asInstanceOf[js.Any])
    
    inline def setForceWebAudioApiUndefined: Self = StObject.set(x, "forceWebAudioApi", js.undefined)
  }
}

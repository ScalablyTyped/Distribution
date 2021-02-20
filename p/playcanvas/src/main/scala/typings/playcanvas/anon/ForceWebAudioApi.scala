package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceWebAudioApi extends StObject {
  
  var forceWebAudioApi: js.UndefOr[Boolean] = js.native
}
object ForceWebAudioApi {
  
  @scala.inline
  def apply(): ForceWebAudioApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceWebAudioApi]
  }
  
  @scala.inline
  implicit class ForceWebAudioApiMutableBuilder[Self <: ForceWebAudioApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceWebAudioApi(value: Boolean): Self = StObject.set(x, "forceWebAudioApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceWebAudioApiUndefined: Self = StObject.set(x, "forceWebAudioApi", js.undefined)
  }
}

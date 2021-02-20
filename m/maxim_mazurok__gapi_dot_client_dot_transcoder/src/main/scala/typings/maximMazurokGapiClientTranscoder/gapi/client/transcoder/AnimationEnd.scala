package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEnd extends StObject {
  
  /** The time to end overlay object, in seconds. Default: 0 */
  var startTimeOffset: js.UndefOr[String] = js.native
}
object AnimationEnd {
  
  @scala.inline
  def apply(): AnimationEnd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEnd]
  }
  
  @scala.inline
  implicit class AnimationEndMutableBuilder[Self <: AnimationEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}

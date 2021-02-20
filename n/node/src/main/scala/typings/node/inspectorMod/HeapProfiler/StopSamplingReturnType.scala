package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopSamplingReturnType extends StObject {
  
  /**
    * Recorded sampling heap profile.
    */
  var profile: SamplingHeapProfile = js.native
}
object StopSamplingReturnType {
  
  @scala.inline
  def apply(profile: SamplingHeapProfile): StopSamplingReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSamplingReturnType]
  }
  
  @scala.inline
  implicit class StopSamplingReturnTypeMutableBuilder[Self <: StopSamplingReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}

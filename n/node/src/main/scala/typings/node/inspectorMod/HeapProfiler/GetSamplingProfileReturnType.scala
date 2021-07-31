package typings.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingProfileReturnType extends StObject {
  
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile
}
object GetSamplingProfileReturnType {
  
  @scala.inline
  def apply(profile: SamplingHeapProfile): GetSamplingProfileReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileReturnType]
  }
  
  @scala.inline
  implicit class GetSamplingProfileReturnTypeMutableBuilder[Self <: GetSamplingProfileReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}

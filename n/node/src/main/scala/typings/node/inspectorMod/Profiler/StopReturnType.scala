package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReturnType extends StObject {
  
  /**
    * Recorded profile.
    */
  var profile: Profile
}
object StopReturnType {
  
  inline def apply(profile: Profile): StopReturnType = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReturnType]
  }
  
  extension [Self <: StopReturnType](x: Self) {
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}

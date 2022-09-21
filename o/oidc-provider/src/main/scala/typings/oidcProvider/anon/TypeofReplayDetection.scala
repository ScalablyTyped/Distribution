package typings.oidcProvider.anon

import typings.oidcProvider.mod.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReplayDetection extends StObject {
  
  /* static member */
  val adapter: Adapter
}
object TypeofReplayDetection {
  
  inline def apply(adapter: Adapter): TypeofReplayDetection = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReplayDetection]
  }
  
  extension [Self <: TypeofReplayDetection](x: Self) {
    
    inline def setAdapter(value: Adapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
  }
}

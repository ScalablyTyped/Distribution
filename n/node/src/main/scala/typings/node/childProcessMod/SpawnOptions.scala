package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnOptions
  extends StObject
     with CommonSpawnOptions {
  
  var detached: js.UndefOr[Boolean] = js.undefined
}
object SpawnOptions {
  
  inline def apply(): SpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnOptions]
  }
  
  extension [Self <: SpawnOptions](x: Self) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
  }
}

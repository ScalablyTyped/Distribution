package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintOptions extends StObject {
  
  var collideConnected: js.UndefOr[Boolean] = js.undefined
  
  var wakeUpBodies: js.UndefOr[Boolean] = js.undefined
}
object ConstraintOptions {
  
  inline def apply(): ConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintOptions]
  }
  
  extension [Self <: ConstraintOptions](x: Self) {
    
    inline def setCollideConnected(value: Boolean): Self = StObject.set(x, "collideConnected", value.asInstanceOf[js.Any])
    
    inline def setCollideConnectedUndefined: Self = StObject.set(x, "collideConnected", js.undefined)
    
    inline def setWakeUpBodies(value: Boolean): Self = StObject.set(x, "wakeUpBodies", value.asInstanceOf[js.Any])
    
    inline def setWakeUpBodiesUndefined: Self = StObject.set(x, "wakeUpBodies", js.undefined)
  }
}

package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: typings.orbitUiReactComponents.adaptersMod.Direction
}
object Direction {
  
  inline def apply(direction: typings.orbitUiReactComponents.adaptersMod.Direction): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: typings.orbitUiReactComponents.adaptersMod.Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}

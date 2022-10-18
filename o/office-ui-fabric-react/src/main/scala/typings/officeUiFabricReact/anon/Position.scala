package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.IPosition
import typings.officeUiFabricReact.officeUiFabricReactStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var display: block
  
  var position: js.UndefOr[IPosition] = js.undefined
}
object Position {
  
  inline def apply(): Position = {
    val __obj = js.Dynamic.literal(display = "block")
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setDisplay(value: block): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

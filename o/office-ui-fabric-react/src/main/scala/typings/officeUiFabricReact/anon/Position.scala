package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.officeUiFabricReactStrings.block
import typings.officeUiFabricReact.positioningTypesMod.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var display: block
  
  var position: js.UndefOr[IPosition] = js.undefined
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal(display = "block")
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: block): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}

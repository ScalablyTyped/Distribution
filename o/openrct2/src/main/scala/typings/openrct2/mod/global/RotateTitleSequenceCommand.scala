package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var rotations: Double
  
  var `type`: rotate
}
object RotateTitleSequenceCommand {
  
  inline def apply(rotations: Double): RotateTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(rotations = rotations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rotate")
    __obj.asInstanceOf[RotateTitleSequenceCommand]
  }
  
  extension [Self <: RotateTitleSequenceCommand](x: Self) {
    
    inline def setRotations(value: Double): Self = StObject.set(x, "rotations", value.asInstanceOf[js.Any])
    
    inline def setType(value: rotate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.nivoLine.mod

import typings.nivoLine.anon.Height
import typings.nivoLine.nivoLineStrings.x
import typings.nivoLine.nivoLineStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceTooltipProps extends StObject {
  
  var axis: x | y
  
  var slice: Height
}
object SliceTooltipProps {
  
  inline def apply(axis: x | y, slice: Height): SliceTooltipProps = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceTooltipProps]
  }
  
  extension [Self <: SliceTooltipProps](x: Self) {
    
    inline def setAxis(value: typings.nivoLine.nivoLineStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setSlice(value: Height): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
  }
}

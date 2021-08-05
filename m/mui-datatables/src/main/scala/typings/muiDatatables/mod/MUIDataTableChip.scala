package typings.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableChip extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[ChipColor] = js.undefined
  
  var variant: js.UndefOr[ChipVariant] = js.undefined
}
object MUIDataTableChip {
  
  inline def apply(): MUIDataTableChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableChip]
  }
  
  extension [Self <: MUIDataTableChip](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ChipColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setVariant(value: ChipVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

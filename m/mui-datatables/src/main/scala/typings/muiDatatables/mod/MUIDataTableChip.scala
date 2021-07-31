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
  
  @scala.inline
  def apply(): MUIDataTableChip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableChip]
  }
  
  @scala.inline
  implicit class MUIDataTableChipMutableBuilder[Self <: MUIDataTableChip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setColor(value: ChipColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setVariant(value: ChipVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}

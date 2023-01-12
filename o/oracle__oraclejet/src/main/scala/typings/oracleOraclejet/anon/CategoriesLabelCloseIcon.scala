package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoriesLabelCloseIcon extends StObject {
  
  var categories: js.UndefOr[Confirmation] = js.undefined
  
  var labelCloseIcon: js.UndefOr[String] = js.undefined
}
object CategoriesLabelCloseIcon {
  
  inline def apply(): CategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesLabelCloseIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoriesLabelCloseIcon] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: Confirmation): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setLabelCloseIcon(value: String): Self = StObject.set(x, "labelCloseIcon", value.asInstanceOf[js.Any])
    
    inline def setLabelCloseIconUndefined: Self = StObject.set(x, "labelCloseIcon", js.undefined)
  }
}

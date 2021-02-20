package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoriesLabelCloseIcon extends StObject {
  
  var categories: js.UndefOr[Confirmation] = js.native
  
  var labelCloseIcon: js.UndefOr[String] = js.native
}
object CategoriesLabelCloseIcon {
  
  @scala.inline
  def apply(): CategoriesLabelCloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoriesLabelCloseIcon]
  }
  
  @scala.inline
  implicit class CategoriesLabelCloseIconMutableBuilder[Self <: CategoriesLabelCloseIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: Confirmation): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setLabelCloseIcon(value: String): Self = StObject.set(x, "labelCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelCloseIconUndefined: Self = StObject.set(x, "labelCloseIcon", js.undefined)
  }
}

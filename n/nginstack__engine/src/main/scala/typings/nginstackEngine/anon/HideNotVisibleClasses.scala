package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideNotVisibleClasses extends StObject {
  
  var hideNotVisibleClasses: Boolean
  
  var justProducts: js.UndefOr[Boolean] = js.undefined
  
  var licenses: js.Array[Double] | Double
}
object HideNotVisibleClasses {
  
  inline def apply(hideNotVisibleClasses: Boolean, licenses: js.Array[Double] | Double): HideNotVisibleClasses = {
    val __obj = js.Dynamic.literal(hideNotVisibleClasses = hideNotVisibleClasses.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideNotVisibleClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HideNotVisibleClasses] (val x: Self) extends AnyVal {
    
    inline def setHideNotVisibleClasses(value: Boolean): Self = StObject.set(x, "hideNotVisibleClasses", value.asInstanceOf[js.Any])
    
    inline def setJustProducts(value: Boolean): Self = StObject.set(x, "justProducts", value.asInstanceOf[js.Any])
    
    inline def setJustProductsUndefined: Self = StObject.set(x, "justProducts", js.undefined)
    
    inline def setLicenses(value: js.Array[Double] | Double): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesVarargs(value: Double*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}

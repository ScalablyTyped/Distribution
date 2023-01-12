package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeOrphans extends StObject {
  
  var excludeOrphans: Boolean
  
  var justProducts: Boolean
  
  var licenses: js.Array[Double] | Double
}
object ExcludeOrphans {
  
  inline def apply(excludeOrphans: Boolean, justProducts: Boolean, licenses: js.Array[Double] | Double): ExcludeOrphans = {
    val __obj = js.Dynamic.literal(excludeOrphans = excludeOrphans.asInstanceOf[js.Any], justProducts = justProducts.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeOrphans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludeOrphans] (val x: Self) extends AnyVal {
    
    inline def setExcludeOrphans(value: Boolean): Self = StObject.set(x, "excludeOrphans", value.asInstanceOf[js.Any])
    
    inline def setJustProducts(value: Boolean): Self = StObject.set(x, "justProducts", value.asInstanceOf[js.Any])
    
    inline def setLicenses(value: js.Array[Double] | Double): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesVarargs(value: Double*): Self = StObject.set(x, "licenses", js.Array(value*))
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `655` extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
}
object `655` {
  
  inline def apply(): `655` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`655`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `655`] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}

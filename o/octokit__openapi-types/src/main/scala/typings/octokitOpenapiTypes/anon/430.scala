package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `430` extends StObject {
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** A user ID. Only return users with an ID greater than this ID. */
  var since: js.UndefOr[Double] = js.undefined
}
object `430` {
  
  inline def apply(): `430` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`430`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `430`] (val x: Self) extends AnyVal {
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}

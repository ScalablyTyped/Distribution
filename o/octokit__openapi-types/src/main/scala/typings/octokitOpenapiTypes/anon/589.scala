package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `589` extends StObject {
  
  var since: js.UndefOr[Double] = js.undefined
}
object `589` {
  
  inline def apply(): `589` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`589`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `589`] (val x: Self) extends AnyVal {
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `706` extends StObject {
  
  var since: js.UndefOr[Double] = js.undefined
}
object `706` {
  
  inline def apply(): `706` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`706`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `706`] (val x: Self) extends AnyVal {
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}

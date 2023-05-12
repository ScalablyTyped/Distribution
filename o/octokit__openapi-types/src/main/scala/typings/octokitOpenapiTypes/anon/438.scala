package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `438` extends StObject {
  
  /** @default false */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object `438` {
  
  inline def apply(): `438` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`438`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `438`] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}

package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `540` extends StObject {
  
  var content_type: js.UndefOr[`539`] = js.undefined
}
object `540` {
  
  inline def apply(): `540` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`540`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `540`] (val x: Self) extends AnyVal {
    
    inline def setContent_type(value: `539`): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
  }
}

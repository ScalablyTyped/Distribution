package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  /**
    * DOM reference of the object identifier's title.
    */
  var domRef: js.UndefOr[js.Object] = js.undefined
}
object `21` {
  
  inline def apply(): `21` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `21`] (val x: Self) extends AnyVal {
    
    inline def setDomRef(value: js.Object): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
  }
}

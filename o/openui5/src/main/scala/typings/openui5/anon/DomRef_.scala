package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomRef_ extends StObject {
  
  /**
    * DOM reference of the ObjectAttribute's text to be used for positioning.
    */
  var domRef: js.UndefOr[String] = js.undefined
}
object DomRef_ {
  
  inline def apply(): DomRef_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomRef_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomRef_] (val x: Self) extends AnyVal {
    
    inline def setDomRef(value: String): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
  }
}

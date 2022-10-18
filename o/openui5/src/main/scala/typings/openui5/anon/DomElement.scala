package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomElement extends StObject {
  
  /**
    * DOM element that was pointed out by the user
    */
  var domElement: typings.std.Element
  
  /**
    * preferences for the selector e.g. which is the most prefered strategy
    */
  var settings: PreferViewId
}
object DomElement {
  
  inline def apply(domElement: typings.std.Element, settings: PreferViewId): DomElement = {
    val __obj = js.Dynamic.literal(domElement = domElement.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomElement]
  }
  
  extension [Self <: DomElement](x: Self) {
    
    inline def setDomElement(value: typings.std.Element): Self = StObject.set(x, "domElement", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: PreferViewId): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}

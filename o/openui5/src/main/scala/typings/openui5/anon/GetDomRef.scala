package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomRef extends StObject {
  
  /**
    * Dom reference of the feed item's sender string to be used for positioning.
    */
  var domRef: js.UndefOr[String] = js.undefined
  
  /**
    * Function to retrieve the DOM reference for the `senderPress` event. The function returns the DOM element
    * of the sender link or null
    */
  var getDomRef: js.UndefOr[js.Function] = js.undefined
}
object GetDomRef {
  
  inline def apply(): GetDomRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomRef]
  }
  
  extension [Self <: GetDomRef](x: Self) {
    
    inline def setDomRef(value: String): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
    
    inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
    
    inline def setGetDomRef(value: js.Function): Self = StObject.set(x, "getDomRef", value.asInstanceOf[js.Any])
    
    inline def setGetDomRefUndefined: Self = StObject.set(x, "getDomRef", js.undefined)
  }
}

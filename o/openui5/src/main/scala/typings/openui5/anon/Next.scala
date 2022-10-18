package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  /**
    * how many levels of ancestors to search
    */
  var level: Boolean
  
  /**
    * match only if control's DOM reference is after the sibling's in the DOM tree,
    */
  var next: Boolean
  
  /**
    * match only if control's DOM reference is before the sibling's in the DOM tree
    */
  var prev: Boolean
  
  /**
    * whether to match by relationships of the DOM references. false by default
    */
  var useDom: Boolean
}
object Next {
  
  inline def apply(level: Boolean, next: Boolean, prev: Boolean, useDom: Boolean): Next = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], useDom = useDom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: Boolean): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setUseDom(value: Boolean): Self = StObject.set(x, "useDom", value.asInstanceOf[js.Any])
  }
}

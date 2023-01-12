package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPreservedDOM extends StObject {
  
  /**
    * Whether the current DOM of the control has been preserved (true) or not (e.g. rendered from content property
    * or it is an empty HTML control).
    */
  var isPreservedDOM: js.UndefOr[Boolean] = js.undefined
}
object IsPreservedDOM {
  
  inline def apply(): IsPreservedDOM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsPreservedDOM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPreservedDOM] (val x: Self) extends AnyVal {
    
    inline def setIsPreservedDOM(value: Boolean): Self = StObject.set(x, "isPreservedDOM", value.asInstanceOf[js.Any])
    
    inline def setIsPreservedDOMUndefined: Self = StObject.set(x, "isPreservedDOM", js.undefined)
  }
}

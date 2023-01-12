package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewNameString extends StObject {
  
  /**
    * If you do not use setView please see {@link sap.ui.view} for the documentation. This is used as a key
    * in the cache of the Views instance. If you want to retrieve a view that has been given an alternative
    * name in {@link #setView} you need to provide the same name here and you can skip all the other viewOptions.
    */
  var viewName: String
}
object ViewNameString {
  
  inline def apply(viewName: String): ViewNameString = {
    val __obj = js.Dynamic.literal(viewName = viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewNameString] (val x: Self) extends AnyVal {
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
  }
}
